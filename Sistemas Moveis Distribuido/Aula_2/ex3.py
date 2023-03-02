dinheiro = int(input("Digite quanto dinheiro você quer trocar: "))

if dinheiro>=100:
    mod100 = int(dinheiro / 100)
    dinheiro = dinheiro%100

if dinheiro>=50:
    mod50 = int(dinheiro / 50)
    dinheiro = dinheiro%50

if dinheiro>=20:
    mod20 = int(dinheiro / 20)
    dinheiro = dinheiro%20

if dinheiro>=10:
    mod10 = int(dinheiro / 10)
    dinheiro = dinheiro%10

if dinheiro>=5:
    mod5 = int(dinheiro / 5)
    dinheiro = dinheiro%5

if dinheiro>=2:
    mod2 = int(dinheiro / 2)
    dinheiro = dinheiro%2

if dinheiro>=1:
    mod1 = int(dinheiro / 1)
    dinheiro = dinheiro%1

print("Troco:\nNotas de 100: ",mod100,"\nNotas de 50: ",mod50,"\nNotas de 20: ",mod20,"\nNotas de 10: ",mod10,"\nNotas de 5: ",mod5,"\nNotas de 2: ",mod2,"\nNotas de 1: ",mod1)
