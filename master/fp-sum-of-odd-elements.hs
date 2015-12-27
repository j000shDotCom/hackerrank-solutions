f :: [Int] -> Int
f [] = 0
f [x] = x
f (x:_:xs) = x + f xs

main = do
   inputdata <- getContents
   putStrLn $ show $ f $ map (read :: String -> Int) $ lines inputdata

