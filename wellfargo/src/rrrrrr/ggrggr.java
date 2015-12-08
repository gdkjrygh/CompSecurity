// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;


// Referenced classes of package rrrrrr:
//            lnnnnn

public class ggrggr extends lnnnnn
{

    public static int b041A041A041A041A041A041A = 1;
    public static int b041A041A041A041A041A041A = 97;
    public static int b041A041A041A041A041A041A = 0;
    public static int b041A041A041A041A041A041A = 2;

    public ggrggr()
    {
        try
        {
            throw new NullPointerException();
        }
        catch (Exception exception) { }
        try
        {
            super();
            return;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
    }

    public static int b042B042B042B042B042B042B()
    {
        return 69;
    }

    public static int b042B042B042B042B042B042B()
    {
        return 2;
    }

    public String b043604360436043604360436(String s, char c)
    {
        int l;
        int j1;
        l = 0;
        j1 = 2;
        int ai[];
        String s1;
        Object obj;
        int j;
        s1 = String.valueOf(c);
        ai = new int[257];
        obj = new int[257];
        j = s1.length();
        int i = 0;
_L2:
        if (i > 255)
        {
            break; /* Loop/switch isn't completed */
        }
        obj[i] = Integer.valueOf(s1.substring(i % j, i % j + 1).toCharArray()[0]).intValue();
        ai[i] = i;
        i++;
        if (true) goto _L2; else goto _L1
_L10:
        if (i > 255) goto _L4; else goto _L3
_L4:
        stringbuilder = new StringBuilder();
        k = 1;
        i1 = 0;
        i = j1;
_L8:
        if (k > s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = (i1 + 1) % 256;
        l = (l + ai[i1]) % 256;
        l1 = ai[i1];
_L6:
        j1 = i / 0;
        i = j1;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        int k1;
        try
        {
            b041A041A041A041A041A041A = 33;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        ai[i1] = ai[l];
        ai[l] = l1;
        k1 = ai[i1];
        l1 = ai[l];
        k1 = ai[(k1 + l1) % 256];
        l1 = Integer.valueOf(s.substring(k - 1, (k - 1) + 1).toCharArray()[0]).intValue();
        c = (char)(k1 ^ l1);
        stringbuilder.append(c);
        k++;
        if (true) goto _L8; else goto _L7
_L1:
        i = 0;
        k = 0;
        continue; /* Loop/switch isn't completed */
_L7:
        s = stringbuilder.toString();
        stringbuilder.setLength(0);
        return s;
        s;
        throw s;
        s;
        throw s;
_L3:
        int i1 = ai[i];
        int l1 = b042B042B042B042B042B042B();
        StringBuilder stringbuilder;
        int k;
        switch ((l1 * (b041A041A041A041A041A041A + l1)) % b041A041A041A041A041A041A)
        {
        default:
            b041A041A041A041A041A041A = 12;
            b041A041A041A041A041A041A = b042B042B042B042B042B042B();
            // fall through

        case 0: // '\0'
            k = (k + i1 + obj[i]) % 256;
            break;
        }
        i1 = ai[i];
        ai[i] = ai[k];
        ai[k] = i1;
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
