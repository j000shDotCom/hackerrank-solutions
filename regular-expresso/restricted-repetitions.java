public class Solution {
    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        // "hh((hh)+|h((hhh)+|hh(h{5})+))aaa((a(aa)+|a(a{5})+)|(aaa)+)(cc)+k(kk){2,10}$"
        tester.checker("(h{2})+(a{2})+(cc)+k(kk){2,10}$");
    }
}
