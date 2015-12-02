// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


final class a_o extends Enum
{

    public static final a_o BLUETOOTH;
    public static final a_o EARPIECE;
    public static final a_o HEADSET;
    public static final a_o SPEAKER;
    private static final a_o a[];
    private static final String z[];

    private a_o(String s, int i)
    {
        super(s, i);
    }

    public static a_o valueOf(String s)
    {
        return (a_o)Enum.valueOf(com/whatsapp/a_o, s);
    }

    public static a_o[] values()
    {
        return (a_o[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "$k|,|$ik";
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
                obj = "2zk=~$x";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ")oo8f$~";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "#f{9a.ez4";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                EARPIECE = new a_o(z[0], 0);
                HEADSET = new a_o(z[2], 1);
                SPEAKER = new a_o(z[1], 2);
                BLUETOOTH = new a_o(z[3], 3);
                a = (new a_o[] {
                    EARPIECE, HEADSET, SPEAKER, BLUETOOTH
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 272
    //                   0 293
    //                   1 299
    //                   2 305
    //                   3 311;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_311;
_L3:
        byte byte0 = 53;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 97;
          goto _L9
_L5:
        byte0 = 42;
          goto _L9
_L6:
        byte0 = 46;
          goto _L9
        byte0 = 124;
          goto _L9
    }
}
