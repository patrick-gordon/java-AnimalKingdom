package animalkingdom;

public class Birds extends AbstractAnimals{

    public Birds (int id, String name, int year){
        super(id, name, year);
    }

    
    @Override
    public String getMove(){
        return "Fly";
    }

    @Override
    public String getBreath(){
        return "Lungs";
    }


    @Override
    public String getReproduce(){
        return "Eggs";
    }

    @Override
    public String getSpecies()
    {
        return "Birds";
    }

    @Override
    public String toString()
    {
        return "Birds{" + 
        "Id: '" + id + '\'' +
        ", Name: " + name + 
        ", Year: " + year + 
        ", Move: " + getMove() + 
        ", Breaths: " + getBreath() + 
        ", Reproduce: " + getReproduce() +
        '}';
    }
}