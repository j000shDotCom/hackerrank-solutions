class Grade extends Student{
   private int score;
   Grade(String f, String l, int p, int s) {
       super(f, l, p);
       this.score = s;
   }
   char calculate() {
       char c;
       if (score < 40)
           c = 'D';
       else if (score < 60) 
           c = 'B';
       else if (score < 75)
           c = 'A';
       else if (score < 90)
           c = 'E';
       else
           c = 'O';
       return c;
   }
}
