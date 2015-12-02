// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class ak extends Enum
{

    public static final ak CANCEL;
    public static final ak CURRENT_LOCATION;
    public static final ak CUSTOM_LOCATION;
    public static final ak PLACE;
    private static final ak a[];
    private static final String z[];
    private final int b;

    private ak(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static ak valueOf(String s)
    {
        return (ak)Enum.valueOf(com/whatsapp/fieldstats/ak, s);
    }

    public static ak[] values()
    {
        return (ak[])a.clone();
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
        as = new String[4];
        obj = "P\036s\"W]\037~<]P\nu9]]";
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
                obj = "C\007`3W";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "P\no3W_";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "P\036r$]^\024m?QR\037h?\\";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                CANCEL = new ak(z[2], 0, 1);
                CURRENT_LOCATION = new ak(z[0], 1, 2);
                CUSTOM_LOCATION = new ak(z[3], 2, 3);
                PLACE = new ak(z[1], 3, 4);
                a = (new ak[] {
                    CANCEL, CURRENT_LOCATION, CUSTOM_LOCATION, PLACE
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 276
    //                   0 297
    //                   1 303
    //                   2 309
    //                   3 315;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_315;
_L3:
        byte byte0 = 18;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 19;
          goto _L9
_L5:
        byte0 = 75;
          goto _L9
_L6:
        byte0 = 33;
          goto _L9
        byte0 = 112;
          goto _L9
    }
}
