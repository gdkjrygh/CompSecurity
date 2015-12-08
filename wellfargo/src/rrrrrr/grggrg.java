// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;


// Referenced classes of package rrrrrr:
//            ggggrg

public class grggrg extends ggggrg
{

    public static int b041504150415041504150415 = 0;
    public static int b041504150415041504150415 = 1;
    public static int b041504150415041504150415 = 2;
    public static int b041504150415041504150415 = 92;

    public grggrg()
    {
        int i = b041504150415041504150415;
        switch ((i * (b041504150415041504150415 + i)) % b041504150415041504150415)
        {
        default:
            b041504150415041504150415 = b042704270427042704270427();
            b041504150415041504150415 = b042704270427042704270427();
            break;

        case 0: // '\0'
            break;
        }
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

    public static int b042704270427042704270427()
    {
        return 66;
    }

    public String b042B042B042B042B042B042B(String s, char c, char c1)
    {
        s = s.toCharArray();
        char ac[] = new char[s.length];
        int i = 0;
        do
        {
            if (i >= s.length)
            {
                break;
            }
            int j = s[i];
            if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
            {
                b041504150415041504150415 = 21;
                b041504150415041504150415 = 22;
            }
            ac[i] = (char)(j - c - c1);
            j = i + 1;
            i = j;
            if (((b042704270427042704270427() + b041504150415041504150415) * b042704270427042704270427()) % b041504150415041504150415 != b041504150415041504150415)
            {
                b041504150415041504150415 = 75;
                b041504150415041504150415 = b042704270427042704270427();
                i = j;
            }
        } while (true);
        s = new String(ac);
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
        return s;
    }
}
