// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class af extends Enum
{

    public static final af CONTACTS;
    public static final af KEYS;
    public static final af MESSAGES;
    private static final af b[];
    private static final String z[];
    private final int a;

    private af(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static af valueOf(String s)
    {
        return (af)Enum.valueOf(com/whatsapp/fieldstats/af, s);
    }

    public static af[] values()
    {
        return (af[])b.clone();
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
        obj = "n,rY";
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
                obj = "f&e^{f=x";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "h,xY{b,x";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                MESSAGES = new af(z[2], 0, 1);
                CONTACTS = new af(z[1], 1, 2);
                KEYS = new af(z[0], 2, 3);
                b = (new af[] {
                    MESSAGES, CONTACTS, KEYS
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
        byte byte0 = 58;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 37;
          goto _L9
_L5:
        byte0 = 105;
          goto _L9
_L6:
        byte0 = 43;
          goto _L9
        byte0 = 10;
          goto _L9
    }
}
