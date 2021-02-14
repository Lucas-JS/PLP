-- Judo
-- Cria tipos de dados para criar o atleta
type Nome = String
type Ippon = Bool
type Wazari = Int
type Yuko = Int
type Atleta = (Nome,Ippon,Wazari,Yuko)

-- Funções para acessar propriedades
getNome :: Atleta -> Nome
getNome (n,i,w,y) = n

getIppon :: Atleta -> Ippon
getIppon (n,i,w,y) = i

getWazari :: Atleta -> Wazari
getWazari (n,i,w,y) = w

getYuko :: Atleta -> Yuko
getYuko (n,i,w,y) = y

-- avalia vencedor da modalidade
getVencedor :: (Atleta,Atleta) -> Nome
getVencedor (x,y)
 |getIppon(x) == True = getNome(x)
 |getIppon(y) == True = getNome(y)
 |getWazari(x) > getWazari(y) = getNome(x) 
 |getWazari(y) > getWazari(x) = getNome(y)
 |getYuko(x) > getYuko(y) = getNome(x)
 |getYuko(y) > getYuko(x) = getNome(y)

-- cria dos atletas
atletaX :: Atleta
atletaX = ("Thiago", False, 6, 10)

atletaY :: Atleta
atletaY = ("Pedro", False, 5, 14)

main = do 
 print("Vencedor do judo: "++getVencedor(atletaX,atletaY))
