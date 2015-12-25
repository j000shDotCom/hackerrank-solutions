hello_worlds n
    | n > 0 = do
        putStrLn "Hello World"
        hello_worlds (n-1)
    | otherwise = return ()

main = do
   n <- readLn :: IO Int
   hello_worlds n

