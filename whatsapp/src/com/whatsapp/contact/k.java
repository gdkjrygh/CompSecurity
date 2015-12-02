// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.contact;


public final class k extends Enum
{

    public static final k CHUNKED;
    public static final k DELTA;
    public static final k FULL;
    public static final k QUERY;
    private static final k b[];
    private static final String z[];
    private final String a;

    private k(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(com/whatsapp/contact/k, s);
    }

    public static k[] values()
    {
        return (k[])b.clone();
    }

    public String getModeString()
    {
        return a;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "BB&j";
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
                obj = "G_?h\177AS";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "g\177\037H_as";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "UB/tm";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "ub\017TM";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "@R&ru";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "bb\006J";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "`r\006RU";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                FULL = new k(z[0], 0, z[6]);
                DELTA = new k(z[5], 1, z[7]);
                QUERY = new k(z[3], 2, z[4]);
                CHUNKED = new k(z[1], 3, z[2]);
                b = (new k[] {
                    FULL, DELTA, QUERY, CHUNKED
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 376
    //                   0 399
    //                   1 405
    //                   2 412
    //                   3 419;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_419;
_L3:
        byte byte1 = 52;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 4;
          goto _L9
_L5:
        byte1 = 23;
          goto _L9
_L6:
        byte1 = 106;
          goto _L9
        byte1 = 38;
          goto _L9
    }
}
