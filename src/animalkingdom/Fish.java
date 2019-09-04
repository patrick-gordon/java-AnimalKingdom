package animalkingdom;

public class Fish extends AbstractAnimals{

    public Fish (int id, String name, int year){
        super(id, name, year);
    }

    @Override
    public String getMove(){
        return "Swim";
    }

    @Override
    public String getBreath(){
        return "Gills";
    }


    @Override
    public String getReproduce(){
        return "Eggs";
    }

    @Override
    public String getSpecies()
    {
        return "Fish";
    }

    @Override
    public String toString()
    {
        return "Fish{" + 
        "Id: '" + id + '\'' +
        ", Name: " + name + 
        ", Year: " + year + 
        ", Move: " + getMove() + 
        ", Breaths: " + getBreath() + 
        ", Reproduce: " + getReproduce() +
        '}';
    }
}