import random
maior = -1
for x in range(10):
    #num = int(random.randint(-100, 901))
    num = input("Digite um número: ")
    #print(num, end=" ")
    if int(num) > int(maior):
        maior = num
print("")
print("O maior número foi: ",maior)