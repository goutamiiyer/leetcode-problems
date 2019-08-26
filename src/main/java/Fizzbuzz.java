public class Fizzbuzz
{
    public static void main(String[] args)
    {
        int num = 17;
        Fizzbuzz fb = new Fizzbuzz();
        fb.printfizzbuzz(num);
    }

    void printfizzbuzz(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            if (i % (3*5) == 0)
            {
                System.out.println("Fizz Buzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
        return;
    }
}