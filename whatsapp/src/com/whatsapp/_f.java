// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class _f extends Enum
{

    public static final _f CENTER_CROP;
    public static final _f FIT_CENTER;
    public static final _f FIT_HEIGHT;
    public static final _f FIT_WIDTH;
    private static final _f a[];
    private static final String z[];

    private _f(String s, int i)
    {
        super(s, i);
    }

    public static _f valueOf(String s)
    {
        return (_f)Enum.valueOf(com/whatsapp/_f, s);
    }

    public static _f[] values()
    {
        return (_f[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "[\027\0220IT\032\022'";
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
                obj = "[\027\0220VX\027\001'J";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "^\033\b;[O\001\005=QM";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "[\027\0220]X\020\022*L";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                FIT_CENTER = new _f(z[3], 0);
                FIT_WIDTH = new _f(z[0], 1);
                FIT_HEIGHT = new _f(z[1], 2);
                CENTER_CROP = new _f(z[2], 3);
                a = (new _f[] {
                    FIT_CENTER, FIT_WIDTH, FIT_HEIGHT, CENTER_CROP
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
        byte byte0 = 30;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 29;
          goto _L9
_L5:
        byte0 = 94;
          goto _L9
_L6:
        byte0 = 70;
          goto _L9
        byte0 = 111;
          goto _L9
    }
}
