// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import com.whatsapp.DialogToastActivity;
import java.io.RandomAccessFile;

// Referenced classes of package com.whatsapp.util:
//            ad, a_, a8, bi

public class ab extends ad
{

    private static final String z[];
    int d;
    double e;
    a8 f;
    long g;
    long h;
    double i;
    long j;

    public ab(long l, String s, RandomAccessFile randomaccessfile)
    {
        int k = a_.c;
        super(l, s, randomaccessfile);
        f = a8.c;
        d = bi.b(randomaccessfile);
        bi.e(randomaccessfile);
        j = bi.d(randomaccessfile);
        h = bi.d(randomaccessfile);
        bi.d(randomaccessfile);
        bi.d(randomaccessfile);
        g = bi.d(randomaccessfile);
        bi.d(randomaccessfile);
        bi.d(randomaccessfile);
        bi.g(randomaccessfile);
        bi.g(randomaccessfile);
        bi.g(randomaccessfile);
        bi.g(randomaccessfile);
        f = a8.a(randomaccessfile);
        e = bi.f(randomaccessfile);
        i = bi.f(randomaccessfile);
        if (DialogToastActivity.g != 0)
        {
            a_.c = k + 1;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append("[").append(bi.a(j)).append("/").append(bi.a(h)).append(z[0]).append(g).append(z[1]).append(f).append(" ").append(e).append("x").append(i).append(z[2]).append(f.a()).append("]").toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int k;
        as = new String[3];
        obj = "X\177'G\001\fr=[Z";
        byte1 = -1;
        k = 0;
_L2:
        String as1[];
        int l;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L8:
label0:
        {
            if (i1 > l)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[k] = ((String) (obj));
                obj = "\ru;A\023X";
                k = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[k] = ((String) (obj));
                k = 2;
                obj = "Xi=A\001\fr=[Z";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[k] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[l];
        l % 5;
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
        obj[l] = (char)(byte0 ^ c);
        l++;
          goto _L8
_L4:
        byte0 = 120;
          goto _L9
_L5:
        byte0 = 27;
          goto _L9
_L6:
        byte0 = 82;
          goto _L9
        byte0 = 53;
          goto _L9
    }
}
