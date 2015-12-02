// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


final class ca extends Enum
{

    public static final ca AGGREGATES_ONLY;
    public static final ca ALL_SYMBOLS;
    public static final ca TYPES_ONLY;
    private static final ca a[];
    private static final String z[];

    private ca(String s, int i)
    {
        super(s, i);
    }

    public static ca valueOf(String s)
    {
        return (ca)Enum.valueOf(com/google/ca, s);
    }

    public static ca[] values()
    {
        return (ca[])a.clone();
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = ";Uf'\025=Su0\003%]o9\t".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = ";^m*\003#_c:\034)".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 228
    //                   0 249
    //                   1 255
    //                   2 261
    //                   3 267;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_267;
_L1:
        byte0 = 80;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 122;
          goto _L7
_L3:
        byte0 = 18;
          goto _L7
_L4:
        byte0 = 33;
          goto _L7
        byte0 = 117;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            ac = ".Kq0\003%]o9\t".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 312
    //                   0 333
    //                   1 339
    //                   2 345
    //                   3 351;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_351;
_L8:
        byte1 = 80;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 122;
          goto _L14
_L10:
        byte1 = 18;
          goto _L14
_L11:
        byte1 = 33;
          goto _L14
        byte1 = 117;
          goto _L14
_L21:
        byte byte1;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, (new String(ac)).intern()
            });
            TYPES_ONLY = new ca(z[2], 0);
            AGGREGATES_ONLY = new ca(z[0], 1);
            ALL_SYMBOLS = new ca(z[1], 2);
            a = (new ca[] {
                TYPES_ONLY, AGGREGATES_ONLY, ALL_SYMBOLS
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 396
    //                   0 417
    //                   1 423
    //                   2 429
    //                   3 435;
           goto _L15 _L16 _L17 _L18 _L19
_L16:
        break; /* Loop/switch isn't completed */
_L19:
        break MISSING_BLOCK_LABEL_435;
_L15:
        byte byte2 = 80;
_L22:
        ac[i] = (char)(byte2 ^ c);
        i++;
        if (true) goto _L21; else goto _L20
_L20:
        byte2 = 122;
          goto _L22
_L17:
        byte2 = 18;
          goto _L22
_L18:
        byte2 = 33;
          goto _L22
        byte2 = 117;
          goto _L22
    }
}
