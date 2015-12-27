solve :: Double -> Double
solve x = foldl (\ acc n -> acc + (power x n / (fromIntegral $ factorial n))) 0.0 [0..9]

power :: (Num a) => a -> Int -> a
power x n
    | n == 0 = 1
    | otherwise = x * power x (n - 1)

factorial :: Int -> Int
factorial = (facts !!)

facts :: [Int]
facts = 1 : zipWith (*) facts [1..]

main :: IO ()
main = getContents >>= mapM_ print. map solve. map (read::String->Double). tail. words

