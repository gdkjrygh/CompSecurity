// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class _r extends Enum
{

    public static final _r AUTO_DETECTED;
    public static final _r RETRIED;
    public static final _r TAPPED_LINK;
    public static final _r TYPED;
    private static final _r a[];
    private static final String z[];

    private _r(String s, int i)
    {
        super(s, i);
    }

    public static _r valueOf(String s)
    {
        return (_r)Enum.valueOf(com/whatsapp/_r, s);
    }

    public static _r[] values()
    {
        return (_r[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = ">Nf\037\023";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "+Bb\025\b.Rb\037\024>Rr";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "8Rb\b\036/S";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ">Vf\n\022.Hz\023\031!";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                TYPED = new _r(z[0], 0);
                AUTO_DETECTED = new _r(z[1], 1);
                TAPPED_LINK = new _r(z[3], 2);
                RETRIED = new _r(z[2], 3);
                a = (new _r[] {
                    TYPED, AUTO_DETECTED, TAPPED_LINK, RETRIED
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 272
    //                   0 293
    //                   1 299
    //                   2 305
    //                   3 311;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_311;
_L3:
        byte byte0 = 87;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 106;
          goto _L9
_L5:
        byte0 = 23;
          goto _L9
_L6:
        byte0 = 54;
          goto _L9
        byte0 = 90;
          goto _L9
    }
}
