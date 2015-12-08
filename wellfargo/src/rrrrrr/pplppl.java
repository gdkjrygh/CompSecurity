// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;


// Referenced classes of package rrrrrr:
//            lnnnnn

public class pplppl extends lnnnnn
{

    public static int b043D043D043D043D043D043D = 0;
    public static int b043D043D043D043D043D043D = 1;
    public static int b043D043D043D043D043D043D = 2;
    public static int b043D043D043D043D043D043D = 46;

    public pplppl()
    {
        try
        {
            super();
            return;
        }
        catch (Exception exception)
        {
            throw exception;
        }
    }

    public static int b0421042104210421042104210421()
    {
        return 1;
    }

    public static int b0421042104210421042104210421()
    {
        return 83;
    }

    public String b043604360436043604360436(String s, char c)
    {
        char ac[];
        int i;
        int j;
        int k;
        try
        {
            s = s.toCharArray();
            ac = new char[s.length];
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
label0:
            do
            {
                switch (1)
                {
                default:
                    while (true) 
                    {
                        switch (1)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            continue label0;

                        case 1: // '\001'
                            break label0;
                        }
                    }
                    break;

                case 0: // '\0'
                    break;

                case 1: // '\001'
                    break label0;
                }
            } while (true);
            throw s;
        }
        j = 0;
        k = b043D043D043D043D043D043D;
        i = j;
        switch ((k * (b0421042104210421042104210421() + k)) % b043D043D043D043D043D043D)
        {
        default:
            b043D043D043D043D043D043D = 34;
            b043D043D043D043D043D043D = b0421042104210421042104210421();
            i = j;
            break;

        case 0: // '\0'
            break;
        }
        if (i >= s.length)
        {
            break; /* Loop/switch isn't completed */
        }
        j = s[i];
        ac[i] = (char)(j - c - c - c);
        j = i + 1;
        i = j;
        if (((b043D043D043D043D043D043D + b043D043D043D043D043D043D) * b043D043D043D043D043D043D) % b043D043D043D043D043D043D != b043D043D043D043D043D043D)
        {
            b043D043D043D043D043D043D = b0421042104210421042104210421();
            b043D043D043D043D043D043D = 16;
            i = j;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_67;
_L1:
        try
        {
            s = new String(ac);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        return s;
    }
}
