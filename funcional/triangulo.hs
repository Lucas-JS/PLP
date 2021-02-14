-- Lucas Silva - Ex Triangulo

triangulo :: (Int, Int, Int) -> Bool
triangulo ( x, y, z) | (x + y) > z = True
					 | (x + z) > y = True
					 | (y + z) > x = True
					 | otherwise = False

forma :: (Int, Int, Int) -> String
forma (x, y, z) | (x == y) && (y == z) = "equilatero"
                | (x == y) || (x == z) || (y == z) = "isosceles"
				| otherwise = "escaleno"					  

main = do
 let tri = (3,4,6)	
 print(triangulo(tri))

 if triangulo(tri)
 	then print(forma(tri))
 else putStrLn "nao triangulo"