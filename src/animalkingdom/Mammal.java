package animalkingdom;

public class Mammal extends AbstractAnimals {

    public Mammal (int id, String name, int year){
        super(id, name, year);
    }

    //meathods

    @Override
    public String getMove(){
        return "Walk";
    }

    @Override
    public String getBreath(){
        return "Lungs";
    }


    @Override
    public String getReproduce(){
        return "Live Births";
    }

    @Override
    public String getSpecies()
    {
        return "Mammal";
    }

    @Override
    public String toString()
    {
        return "Mammal{" + 
        "Id: '" + id + '\'' +
        ", Name: " + name + 
        ", Year: " + year + 
        ", Move: " + getMove() + 
        ", Breaths: " + getBreath() + 
        ", Reproduce: " + getReproduce() +
        '}';
    }
}