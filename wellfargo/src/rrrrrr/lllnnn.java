// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;


// Referenced classes of package rrrrrr:
//            lnnnnn

public class lllnnn extends lnnnnn
{

    public static int b044C044C044C044C044C044C = 2;
    public static int b044C044C044C044C044C044C = 54;
    public static int b044C044C044C044C044C044C = 0;
    public static int b044C044C044C044C044C044C = 1;

    public lllnnn()
    {
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
        super();
        if (((b044C044C044C044C044C044C + b0446044604460446044604460446()) * b044C044C044C044C044C044C) % b044C044C044C044C044C044C != b044C044C044C044C044C044C)
        {
label1:
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
                            break label1;

                        case 1: // '\001'
                            continue label1;
                        }
                    }
                    break;

                case 0: // '\0'
                    break label1;

                case 1: // '\001'
                    break;
                }
            } while (true);
            b044C044C044C044C044C044C = 21;
            b044C044C044C044C044C044C = b0446044604460446044604460446();
            int i = b044C044C044C044C044C044C;
            switch ((i * (b044C044C044C044C044C044C + i)) % b044C044C044C044C044C044C)
            {
            default:
                b044C044C044C044C044C044C = 51;
                b044C044C044C044C044C044C = b0446044604460446044604460446();
                break;

            case 0: // '\0'
                break;
            }
        }
    }

    public static int b0446044604460446044604460446()
    {
        return 81;
    }

    public static int b0446044604460446044604460446()
    {
        return 1;
    }

    public String b043604360436043604360436(String s, char c)
    {
        boolean flag = false;
        char ac1[] = s.toCharArray();
        char ac[] = new char[ac1.length];
        int i;
label0:
        do
        {
            i = ((flag) ? 1 : 0);
            switch (1)
            {
            default:
                while (true) 
                {
                    i = ((flag) ? 1 : 0);
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
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        while (i < ac1.length) 
        {
            char c1 = (char)(ac1[i] + c + c + c);
            if (((b044C044C044C044C044C044C + b044C044C044C044C044C044C) * b044C044C044C044C044C044C) % b044C044C044C044C044C044C != b044C044C044C044C044C044C)
            {
                b044C044C044C044C044C044C = 16;
                b044C044C044C044C044C044C = 83;
            }
            ac[i] = c1;
            i++;
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                b044C044C044C044C044C044C = b0446044604460446044604460446();
            }
        }
        return new String(ac);
    }
}
