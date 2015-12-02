// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class bs extends Enum
{

    public static final bs BROADCAST;
    public static final bs GROUP;
    public static final bs INDIVIDUAL;
    private static final bs a[];
    private static final String z[];
    private final int b;

    private bs(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static bs valueOf(String s)
    {
        return (bs)Enum.valueOf(com/whatsapp/fieldstats/bs, s);
    }

    public static bs[] values()
    {
        return (bs[])a.clone();
    }

    public int getCode()
    {
        return b;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "1xi\0311";
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
                obj = "4xi\r%5ku\030";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "?db\0057?ns\r-";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                INDIVIDUAL = new bs(z[2], 0, 1);
                GROUP = new bs(z[0], 1, 2);
                BROADCAST = new bs(z[1], 2, 3);
                a = (new bs[] {
                    INDIVIDUAL, GROUP, BROADCAST
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
        byte byte0 = 97;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 118;
          goto _L9
_L5:
        byte0 = 42;
          goto _L9
_L6:
        byte0 = 38;
          goto _L9
        byte0 = 76;
          goto _L9
    }
}
