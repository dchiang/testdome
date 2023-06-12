# [Quadratic Equation](https://www.testdome.com/questions/python/quadratic-equation/94864 "Quadratic Equation")

Implement the function *find_roots* to find the roots of the quadratic equation:

> ax<sup>2</sup> + bx + c = 0

The function should return a tuple containing roots in any order. If the equation has only one solution, the function should return that solution as both elements of the tuple. The equation will always have at least one solution.

The roots of the quadratic equation can be found with the following formula: ![\Large x=\frac{-b\pm\sqrt{b^2-4ac}}{2a}](https://latex.codecogs.com/svg.latex?x%3D%5Cfrac%7B-b%5Cpm%5Csqrt%7Bb%5E2-4ac%7D%7D%7B2a%7D)

For example, `find_roots(2, 10, 8)` should return `(-1, -4)` or `(-4 , -1)` as -1 and -4 are the roots of the equation:

> 2x<sup>2</sup> + 10x + 8 = 0

<ins>

*Note: This solution does not consider imaginary numbers as this is not being requested by the excercise.*

</ins>