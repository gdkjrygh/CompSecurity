// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;


// Referenced classes of package rrrrrr:
//            lnnnnn

public class plpppl extends lnnnnn
{

    public static int b043D043D043D043D043D043D = 94;
    public static int b043D043D043D043D043D043D = 1;
    public static int b043D043D043D043D043D043D = 2;
    public static int b043D043D043D043D043D043D;

    public plpppl()
    {
        if (((b0421042104210421042104210421() + b043D043D043D043D043D043D) * b0421042104210421042104210421()) % b043D043D043D043D043D043D != b043D043D043D043D043D043D)
        {
            int i = b043D043D043D043D043D043D;
            switch ((i * (b043D043D043D043D043D043D + i)) % b043D043D043D043D043D043D)
            {
            default:
                b043D043D043D043D043D043D = b0421042104210421042104210421();
                b043D043D043D043D043D043D = 33;
                // fall through

            case 0: // '\0'
                b043D043D043D043D043D043D = 35;
                break;
            }
        }
        super();
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
label1:
                    switch (1)
                    {
                    case 0: // '\0'
                        break;

                    default:
label2:
                        while (true) 
                        {
                            switch (1)
                            {
                            default:
                                break;

                            case 0: // '\0'
                                break label1;

                            case 1: // '\001'
                                break label2;
                            }
                        }
                        // fall through

                    case 1: // '\001'
                        switch (0)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            break label0;

                        case 1: // '\001'
                            continue label0;
                        }
                        break;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
    }

    public static int b0421042104210421042104210421()
    {
        return 45;
    }

    public String b043604360436043604360436(String s, char c)
    {
        char ac[];
        int i;
        char c1;
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
        while (i < s.length) 
        {
            c1 = s[i];
            ac[i] = (char)(c1 - c);
            i++;
        }
        try
        {
            s = new String(ac);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        c = b043D043D043D043D043D043D;
        switch ((c * (b043D043D043D043D043D043D + c)) % b043D043D043D043D043D043D)
        {
        default:
            b043D043D043D043D043D043D = 83;
            b043D043D043D043D043D043D = 99;
            if (((b0421042104210421042104210421() + b043D043D043D043D043D043D) * b0421042104210421042104210421()) % b043D043D043D043D043D043D != b043D043D043D043D043D043D)
            {
                b043D043D043D043D043D043D = 57;
                b043D043D043D043D043D043D = b0421042104210421042104210421();
            }
            // fall through

        case 0: // '\0'
            return s;
        }
    }
}
