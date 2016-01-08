public class Solution {
    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        // "hh((hh)+|h((hhh)+|hh(h{5})+))aaa((a(aa)+|a(a{5})+)|(aaa)+)(cc)+k(kk){2,10}$"
        tester.checker("hh((hh)+|h(hhh)+|hhh(h{5})+|h{47})aaa(a(aa)+|(aaa)+|aa(a{5})+|a{47})(cc)+k(kk){2,10}$");
    }
}
