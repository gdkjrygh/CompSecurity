// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;


public final class bw extends Enum
{

    public static final bw CRYPT1;
    public static final bw CRYPT2;
    public static final bw CRYPT3;
    public static final bw CRYPT4;
    public static final bw CRYPT5;
    public static final bw CRYPT6;
    public static final bw CRYPT7;
    public static final bw CRYPT8;
    private static final bw a[];
    private static final String z[];

    private bw(String s, int i)
    {
        super(s, i);
    }

    public static bw valueOf(String s)
    {
        return (bw)Enum.valueOf(com/whatsapp/util/bw, s);
    }

    public static bw[] values()
    {
        return (bw[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "s\036p/Z\006";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "s\036p/Z\005";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "s\036p/Z\003";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "s\036p/Z\001";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "s\036p/Z\007";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "s\036p/Z\002";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "s\036p/Z\004";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "s\036p/Z\b";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                CRYPT1 = new bw(z[3], 0);
                CRYPT2 = new bw(z[5], 1);
                CRYPT3 = new bw(z[2], 2);
                CRYPT4 = new bw(z[6], 3);
                CRYPT5 = new bw(z[1], 4);
                CRYPT6 = new bw(z[0], 5);
                CRYPT7 = new bw(z[4], 6);
                CRYPT8 = new bw(z[7], 7);
                a = (new bw[] {
                    CRYPT1, CRYPT2, CRYPT3, CRYPT4, CRYPT5, CRYPT6, CRYPT7, CRYPT8
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 448
    //                   0 471
    //                   1 478
    //                   2 485
    //                   3 492;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_492;
_L3:
        byte byte1 = 14;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 48;
          goto _L9
_L5:
        byte1 = 76;
          goto _L9
_L6:
        byte1 = 41;
          goto _L9
        byte1 = 127;
          goto _L9
    }
}
