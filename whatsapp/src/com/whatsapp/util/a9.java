// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.RandomAccessFile;

// Referenced classes of package com.whatsapp.util:
//            ad, a8, bi

public class a9 extends ad
{

    private static final String z[];
    a8 d;
    int e;
    long f;
    long g;
    long h;
    long i;

    public a9(long l, String s, RandomAccessFile randomaccessfile)
    {
        super(l, s, randomaccessfile);
        d = a8.c;
        e = bi.b(randomaccessfile);
        bi.e(randomaccessfile);
        h = bi.d(randomaccessfile);
        f = bi.d(randomaccessfile);
        i = bi.d(randomaccessfile);
        g = bi.d(randomaccessfile);
        bi.d(randomaccessfile);
        bi.g(randomaccessfile);
        bi.g(randomaccessfile);
        bi.d(randomaccessfile);
        bi.d(randomaccessfile);
        d = a8.a(randomaccessfile);
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append("[").append(bi.a(h)).append("/").append(bi.a(f)).append(z[0]).append(g / i).append(z[2]).append(g).append(z[1]).append(d).append("]").toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int j;
        as = new String[3];
        obj = "T\t\0232\001\000\004\t.Z";
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
                obj = "]M";
                j = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                j = 2;
                obj = "\007\b\005`H";
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
        char c = obj[k];
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
        byte byte0 = 96;
_L9:
        obj[k] = (char)(byte0 ^ c);
        k++;
          goto _L8
_L4:
        byte0 = 116;
          goto _L9
_L5:
        byte0 = 109;
          goto _L9
_L6:
        byte0 = 102;
          goto _L9
        byte0 = 64;
          goto _L9
    }
}
