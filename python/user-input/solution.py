class TextInput:
    def __init__(self):
        self.value = ""

    def add(self, character):
        self.value += character

    def get_value(self):
        return self.value


class NumericInput(TextInput):
    def __init__(self):
        super().__init__()

    def add(self, character):
        if character.isnumeric():
            super().add(character)


if __name__ == "__main__":
    input = NumericInput()
    input.add("1")
    input.add("a")
    input.add("0")
    print(input.get_value())
