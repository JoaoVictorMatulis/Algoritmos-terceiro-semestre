num = int(input("Digite um número: "))
print("Números impares entre 2 e 10: 2, ",end = "")
for x in range(2,num-1):
  if x%2 == 1:
    print(x,end=", ")
  x+=1
