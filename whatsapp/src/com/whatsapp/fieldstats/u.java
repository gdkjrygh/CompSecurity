// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class u extends Enum
{

    public static final u FACEBOOK;
    public static final u FOURSQUARE;
    public static final u GOOGLE;
    private static final u b[];
    private static final String z[];
    private final int a;

    private u(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static u valueOf(String s)
    {
        return (u)Enum.valueOf(com/whatsapp/fieldstats/u, s);
    }

    public static u[] values()
    {
        return (u[])b.clone();
    }

    public int getCode()
    {
        return a;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\016\023\031]k\f";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\017\023\003Ht\030\t\027Hb";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\017\035\025_e\006\023\035";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                GOOGLE = new u(z[0], 0, 1);
                FOURSQUARE = new u(z[1], 1, 2);
                FACEBOOK = new u(z[2], 2, 3);
                b = (new u[] {
                    GOOGLE, FOURSQUARE, FACEBOOK
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 232
    //                   0 253
    //                   1 259
    //                   2 265
    //                   3 271;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_271;
_L3:
        byte byte0 = 39;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 73;
          goto _L9
_L5:
        byte0 = 92;
          goto _L9
_L6:
        byte0 = 86;
          goto _L9
        byte0 = 26;
          goto _L9
    }
}
