class IceCreamMachine:
    def __init__(self, ingredients, toppings):
        self.ingredients = ingredients
        self.toppings = toppings

    def scoops(self):
        ice_creams = []
        for ingredient in self.ingredients:
            for topping in self.toppings:
                ice_creams.append([ingredient, topping])
        return ice_creams


if __name__ == "__main__":
    machine = IceCreamMachine(["vanilla", "chocolate"], ["chocolate sauce"])
    print(
        machine.scoops()
    )  # should print: [['vanilla', 'chocolate sauce'], ['chocolate', 'chocolate sauce']]
