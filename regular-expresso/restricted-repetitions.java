public class Solution {
    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        // "hh((hh)+|h((hhh)+|hhh{5}+))aaa((a(aa)+|aa{5}+)|(aaa)+)(cc)+k(kk){2,10}$"
        tester.checker("hh((hh)+|h((hhh)+|hhh{5}+))aaa((a(aa)+|aa{5}+)|(aaa)+)(cc)+k(kk){2,10}$");
    }
}
