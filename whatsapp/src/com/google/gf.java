// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


final class gf extends Enum
{

    public static final gf DONE;
    public static final gf NOT_READY;
    public static final gf READY;
    private static final gf a[];
    private static final String z[];

    private gf(String s, int i)
    {
        super(s, i);
    }

    public static gf valueOf(String s)
    {
        return (gf)Enum.valueOf(com/google/gf, s);
    }

    public static gf[] values()
    {
        return (gf[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "GACA\022LOSG";
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
                obj = "MAY[";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "[KVZ\031";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                NOT_READY = new gf(z[0], 0);
                READY = new gf(z[2], 1);
                DONE = new gf(z[1], 2);
                a = (new gf[] {
                    NOT_READY, READY, DONE
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 228
    //                   0 249
    //                   1 255
    //                   2 261
    //                   3 267;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_267;
_L3:
        byte byte0 = 64;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 9;
          goto _L9
_L5:
        byte0 = 14;
          goto _L9
_L6:
        byte0 = 23;
          goto _L9
        byte0 = 30;
          goto _L9
    }
}
