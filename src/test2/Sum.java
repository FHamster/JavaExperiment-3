package test2;

class Sum
{
    public static int static_getSum(int begin, int end)
    {
        int sum = 0;
        for (int i = Math.min(begin, end); i < Math.max(begin, end); i++)
        {
            sum += i;
        }
        return sum;
    }

    public int getSum(int begin, int end)
    {
        int sum = 0;
        for (int i = Math.min(begin, end); i < Math.max(begin, end); i++)
        {
            sum += i;
        }
        return sum;
    }
}