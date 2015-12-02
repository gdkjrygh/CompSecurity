// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;


// Referenced classes of package org.whispersystems:
//            i, bs, n, at, 
//            bd, a6, a0

public class Y
{

    private static final String z;
    private final byte a[];
    private final at b;

    public Y(at at1, byte abyte0[])
    {
        b = at1;
        a = abyte0;
    }

    public bd a(a0 a0, i j)
    {
        a0 = bs.a(a0, j.b());
        a0 = new n(b.a(a0, a, z.getBytes(), 64));
        return new bd(new Y(b, a0.b()), new a6(b, a0.a(), 0));
    }

    public byte[] a()
    {
        return a;
    }

    static 
    {
        char ac[];
        int j;
        int k;
        ac = "\035#^\017\"/9e\035&)#R\b".toCharArray();
        k = ac.length;
        j = 0;
_L7:
        char c;
        if (k <= j)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 82;
_L8:
        ac[j] = (char)(byte0 ^ c);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 74;
          goto _L8
_L3:
        byte0 = 75;
          goto _L8
_L4:
        byte0 = 55;
          goto _L8
        byte0 = 124;
          goto _L8
    }
}
