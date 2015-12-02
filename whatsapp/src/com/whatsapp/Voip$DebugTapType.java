// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class  extends Enum
{

    private static final RAW_CAPTURED $VALUES[];
    public static final RAW_CAPTURED CAPTURED_AND_POST_PROCESSED;
    public static final RAW_CAPTURED OUTGOING_ENCODED;
    public static final RAW_CAPTURED RAW_CAPTURED;
    public static final RAW_CAPTURED RECEIVED_AND_DECODED;
    private static final String z[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/whatsapp/Voip$DebugTapType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "5PH^61POD>)QT_:$ZO^;";
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
                obj = "(@_\\0.[LD:)VD_:#";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "5T\\D<&E_N-\"Q";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "$T[O*5POD>)QTK04ATK-(VNH,\"Q";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                RECEIVED_AND_DECODED = new <init>(z[0], 0);
                CAPTURED_AND_POST_PROCESSED = new <init>(z[3], 1);
                OUTGOING_ENCODED = new <init>(z[1], 2);
                RAW_CAPTURED = new <init>(z[2], 3);
                $VALUES = (new .VALUES[] {
                    RECEIVED_AND_DECODED, CAPTURED_AND_POST_PROCESSED, OUTGOING_ENCODED, RAW_CAPTURED
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
        byte byte0 = 127;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 103;
          goto _L9
_L5:
        byte0 = 21;
          goto _L9
_L6:
        byte0 = 11;
          goto _L9
        byte0 = 27;
          goto _L9
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
