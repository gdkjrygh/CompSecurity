// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class a3d extends Enum
{

    public static final a3d EXTENSION_REQUESTED;
    public static final a3d GIFT_RECEIVED;
    public static final a3d PAYMENT_COMPLETED;
    public static final a3d WHATSAPP_INITIATED;
    private static final a3d a[];
    private static final String z[];

    private a3d(String s, int i)
    {
        super(s, i);
    }

    public static a3d valueOf(String s)
    {
        return (a3d)Enum.valueOf(com/whatsapp/a3d, s);
    }

    public static a3d[] values()
    {
        return (a3d[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "OV7\031iQC1\027cRG\"\021xZS";
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
                obj = "H_/\000\177^G>\013eQ^:\035mKR*";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "X^(\000sMR-\021eIR*";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "ZO:\021bL^!\032sMR?\001iLC+\020";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                WHATSAPP_INITIATED = new a3d(z[1], 0);
                EXTENSION_REQUESTED = new a3d(z[3], 1);
                PAYMENT_COMPLETED = new a3d(z[0], 2);
                GIFT_RECEIVED = new a3d(z[2], 3);
                a = (new a3d[] {
                    WHATSAPP_INITIATED, EXTENSION_REQUESTED, PAYMENT_COMPLETED, GIFT_RECEIVED
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
        byte byte0 = 44;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 31;
          goto _L9
_L5:
        byte0 = 23;
          goto _L9
_L6:
        byte0 = 110;
          goto _L9
        byte0 = 84;
          goto _L9
    }
}
