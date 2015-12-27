module Main where

fib :: Int -> Int
fib n 
    | n == 1 = 0
    | otherwise = fibs !! (n - 1)

fibs :: [Int]
fibs = 0 : 1 : zipWith (+) fibs (tail fibs)

-- This part is related to the Input/Output and can be used as it is
-- Do not modify it
main = do
    input <- getLine
    print . fib . (read :: String -> Int) $ input

