public class App {
    public static void main(String[] args) throws Exception {
        Reader name = new Reader();
        int score = 0;
        int a = Methods.randInt(1, 10);
        int b = Methods.randInt(1, 10);
        System.out.println("What is " + a + " + " + b + "?");
        int answer = name.getInt("Answer:");
        if (answer == a+b){
            System.out.println("correct");
            score += 1;
        } else {
            System.out.println("Incorrect");
        }

        int c = Methods.randInt(1, 10);
        double d = Methods.randInt(1, 10);
        double z = Methods.randInt(1, 10);
        z = z/10;
        d = d + z;
        System.out.println("What is " + d + " - " + c + "?");
        double answer2 = name.getDouble("Answer:");
        if (answer2 == Methods.roundDouble(1, d-c)){
            System.out.println("correct");
            score += 1;
        } else {
            System.out.println("Incorrect");
            System.out.println(d-c);
        }

        int e = Methods.randInt(1, 10);
        int f = Methods.randInt(1, 10);
        System.out.println("What is " + e + " * " + f + "?");
        int answer3 = name.getInt("Answer:");
        if (answer3 == e*f){
            System.out.println("correct");
            score += 1;
        } else {
            System.out.println("Incorrect");
        }

        double g = Methods.randInt(1, 10);
        double h = Methods.randInt(1, 100);
        double y = Methods.randInt(1, 10);
        double x = Methods.randInt(1, 10);
        y = y/10;
        x = x/10;
        h = h + z;
        g = g + x;
        System.out.println("What is " + h + " / " + g + "?");
        double answer4 = name.getDouble("Answer:");
        if (answer4 == Methods.roundDouble(1, h/g)){
            System.out.println("correct");
            score += 1;
        } else {
            System.out.println("Incorrect");
            System.out.println(h/g);
        }

        int i = Methods.randInt(1, 10);
        int j = Methods.randInt(1, 10);
        System.out.println("What is " + i + " % " + j + "?");
        int answer5 = name.getInt("Answer:");
        if (answer5 == i % j){
            System.out.println("correct");
            score += 1;
        } else {
            System.out.println("Incorrect");
            System.out.println(i % j);
        }
    }
}
