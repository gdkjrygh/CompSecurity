// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class  extends Enum
{

    private static final ACTIVE $VALUES[];
    public static final ACTIVE ACCEPT_RECEIVED;
    public static final ACTIVE ACCEPT_SENT;
    public static final ACTIVE ACTIVE;
    public static final ACTIVE CALLING;
    public static final ACTIVE NONE;
    public static final ACTIVE RECEIVED_CALL;
    private static final String z[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/whatsapp/Voip$CallState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "6}\177!";
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
                obj = "*wr!\r.wu;\0079~}";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "9qr!\024,mc!\007={g!\0";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "9qe-\022=";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "9qr!\024,mb!\n,";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = ";s}(\r6u";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                NONE = new <init>(z[0], 0);
                CALLING = new <init>(z[5], 1);
                RECEIVED_CALL = new <init>(z[1], 2);
                ACCEPT_SENT = new <init>(z[4], 3);
                ACCEPT_RECEIVED = new <init>(z[2], 4);
                ACTIVE = new <init>(z[3], 5);
                $VALUES = (new .VALUES[] {
                    NONE, CALLING, RECEIVED_CALL, ACCEPT_SENT, ACCEPT_RECEIVED, ACTIVE
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 356
    //                   0 379
    //                   1 386
    //                   2 393
    //                   3 400;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_400;
_L3:
        byte byte1 = 68;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 120;
          goto _L9
_L5:
        byte1 = 50;
          goto _L9
_L6:
        byte1 = 49;
          goto _L9
        byte1 = 100;
          goto _L9
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
