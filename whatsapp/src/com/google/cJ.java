// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            aG, e0, cR, g

public final class cJ
{

    private static final String z[];
    private final cR a;
    private final Object b;
    private final cR c;
    private final aG d;

    private cJ(cR cr, Object obj, cR cr1, aG ag)
    {
        if (cr == null)
        {
            throw new IllegalArgumentException(z[0]);
        }
        e0 e0_1;
        e0 e0_2;
        e0_1 = ag.b();
        e0_2 = e0.MESSAGE;
        if (e0_1 == e0_2 && cr1 == null)
        {
            try
            {
                throw new IllegalArgumentException(z[1]);
            }
            // Misplaced declaration of an exception variable
            catch (cR cr)
            {
                throw cr;
            }
        } else
        {
            c = cr;
            b = obj;
            a = cr1;
            d = ag;
            return;
        }
        cr;
        throw cr;
    }

    cJ(cR cr, Object obj, cR cr1, aG ag, g g)
    {
        this(cr, obj, cr1, ag);
    }

    static cR a(cJ cj)
    {
        return cj.a;
    }

    static aG b(cJ cj)
    {
        return cj.d;
    }

    static Object c(cJ cj)
    {
        return cj.b;
    }

    public int a()
    {
        return d.c();
    }

    public cR b()
    {
        return c;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "'xx\037\027\nbz\007V\000c}\035P=td\026s\fku\006[\035Dz\000C\bcw\026".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        char ac[];
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            ac = "'xx\037\027\004hg\000V\016hP\026Q\bxx\007~\007~`\022Y\nh".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_42;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 112
    //                   0 130
    //                   1 136
    //                   2 142
    //                   3 148;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_148;
_L1:
        byte0 = 55;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 105;
          goto _L7
_L3:
        byte0 = 13;
          goto _L7
_L4:
        byte0 = 20;
          goto _L7
        byte0 = 115;
          goto _L7
_L14:
        byte byte0;
        if (j <= i)
        {
            z = (new String[] {
                obj, (new String(ac)).intern()
            });
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 210
    //                   1 216
    //                   2 222
    //                   3 228;
           goto _L8 _L9 _L10 _L11 _L12
_L9:
        break; /* Loop/switch isn't completed */
_L12:
        break MISSING_BLOCK_LABEL_228;
_L8:
        byte byte1 = 55;
_L15:
        ac[i] = (char)(byte1 ^ c1);
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        byte1 = 105;
          goto _L15
_L10:
        byte1 = 13;
          goto _L15
_L11:
        byte1 = 20;
          goto _L15
        byte1 = 115;
          goto _L15
    }
}
