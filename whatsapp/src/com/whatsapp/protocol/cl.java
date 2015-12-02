// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.whatsapp.protocol:
//            b1, cu, bj, bt, 
//            b9, bo

public abstract class cl
{

    private static final String z[];
    cu a;
    byte b[];
    private String c;
    private String d;
    bt e;
    private String f;
    b9 g;
    private String h;
    bo i;
    private String j;
    private String k;

    public cl(bo bo, b9 b9, bt bt)
    {
        g = b9;
        e = bt;
        i = bo;
    }

    private void a(ByteArrayOutputStream bytearrayoutputstream, String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        bytearrayoutputstream.write(s.getBytes(z[0]));
        return;
        bytearrayoutputstream;
    }

    private byte[] c()
    {
        long l = System.currentTimeMillis() / 1000L;
        if (l < 0x3b9aca00L)
        {
            return String.valueOf(l + 0x2540be400L).substring(1).getBytes();
        }
        if (l >= 0x2540be400L)
        {
            throw new IOException(z[1]);
        } else
        {
            return Long.toString(l).getBytes();
        }
    }

    private byte[] d()
    {
        if (b != null)
        {
            return b;
        }
        if (k != null || j != null || d != null || f != null || c != null || h != null)
        {
            b1 b1_1 = new b1();
            a(b1_1, k);
            b1_1.write(0);
            a(b1_1, j);
            b1_1.write(0);
            a(b1_1, d);
            b1_1.write(0);
            a(b1_1, f);
            b1_1.write(0);
            a(b1_1, c);
            b1_1.write(0);
            a(b1_1, h);
            b(b1_1.toByteArray());
            return b;
        } else
        {
            return new byte[0];
        }
    }

    public b9 a()
    {
        return g;
    }

    public void a(cu cu1)
    {
        a = cu1;
    }

    public void a(String s)
    {
        k = s;
    }

    abstract void a(boolean flag);

    protected byte[] a(byte abyte0[])
    {
        byte abyte1[] = a.M.getBytes();
        byte abyte2[] = c();
        byte abyte3[] = d();
        int l = abyte0.length + abyte1.length + abyte2.length + abyte3.length;
        byte abyte4[] = new byte[l + 4];
        System.arraycopy(abyte1, 0, abyte4, 4, abyte1.length);
        int i1 = abyte1.length + 4;
        System.arraycopy(abyte0, 0, abyte4, i1, abyte0.length);
        i1 += abyte0.length;
        System.arraycopy(abyte2, 0, abyte4, i1, abyte2.length);
        int j1 = abyte2.length;
        if (abyte3.length > 0)
        {
            System.arraycopy(abyte3, 0, abyte4, i1 + j1, abyte3.length);
        }
        a.g.a(abyte4, 4, l);
        System.arraycopy(a.g.a(), 0, abyte4, 0, 4);
        return abyte4;
    }

    public bt b()
    {
        return e;
    }

    public void b(String s)
    {
        h = s;
    }

    public void b(byte abyte0[])
    {
        b = abyte0;
    }

    public void c(String s)
    {
        c = s;
    }

    public void d(String s)
    {
        d = s;
    }

    public void e(String s)
    {
        j = s;
    }

    public void f(String s)
    {
        f = s;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int l;
        as = new String[2];
        obj = "\026?;+\b";
        byte1 = -1;
        l = 0;
_L2:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L8:
label0:
        {
            if (j1 > i1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[l] = ((String) (obj));
                l = 1;
                obj = "*\005\013g\\*\017]e\\,\b\026&C&\037\to^$";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[l] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 48;
_L9:
        obj[i1] = (char)(byte0 ^ c1);
        i1++;
          goto _L8
_L4:
        byte0 = 67;
          goto _L9
_L5:
        byte0 = 107;
          goto _L9
_L6:
        byte0 = 125;
          goto _L9
        byte0 = 6;
          goto _L9
    }
}
