// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;


final class a3 extends Enum
{

    public static final a3 DEBUG_CHAT_HOST;
    public static final a3 END;
    public static final a3 FALLBACKS;
    public static final a3 HTTP;
    public static final a3 IP_OVERRIDE_PORT_1;
    public static final a3 IP_OVERRIDE_PORT_2;
    public static final a3 OVERRIDES;
    public static final a3 PRIMARY;
    public static final a3 START;
    private static final a3 a[];
    private static final String z[];

    private a3(String s, int i)
    {
        super(s, i);
    }

    public static a3 valueOf(String s)
    {
        return (a3)Enum.valueOf(com/whatsapp/messaging/a3, s);
    }

    public static a3[] values()
    {
        return (a3[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[9];
        obj = "y(\013m~";
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
                obj = "n9\bjmu?\002~~u4\005l~";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "e*\017mxc8\017l";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "l=\006shk?\001l";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "z.\003rkx%";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "c,\025p|o.\030vno#\032px~#{";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "o2\016";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "c,\025p|o.\030vno#\032px~#x";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "b(\036o";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                z = as;
                START = new a3(z[0], 0);
                DEBUG_CHAT_HOST = new a3(z[1], 1);
                OVERRIDES = new a3(z[2], 2);
                IP_OVERRIDE_PORT_1 = new a3(z[5], 3);
                IP_OVERRIDE_PORT_2 = new a3(z[7], 4);
                PRIMARY = new a3(z[4], 5);
                FALLBACKS = new a3(z[3], 6);
                HTTP = new a3(z[8], 7);
                END = new a3(z[6], 8);
                a = (new a3[] {
                    START, DEBUG_CHAT_HOST, OVERRIDES, IP_OVERRIDE_PORT_1, IP_OVERRIDE_PORT_2, PRIMARY, FALLBACKS, HTTP, END
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 496
    //                   0 519
    //                   1 526
    //                   2 533
    //                   3 540;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_540;
_L3:
        byte byte1 = 42;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 42;
          goto _L9
_L5:
        byte1 = 124;
          goto _L9
_L6:
        byte1 = 74;
          goto _L9
        byte1 = 63;
          goto _L9
    }
}
