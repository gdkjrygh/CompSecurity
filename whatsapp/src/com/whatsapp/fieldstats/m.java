// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class m extends Enum
{

    public static final m ERROR_UNKNOWN;
    public static final m OK;
    public static final m TIMEOUT;
    private static final m a[];
    private static final String z[];
    private final int b;

    private m(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(com/whatsapp/fieldstats/m, s);
    }

    public static m[] values()
    {
        return (m[])a.clone();
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
        obj = "<6@mM=+";
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
                obj = "'4";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "--_gP7*CcL'(C";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                OK = new m(z[1], 0, 1);
                TIMEOUT = new m(z[0], 1, 2);
                ERROR_UNKNOWN = new m(z[2], 2, 3);
                a = (new m[] {
                    OK, TIMEOUT, ERROR_UNKNOWN
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 232
    //                   0 252
    //                   1 258
    //                   2 264
    //                   3 270;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_270;
_L3:
        byte byte0 = 2;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 104;
          goto _L9
_L5:
        byte0 = 127;
          goto _L9
_L6:
        byte0 = 13;
          goto _L9
        byte0 = 40;
          goto _L9
    }
}
