public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("h{4}(hh|h{3})*a{6,}(aa|a{3})*(cc)+(kk){2,10}k$");
    }
}
