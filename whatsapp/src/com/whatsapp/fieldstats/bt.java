// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class bt extends Enum
{

    public static final bt CELLULAR_1XRTT;
    public static final bt CELLULAR_CDMA;
    public static final bt CELLULAR_EDGE;
    public static final bt CELLULAR_EHRPD;
    public static final bt CELLULAR_EVDO;
    public static final bt CELLULAR_GPRS;
    public static final bt CELLULAR_HSDPA;
    public static final bt CELLULAR_HSPA;
    public static final bt CELLULAR_HSPAP;
    public static final bt CELLULAR_HSUPA;
    public static final bt CELLULAR_IDEN;
    public static final bt CELLULAR_LTE;
    public static final bt CELLULAR_UMTS;
    public static final bt CELLULAR_UNKNOWN;
    public static final bt WIFI_UNKNOWN;
    private static final bt b[];
    private static final String z[];
    private final int a;

    private bt(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static bt valueOf(String s)
    {
        return (bt)Enum.valueOf(com/whatsapp/fieldstats/bt, s);
    }

    public static bt[] values()
    {
        return (bt[])b.clone();
    }

    public int getCode()
    {
        return a;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[15];
        obj = "I,o9|F(q*aY9b%";
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
                obj = "I,o9|F(q*e^,";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "I,o9|F(q*|G=p";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "I,o9|F(q*aY<s4";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "I,o9|F(q*`N,m";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "I,o9|F(q*aY-s4";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "I,o9|F(q*aY9b";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "I,o9|F(q*|D\"m:~D";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "I,o9|F(q*lB;s1";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "I,o9|F(q*\030R;w!";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                obj = "I,o9|F(q*lN.f";
                byte0 = 9;
                i = 10;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "I,o9|F(q*l\\-l";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "I,o9|F(q*nZ;p";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "] e<v_'h;f]'";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "I,o9|F(q*jN$b";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                z = as;
                CELLULAR_UNKNOWN = new bt(z[7], 0, 0);
                WIFI_UNKNOWN = new bt(z[13], 1, 1);
                CELLULAR_EDGE = new bt(z[10], 2, 100);
                CELLULAR_IDEN = new bt(z[4], 3, 101);
                CELLULAR_UMTS = new bt(z[2], 4, 102);
                CELLULAR_EVDO = new bt(z[11], 5, 103);
                CELLULAR_GPRS = new bt(z[12], 6, 104);
                CELLULAR_HSDPA = new bt(z[5], 7, 105);
                CELLULAR_HSUPA = new bt(z[3], 8, 106);
                CELLULAR_HSPA = new bt(z[6], 9, 107);
                CELLULAR_CDMA = new bt(z[14], 10, 108);
                CELLULAR_1XRTT = new bt(z[9], 11, 109);
                CELLULAR_EHRPD = new bt(z[8], 12, 110);
                CELLULAR_LTE = new bt(z[1], 13, 111);
                CELLULAR_HSPAP = new bt(z[0], 14, 112);
                b = (new bt[] {
                    CELLULAR_UNKNOWN, WIFI_UNKNOWN, CELLULAR_EDGE, CELLULAR_IDEN, CELLULAR_UMTS, CELLULAR_EVDO, CELLULAR_GPRS, CELLULAR_HSDPA, CELLULAR_HSUPA, CELLULAR_HSPA, 
                    CELLULAR_CDMA, CELLULAR_1XRTT, CELLULAR_EHRPD, CELLULAR_LTE, CELLULAR_HSPAP
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 804
    //                   0 827
    //                   1 834
    //                   2 841
    //                   3 848;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_848;
_L3:
        byte byte1 = 41;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 10;
          goto _L9
_L5:
        byte1 = 105;
          goto _L9
_L6:
        byte1 = 35;
          goto _L9
        byte1 = 117;
          goto _L9
    }
}
