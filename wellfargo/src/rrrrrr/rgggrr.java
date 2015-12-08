// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;


// Referenced classes of package rrrrrr:
//            lnnnnn

public class rgggrr extends lnnnnn
{

    public static int b041904190419041904190419 = 1;
    public static int b041904190419041904190419 = 2;
    public static int b041904190419041904190419 = 0;
    public static int b041904190419041904190419 = 1;

    public rgggrr()
    {
        if (((b041904190419041904190419 + b041904190419041904190419) * b041904190419041904190419) % b041904190419041904190419 != b041904190419041904190419)
        {
            b041904190419041904190419 = b043604360436043604360436();
            b041904190419041904190419 = b043604360436043604360436();
        }
        super();
        Exception exception;
        int i;
        int j;
        int k;
        try
        {
            i = b041904190419041904190419;
            j = b043604360436043604360436();
            k = b041904190419041904190419;
        }
        catch (Exception exception2)
        {
            throw exception2;
        }
        switch ((i * (j + i)) % k)
        {
        default:
            try
            {
                b041904190419041904190419 = b043604360436043604360436();
                b041904190419041904190419 = 94;
                return;
            }
            catch (Exception exception1)
            {
                throw exception1;
            }

        case 0: // '\0'
            return;
        }
        exception;
        throw exception;
    }

    public static int b043604360436043604360436()
    {
        return 2;
    }

    public static int b043604360436043604360436()
    {
        return 57;
    }

    public static int b043604360436043604360436()
    {
        return 1;
    }

    public String b043604360436043604360436(String s, char c)
    {
        s = s.toCharArray();
        char ac[] = new char[s.length];
        for (int i = 0; i < s.length; i++)
        {
            ac[i] = (char)(s[i] - c - c);
            if (((b041904190419041904190419 + b041904190419041904190419) * b041904190419041904190419) % b043604360436043604360436() == b041904190419041904190419)
            {
                continue;
            }
            b041904190419041904190419 = 94;
            int j = b041904190419041904190419;
            switch ((j * (b041904190419041904190419 + j)) % b041904190419041904190419)
            {
            default:
                b041904190419041904190419 = 66;
                b041904190419041904190419 = 86;
                // fall through

            case 0: // '\0'
                b041904190419041904190419 = 7;
                break;
            }
        }

        return new String(ac);
    }
}
