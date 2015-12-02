// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.List;

// Referenced classes of package com.google:
//            dh, gc, dz, cP, 
//            gU, dI, gw

public final class gD extends Enum
    implements dh
{

    public static final gD CORD;
    public static final int CORD_VALUE = 1;
    public static final gD STRING;
    public static final gD STRING_PIECE;
    public static final int STRING_PIECE_VALUE = 2;
    public static final int STRING_VALUE = 0;
    private static final gD a[];
    private static gw b;
    private static final gD e[];
    private static final String z[];
    private final int c;
    private final int d;

    private gD(String s, int i, int j, int k)
    {
        super(s, i);
        c = j;
        d = k;
    }

    public static final gU getDescriptor()
    {
        return (gU)dz.v().b().get(0);
    }

    public static gw internalGetValueMap()
    {
        return b;
    }

    public static gD valueOf(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            gD gd;
            try
            {
                gd = STRING;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return gd;

        case 1: // '\001'
            return CORD;

        case 2: // '\002'
            return STRING_PIECE;
        }
    }

    public static gD valueOf(dI di)
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

    public static gD valueOf(String s)
    {
        return (gD)Enum.valueOf(com/google/gD, s);
    }

    public static gD[] values()
    {
        return (gD[])e.clone();
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
        return (dI)getDescriptor().a().get(c);
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "(o\fR\"\fm\fZ0\br\032M\035\035u\026MT\004rYQ\033\031!\037P\006Mu\021V\007Mu\000O\021C".toCharArray();
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
            obj1 = ">U+v:*".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 284
    //                   0 307
    //                   1 314
    //                   2 320
    //                   3 327;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_327;
_L1:
        byte0 = 116;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 109;
          goto _L7
_L3:
        byte0 = 1;
          goto _L7
_L4:
        byte0 = 121;
          goto _L7
        byte0 = 63;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = ">U+v:*^)v1.D".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c1 = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 376
    //                   0 399
    //                   1 406
    //                   2 412
    //                   3 419;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_419;
_L8:
        byte1 = 116;
_L14:
        obj1[i] = (char)(byte1 ^ c1);
        i++;
          goto _L13
_L9:
        byte1 = 109;
          goto _L14
_L10:
        byte1 = 1;
          goto _L14
_L11:
        byte1 = 121;
          goto _L14
        byte1 = 63;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            ac = ".N+{".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c1 = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 468
    //                   0 491
    //                   1 498
    //                   2 504
    //                   3 511;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_511;
_L15:
        byte2 = 116;
_L21:
        obj2[i] = (char)(byte2 ^ c1);
        i++;
          goto _L20
_L16:
        byte2 = 109;
          goto _L21
_L17:
        byte2 = 1;
          goto _L21
_L18:
        byte2 = 121;
          goto _L21
        byte2 = 63;
          goto _L21
_L28:
        byte byte2;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, (new String(ac)).intern()
            });
            STRING = new gD(z[1], 0, 0, 0);
            CORD = new gD(z[3], 1, 1, 1);
            STRING_PIECE = new gD(z[2], 2, 2, 2);
            e = (new gD[] {
                STRING, CORD, STRING_PIECE
            });
            b = new gc();
            a = values();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 560
    //                   0 583
    //                   1 590
    //                   2 596
    //                   3 603;
           goto _L22 _L23 _L24 _L25 _L26
_L23:
        break; /* Loop/switch isn't completed */
_L26:
        break MISSING_BLOCK_LABEL_603;
_L22:
        byte byte3 = 116;
_L29:
        ac[i] = (char)(byte3 ^ c1);
        i++;
        if (true) goto _L28; else goto _L27
_L27:
        byte3 = 109;
          goto _L29
_L24:
        byte3 = 1;
          goto _L29
_L25:
        byte3 = 121;
          goto _L29
        byte3 = 63;
          goto _L29
    }
}
