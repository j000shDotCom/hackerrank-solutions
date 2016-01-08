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
        String horizontal = "^(...){0,2}(X|O)\\2\\2";
        String vertical = "(X|O)((.|..|...)\\3){2}";
        // String vertdiag = "(X|O).{1,3}\\3.{1,3}\\3";
        tester.checker(horizontal + "|" + vertical);
    }
}
