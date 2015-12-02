// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class ae extends Enum
{

    public static final ae INVALID_MESSAGE;
    public static final ae INVALID_VERSION;
    public static final ae LEGACY_MESSAGE;
    public static final ae NO_SESSION_AVAILABLE;
    public static final ae PLAINTEXT_BYTE_MISMATCH;
    public static final ae PRE_KEY_MESSAGE_INVALID_KEY;
    public static final ae PRE_KEY_MESSAGE_MISSING_PRE_KEY;
    public static final ae UNTRUSTED_IDENTITY;
    private static final ae a[];
    private static final String z[];
    private final int b;

    private ae(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static ae valueOf(String s)
    {
        return (ae)Enum.valueOf(com/whatsapp/fieldstats/ae, s);
    }

    public static ae[] values()
    {
        return (ae[])a.clone();
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
        as = new String[8];
        obj = "m\003DR\rm\tM^\004w\036ST\004";
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
                obj = "m\003DR\rm\tME\004v\036[\\\017";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "q\003FA\024w\031WW\036m\tW]\025m\031K";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "h\bUR\002}\022_V\022w\fUV";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "t\037WL\na\024M^\004w\036ST\004{\004\\E\000h\004VL\na\024";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "j\002M@\004w\036[\\\017{\fDR\bh\fP_\004";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "t\001SZ\017p\bJG\036f\024FV\036i\004A^\000p\016Z";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "t\037WL\na\024M^\004w\036ST\004{\000[@\022m\003UL\021v\bMX\004}";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                INVALID_MESSAGE = new ae(z[0], 0, 0);
                LEGACY_MESSAGE = new ae(z[3], 1, 1);
                INVALID_VERSION = new ae(z[1], 2, 2);
                PRE_KEY_MESSAGE_MISSING_PRE_KEY = new ae(z[7], 3, 3);
                PRE_KEY_MESSAGE_INVALID_KEY = new ae(z[4], 4, 4);
                UNTRUSTED_IDENTITY = new ae(z[2], 5, 5);
                NO_SESSION_AVAILABLE = new ae(z[5], 6, 6);
                PLAINTEXT_BYTE_MISMATCH = new ae(z[6], 7, 7);
                a = (new ae[] {
                    INVALID_MESSAGE, LEGACY_MESSAGE, INVALID_VERSION, PRE_KEY_MESSAGE_MISSING_PRE_KEY, PRE_KEY_MESSAGE_INVALID_KEY, UNTRUSTED_IDENTITY, NO_SESSION_AVAILABLE, PLAINTEXT_BYTE_MISMATCH
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 456
    //                   0 479
    //                   1 486
    //                   2 493
    //                   3 500;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_500;
_L3:
        byte byte1 = 65;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 36;
          goto _L9
_L5:
        byte1 = 77;
          goto _L9
_L6:
        byte1 = 18;
          goto _L9
        byte1 = 19;
          goto _L9
    }
}
