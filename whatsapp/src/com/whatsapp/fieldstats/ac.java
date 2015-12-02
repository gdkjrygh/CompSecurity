// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class ac extends Enum
{

    public static final ac CORRUPTED;
    public static final ac ERROR_FAILED;
    public static final ac MISSING_CHAT_STORE;
    public static final ac NOT_CONNECTED;
    public static final ac NOT_ENOUGH_SPACE;
    public static final ac NOT_REGISTERED;
    public static final ac SUCCESS;
    public static final ac TIME_EXPIRED;
    public static final ac TOO_LARGE;
    public static final ac USER_STOPPED;
    private static final ac a[];
    private static final String z[];
    private final int b;

    private ac(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static ac valueOf(String s)
    {
        return (ac)Enum.valueOf(com/whatsapp/fieldstats/ac, s);
    }

    public static ac[] values()
    {
        return (ac[])a.clone();
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
        obj = "\003\025\tl/\022\004\024`\"\022\030";
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
                obj = "\032\025\027z9\031\033\033j8\026\b\033z$\030\016\001";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\003\023\013v<\026\016\003l";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\022\016\026f\"\b\032\005`<\022\030";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\031\023\020v3\030\022\nl3\003\031\0";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\024\023\026{%\007\b\001m";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\031\023\020v\"\022\033\rz$\022\016\001m";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\031\023\020v5\031\023\021n8\b\017\024h3\022";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\002\017\001{/\004\b\013y \022\030";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\004\t\007j5\004\017";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                z = as;
                SUCCESS = new ac(z[9], 0, 1);
                USER_STOPPED = new ac(z[8], 1, 2);
                TIME_EXPIRED = new ac(z[0], 2, 3);
                ERROR_FAILED = new ac(z[3], 3, 4);
                MISSING_CHAT_STORE = new ac(z[1], 4, 5);
                CORRUPTED = new ac(z[5], 5, 6);
                NOT_REGISTERED = new ac(z[6], 6, 7);
                NOT_ENOUGH_SPACE = new ac(z[7], 7, 8);
                TOO_LARGE = new ac(z[2], 8, 9);
                NOT_CONNECTED = new ac(z[4], 9, 10);
                a = (new ac[] {
                    SUCCESS, USER_STOPPED, TIME_EXPIRED, ERROR_FAILED, MISSING_CHAT_STORE, CORRUPTED, NOT_REGISTERED, NOT_ENOUGH_SPACE, TOO_LARGE, NOT_CONNECTED
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
        byte byte1 = 112;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 87;
          goto _L9
_L5:
        byte1 = 92;
          goto _L9
_L6:
        byte1 = 68;
          goto _L9
        byte1 = 41;
          goto _L9
    }
}
