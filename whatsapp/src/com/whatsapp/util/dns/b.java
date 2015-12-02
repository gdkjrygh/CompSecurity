// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util.dns;

import java.io.OutputStream;

// Referenced classes of package com.whatsapp.util.dns:
//            i, e

class b
{

    private static final String z[];
    private final int a;
    private final short b;
    private final short c;
    private final i d;
    private final int e;
    private final byte f[];

    private b(i j, short word0, short word1, int k, byte abyte0[], int l)
    {
        d = j;
        b = word0;
        c = word1;
        a = k;
        f = abyte0;
        e = l;
    }

    static b a(byte abyte0[], int j)
    {
        if (abyte0 == null)
        {
            try
            {
                throw new NullPointerException(z[1]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        i k = i.a(abyte0, j);
        int l = k.c() + j;
        try
        {
            if (abyte0.length < l + 10)
            {
                throw new IllegalArgumentException(z[2]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        short word0 = com.whatsapp.util.dns.e.a(abyte0, l);
        short word1 = com.whatsapp.util.dns.e.a(abyte0, l + 2);
        j = com.whatsapp.util.dns.e.b(abyte0, l + 4);
        short word2 = com.whatsapp.util.dns.e.a(abyte0, l + 8);
        l += 10;
        try
        {
            if (abyte0.length < l + word2)
            {
                throw new IllegalArgumentException(z[0]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        byte abyte1[] = new byte[word2];
        System.arraycopy(abyte0, l, abyte1, 0, word2);
        return new b(k, word0, word1, j, abyte1, word2 + (k.c() + 10));
    }

    int a()
    {
        return e;
    }

    void a(OutputStream outputstream)
    {
        d.a(outputstream);
        com.whatsapp.util.dns.e.a(outputstream, b);
        com.whatsapp.util.dns.e.a(outputstream, c);
        com.whatsapp.util.dns.e.a(outputstream, a);
        com.whatsapp.util.dns.e.a(outputstream, (short)f.length);
        outputstream.write(f);
    }

    i b()
    {
        return d;
    }

    short c()
    {
        return b;
    }

    int d()
    {
        return a;
    }

    short e()
    {
        return c;
    }

    byte[] f()
    {
        return f;
    }

    short g()
    {
        return (short)f.length;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int j;
        as = new String[3];
        obj = "\"%k?\"-\"{#!%?8.%?*";
        byte1 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[j] = ((String) (obj));
                obj = ")2l/7k&y3d%$lj&.kv?('";
                j = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                j = 2;
                obj = "\"%k?\"-\"{#!%?8.%?*";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 68;
_L9:
        obj[k] = (char)(byte0 ^ c1);
        k++;
          goto _L8
_L4:
        byte0 = 75;
          goto _L9
_L5:
        byte0 = 75;
          goto _L9
_L6:
        byte0 = 24;
          goto _L9
        byte0 = 74;
          goto _L9
    }
}
