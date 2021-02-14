-- Arremesso de pesos
-- avalia maior arremesso entre 3
maior :: (Double,Double,Double) -> Double
maior  (a,b,c) 
 | a > b && a > c = a
 | b > c = b
 | otherwise = c

-- avalia segundo maior arremesso para caso de empates
segundoMaior :: (Double,Double,Double) -> Double
segundoMaior (a,c,b)
 | a == maior(a,b,c) = (max b c)
 | b == maior(a,b,c) = (max a c)
 | c == maior(a,b,c) = (max a b)
main = do
 let x = ("Jose",(20.53, 21.9, 21.5))
 let y = ("Luiz",(20.78, 22.6, 22.7))

 if maior(snd(x)) == maior(snd(y))
  then if segundoMaior(snd(x)) > segundoMaior(snd(y)) 
   then print("Vencedor do arremesso de pesos: "++fst(x))
   else print("Vencedor do arremesso de pesos: "++fst(y))
 else if maior(snd(x)) > maior(snd(y))
  then print("Vencedor do arremesso de pesos: "++fst(x))
  else print("Vencedor do arremesso de pesos: "++fst(y))
