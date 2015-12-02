// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


final class n1 extends Enum
{

    public static final n1 AGREE_1;
    public static final n1 AGREE_2;
    public static final n1 AGREE_NONE;
    private static final n1 a[];
    private static final String z[];

    private n1(String s, int i)
    {
        super(s, i);
    }

    public static n1 valueOf(String s)
    {
        return (n1)Enum.valueOf(com/whatsapp/n1, s);
    }

    public static n1[] values()
    {
        return (n1[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "iWh\b>w^u\003>";
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
                obj = "iWh\b>w!";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "iWh\b>w\"";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                AGREE_NONE = new n1(z[0], 0);
                AGREE_1 = new n1(z[1], 1);
                AGREE_2 = new n1(z[2], 2);
                a = (new n1[] {
                    AGREE_NONE, AGREE_1, AGREE_2
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
        byte byte0 = 123;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 40;
          goto _L9
_L5:
        byte0 = 16;
          goto _L9
_L6:
        byte0 = 58;
          goto _L9
        byte0 = 77;
          goto _L9
    }
}
