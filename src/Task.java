public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();
        System.out.println(developer.makeJob());

        Developer seniorDeveloper = new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println(seniorDeveloper.makeJob());

        Developer teamLead = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(teamLead.makeJob());
    }
}
