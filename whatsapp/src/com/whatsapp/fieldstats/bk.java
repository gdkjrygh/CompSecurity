// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class bk extends Enum
{

    public static final bk ENDED_BY_USER;
    public static final bk TIMEOUT;
    private static final bk a[];
    private static final String z[];
    private final int b;

    private bk(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static bk valueOf(String s)
    {
        return (bk)Enum.valueOf(com/whatsapp/fieldstats/bk, s);
    }

    public static bk[] values()
    {
        return (bk[])a.clone();
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
        as = new String[2];
        obj = "tPuuNn\\ho_b[c";
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
                obj = "eW|uEdJ";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                ENDED_BY_USER = new bk(z[0], 0, 1);
                TIMEOUT = new bk(z[1], 1, 2);
                a = (new bk[] {
                    ENDED_BY_USER, TIMEOUT
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 188
    //                   0 209
    //                   1 215
    //                   2 221
    //                   3 227;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_227;
_L3:
        byte byte0 = 10;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 49;
          goto _L9
_L5:
        byte0 = 30;
          goto _L9
_L6:
        byte0 = 49;
          goto _L9
        byte0 = 48;
          goto _L9
    }
}
