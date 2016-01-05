public class Person {
  
    int age;	
	public Person(int initial_Age) {
        if (initial_Age < 0) {
            System.out.println("This person is not valid, setting age to 0.");
            initial_Age = 0;
        }
  		this.age = initial_Age;
	}

	public void amIOld() {
        String msg;
        if (this.age < 13)
            msg = "You are young.";
        else if (this.age < 18)
            msg = "You are a teenager.";
        else
            msg = "You are old.";
  		System.out.println(msg);
	}

	public void yearPasses() {
  		this.age += 1;
	}


