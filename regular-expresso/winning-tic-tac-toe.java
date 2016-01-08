public class Solution {    

    public static void main(String[] args) {
        /*
        --- --- ---
        XXX
            XXX
                XXX
                
        X.. X.. X..
        .X. .X. .X.
        ..X ..X ..X
        
        X.. .X. ..X
        ..X .X. X..
        */
        Regex_Test tester = new Regex_Test();
        String horizontal = "(...){0,2}([XO])\\2{2}"; // "(...)?(...)?([XO])\\3{2}"
        String vertdiag = "([XO])(.{1,3})\\3\\4\\3";
        tester.checker(horizontal + "|" + vertdiag);
    }
}
