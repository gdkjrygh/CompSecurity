// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


public final class g_ extends Enum
{

    public static final g_ FIXED_LINE;
    public static final g_ FIXED_LINE_OR_MOBILE;
    public static final g_ MOBILE;
    public static final g_ PAGER;
    public static final g_ PERSONAL_NUMBER;
    public static final g_ PREMIUM_RATE;
    public static final g_ SHARED_COST;
    public static final g_ TOLL_FREE;
    public static final g_ UAN;
    public static final g_ UNKNOWN;
    public static final g_ VOICEMAIL;
    public static final g_ VOIP;
    private static final g_ a[];
    private static final String z[];

    private g_(String s, int i)
    {
        super(s, i);
    }

    public static g_ valueOf(String s)
    {
        return (g_)Enum.valueOf(com/google/g_, s);
    }

    public static g_[] values()
    {
        return (g_[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[12];
        obj = "LISp,RMM|-IACf1";
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
                obj = "HCMo<Z^Df";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "QCCj/Y";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "JCHs";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "ZEYf'C@Hm&CCS|.SNHo&";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "L^Dn*IA^q\"HI";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "IMO";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "OD@q&XSBl0H";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "ZEYf'C@Hm&";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "LMFf1";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "JCH`&QMHo";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "IBJm,KB";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                FIXED_LINE = new g_(z[8], 0);
                MOBILE = new g_(z[2], 1);
                FIXED_LINE_OR_MOBILE = new g_(z[4], 2);
                TOLL_FREE = new g_(z[1], 3);
                PREMIUM_RATE = new g_(z[5], 4);
                SHARED_COST = new g_(z[7], 5);
                VOIP = new g_(z[3], 6);
                PERSONAL_NUMBER = new g_(z[0], 7);
                PAGER = new g_(z[9], 8);
                UAN = new g_(z[6], 9);
                VOICEMAIL = new g_(z[10], 10);
                UNKNOWN = new g_(z[11], 11);
                a = (new g_[] {
                    FIXED_LINE, MOBILE, FIXED_LINE_OR_MOBILE, TOLL_FREE, PREMIUM_RATE, SHARED_COST, VOIP, PERSONAL_NUMBER, PAGER, UAN, 
                    VOICEMAIL, UNKNOWN
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 636
    //                   0 659
    //                   1 666
    //                   2 673
    //                   3 679;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_679;
_L3:
        byte byte1 = 99;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 28;
          goto _L9
_L5:
        byte1 = 12;
          goto _L9
_L6:
        byte1 = 1;
          goto _L9
        byte1 = 35;
          goto _L9
    }
}
