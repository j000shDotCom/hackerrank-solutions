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
        // String vertical = "(X|O)(\\1{2}(...){0,2}$|(.\\1){2}..$|(...?\\1){2})";
        //
        String vertical = "(X|O)(\\1\\1(...)*$|.\\1.\\1..$|(..\\1){2}|(...\\1){2})";
        tester.checker(vertical);
    }
}
