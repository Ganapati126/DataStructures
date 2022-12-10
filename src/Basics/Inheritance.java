package Basics;

public class Inheritance
{
    public static void main(String[] args) {
        System.out.println(Beta.saySomeThingDifferent());
        System.out.println(Beta.saySomeThing());
        System.out.println(Beta.saySomeThing("OK"));
        System.out.println(Beta.saySomeThing());
    }
}

class Baap
{
    public static String saySomeThing()
    {
        return "Hello from Baap";
    }
    public static String saySomeThing(String s)
    {
        return s;
    }
}

class Beta extends Baap
{
    public static String saySomeThingDifferent()
    {
        return "Hello from Beta";
    }

    public static String saySomeThing()
    {
        return  "Beta overridden Baap";
    }
}

interface GS
{
    default void doSomeThing()
    {

    }
}