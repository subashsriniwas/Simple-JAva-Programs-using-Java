import java.util.*;

public class Grade {
    public static void main(String[] args) {

        System.out.println("Welcome To Grade Management System..");

        Ask obj = new Ask();
        obj.ask();

        Compute obj2 = new Compute(obj.getAiG(), obj.getMcG());
        obj2.totalGrade();
    }
}

class Ask {
    private int aiG = 0;
    private int mcG = 0;

    public void ask() {
        HashMap<String, Character> Marks = new HashMap<String, Character>();

        System.out.println("Enter The Grade of AI: ");
        Scanner s = new Scanner(System.in);
        String A = s.nextLine();

        char AI = A.charAt(0);

        if (AI == 'O' || AI == 'o') {
            aiG = 10;
        } else if (AI == 'A' || AI == 'a') {
            aiG = 8;
        } else {
            aiG = 6;
        }

        System.out.println("Enter The Grade of MC: ");
        String M = s.nextLine();
        char MC = M.charAt(0);

        if (MC == 'O' || MC == 'o') {
            mcG = 10;
        } else if (MC == 'A' || MC == 'a') {
            mcG = 8;
        } else {
            mcG = 6;
        }

        s.close();

        Marks.put("ArtificialIntelligence", AI);
        Marks.put("MobileComputing", MC);

        System.out.println(Marks);

        for (String Key : Marks.keySet()) {
            System.out.println(Key + " : " + Marks.get(Key));
        }

        System.out.println(aiG + " , " + mcG);
    }

    public int getAiG() {
        return aiG;
    }

    public int getMcG() {
        return mcG;
    }
}

class Compute {
    private int aiG;
    private int mcG;

    public Compute(int aiG, int mcG) {
        this.aiG = aiG;
        this.mcG = mcG;
    }

    public void totalGrade() {
        int overAll = aiG + mcG;

        System.out.println("Your CGPA is: " + overAll);
    }
}

