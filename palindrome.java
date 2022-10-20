public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);

        int n;
        System.out.println("enter any number");
        n=s.nextInt();
        int m=n;
        int rev=0;

        while(n>0)
        {
            int r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }

        System.out.println("reverse of the number is "+rev);
    

        if(rev==m)
        {
            System.out.println("IT IS A PALINDROME");
        }
        else
        {
            System.out.println("IT IS NOT A PALINDROME");
        }
        s.close();
    }
