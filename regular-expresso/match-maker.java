public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        // "^(d[bcgj]|[ej][^h]|[hi][bhe]|b(e|hd))|a(a[adg]|b[cf])$"
        tester.checker("^([dej][^dhi]|[hi][bhe]|b(e|hd))|a(a[adg]|b[cf]|ga)$");
    }
}
