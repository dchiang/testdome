# [User Input](https://www.testdome.com/questions/python/user-input/94867 "User Input")

A user interface contains two types of user input controls: *TextInput*, which accepts all characters and *NumericInput*, which accepts only digits.

Implement the class *TextInput* that contains:

* Method<em>&nbsp;add(self, character)</em> - adds the given character to the current value</li>
* Method <em>get_value(self)</em> - returns the current value</li>

Implement the class *NumericInput* that:

* Inherits <em>TextInput</em></li>
* Overrides the a<em>dd</em> method so that each non-numeric character is ignored</li>

For example, the following code should output "10":

```python
input = NumericInput()
input.add("1")
input.add("a")
input.add("0")
print(input.get_value())
```
