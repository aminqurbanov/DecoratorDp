public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeeklyReport() {
        return " Send week report to customer.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeeklyReport();
    }
}
