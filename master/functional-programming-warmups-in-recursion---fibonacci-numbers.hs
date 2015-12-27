module Main where

fib :: Int -> Int
fib n = fibs !! n

fibs :: [Int]
fibs = 0 : 1 : scanl (+) 1 fibs

-- This part is related to the Input/Output and can be used as it is
-- Do not modify it
main = do
    input <- getLine
    print . fib . (read :: String -> Int) $ input

