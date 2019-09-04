package animalkingdom;

public abstract class AbstractAnimal {
    int id;
    int name;
    int year;

    public AbstractAnimal(int id, String name, double year){
        this.id = id;
        this.name = name;
        this.year = year;
    }

    //public abstracts
    public abstract String getMove();
    public abstract String getBreath();
    public abstract String getReproduce();
    
    //meathods 
    public getId(){
        return id;
    }

    public getName(){
        return name;
    }

    public getYear(){
        return year;
    }

}