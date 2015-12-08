// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;


// Referenced classes of package rrrrrr:
//            lnnnnn

public class grrrgr extends lnnnnn
{

    public static int b041904190419041904190419 = 6;
    public static int b041A041A041A041A041A041A = 2;
    public static int b041904190419041904190419 = 1;
    public static int b041A041A041A041A041A041A;

    public grrrgr()
    {
        int i = 5;
        int j = b041904190419041904190419;
        switch ((j * (b041904190419041904190419 + j)) % b041A041A041A041A041A041A)
        {
        default:
            b041904190419041904190419 = b042B042B042B042B042B042B();
            b041904190419041904190419 = 72;
            break;

        case 0: // '\0'
            break;
        }
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        try
        {
            super();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        do
        {
            try
            {
                i /= 0;
            }
            catch (Exception exception1)
            {
                return;
            }
        } while (true);
    }

    public static int b042B042B042B042B042B042B()
    {
        return 37;
    }

    public String b043604360436043604360436(String s, char c)
    {
        char ac[];
        int i;
        try
        {
            s = s.toCharArray();
            ac = new char[s.length];
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        i = 0;
        do
        {
label0:
            {
                if (((b041904190419041904190419 + b041904190419041904190419) * b041904190419041904190419) % b041A041A041A041A041A041A != b041A041A041A041A041A041A)
                {
                    b041904190419041904190419 = 1;
                    b041A041A041A041A041A041A = b042B042B042B042B042B042B();
                }
                int j;
                try
                {
                    j = s.length;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
                if (i >= j)
                {
                    break label0;
                }
                j = b041904190419041904190419;
                switch ((j * (b041904190419041904190419 + j)) % b041A041A041A041A041A041A)
                {
                default:
label1:
                    while (true) 
                    {
                        switch (1)
                        {
                        default:
                            while (true) 
                            {
                                switch (0)
                                {
                                default:
                                    break;

                                case 0: // '\0'
                                    break label1;

                                case 1: // '\001'
                                    continue label1;
                                }
                            }
                            break;

                        case 0: // '\0'
                            break;

                        case 1: // '\001'
                            break label1;
                        }
                    }
                    b041904190419041904190419 = 25;
                    b041904190419041904190419 = 21;
                    // fall through

                case 0: // '\0'
                    ac[i] = (char)(s[i] ^ c);
                    i++;
                    break;
                }
            }
        } while (true);
        s = new String(ac);
        return s;
    }
}
