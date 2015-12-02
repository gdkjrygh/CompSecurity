// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class d extends Enum
{

    public static final d ATTACHED;
    public static final d CREATED;
    public static final d EXPIRED;
    public static final d FAIL_BAD_PARAM;
    public static final d FAIL_BAD_TOKEN;
    public static final d FAIL_BLOCKED;
    public static final d FAIL_FORMAT_WRONG;
    public static final d FAIL_GUESSED_TOO_FAST;
    public static final d FAIL_INCORRECT;
    public static final d FAIL_LENGTH_LONG;
    public static final d FAIL_LENGTH_SHORT;
    public static final d FAIL_MISMATCH;
    public static final d FAIL_MISSING;
    public static final d FAIL_MISSING_PARAM;
    public static final d FAIL_NEXT_METHOD;
    public static final d FAIL_NO_ROUTES;
    public static final d FAIL_OLD_VERSION;
    public static final d FAIL_PROVIDER_TIMEOUT;
    public static final d FAIL_PROVIDER_UNROUTABLE;
    public static final d FAIL_STALE;
    public static final d FAIL_TEMPORARILY_UNAVAILABLE;
    public static final d FAIL_TOO_MANY;
    public static final d FAIL_TOO_MANY_ALL_METHODS;
    public static final d FAIL_TOO_MANY_GUESSES;
    public static final d FAIL_TOO_RECENT;
    public static final d OK;
    public static final d SENT;
    private static final d a[];
    private static final String z[];
    private final int b;

    private d(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/whatsapp/fieldstats/d, s);
    }

    public static d[] values()
    {
        return (d[])a.clone();
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
        as = new String[27];
        obj = "|\035J\001>x\020L\016*\177\030";
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
                obj = "|\035J\001>w\025P\000 n\037K";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "|\035J\001>n\023L\0223\177\037F\0035";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "|\035J\001>j\016L\033(~\031Q\0224t\016L\0305{\036O\b";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "|\035J\001>n\023L\022,{\022Z";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "|\035J\001>u\020G\0227\177\016P\004.t";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "|\035J\001>w\025P\036(t\033\\\035 h\035N";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "y\016F\f5\177\030";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "u\027";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "|\035J\001>x\035G\0221{\016B\0";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "|\035J\001>v\031M\n5r\003O\002/}";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "|\035J\001>x\035G\0225u\027F\003";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "|\035J\001>n\023L\022,{\022Z\022&o\031P\036$i";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "|\035J\001>j\016L\033(~\031Q\0225s\021F\0024n";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "|\035J\001>v\031M\n5r\003P\005.h\b";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "|\035J\001>}\tF\0362\177\030\\\031.u\003E\f2n";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "{\bW\f\"r\031G";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "|\035J\001>n\023L\022,{\022Z\022 v\020\\\000$n\024L\t2";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "|\035J\001>n\031N\035.h\035Q\004-c\003V\003 l\035J\001 x\020F";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "\177\004S\0043\177\030";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "|\035J\001>t\031[\031>w\031W\005.~";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "|\035J\001>t\023\\\037.o\bF\036";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "|\035J\001>s\022@\0023h\031@\031";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "|\035J\001>|\023Q\000 n\003T\037.t\033";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "|\035J\001>i\bB\001$";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "|\035J\001>w\025P\036(t\033";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "i\031M\031";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                z = as;
                OK = new d(z[8], 0, 1);
                FAIL_MISMATCH = new d(z[1], 1, 2);
                FAIL_TOO_MANY_GUESSES = new d(z[12], 2, 3);
                FAIL_GUESSED_TOO_FAST = new d(z[15], 3, 4);
                FAIL_MISSING = new d(z[25], 4, 5);
                FAIL_STALE = new d(z[24], 5, 6);
                FAIL_TEMPORARILY_UNAVAILABLE = new d(z[18], 6, 7);
                FAIL_BLOCKED = new d(z[0], 7, 8);
                SENT = new d(z[26], 8, 9);
                FAIL_NEXT_METHOD = new d(z[20], 9, 10);
                FAIL_TOO_MANY_ALL_METHODS = new d(z[17], 10, 11);
                FAIL_TOO_RECENT = new d(z[2], 11, 12);
                FAIL_TOO_MANY = new d(z[4], 12, 13);
                FAIL_OLD_VERSION = new d(z[5], 13, 14);
                FAIL_BAD_PARAM = new d(z[9], 14, 15);
                FAIL_PROVIDER_TIMEOUT = new d(z[13], 15, 16);
                FAIL_PROVIDER_UNROUTABLE = new d(z[3], 16, 17);
                FAIL_BAD_TOKEN = new d(z[11], 17, 18);
                FAIL_NO_ROUTES = new d(z[21], 18, 19);
                ATTACHED = new d(z[16], 19, 20);
                FAIL_INCORRECT = new d(z[22], 20, 21);
                FAIL_LENGTH_LONG = new d(z[10], 21, 22);
                FAIL_LENGTH_SHORT = new d(z[14], 22, 23);
                FAIL_FORMAT_WRONG = new d(z[23], 23, 24);
                EXPIRED = new d(z[19], 24, 25);
                CREATED = new d(z[7], 25, 26);
                FAIL_MISSING_PARAM = new d(z[6], 26, 27);
                a = (new d[] {
                    OK, FAIL_MISMATCH, FAIL_TOO_MANY_GUESSES, FAIL_GUESSED_TOO_FAST, FAIL_MISSING, FAIL_STALE, FAIL_TEMPORARILY_UNAVAILABLE, FAIL_BLOCKED, SENT, FAIL_NEXT_METHOD, 
                    FAIL_TOO_MANY_ALL_METHODS, FAIL_TOO_RECENT, FAIL_TOO_MANY, FAIL_OLD_VERSION, FAIL_BAD_PARAM, FAIL_PROVIDER_TIMEOUT, FAIL_PROVIDER_UNROUTABLE, FAIL_BAD_TOKEN, FAIL_NO_ROUTES, ATTACHED, 
                    FAIL_INCORRECT, FAIL_LENGTH_LONG, FAIL_LENGTH_SHORT, FAIL_FORMAT_WRONG, EXPIRED, CREATED, FAIL_MISSING_PARAM
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1388
    //                   0 1411
    //                   1 1418
    //                   2 1425
    //                   3 1431;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1431;
_L3:
        byte byte1 = 97;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 58;
          goto _L9
_L5:
        byte1 = 92;
          goto _L9
_L6:
        byte1 = 3;
          goto _L9
        byte1 = 77;
          goto _L9
    }
}
