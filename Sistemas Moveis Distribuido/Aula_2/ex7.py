peso = float (input("Digite seu peso: "))
altura = float (input("Digite sua altura em metros: ")) 
sexo = input("Qual o seu sexo?\n(M) = masculino    (F) = feminino\n")

imc = peso/(altura * altura)

if sexo == "M" or sexo == "m":
  if imc < 20.7:
    print("IMC: ",imc,"\nAbaixo do peso")
  if imc >= 20.7 and imc < 26.4:
    print("IMC: ",imc,"\nPeso normal")
  if imc >= 26.4 and imc < 27.8:
    print("IMC: ",imc,"\nMarginalmente acima do peso")
  if imc >= 27.8 and imc < 31.1:
    print("IMC: ",imc,"\nAcima do peso ideal")
  if imc >= 31.1:
    print("IMC: ",imc,"\nObeso")
else:
  if imc < 19.1:
    print("IMC: ",imc,"\nAbaixo do peso")
  if imc >= 19.1 and imc < 25.8:
    print("IMC: ",imc,"\nPeso normal")
  if imc >= 25.8 and imc < 27.3:
    print("IMC: ",imc,"\nMarginalmente acima do peso")
  if imc >= 27.3 and imc < 32.3:
    print("IMC: ",imc,"\nAcima do peso ideal")
  if imc >= 32.3:
    print("IMC: ",imc,"\nObeso")
