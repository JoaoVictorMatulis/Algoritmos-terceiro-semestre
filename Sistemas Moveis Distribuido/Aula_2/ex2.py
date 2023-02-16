cand1=input("Digite o total de votos do canditado1: ")
cand2=input("Digite o total de votos do canditado2: ")
cand3=input("Digite o total de votos do canditado3: ")
branco=input("Digite o total de votos em branco: ")
nulo=input("Digite o total de votos nulos: ")

votoTotal = int(cand1) + int(cand2) + int(cand3) + int(branco) + int(nulo)
porcCand1 = (int(cand1)/votoTotal)*100
porcCand2 = (int(cand2)/votoTotal)*100
porcCand3 = (int(cand3)/votoTotal)*100
porcBranco = (int(branco)/votoTotal)*100
porcNulo = (int(nulo)/votoTotal)*100
