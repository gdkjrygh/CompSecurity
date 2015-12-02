// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class k extends Enum
{

    public static final k DEDUPED;
    public static final k ERROR_CANCEL;
    public static final k ERROR_CANNOT_RESUME;
    public static final k ERROR_DNS;
    public static final k ERROR_HASH_MISMATCH;
    public static final k ERROR_INSUFFICIENT_SPACE;
    public static final k ERROR_INVALID_URL;
    public static final k ERROR_OUTPUT_STREAM;
    public static final k ERROR_TIMEOUT;
    public static final k ERROR_TOO_OLD;
    public static final k ERROR_UNKNOWN;
    public static final k OK;
    private static final k a[];
    private static final String z[];
    private final int b;

    private k(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(com/whatsapp/fieldstats/k, s);
    }

    public static k[] values()
    {
        return (k[])a.clone();
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
        as = new String[12];
        obj = "\027d}sf\rbfqq\035c{";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\027d}sf\r~no|\r{foy\023blt";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\027d}sf\rb`sk\035zk";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\027d}sf\r\177aju\036\177kca\000z";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\027d}sf\ryzhd\007bpo`\000snq";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\027d}sf\r\177aoa\024pf\177}\027x{cg\002wly";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\027d}sf\runrw\027z";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\035}";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\026skid\027r";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\027d}sf\rcawz\035aa";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\027d}sf\rrao";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\027d}sf\runrz\035bpnq\001cby";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                OK = new k(z[7], 0, 1);
                ERROR_UNKNOWN = new k(z[9], 1, 2);
                ERROR_TIMEOUT = new k(z[0], 2, 3);
                ERROR_DNS = new k(z[10], 3, 4);
                ERROR_INSUFFICIENT_SPACE = new k(z[5], 4, 5);
                ERROR_TOO_OLD = new k(z[2], 5, 6);
                ERROR_CANNOT_RESUME = new k(z[11], 6, 7);
                ERROR_HASH_MISMATCH = new k(z[1], 7, 8);
                ERROR_INVALID_URL = new k(z[3], 8, 9);
                ERROR_OUTPUT_STREAM = new k(z[4], 9, 10);
                ERROR_CANCEL = new k(z[6], 10, 11);
                DEDUPED = new k(z[8], 11, 12);
                a = (new k[] {
                    OK, ERROR_UNKNOWN, ERROR_TIMEOUT, ERROR_DNS, ERROR_INSUFFICIENT_SPACE, ERROR_TOO_OLD, ERROR_CANNOT_RESUME, ERROR_HASH_MISMATCH, ERROR_INVALID_URL, ERROR_OUTPUT_STREAM, 
                    ERROR_CANCEL, DEDUPED
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 656
    //                   0 679
    //                   1 686
    //                   2 693
    //                   3 700;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_700;
_L3:
        byte byte1 = 52;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 82;
          goto _L9
_L5:
        byte1 = 54;
          goto _L9
_L6:
        byte1 = 47;
          goto _L9
        byte1 = 60;
          goto _L9
    }
}
