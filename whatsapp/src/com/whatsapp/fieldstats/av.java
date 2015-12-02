// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class av extends Enum
{

    public static final av ACCEPTED_BUT_NOT_CONNECTED;
    public static final av BUSY;
    public static final av CALL_OFFER_ACK_NOT_RECEIVED;
    public static final av CONNECTED;
    public static final av MISSED;
    public static final av MISSED_NO_RECEIPT;
    public static final av REJECTED_BY_SERVER;
    public static final av REJECTED_BY_USER;
    public static final av SERVER_NACK;
    public static final av SETUP_ERROR;
    private static final av a[];
    private static final String z[];
    private final int b;

    private av(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static av valueOf(String s)
    {
        return (av)Enum.valueOf(com/whatsapp/fieldstats/av, s);
    }

    public static av[] values()
    {
        return (av[])a.clone();
    }

    public int getCode()
    {
        return b;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[10];
        obj = "&\177!\\";
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
                obj = "'k>I@+l4@M;k1N@*e&ZM!i7LI!n";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ")c!VZ u<J@6o1@V4~";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "'e<KZ'~7A";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "6o8@\\0o6Z]=u!@M2o ";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                obj = "7o&PO;o WP6";
                byte0 = 4;
                i = 5;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = ")c!VZ ";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "6o8@\\0o6Z]=u'VZ6";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "7o SZ6u<D\\/";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "%i1@O0o6Z]1~-KP0u1JQ*o1QZ ";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                z = as;
                CONNECTED = new av(z[3], 0, 1);
                REJECTED_BY_USER = new av(z[7], 1, 2);
                REJECTED_BY_SERVER = new av(z[4], 2, 3);
                MISSED = new av(z[6], 3, 4);
                BUSY = new av(z[0], 4, 5);
                SETUP_ERROR = new av(z[5], 5, 6);
                SERVER_NACK = new av(z[8], 6, 7);
                CALL_OFFER_ACK_NOT_RECEIVED = new av(z[1], 7, 8);
                MISSED_NO_RECEIPT = new av(z[2], 8, 9);
                ACCEPTED_BUT_NOT_CONNECTED = new av(z[9], 9, 10);
                a = (new av[] {
                    CONNECTED, REJECTED_BY_USER, REJECTED_BY_SERVER, MISSED, BUSY, SETUP_ERROR, SERVER_NACK, CALL_OFFER_ACK_NOT_RECEIVED, MISSED_NO_RECEIPT, ACCEPTED_BUT_NOT_CONNECTED
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 556
    //                   0 579
    //                   1 586
    //                   2 593
    //                   3 600;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_600;
_L3:
        byte byte1 = 31;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 100;
          goto _L9
_L5:
        byte1 = 42;
          goto _L9
_L6:
        byte1 = 114;
          goto _L9
        byte1 = 5;
          goto _L9
    }
}
