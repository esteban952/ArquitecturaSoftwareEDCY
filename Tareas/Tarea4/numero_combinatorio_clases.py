
class Combinatoria:
    def __init__(self, n, x):
        self.n = n
        self.x = x
    def factorial(self, n):
        if(n <= 1):
            return 1
        else :
            return n * self.factorial(n - 1)
    def calcular_combinatoria(self):
        return self.factorial(self.n) / (self.factorial(self.x) * self.factorial(self.n - self. x))

print("\tNumero Combinatorio")
print("\n\tDonde: ")
print("\t\tn >= 1\n\t\t0 <= x <= n\n")

n = 0
x = -1
while n <= 0:
    n = int(input("Introducir el valor de N: "))
while x < 0 or x > n:
    x = int (input("Introducir el valor de X: "))
comb = Combinatoria(n, x)
result = comb.calcular_combinatoria()
print("El valor del numero combinatorio es: ", result)
