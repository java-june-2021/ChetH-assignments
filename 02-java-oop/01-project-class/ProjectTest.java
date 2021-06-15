public class ProjectTest{
    public static void main(String[] args){
        Project proj1 = new Project("Procure mountain bike", "Visit bike shops, test ride, buy", 2400.0);
        Project proj2 = new Project();
        proj2.setName("Relandscape yard");
        proj2.setDescription("Demolition, regrade, irrigate, sod, plant");
        proj2.setInitialCost(40000.0);
        Project proj3 = new Project();
        proj3.setName("Make a pizza");
        proj3.setInitialCost(9.82);
        System.out.println(Project.elevatorPitch(proj1));
        System.out.println(Project.elevatorPitch(proj2));
        System.out.println(Project.elevatorPitch(proj3));
    }
}