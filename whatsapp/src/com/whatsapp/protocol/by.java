// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.io.Writer;

// Referenced classes of package com.whatsapp.protocol:
//            bt, c4, c_, b0, 
//            bj

public final class by
    implements bt
{

    private static final String b[];
    private static final String z[];
    private final Writer a;

    public by(Writer writer)
    {
        a = writer;
    }

    private void b(c_ c_1)
    {
label0:
        {
            boolean flag = false;
            int k = c4.F;
            a.write(60);
            a.write(c_1.d);
            if (c_1.f != null)
            {
                int i = 0;
                do
                {
                    if (i >= c_1.f.length)
                    {
                        break;
                    }
                    a.write(32);
                    a.write(c_1.f[i].a);
                    a.write(z[5]);
                    a(c_1.f[i].b);
                    a.write(39);
                    i++;
                } while (k == 0);
            }
            if (c_1.b == null && c_1.a == null)
            {
                a.write(z[3]);
                if (k == 0)
                {
                    break label0;
                }
            }
            if (b(c_1.d))
            {
                a.write(z[4]);
                a.write(c_1.d);
                a.write(62);
                if (k == 0)
                {
                    break label0;
                }
            }
            a.write(62);
            if (c_1.b != null)
            {
                a(c_1.b);
            }
            if (c_1.a != null)
            {
                int j = ((flag) ? 1 : 0);
                do
                {
                    if (j >= c_1.a.length)
                    {
                        break;
                    }
                    c(c_1.a[j]);
                    j++;
                } while (k == 0);
            }
            a.write(z[6]);
            a.write(c_1.d);
            a.write(62);
        }
    }

    private static boolean b(String s)
    {
        boolean flag1 = false;
        int j = c4.F;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < b.length)
                {
                    if (!b[i].equals(s))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
            if (j != 0)
            {
                return false;
            }
        } while (true);
    }

    private void c(c_ c_1)
    {
        b(c_1);
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        a.write(z[7]);
        a.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(bj bj)
    {
    }

    public void a(c_ c_1)
    {
        this;
        JVM INSTR monitorenter ;
        a(c_1, 1);
        this;
        JVM INSTR monitorexit ;
        return;
        c_1;
        throw c_1;
    }

    public void a(c_ c_1, int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (c_1 != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        a.write(32);
        if (c4.F == 0)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        c(c_1);
        if ((i & 1) == 0)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        a.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        c_1;
        throw c_1;
    }

    public void a(c_ c_1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        a(c_1, i);
        this;
        JVM INSTR monitorexit ;
        return;
        c_1;
        throw c_1;
    }

    void a(String s)
    {
        a(s.getBytes());
    }

    public void a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        a.write(z[1]);
        a.write(s);
        a.write(z[0]);
        a.write(s1);
        a.write(z[2]);
        a.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    void a(byte abyte0[])
    {
        int j = c4.F;
        StringBuilder stringbuilder = new StringBuilder();
        int k = abyte0.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= k)
                {
                    break label0;
                }
                byte byte0 = abyte0[i];
                if (byte0 < 33 || byte0 == 37 || byte0 > 126)
                {
                    stringbuilder.append('%');
                    String s = Integer.toHexString(byte0 & 0xff);
                    if (s.length() == 1)
                    {
                        stringbuilder.append('0');
                    }
                    stringbuilder.append(s);
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                stringbuilder.append((char)byte0);
            }
            i++;
        } while (j == 0);
        a.write(stringbuilder.toString());
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "I\030s(\"\001Ms.4S\037";
        byte0 = -1;
        as1 = as;
        i = 0;
_L10:
        int j;
        int k;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L7:
        if (k <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte1;
            char c1;
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "RKu?4\017U;>%\034]` q\032W<j";
                i = 1;
                as1 = as;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "I\006";
                i = 2;
                as1 = as;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "A\006";
                i = 3;
                as1 = as;
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "PCz\016\036 lD\003\005=\030D\001\030*}E0,R\027";
                i = 4;
                as1 = as;
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                as1 = as;
                obj = "S\037";
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "R\027";
                byte0 = 5;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "R\027r9#\013Ylw\"\032Jd,<P";
                byte0 = 6;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                as = new String[1];
                obj = "\fWe4";
                byte0 = 7;
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 292
    //                   0 315
    //                   1 322
    //                   2 329
    //                   3 335;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_335;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 81;
_L8:
        obj[j] = (char)(byte1 ^ c1);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 110;
          goto _L8
_L3:
        byte1 = 56;
          goto _L8
_L4:
        byte1 = 1;
          goto _L8
        byte1 = 77;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        b = as;
    }
}
