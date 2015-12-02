// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class ak5 extends Enum
{

    public static final ak5 CREATED;
    public static final ak5 EXPIRED;
    public static final ak5 FAIL;
    public static final ak5 OK;
    private static final ak5 a[];
    private static final String z[];

    private ak5(String s, int i)
    {
        super(s, i);
    }

    public static ak5 valueOf(String s)
    {
        return (ak5)Enum.valueOf(com/whatsapp/ak5, s);
    }

    public static ak5[] values()
    {
        return (ak5[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "N7emlH!";
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
                obj = "H=pejH!";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "B.";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "K$i`";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                OK = new ak5(z[2], 0);
                EXPIRED = new ak5(z[1], 1);
                FAIL = new ak5(z[3], 2);
                CREATED = new ak5(z[0], 3);
                a = (new ak5[] {
                    OK, EXPIRED, FAIL, CREATED
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
        byte byte0 = 56;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 13;
          goto _L9
_L5:
        byte0 = 101;
          goto _L9
_L6:
        byte0 = 32;
          goto _L9
        byte0 = 44;
          goto _L9
    }
}
