# [Pipeline](https://www.testdome.com/questions/python/pipeline/94856 "Pipeline")

As part of a data processing pipeline, complete the implementation of the *pipeline* method:

* The *pipeline* method should accept a variable number of functions, and it should return a new function that accepts one parameter *arg*.
* The returned function should call the first function in *pipeline* with the parameter *arg*, and call the second function with the result of the first function.
* The returned function should continue calling each function in *pipeline* in order, following the same pattern, and return the value from the last function.

For example, calling `pipeline(lambda x: x * 3, lambda x: x + 1, lambda x: x / 2)`, and then calling the returned function with 3 should return 5.0.

*Note: The solution for this question was taken from [github testdome-python-solutions repo](https://github.com/jozo/testdome-python-solutions/blob/master/08_pipeline.py "testdome-python-solutions") posted by [jozo](https://github.com/jozo "jozo")*