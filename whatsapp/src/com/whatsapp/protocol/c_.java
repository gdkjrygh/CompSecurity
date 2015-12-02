// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.io.InputStream;
import java.util.Vector;

// Referenced classes of package com.whatsapp.protocol:
//            bg, c4, bp, b0

public final class c_
{

    private static final String z[];
    public final c_ a[];
    public final byte b[];
    public int c;
    public final String d;
    public InputStream e;
    public final b0 f[];

    public c_(String s, b0 ab0[])
    {
        e = null;
        d = s;
        f = ab0;
        a = null;
        b = null;
    }

    public c_(String s, b0 ab0[], c_ c_1)
    {
        e = null;
        d = s;
        f = ab0;
        a = (new c_[] {
            c_1
        });
        b = null;
    }

    public c_(String s, b0 ab0[], InputStream inputstream, int i)
    {
        e = null;
        d = s;
        f = ab0;
        a = null;
        b = null;
        e = inputstream;
        c = i;
    }

    public c_(String s, b0 ab0[], String s1)
    {
        e = null;
        d = s;
        f = ab0;
        a = null;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        b = bg.a(s1);
        if (c4.F == 0)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        b = null;
        return;
        s;
        throw s;
    }

    public c_(String s, b0 ab0[], byte abyte0[])
    {
        e = null;
        d = s;
        f = ab0;
        a = null;
        b = abyte0;
    }

    public c_(String s, b0 ab0[], c_ ac_[])
    {
        e = null;
        d = s;
        f = ab0;
        a = ac_;
        b = null;
    }

    public static c_ a(c_ c_1)
    {
        if (c_1 == null)
        {
            try
            {
                throw new bp(z[5]);
            }
            // Misplaced declaration of an exception variable
            catch (c_ c_1)
            {
                throw c_1;
            }
        } else
        {
            return c_1;
        }
    }

    public static boolean a(c_ c_1, String s)
    {
        if (c_1 == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        String s1;
        try
        {
            s1 = c_1.d;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            try
            {
                throw c_1;
            }
            // Misplaced declaration of an exception variable
            catch (c_ c_1)
            {
                throw c_1;
            }
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        if (c_1.d.equals(s))
        {
            return true;
        }
        return false;
    }

    public static byte[] a(c_ c_1, int i)
    {
        try
        {
            if (c_1.b == null)
            {
                throw new bp((new StringBuilder()).append(z[3]).append(c_1).append(z[1]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        try
        {
            if (c_1.b.length != i)
            {
                throw new bp((new StringBuilder()).append(z[2]).append(c_1).append(z[0]).append(c_1.b.length).append(z[4]).append(i).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        return c_1.b;
    }

    public static void b(c_ c_1, String s)
    {
        try
        {
            if (!a(c_1, s))
            {
                throw new bp((new StringBuilder()).append(z[9]).append(c_1).append(z[8]).append(s).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
    }

    public c_ a(int i)
    {
        c_ ac_[];
        try
        {
            ac_ = a;
        }
        catch (NumberFormatException numberformatexception)
        {
            try
            {
                throw numberformatexception;
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw numberformatexception1;
            }
        }
        if (ac_ == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (a.length > i)
        {
            return a[i];
        }
        return null;
    }

    public c_ a(String s)
    {
        int j = c4.F;
        c_ ac_[];
        try
        {
            ac_ = a;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (ac_ == null)
        {
            return null;
        }
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= a.length)
                {
                    break label0;
                }
                try
                {
                    if (!s.equals(a[i].d))
                    {
                        break label1;
                    }
                    s = a[i];
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
                return s;
            }
            i++;
        } while (j == 0);
        return null;
    }

    public String a()
    {
        byte abyte0[];
        try
        {
            abyte0 = b;
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return bg.a(b);
        }
    }

    public String a(String s, String s1)
    {
        int j = c4.F;
        b0 ab0[];
        try
        {
            ab0 = f;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (ab0 != null)
        {
            int i = 0;
            while (i < f.length) 
            {
label0:
                {
                    b0 b0_1 = f[i];
                    try
                    {
                        if (!s.equals(b0_1.a))
                        {
                            break label0;
                        }
                        s = b0_1.b;
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw s;
                    }
                    return s;
                }
                i++;
                if (j != 0)
                {
                    return s1;
                }
            }
        }
_L2:
        return s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Vector b(String s)
    {
        int j = c4.F;
        Vector vector = new Vector();
        c_ ac_[];
        try
        {
            ac_ = a;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (ac_ == null)
        {
            return vector;
        }
        int i = 0;
        do
        {
            if (i >= a.length)
            {
                break;
            }
            try
            {
                if (s.equals(a[i].d))
                {
                    vector.addElement(a[i]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            i++;
        } while (j == 0);
        return vector;
    }

    public long c(String s)
    {
        String s1 = e(s);
        long l;
        try
        {
            l = Long.parseLong(s1);
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new bp((new StringBuilder()).append(z[10]).append(s).append(z[11]).append(s1).toString());
        }
        return l;
    }

    public String d(String s)
    {
        return a(s, ((String) (null)));
    }

    public String e(String s)
    {
        String s1 = a(s, ((String) (null)));
        if (s1 == null)
        {
            try
            {
                throw new bp((new StringBuilder()).append(z[12]).append(s).append(z[13]).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        } else
        {
            return s1;
        }
    }

    public int f(String s)
    {
        String s1 = e(s);
        int i;
        try
        {
            i = Integer.parseInt(s1);
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new bp((new StringBuilder()).append(z[7]).append(s).append(z[6]).append(s1).toString());
        }
        return i;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[14];
        obj = "|~\006\023p|v\002\tv(rG";
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
                obj = "|w\016\024b5t\000Gu=n\006";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ":{\016\013t8:\025\002`)s\025\002?|t\b\003t|";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ":{\016\013t8:\025\002`)s\025\002?|t\b\003t|";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "|;ZGc9k\022\016c9~G\013t2}\023\0171";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = ":{\016\013t8:\025\002`)s\025\002?|t\b\003t|s\024G\177)v\013";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "|s\024G\1773nG\016\177(\177\000\025p0 G";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "=n\023\025x>o\023\0021";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "|i\023\025x2}]G";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = ":{\016\013t8:\025\002`)s\025\002?|t\b\003tf:";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "=n\023\025x>o\023\0021";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "|s\024G\1773nG\016\177(\177\000\025p0 G";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = ".\177\026\022x.\177\003Gp(n\025\016s)n\002G6";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "{:\n\016b/s\t\0";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 388
    //                   0 411
    //                   1 418
    //                   2 425
    //                   3 432;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_432;
_L3:
        byte byte1 = 17;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 92;
          goto _L9
_L5:
        byte1 = 26;
          goto _L9
_L6:
        byte1 = 103;
          goto _L9
        byte1 = 103;
          goto _L9
    }
}
