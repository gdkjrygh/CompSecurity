// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util.dns;

import com.whatsapp.DialogToastActivity;
import java.io.OutputStream;

// Referenced classes of package com.whatsapp.util.dns:
//            f, e

class h
{

    private static final String z[];
    private final boolean a;
    private final short b;
    private final short c;
    private final boolean d;
    private final short e;
    private final boolean f;
    private final boolean g;
    private final byte h;
    private final boolean i;
    private final short j;
    private final short k;
    private final short l;

    h(short word0, boolean flag, byte byte0, boolean flag1, boolean flag2, boolean flag3, boolean flag4, 
            short word1, short word2, short word3, short word4, short word5)
    {
        c = word0;
        f = flag;
        h = byte0;
        g = flag1;
        a = flag2;
        i = flag3;
        d = flag4;
        l = word1;
        k = word2;
        e = word3;
        b = word4;
        j = word5;
    }

    static h a(byte abyte0[], int i1)
    {
        boolean flag4 = false;
        int j1 = f.a;
        if (abyte0 == null)
        {
            try
            {
                throw new NullPointerException(z[2]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        try
        {
            if (abyte0.length < i1 + 12)
            {
                throw new IllegalArgumentException(z[3]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        short word0 = com.whatsapp.util.dns.e.a(abyte0, i1);
        byte byte0;
        short word1;
        short word2;
        short word3;
        short word4;
        byte byte1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if ((abyte0[i1 + 2] & 0x80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        byte0 = (byte)(abyte0[i1 + 2] >> 3 & 0xf);
        if ((abyte0[i1 + 2] & 4) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((abyte0[i1 + 2] & 2) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if ((abyte0[i1 + 2] & 1) != 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if ((abyte0[i1 + 3] & 0x80) != 0)
        {
            flag4 = true;
        }
        byte1 = (byte)(abyte0[i1 + 3] & 0xf);
        word1 = com.whatsapp.util.dns.e.a(abyte0, i1 + 4);
        word2 = com.whatsapp.util.dns.e.a(abyte0, i1 + 6);
        word3 = com.whatsapp.util.dns.e.a(abyte0, i1 + 8);
        word4 = com.whatsapp.util.dns.e.a(abyte0, i1 + 10);
        try
        {
            abyte0 = new h(word0, flag, byte0, flag1, flag2, flag3, flag4, byte1, word1, word2, word3, word4);
            if (DialogToastActivity.g != 0)
            {
                f.a = j1 + 1;
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        return abyte0;
    }

    void a(OutputStream outputstream)
    {
        outputstream.write(h());
    }

    boolean a()
    {
        return a;
    }

    short b()
    {
        return e;
    }

    void b(byte abyte0[], int i1)
    {
        int j1;
        char c1 = '\200';
        int k1 = 1;
        int l1 = f.a;
        if (abyte0 == null)
        {
            try
            {
                throw new NullPointerException(z[0]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        try
        {
            if (abyte0.length < i1 + 12)
            {
                throw new IllegalArgumentException(z[1]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        byte byte0;
        int i2;
        byte byte1;
        boolean flag;
        try
        {
            com.whatsapp.util.dns.e.a(c, abyte0, i1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        abyte0[i1 + 2] = 0;
        i2 = i1 + 2;
        byte1 = abyte0[i2];
        flag = f;
        if (flag)
        {
            j1 = 128;
        } else
        {
            j1 = 0;
        }
        byte0 = (byte)(j1 | byte1);
        abyte0[i2] = byte0;
        j1 = i1 + 2;
        try
        {
            abyte0[j1] = (byte)(abyte0[j1] | (byte)((h & 0xf) << 3));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        i2 = i1 + 2;
        byte1 = abyte0[i2];
        flag = g;
        if (flag)
        {
            j1 = 4;
        } else
        {
            j1 = 0;
        }
        byte0 = (byte)(j1 | byte1);
        abyte0[i2] = byte0;
        i2 = i1 + 2;
        byte1 = abyte0[i2];
        try
        {
            flag = a;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (flag)
        {
            j1 = 2;
        } else
        {
            j1 = 0;
        }
        byte0 = (byte)(j1 | byte1);
        abyte0[i2] = byte0;
        i2 = i1 + 2;
        byte1 = abyte0[i2];
        try
        {
            flag = i;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (flag)
        {
            j1 = k1;
        } else
        {
            j1 = 0;
        }
        byte0 = (byte)(j1 | byte1);
        abyte0[i2] = byte0;
        abyte0[i1 + 3] = 0;
        k1 = i1 + 3;
        i2 = abyte0[k1];
        try
        {
            flag = d;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (flag)
        {
            j1 = c1;
        } else
        {
            j1 = 0;
        }
        abyte0[k1] = (byte)(j1 | i2);
        j1 = i1 + 3;
        abyte0[j1] = (byte)(abyte0[j1] | (byte)(l & 0xf));
        com.whatsapp.util.dns.e.a(k, abyte0, i1 + 4);
        com.whatsapp.util.dns.e.a(e, abyte0, i1 + 6);
        com.whatsapp.util.dns.e.a(b, abyte0, i1 + 8);
        com.whatsapp.util.dns.e.a(j, abyte0, i1 + 10);
        if (l1 != 0)
        {
            DialogToastActivity.g++;
        }
        return;
    }

    short c()
    {
        return l;
    }

    short d()
    {
        return k;
    }

    short e()
    {
        return c;
    }

    public int f()
    {
        return 12;
    }

    boolean g()
    {
        return f;
    }

    byte[] h()
    {
        byte abyte0[] = new byte[12];
        b(abyte0, 0);
        return abyte0;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i1;
        as = new String[4];
        obj = "l\032\033h\025.\016\016tF`\f\033-\004kC\001x\nb";
        byte1 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "l\032\033h\025.\007\000h\025.\r\000yFm\f\001y\007g\rOh\ba\026\beF}\023\016n\003";
                i1 = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "l\032\033h\025.\016\016tF`\f\033-\004kC\001x\nb";
                i1 = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "l\032\033h\025.\007\000h\025.\r\000yFm\f\001y\007g\rOh\ba\026\beFj\002\033l";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 102;
_L9:
        obj[j1] = (char)(byte0 ^ c1);
        j1++;
          goto _L8
_L4:
        byte0 = 14;
          goto _L9
_L5:
        byte0 = 99;
          goto _L9
_L6:
        byte0 = 111;
          goto _L9
        byte0 = 13;
          goto _L9
    }
}
