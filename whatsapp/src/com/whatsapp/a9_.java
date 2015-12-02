// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class a9_ extends Enum
{

    public static final a9_ ERROR_BAD_PARAMETER;
    public static final a9_ ERROR_BAD_TOKEN;
    public static final a9_ ERROR_BLOCKED;
    public static final a9_ ERROR_CONNECTIVITY;
    public static final a9_ ERROR_MISSING_PARAMETER;
    public static final a9_ ERROR_NEXT_METHOD;
    public static final a9_ ERROR_NO_ROUTES;
    public static final a9_ ERROR_OLD_VERSION;
    public static final a9_ ERROR_PROVIDER_TIMEOUT;
    public static final a9_ ERROR_PROVIDER_UNROUTABLE;
    public static final a9_ ERROR_TEMPORARILY_UNAVAILABLE;
    public static final a9_ ERROR_TOO_MANY;
    public static final a9_ ERROR_TOO_MANY_ALL_METHODS;
    public static final a9_ ERROR_TOO_MANY_GUESSES;
    public static final a9_ ERROR_TOO_RECENT;
    public static final a9_ ERROR_UNSPECIFIED;
    public static final a9_ EXPIRED;
    public static final a9_ OK;
    public static final a9_ YES;
    public static final a9_ YES_WITH_CODE;
    private static final a9_ a[];
    private static final String z[];

    private a9_(String s, int i)
    {
        super(s, i);
    }

    public static a9_ valueOf(String s)
    {
        return (a9_)Enum.valueOf(com/whatsapp/a9_, s);
    }

    public static a9_[] values()
    {
        return (a9_[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[20];
        obj = "S\b8(sI\n8(w_\036/5~C\0248(tB\033(+d";
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
                obj = "S\b8(sI\030&(b]\037.";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "O\03798v_\016\"8bY\036/";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "S\b8(sI\017$4qS\031#!hS\036";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "S\b8(sI\024/?uI\027/3iY\036";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "S\b8(sI\016/*qY\b+5hZ\00352oW\f+.mW\030&\"";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "S\b8(sI\024%8sY\017>\"r";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "S\b8(sI\016%(~D\037)\"oB";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "S\b8(sI\027#4r_\024-8qW\b+*dB\0378";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "S\002:.sS\036";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "S\b8(sI\016%(~[\033$>~Q\017/4rS\t";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "S\b8(sI\n8(w_\036/5~B\023'\"nC\016";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "S\b8(sI\016%(~[\033$>~W\026&8lS\016\"(eE";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "S\b8(sI\031%)oS\031>.w_\0163";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "S\b8(sI\016%(~[\033$>";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "O\0379";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "Y\021";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "S\b8(sI\030+#~F\0338&lS\016/5";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "S\b8(sI\025&#~@\03784hY\024";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "S\b8(sI\030+#~B\025!\"o";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                z = as;
                YES = new a9_(z[15], 0);
                YES_WITH_CODE = new a9_(z[2], 1);
                OK = new a9_(z[16], 2);
                EXPIRED = new a9_(z[9], 3);
                ERROR_UNSPECIFIED = new a9_(z[3], 4);
                ERROR_CONNECTIVITY = new a9_(z[13], 5);
                ERROR_TOO_RECENT = new a9_(z[7], 6);
                ERROR_TOO_MANY = new a9_(z[14], 7);
                ERROR_OLD_VERSION = new a9_(z[18], 8);
                ERROR_TEMPORARILY_UNAVAILABLE = new a9_(z[5], 9);
                ERROR_NEXT_METHOD = new a9_(z[4], 10);
                ERROR_TOO_MANY_GUESSES = new a9_(z[10], 11);
                ERROR_BLOCKED = new a9_(z[1], 12);
                ERROR_BAD_PARAMETER = new a9_(z[17], 13);
                ERROR_MISSING_PARAMETER = new a9_(z[8], 14);
                ERROR_PROVIDER_TIMEOUT = new a9_(z[11], 15);
                ERROR_PROVIDER_UNROUTABLE = new a9_(z[0], 16);
                ERROR_BAD_TOKEN = new a9_(z[19], 17);
                ERROR_TOO_MANY_ALL_METHODS = new a9_(z[12], 18);
                ERROR_NO_ROUTES = new a9_(z[6], 19);
                a = (new a9_[] {
                    YES, YES_WITH_CODE, OK, EXPIRED, ERROR_UNSPECIFIED, ERROR_CONNECTIVITY, ERROR_TOO_RECENT, ERROR_TOO_MANY, ERROR_OLD_VERSION, ERROR_TEMPORARILY_UNAVAILABLE, 
                    ERROR_NEXT_METHOD, ERROR_TOO_MANY_GUESSES, ERROR_BLOCKED, ERROR_BAD_PARAMETER, ERROR_MISSING_PARAMETER, ERROR_PROVIDER_TIMEOUT, ERROR_PROVIDER_UNROUTABLE, ERROR_BAD_TOKEN, ERROR_TOO_MANY_ALL_METHODS, ERROR_NO_ROUTES
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1012
    //                   0 1035
    //                   1 1042
    //                   2 1049
    //                   3 1056;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1056;
_L3:
        byte byte1 = 33;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 22;
          goto _L9
_L5:
        byte1 = 90;
          goto _L9
_L6:
        byte1 = 106;
          goto _L9
        byte1 = 103;
          goto _L9
    }
}
