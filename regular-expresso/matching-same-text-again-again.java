public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        String front = "([a-z])(\\w)(\\s)(\\W)(\\d)(\\D)([A-Z])([a-zA-Z])([aeiouAEIOU])(\\S)";
        String back = "\\1\\2\\3\\4\\5\\6\\7\\8\\9\\10";
        tester.checker(front + back);
    
    }
}
