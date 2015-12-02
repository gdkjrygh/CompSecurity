// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Arrays;

// Referenced classes of package com.google:
//            bi

public final class f_
{

    private static final String z[];
    private final bi a;
    private final int b;
    private final String c;

    f_(int i, String s, bi bi1)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException(z[2]);
        }
        if (s == null || bi1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        } else
        {
            b = i;
            c = s;
            a = bi1;
            return;
        }
    }

    public int a()
    {
        return b + c.length();
    }

    public int b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        boolean flag;
        try
        {
            flag = obj instanceof f_;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag)
        {
            return false;
        }
        obj = (f_)obj;
        boolean flag1 = c.equals(((f_) (obj)).c);
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        int i;
        int j;
        i = b;
        j = ((f_) (obj)).b;
        if (i != j)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag2;
        try
        {
            flag2 = a.equals(((f_) (obj)).a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag2) goto _L1; else goto _L3
_L3:
        return false;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), c, a
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[1]).append(b()).append(",").append(a()).append(z[0]).append(c).toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "KD";
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
                obj = "2\f@Rp,\021B^p\020)NHv\nDt";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "1\020NNaB\rAXp\032DBIf\026DMY5\\Y\017\f;";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 21;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 98;
          goto _L9
_L5:
        byte0 = 100;
          goto _L9
_L6:
        byte0 = 47;
          goto _L9
        byte0 = 60;
          goto _L9
    }
}
