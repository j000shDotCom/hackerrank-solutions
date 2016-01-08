public class Solution {
    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        String back = "(cc)+k(kk){2,10}$";
        // "hh((hh)+|h(hhh)+|hhh(h{5})+|h{47})aaa(a(aa)+|(aaa)+|aa(a{5})+|a{47})(cc)+k(kk){2,10}$"
        tester.checker("(h{2,})\\1+(a{2,})\\2+" + back);
    }
}
