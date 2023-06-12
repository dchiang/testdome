def find_two_sum(numbers, target_sum):
    """
    :param numbers: (list of ints) The list of numbers.
    :param target_sum: (int) The required target sum.
    :returns: (a tuple of 2 ints) The indices of the two elements whose sum is equal to target_sum
    """
    complements = {}
    for i in range(len(numbers)):
        complement = target_sum - numbers[i]
        if numbers[i] in complements:
            return i, complements[numbers[i]]
        else:
            complements[complement] = i
    return None


if __name__ == "__main__":
    print(find_two_sum([3, 1, 5, 7, 5, 9], 10))
