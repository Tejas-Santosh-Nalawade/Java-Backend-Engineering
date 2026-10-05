public class CourseAccess {
    public static void main(String[] args) {
        String paymentStatus = "SUCCESS";

        if(paymentStatus.equals("SUCCESS")){
            System.out.println("Access to the course");
        } else if(paymentStatus.equals("REFUNDED")){
            System.out.println("Your course is Refunded");
        } else if(paymentStatus.equals("PENDING")){
            System.out.println("Your request is processing");
        }
        else{
            System.out.println("Access not allowed");
        }

        // Switch Condition

        switch(paymentStatus){
            case "SUCCESS"-> System.out.println("Access to the course");
                case "REFUNDED"-> System.out.println("Your course is Refunded");
                    case "PENDING"-> System.out.println("Your request is processing");
                        default-> System.out.println("Access not allowed");
        }

        int watchedLesson = 5;
        int totalLesson = 10;

        // How many lessons are completed
        for(int lesson=1; lesson<=watchedLesson; lesson++){
            System.out.println("Lesson: " + lesson + " is Completed");
        }
        int lesson = 1;
        while(lesson <= watchedLesson){
            System.out.println("Lesson: " + lesson + " is Completed");
            lesson++;
        }
    }
}