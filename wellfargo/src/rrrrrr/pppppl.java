// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;


// Referenced classes of package rrrrrr:
//            lnnnnn

public class pppppl extends lnnnnn
{

    public static int b043D043D043D043D043D043D = 92;
    public static int b043D043D043D043D043D043D = 2;
    public static int b043D043D043D043D043D043D = 0;
    public static int b043D043D043D043D043D043D = 1;

    public pppppl()
    {
        int i = b043D043D043D043D043D043D;
        switch ((i * (b043D043D043D043D043D043D + i)) % b043D043D043D043D043D043D)
        {
        default:
            b043D043D043D043D043D043D = 10;
            b043D043D043D043D043D043D = 90;
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public static int b0421042104210421042104210421()
    {
        return 2;
    }

    public static int b0421042104210421042104210421()
    {
        return 47;
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
                j = b043D043D043D043D043D043D;
                switch ((j * (b043D043D043D043D043D043D + j)) % b043D043D043D043D043D043D)
                {
                default:
                    b043D043D043D043D043D043D = b0421042104210421042104210421();
                    b043D043D043D043D043D043D = b0421042104210421042104210421();
                    // fall through

                case 0: // '\0'
                    ac[i] = (char)(s[i] + c);
                    break;
                }
                j = i + 1;
                i = j;
                if (((b043D043D043D043D043D043D + b043D043D043D043D043D043D) * b043D043D043D043D043D043D) % b0421042104210421042104210421() != b043D043D043D043D043D043D)
                {
                    b043D043D043D043D043D043D = 46;
                    b043D043D043D043D043D043D = 79;
                    i = j;
                }
            }
        } while (true);
        s = new String(ac);
        return s;
    }
}
