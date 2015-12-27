rev :: [Int] -> [Int]
rev = foldl (\ xs x -> x : xs) []
