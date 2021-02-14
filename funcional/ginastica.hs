-- Ginastica artística
-- avalia menor nota da ginasta para descarte 
menorNota :: (Double, Double, Double, Double, Double) -> Double
menorNota (a,b,c,d,e) =  min (min (min (min a b) c) d) e

-- soma todas as notas da ginasta
soma :: (Double, Double, Double, Double, Double) -> Double
soma (a,b,c,d,e) = a + b + c + d + e

-- calcula media da ginasta, descartando menor nota
media :: (Double, Double, Double, Double, Double) -> Double
media (a,b,c,d,e) = (soma(a,b,c,d,e) - menorNota(a,b,c,d,e)) / 4

main = do
 let x = ("Beatriz",(9.5, 9.0, 9.1, 8.75, 8.8))
 let y = ("Lilian",(9.3, 8.5, 9.2, 8.9, 9.4))

 if media(snd(x)) > media(snd(y))
  then print("Vencedora da ginastica artistica: "++fst(x))
 else print("Vencedora da ginastica artistica: "++fst(y))
