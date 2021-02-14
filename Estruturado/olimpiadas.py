# Lucas de Jesus Silva - 20731356 - atividade 2 PLP - Estruturado

#=================================================================================================
# método para determinar vencedor do levantamento de pesos
def levantamentoPeso (x,y):
	vencedor = ""
	if x["peso"] > y["peso"]:
		vencedor = x["nome"]
	else:
		vencedor = y["nome"]
	print("Vencedor do levantamento de pesos: "+vencedor)
#=================================================================================================
# Método para determinar o vencedor do Judo:
def judo (x,y):
	vencedor = ""
	if x["ippon"] == True :
		return "Vencedor do judo: " + x["nome"]

	if y["ippon"] == True :
		return "Vencedor do judo: " +  y["nome"]
	
	if x["wazari"] == y["wazari"] :
		if x["yuko"] > y["yuko"] :
			vencedor = x["nome"]
		else:
			vencedor = y["nome"]
			
	if x["wazari"] > y["wazari"]:
			vencedor = judocaX["nome"]
	else: 
		vencedor = y["nome"]
	return "Vencedor do judô: " + vencedor	

#=================================================================================================
# O calculo do vencedor da modalidade de arremesso de pesos foi separado nos 3 proximos metodos
# encontra maior arremesso
def maiorArremesso(a,b,c):
	maior = a;
		
	if b > maior : 
		maior = b
	if c > maior :
		maior = c		
	return maior
# encontra segundo maior arremesso
def segundoMaior(a,b,c):
	if a > b :
	    if c > a :
        	return a
	    if b > c :
	    	return b
	else :
	    if c > b : 
	    	return b
	    if a > c :
	    	return a

	return c

# determina vencedor do arremesso de pesos
def arremessoPesos (x, y):
	vencedor = ""
	xMaior = maiorArremesso(x["arr1"],x["arr2"],x["arr3"])
	yMaior = maiorArremesso(y["arr1"],y["arr2"],y["arr3"])
	xSegundo = segundoMaior(x["arr1"],x["arr2"],x["arr3"])
	ySegundo = segundoMaior(y["arr1"],y["arr2"],y["arr3"])

	if xMaior == yMaior:
		if xSegundo > ySegundo:
			vencedor = x["nome"]
		else:
			vencedor = y["nome"]
	else:			
		if xMaior > yMaior:
			vencedor = x["nome"]
		else:
			vencedor = y["nome"]
	return "Vencedor do arremesso de pesos: "+vencedor

#=================================================================================================
# O calculo da vencedora da modalidade de ginastica artistica foi separado nos 4 proximos metodos
# encontra menor nota da ginasta para descarte
def menorNota(a,b,c,d,e):
	menor = a
		
	if b < menor :
		menor = b
	if c < menor :
		menor = c
	if d < menor :
		menor = d
	if e < menor :
		menor = e
		
	return menor;

# soma notas da ginasta para calculo da media	
def somaNotas(a,b,c,d,e):
	return a + b + c + d + e 

# calcula media de ginasta, descartando menor nota
def mediaGinasta(a,b,c,d,e):
	return (somaNotas(a,b,c,d,e) - menorNota(a,b,c,d,e))/4

# determina vencedora da ginastica artistica
def ginasticaArtistica(x,y):
	vencedora = ""
	mediaX = mediaGinasta(x["n1"],x["n2"],x["n3"],x["n4"],x["n5"])
	mediaY = mediaGinasta(y["n1"],y["n2"],y["n3"],y["n4"],y["n5"])

	if mediaX > mediaY :
		vencedora = x["nome"]
	else:
		vencedora = y["nome"]

	return "Vencedora da ginástica artística: "+vencedora

#=================================================================================================
# Levantamento de pesos
levantadorX = {"nome":"João","peso":310}
levantadorY = {"nome":"Carlos","peso":320}

levantamentoPeso(levantadorX,levantadorY)
#=================================================================================================
# Judo

judocaX = {"nome":"Thiago","ippon":False,"wazari":6,"yuko":10}
judocaY = {"nome":"Lucas","ippon":False,"wazari":5,"yuko":14}

print(judo(judocaX,judocaY))
#=================================================================================================
# Arremesso de pesos
arremessadorX = {"nome":"José","arr1":20.53,"arr2":21.9,"arr3":21.5}
arremessadorY = {"nome":"Luiz","arr1":20.78,"arr2":22.6,"arr3":22.7}

print(arremessoPesos(arremessadorX,arremessadorY))
#=================================================================================================
# Ginastica artistica

ginastaX = {"nome":"Beatriz","n1":9.5,"n2":9.0,"n3":9.1,"n4":8.75,"n5":8.8}
ginastaY = {"nome":"Lilian","n1":9.3,"n2":8.5,"n3":9.2,"n4":8.9,"n5":9.4}

print(ginasticaArtistica(ginastaX,ginastaY))
