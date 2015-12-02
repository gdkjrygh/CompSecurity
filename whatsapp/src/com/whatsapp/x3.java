// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


final class x3 extends Enum
{

    public static final x3 BROADCAST;
    public static final x3 CALL;
    public static final x3 NORMAL;
    private static final x3 a[];
    private static final String z[];

    private x3(String s, int i)
    {
        super(s, i);
    }

    public static x3 valueOf(String s)
    {
        return (x3)Enum.valueOf(com/whatsapp/x3, s);
    }

    public static x3[] values()
    {
        return (x3[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "FM;\177\nD";
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
                obj = "KC%~";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "JP&s\017KC:f";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                NORMAL = new x3(z[0], 0);
                BROADCAST = new x3(z[2], 1);
                CALL = new x3(z[1], 2);
                a = (new x3[] {
                    NORMAL, BROADCAST, CALL
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
    //                   2 260
    //                   3 266;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_266;
_L3:
        byte byte0 = 75;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 8;
          goto _L9
_L5:
        byte0 = 2;
          goto _L9
_L6:
        byte0 = 105;
          goto _L9
        byte0 = 50;
          goto _L9
    }
}
