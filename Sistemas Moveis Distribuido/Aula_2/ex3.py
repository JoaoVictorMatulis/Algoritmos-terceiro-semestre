dinheiro = int(input("Digite quanto dinheiro você quer trocar: "))
#	100,	50,	20,10,	5,	2	e	1
mod100 = int(dinheiro / 100)
dinheiro = dinheiro%100

mod50 = int(dinheiro / 50)
dinheiro = dinheiro%50

mod20 = int(dinheiro / 20)
dinheiro = dinheiro%20

mod10 = int(dinheiro / 10)
dinheiro = dinheiro%10

mod5 = int(dinheiro / 5)
dinheiro = dinheiro%5

mod2 = int(dinheiro / 2)
dinheiro = dinheiro%2

mod1 = int(dinheiro / 1)
dinheiro = dinheiro%1

print("Troco:\nNotas de 100: ",mod100,"\nNotas de 50: ",mod50,"\nNotas de 20: ",mod20,"\nNotas de 10: ",mod10,"\nNotas de 5: ",mod5,"\nNotas de 2: ",mod2,"\nNotas de 1: ",mod1)
