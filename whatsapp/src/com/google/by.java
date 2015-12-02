// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            gt, gZ, gV, d6, 
//            bQ

public final class by
{

    private static final String z;
    private d6 a;
    private final gt b;

    public by(gt gt1)
    {
        if (gt1 == null)
        {
            throw new IllegalArgumentException(z);
        } else
        {
            b = gt1;
            return;
        }
    }

    public bQ a(int i, bQ bq)
    {
        return b.a(i, bq);
    }

    public by a()
    {
        gZ gz = b.d().a();
        return new by(b.a(gz));
    }

    public int b()
    {
        return b.a();
    }

    public boolean c()
    {
        return b.d().b();
    }

    public d6 d()
    {
        try
        {
            if (a == null)
            {
                a = b.b();
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return a;
    }

    public int e()
    {
        return b.c();
    }

    public String toString()
    {
        String s;
        try
        {
            s = d().toString();
        }
        catch (gV gv)
        {
            return "";
        }
        return s;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "l@)<\021GS\"/CC\\4)CLLg3\f@\004)(\017B\007".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
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
        byte byte0 = 99;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 46;
          goto _L8
_L3:
        byte0 = 41;
          goto _L8
_L4:
        byte0 = 71;
          goto _L8
        byte0 = 93;
          goto _L8
    }
}
