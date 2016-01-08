public class Solution {
    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("hh((hh)+|h(hhh)+)aaaa((aa)+|aa(aaa)+)(cc)+k(kk){2,10}$");
    }
}
