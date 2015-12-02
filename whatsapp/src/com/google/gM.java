// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            cm, m

final class gM
{

    private static final String z[];
    private final m a;
    private final m b;
    private final cm c;
    private final boolean d;

    gM(m m, m m1, cm cm1, boolean flag)
    {
        b = m;
        a = m1;
        c = cm1;
        d = flag;
    }

    private static int a(Object obj)
    {
        if (obj == null)
        {
            return 0;
        } else
        {
            return obj.hashCode();
        }
    }

    private static boolean a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public boolean a()
    {
        return a == null;
    }

    cm b()
    {
        return c;
    }

    m c()
    {
        return a;
    }

    m d()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof gM)
        {
            if (a(b, ((gM) (obj = (gM)obj)).b) && a(a, ((gM) (obj)).a) && a(c, ((gM) (obj)).c))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return a(b) ^ a(a) ^ a(c);
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(z[1]).append(b).append(z[2]).append(a).append(z[3]);
        Object obj;
        if (c == null)
        {
            obj = z[0];
        } else
        {
            obj = Integer.valueOf(c.a());
        }
        return stringbuilder.append(obj).append(z[4]).toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "G\tuW";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "r\\";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\tP9";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\tF9";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\t!";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 15;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 41;
          goto _L9
_L5:
        byte1 = 124;
          goto _L9
_L6:
        byte1 = 25;
          goto _L9
        byte1 = 59;
          goto _L9
    }
}
