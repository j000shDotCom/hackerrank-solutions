public class Solution {
    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        String h = "(h{2,})\\1+";
        String a = "(a{3,})\\2+";
        String c = "(cc)+";
        String k = "k(kk){2,10}";
        tester.checker("^" + h + a + c + k + "$");
    }
}
