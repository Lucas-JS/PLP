main = do 
 let a = ("Jose",310);
 let b = ("Paulo",325);

 if (snd(a)>snd(b))
  then print("vencedor levantamento de pesos: "++fst(a))
 else print("vencedor levantamento de pesos: "++fst(b))