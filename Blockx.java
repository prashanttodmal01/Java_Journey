class Demo
{
    public int i;
    static public int j;

    static
    {
        System.out.println("Inside static block");
        j = 21;
    }

    {
        System.out.println("inside initializer block");         //non static block
    }

    public Demo()
    {
        System.out.println("inside constructor");
        this.i = 11;
    }

    public Demo(int a)
    {
        System.out.println("Inside parametrised constrctor");
        this.i = a;
    }
}

class Blockx
{
    public static void main(String A[])
    {
        System.out.println("inside main ");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();
        Demo dobj4 = new Demo(11);
    }
}