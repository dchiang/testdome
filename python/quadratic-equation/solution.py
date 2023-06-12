import math


def find_roots(a, b, c):
    discriminant = math.sqrt(math.pow(b, 2) - 4 * a * c)
    x1 = (-b + discriminant) / (2 * a)
    x2 = (-b - discriminant) / (2 * a)
    return x1, x2


print(find_roots(2, 10, 8))
