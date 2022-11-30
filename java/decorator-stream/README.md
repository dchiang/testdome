# [Decorator Stream](https://www.testdome.com/questions/java/decorator-stream/30739 "Decorator Stream")

Implement methods in the DecoratorStream class:

* write method should write the prefix into the underlying stream member **only** on the first write invocation. It should always write the bytes it receives to the underlying stream.
* The prefix should be written in UTF-8 encoding.

For example, if the DecoratorStream is instantiated with `"First line: "` as the prefix parameter and write method is called with UTF-8 byte representation of `"Hello, world!"`, it should write `"First line: Hello, world!"` into the underlying stream.