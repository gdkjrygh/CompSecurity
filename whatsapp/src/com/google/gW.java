// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.List;

// Referenced classes of package com.google:
//            dh, bJ, de, cP, 
//            gU, dI, gw

public final class gW extends Enum
    implements dh
{

    public static final gW CODE_SIZE;
    public static final int CODE_SIZE_VALUE = 2;
    public static final gW LITE_RUNTIME;
    public static final int LITE_RUNTIME_VALUE = 3;
    public static final gW SPEED;
    public static final int SPEED_VALUE = 1;
    private static final gW a[];
    private static final gW b[];
    private static gw c;
    private static final String z[];
    private final int d;
    private final int e;

    private gW(String s, int i, int j, int k)
    {
        super(s, i);
        e = j;
        d = k;
    }

    public static final gU getDescriptor()
    {
        return (gU)de.x().b().get(0);
    }

    public static gw internalGetValueMap()
    {
        return c;
    }

    public static gW valueOf(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            gW gw;
            try
            {
                gw = SPEED;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return gw;

        case 2: // '\002'
            return CODE_SIZE;

        case 3: // '\003'
            return LITE_RUNTIME;
        }
    }

    public static gW valueOf(dI di)
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
        return a[di.b()];
    }

    public static gW valueOf(String s)
    {
        return (gW)Enum.valueOf(com/google/gW, s);
    }

    public static gW[] values()
    {
        return (gW[])b.clone();
    }

    public final gU getDescriptorForType()
    {
        return getDescriptor();
    }

    public final int getNumber()
    {
        return d;
    }

    public final dI getValueDescriptor()
    {
        return (dI)getDescriptor().a().get(e);
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "\022YJ\000G6[J\bU2D\\\037x'CP\0371>D\037\003~#\027Y\002cwCW\004bwCF\035ty".toCharArray();
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
            obj1 = "\024x{(N\004~e(".toCharArray();
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
        byte0 = 17;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 87;
          goto _L7
_L3:
        byte0 = 55;
          goto _L7
_L4:
        byte0 = 63;
          goto _L7
        byte0 = 109;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "\033~k(N\005bq9X\032r".toCharArray();
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
        byte1 = 17;
_L14:
        obj1[i] = (char)(byte1 ^ c1);
        i++;
          goto _L13
_L9:
        byte1 = 87;
          goto _L14
_L10:
        byte1 = 55;
          goto _L14
_L11:
        byte1 = 63;
          goto _L14
        byte1 = 109;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            ac = "\004gz(U".toCharArray();
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
        byte2 = 17;
_L21:
        obj2[i] = (char)(byte2 ^ c1);
        i++;
          goto _L20
_L16:
        byte2 = 87;
          goto _L21
_L17:
        byte2 = 55;
          goto _L21
_L18:
        byte2 = 63;
          goto _L21
        byte2 = 109;
          goto _L21
_L28:
        byte byte2;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, (new String(ac)).intern()
            });
            SPEED = new gW(z[3], 0, 0, 1);
            CODE_SIZE = new gW(z[1], 1, 1, 2);
            LITE_RUNTIME = new gW(z[2], 2, 2, 3);
            b = (new gW[] {
                SPEED, CODE_SIZE, LITE_RUNTIME
            });
            c = new bJ();
            a = values();
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
        byte byte3 = 17;
_L29:
        ac[i] = (char)(byte3 ^ c1);
        i++;
        if (true) goto _L28; else goto _L27
_L27:
        byte3 = 87;
          goto _L29
_L24:
        byte3 = 55;
          goto _L29
_L25:
        byte3 = 63;
          goto _L29
        byte3 = 109;
          goto _L29
    }
}
