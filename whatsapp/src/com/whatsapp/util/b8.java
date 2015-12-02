// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.whatsapp.util:
//            Log

public final class b8
{

    private static final Pattern b;
    private static final String z[];
    private final String a;
    private final String c;

    private b8(String s, String s1)
    {
        a = s;
        c = s1;
    }

    public static b8 a(String s)
    {
        return a(s, z[4], z[3]);
    }

    public static b8 a(String s, String s1, String s2)
    {
        Matcher matcher;
label0:
        {
            if (s == null)
            {
                try
                {
                    s = new b8(s1, s2);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
                return s;
            }
            matcher = b.matcher(s);
            try
            {
                if (matcher.matches())
                {
                    break label0;
                }
                s = new b8(s1, s2);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return s;
        }
        s1 = matcher.group(1);
        try
        {
            s = String.format(Locale.US, z[2], new Object[] {
                Integer.valueOf(Integer.valueOf(matcher.group(2)).intValue())
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e((new StringBuilder()).append(z[1]).append(matcher.group(2)).toString());
            s = s2;
        }
        return new b8(s1, s);
    }

    public static String a(String s, String s1)
    {
        if (s != null)
        {
            s = b.matcher(s);
            boolean flag;
            try
            {
                flag = s.matches();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (flag)
            {
                s1 = s.group(1);
                s = s.group(2);
                return (new StringBuilder()).append(s1).append("-").append(s).toString();
            }
        }
        return s1;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        Class class1;
        Class class2;
        try
        {
            class1 = getClass();
            class2 = obj.getClass();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (class1 != class2)
        {
            return false;
        }
        obj = (b8)obj;
        boolean flag;
        try
        {
            flag = TextUtils.equals(a, ((b8) (obj)).a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.equals(c, ((b8) (obj)).c)) goto _L1; else goto _L3
_L3:
        return false;
    }

    public int hashCode()
    {
        int j = 0;
        String s;
        int i;
        try
        {
            s = a;
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
        if (s == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        try
        {
            s = c;
        }
        catch (NumberFormatException numberformatexception1)
        {
            throw numberformatexception1;
        }
        if (s != null)
        {
            j = c.hashCode();
        }
        return i * 31 + j;
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[0]).append(a).append(",").append(c).append(">").toString();
    }

    static 
    {
        char ac[];
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        ac = "\\\013^W\023rT";
        byte0 = -1;
        i = 0;
_L16:
        String as1[];
        int k;
        int l;
        as1 = as;
        ac = ac.toCharArray();
        l = ac.length;
        k = 0;
_L14:
        if (l > k) goto _L2; else goto _L1
_L1:
        ac = (new String(ac)).intern();
        byte0;
        JVM INSTR tableswitch 0 3: default 76
    //                   0 92
    //                   1 108
    //                   2 124
    //                   3 140;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        as1[i] = ac;
        ac = "|\013^w\023rGM{\017b\r\035w\023rHSu\t1\030\\h\016t\t_v\0301\tN:\024\177\034X}\030cR\035";
        i = 1;
        byte0 = 0;
        break; /* Loop/switch isn't completed */
_L4:
        as1[i] = ac;
        ac = "4X\016~";
        i = 2;
        byte0 = 1;
        break; /* Loop/switch isn't completed */
_L5:
        as1[i] = ac;
        ac = "!X\r";
        i = 3;
        byte0 = 2;
        break; /* Loop/switch isn't completed */
_L6:
        as1[i] = ac;
        i = 4;
        ac = "!X\r";
        byte0 = 3;
        break; /* Loop/switch isn't completed */
_L7:
        int j;
        as1[i] = ac;
        z = as;
        ac = "94YaNlA\025F\031jZ\021)\0008".toCharArray();
        j = ac.length;
        i = 0;
          goto _L8
_L2:
        c1 = ac[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 228
    //                   0 251
    //                   1 258
    //                   2 265
    //                   3 272;
           goto _L9 _L10 _L11 _L12 _L13
_L13:
        break MISSING_BLOCK_LABEL_272;
_L9:
        j = 125;
_L15:
        ac[k] = (char)(j ^ c1);
        k++;
          goto _L14
_L10:
        j = 17;
          goto _L15
_L11:
        j = 104;
          goto _L15
_L12:
        j = 61;
          goto _L15
        j = 26;
          goto _L15
        if (true) goto _L16; else goto _L2
_L8:
        char c1;
        if (j <= i)
        {
            b = Pattern.compile((new String(ac)).intern());
            return;
        }
        k = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 320
    //                   0 341
    //                   1 347
    //                   2 353
    //                   3 359;
           goto _L17 _L18 _L19 _L20 _L21
_L21:
        break MISSING_BLOCK_LABEL_359;
_L18:
        break; /* Loop/switch isn't completed */
_L17:
        byte0 = 125;
_L23:
        ac[i] = (char)(byte0 ^ k);
        i++;
        if (true) goto _L8; else goto _L22
_L22:
        byte0 = 17;
          goto _L23
_L19:
        byte0 = 104;
          goto _L23
_L20:
        byte0 = 61;
          goto _L23
        byte0 = 26;
          goto _L23
    }
}
