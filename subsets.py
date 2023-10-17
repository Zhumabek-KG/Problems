def allVar(array, store = []):
    result = []

    if len(array) == 1:
        store.append(array[0])
        return [store]
    
    for i in range(len(array)):
        selected_elements = array[:i] + array[i + 1:]
        result = result + allVar(selected_elements, store + [array[i]])
    
    return result

array = [1,2,3]
print(allVar(array, []))