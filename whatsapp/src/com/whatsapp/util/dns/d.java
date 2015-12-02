// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util.dns;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.whatsapp.util.dns:
//            h, g, i, b, 
//            f

class d
{

    private static final AtomicInteger b;
    private static final String z;
    private final b a[];
    private final h c;
    private final int d;
    private byte e[];
    private int f;
    private final g g[];

    private d(h h1, g ag[], b ab[], int j)
    {
        c = h1;
        g = ag;
        a = ab;
        d = j;
    }

    static d a(String s)
    {
        s = s.split(z);
        h h1 = new h((short)b.getAndIncrement(), false, (byte)0, false, false, true, false, (short)0, (short)1, (short)0, (short)0, (short)0);
        g ag[] = new g[1];
        ag[0] = com.whatsapp.util.dns.g.a(i.a(s, (short)0), (short)1, (short)1);
        int j = h1.f();
        int k = ag[0].a();
        return new d(h1, ag, new b[0], k + j);
    }

    static d a(byte abyte0[])
    {
        return a(abyte0, 0);
    }

    static d a(byte abyte0[], int j)
    {
        boolean flag = false;
        int j1 = f.a;
        Object obj = h.a(abyte0, j);
        int k = ((h) (obj)).f();
        g ag[] = new g[((h) (obj)).d()];
        k += j;
        int i1 = 0;
        int l;
        do
        {
            l = k;
            if (i1 >= ag.length)
            {
                break;
            }
            ag[i1] = com.whatsapp.util.dns.g.a(abyte0, k);
            l = k + ag[i1].a();
            i1++;
            k = l;
        } while (j1 == 0);
        b ab[] = new b[((h) (obj)).b()];
        k = ((flag) ? 1 : 0);
        do
        {
            if (k >= ab.length)
            {
                break;
            }
            ab[k] = com.whatsapp.util.dns.b.a(abyte0, l);
            l += ab[k].a();
            k++;
        } while (j1 == 0);
        obj = new d(((h) (obj)), ag, ab, -1);
        obj.e = abyte0;
        obj.f = j;
        return ((d) (obj));
    }

    h a()
    {
        return c;
    }

    String a(i j)
    {
        boolean flag = false;
        int i1 = f.a;
        StringBuilder stringbuilder = new StringBuilder();
        String as[] = j.a();
        int j1 = as.length;
        int k = 0;
        do
        {
            if (k >= j1)
            {
                break;
            }
            stringbuilder.append(as[k]).append('.');
            k++;
        } while (i1 == 0);
        if (j.b() != 0)
        {
            j = i.a(e, f + j.b()).a();
            int k1 = j.length;
            int l = ((flag) ? 1 : 0);
            do
            {
                if (l >= k1)
                {
                    break;
                }
                stringbuilder.append(j[l]).append('.');
                l++;
            } while (i1 == 0);
        }
        if (stringbuilder.length() > 0)
        {
            stringbuilder.setLength(stringbuilder.length() - 1);
        }
        return stringbuilder.toString();
    }

    void a(OutputStream outputstream)
    {
        boolean flag = false;
        int k = f.a;
        c.a(outputstream);
        Object aobj[] = g;
        int l = aobj.length;
        int j = 0;
        do
        {
            if (j >= l)
            {
                break;
            }
            aobj[j].a(outputstream);
            j++;
        } while (k == 0);
        aobj = a;
        l = aobj.length;
        j = ((flag) ? 1 : 0);
        do
        {
            if (j >= l)
            {
                break;
            }
            aobj[j].a(outputstream);
            j++;
        } while (k == 0);
    }

    byte[] b()
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            a(bytearrayoutputstream);
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return bytearrayoutputstream.toByteArray();
    }

    b[] c()
    {
        return a;
    }

    static 
    {
        char ac[];
        int j;
        int k;
        ac = "\bg".toCharArray();
        k = ac.length;
        j = 0;
_L7:
        char c1;
        if (k <= j)
        {
            z = (new String(ac)).intern();
            b = new AtomicInteger();
            return;
        }
        c1 = ac[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 80
    //                   0 98
    //                   1 104
    //                   2 110
    //                   3 115;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_115;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 37;
_L8:
        ac[j] = (char)(byte0 ^ c1);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 84;
          goto _L8
_L3:
        byte0 = 73;
          goto _L8
_L4:
        byte0 = 1;
          goto _L8
        byte0 = 16;
          goto _L8
    }
}
