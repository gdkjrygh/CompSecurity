// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.contact;


public final class n extends Enum
{

    public static final n DELAYED;
    public static final n FAILED;
    public static final n IN_PROGRESS;
    public static final n NETWORK_UNAVAILABLE;
    public static final n UP_TO_DATE;
    public static final n USER_IS_EXPIRED;
    private static final n a[];
    private static final String z[];

    private n(String s, int i)
    {
        super(s, i);
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(com/whatsapp/contact/n, s);
    }

    public static n[] values()
    {
        return (n[])a.clone();
    }

    public boolean isFailure()
    {
        return this != IN_PROGRESS && !isSuccess();
    }

    public boolean isSuccess()
    {
        return this == UP_TO_DATE;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "m~)\023~kw$\006\177w";
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
                obj = "`u:\002uat";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "q`)\027c{t7\027i";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "ju\"\024cv{)\026bef7\n`er:\006";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "bq?\017i`";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "qc3\021smc)\006tty$\006h";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                NETWORK_UNAVAILABLE = new n(z[3], 0);
                IN_PROGRESS = new n(z[0], 1);
                UP_TO_DATE = new n(z[2], 2);
                FAILED = new n(z[4], 3);
                DELAYED = new n(z[1], 4);
                USER_IS_EXPIRED = new n(z[5], 5);
                a = (new n[] {
                    NETWORK_UNAVAILABLE, IN_PROGRESS, UP_TO_DATE, FAILED, DELAYED, USER_IS_EXPIRED
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
        byte byte1 = 44;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 36;
          goto _L9
_L5:
        byte1 = 48;
          goto _L9
_L6:
        byte1 = 118;
          goto _L9
        byte1 = 67;
          goto _L9
    }
}
