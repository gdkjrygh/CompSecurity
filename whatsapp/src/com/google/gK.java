// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.List;

// Referenced classes of package com.google:
//            dh, x, dq, cP, 
//            gU, dI, gw

public final class gK extends Enum
    implements dh
{

    public static final gK LABEL_OPTIONAL;
    public static final int LABEL_OPTIONAL_VALUE = 1;
    public static final gK LABEL_REPEATED;
    public static final int LABEL_REPEATED_VALUE = 3;
    public static final gK LABEL_REQUIRED;
    public static final int LABEL_REQUIRED_VALUE = 2;
    private static gw a;
    private static final gK d[];
    private static final gK e[];
    private static final String z[];
    private final int b;
    private final int c;

    private gK(String s, int i, int j, int k)
    {
        super(s, i);
        b = j;
        c = k;
    }

    public static final gU getDescriptor()
    {
        return (gU)dq.v().b().get(1);
    }

    public static gw internalGetValueMap()
    {
        return a;
    }

    public static gK valueOf(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            gK gk;
            try
            {
                gk = LABEL_OPTIONAL;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return gk;

        case 2: // '\002'
            return LABEL_REQUIRED;

        case 3: // '\003'
            return LABEL_REPEATED;
        }
    }

    public static gK valueOf(dI di)
    {
        try
        {
            if (di.a() != getDescriptor())
            {
                throw new IllegalArgumentException(z[0]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (dI di)
        {
            throw di;
        }
        return d[di.b()];
    }

    public static gK valueOf(String s)
    {
        return (gK)Enum.valueOf(com/google/gK, s);
    }

    public static gK[] values()
    {
        return (gK[])e.clone();
    }

    public final gU getDescriptorForType()
    {
        return getDescriptor();
    }

    public final int getNumber()
    {
        return c;
    }

    public final dI getValueDescriptor()
    {
        return (dI)getDescriptor().a().get(b);
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "P\037<^\036t\035<V\fp\002*A!e\005&Ah|\002i]'aQ/\\:5\005!Z;5\0050C-;".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        char ac[];
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "Y0\013v\004J#\fb\035\\#\fw".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 284
    //                   0 307
    //                   1 314
    //                   2 321
    //                   3 328;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_328;
_L1:
        byte0 = 72;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 21;
          goto _L7
_L3:
        byte0 = 113;
          goto _L7
_L4:
        byte0 = 73;
          goto _L7
        byte0 = 51;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "Y0\013v\004J#\fc\rT%\fw".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c1 = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 376
    //                   0 399
    //                   1 406
    //                   2 413
    //                   3 420;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_420;
_L8:
        byte1 = 72;
_L14:
        obj1[i] = (char)(byte1 ^ c1);
        i++;
          goto _L13
_L9:
        byte1 = 21;
          goto _L14
_L10:
        byte1 = 113;
          goto _L14
_L11:
        byte1 = 73;
          goto _L14
        byte1 = 51;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            ac = "Y0\013v\004J>\031g\001Z?\b\177".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c1 = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 468
    //                   0 491
    //                   1 498
    //                   2 505
    //                   3 512;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_512;
_L15:
        byte2 = 72;
_L21:
        obj2[i] = (char)(byte2 ^ c1);
        i++;
          goto _L20
_L16:
        byte2 = 21;
          goto _L21
_L17:
        byte2 = 113;
          goto _L21
_L18:
        byte2 = 73;
          goto _L21
        byte2 = 51;
          goto _L21
_L28:
        byte byte2;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, (new String(ac)).intern()
            });
            LABEL_OPTIONAL = new gK(z[3], 0, 0, 1);
            LABEL_REQUIRED = new gK(z[1], 1, 1, 2);
            LABEL_REPEATED = new gK(z[2], 2, 2, 3);
            e = (new gK[] {
                LABEL_OPTIONAL, LABEL_REQUIRED, LABEL_REPEATED
            });
            a = new x();
            d = values();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 560
    //                   0 583
    //                   1 590
    //                   2 597
    //                   3 604;
           goto _L22 _L23 _L24 _L25 _L26
_L23:
        break; /* Loop/switch isn't completed */
_L26:
        break MISSING_BLOCK_LABEL_604;
_L22:
        byte byte3 = 72;
_L29:
        ac[i] = (char)(byte3 ^ c1);
        i++;
        if (true) goto _L28; else goto _L27
_L27:
        byte3 = 21;
          goto _L29
_L24:
        byte3 = 113;
          goto _L29
_L25:
        byte3 = 73;
          goto _L29
        byte3 = 51;
          goto _L29
    }
}
