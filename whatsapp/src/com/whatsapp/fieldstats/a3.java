// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class a3 extends Enum
{

    public static final a3 DELIVERED;
    public static final a3 PLAYED;
    public static final a3 READ;
    private static final a3 b[];
    private static final String z[];
    private final int a;

    private a3(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static a3 valueOf(String s)
    {
        return (a3)Enum.valueOf(com/whatsapp/fieldstats/a3, s);
    }

    public static a3[] values()
    {
        return (a3[])b.clone();
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
        obj = "n'\004J,o0\rG";
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
                obj = "x'\tG";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "z.\tZ?n";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                DELIVERED = new a3(z[0], 0, 1);
                READ = new a3(z[1], 1, 2);
                PLAYED = new a3(z[2], 2, 3);
                b = (new a3[] {
                    DELIVERED, READ, PLAYED
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
        byte byte0 = 122;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 42;
          goto _L9
_L5:
        byte0 = 98;
          goto _L9
_L6:
        byte0 = 72;
          goto _L9
        byte0 = 3;
          goto _L9
    }
}
