public class Tester {

    public static void main(String[] args) {

        Student terrence = new Student();
        terrence.setName("Terrence");
        terrence.setScore(1, 100);
        terrence.setScore(2, 90);
        terrence.setScore(3, 80);

        String result = terrence.validateData();

        if (result == null) {
            System.out.println(terrence);
        } else {
            System.out.println(result);
        }
    
    }

}

