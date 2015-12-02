// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.whatsapp.util:
//            ao, Log, j, b9

final class a7
{

    private static final String z[];
    private final String a;
    private final long b[];
    private long c;
    private j d;
    final ao e;
    private boolean f;

    private a7(ao ao1, String s)
    {
        e = ao1;
        super();
        a = s;
        b = new long[ao.b(ao1)];
    }

    a7(ao ao1, String s, b9 b9)
    {
        this(ao1, s);
    }

    static long a(a7 a7_1, long l)
    {
        a7_1.c = l;
        return l;
    }

    static j a(a7 a7_1, j j)
    {
        a7_1.d = j;
        return j;
    }

    private IOException a(String as[])
    {
        throw new IOException((new StringBuilder()).append(z[0]).append(Arrays.toString(as)).toString());
    }

    static void a(a7 a7_1, String as[])
    {
        a7_1.b(as);
    }

    static boolean a(a7 a7_1, boolean flag)
    {
        a7_1.f = flag;
        return flag;
    }

    static long[] a(a7 a7_1)
    {
        return a7_1.b;
    }

    static String b(a7 a7_1)
    {
        return a7_1.a;
    }

    private void b(String as[])
    {
        boolean flag = Log.f;
        try
        {
            if (as.length != ao.b(e))
            {
                throw a(as);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            throw as;
        }
        int i = 0;
        do
        {
            try
            {
                if (i >= as.length)
                {
                    break;
                }
                b[i] = Long.parseLong(as[i]);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw a(as);
            }
            i++;
        } while (!flag);
    }

    static boolean c(a7 a7_1)
    {
        return a7_1.f;
    }

    static long d(a7 a7_1)
    {
        return a7_1.c;
    }

    static j e(a7 a7_1)
    {
        return a7_1.d;
    }

    public File a(int i)
    {
        return new File(ao.c(e), (new StringBuilder()).append(a).append(".").append(i).toString());
    }

    public String a()
    {
        boolean flag = Log.f;
        StringBuilder stringbuilder = new StringBuilder();
        long al[] = b;
        int j = al.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            long l = al[i];
            stringbuilder.append(' ').append(l);
            i++;
        } while (!flag);
        return stringbuilder.toString();
    }

    public File b(int i)
    {
        return new File(ao.c(e), (new StringBuilder()).append(a).append(".").append(i).append(z[1]).toString());
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "3,$e\036#!5x\nf(.h\034(#-=\002/,$'N";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "h6,m";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 110;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 70;
          goto _L9
_L5:
        byte0 = 66;
          goto _L9
_L6:
        byte0 = 65;
          goto _L9
        byte0 = 29;
          goto _L9
    }
}
