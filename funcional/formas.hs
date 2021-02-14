-- Lucas de Jesus Silva - RA 20731356 - N2 PLP
-- importa classe para pegar elementos da lista pelo indice
import Data.List (genericIndex)
-- cria os tipos de formas
data Formas = Circulo Double | Quadrado Double | Retangulo Double Double | Triangulo Double Double 
  deriving(Show)

class Forma f where
  calculaArea :: f -> Double

instance Forma Formas where
  calculaArea (Circulo r) = pi * r * r 
  calculaArea (Quadrado l) = l * l 
  calculaArea (Retangulo l1 l2) = l1 * l2 
  calculaArea (Triangulo b a) = (b * a)/2

listaFormas :: [Formas]
listaFormas = [Circulo 3.3, Quadrado 8, Retangulo 4 7, Triangulo 8 12]

main :: IO ()
main = do
 print("Area do Circulo:" )
 print $  calculaArea(listaFormas `genericIndex` 0)
 print("Area do Quadrado:" )
 print $  calculaArea(listaFormas `genericIndex` 1)
 print("Area do Retangulo:" )
 print $  calculaArea(listaFormas `genericIndex` 2)
 print("Area do Triangulo:" )
 print $  calculaArea(listaFormas `genericIndex` 3)