package Day5_IfElseStatements;

public class Topic6_IfElseExample {
    public static void main(String[] args) {

        // check if a student will ve accepted to school;
        // 1) SAT score must be 90 or more
        // 2) writing skill 5 or above

        double stScore = 89;
        int wrScore = 7;

        if(stScore >= 90 && wrScore >= 5){
            System.out.println("Student can be accepted");
                    }
        else{
            System.out.println("Student is rejected");
        }
    }
}
