
class human
{
    String name;
    int age;
    double weight;

    human(String name,int age,double weight)
    {
     
     this.name=name;
     this.age=age;
     this.weight=weight;

    }
    void eat()
    {
        System.out.println(this.name + " is eating ");
    }
    void drink()
    {
        System.out.println(this.name + " is drinking ");
    }
}
class main
{
    public static void main(String args[])
    {
        human human1=new human("CHANDINI",19,40);
        human human2=new human("LIKHITHA",21,45);
        human1.eat();
        human2.drink();
    }
}