// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class x extends Enum
{

    public static final x DUPLICATE;
    public static final x ERROR_REQUEST;
    public static final x ERROR_UNKNOWN;
    public static final x ERROR_UPLOAD;
    public static final x OK;
    private static final x a[];
    private static final String z[];
    private final int b;

    private x(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static x valueOf(String s)
    {
        return (x)Enum.valueOf(com/whatsapp/fieldstats/x, s);
    }

    public static x[] values()
    {
        return (x[])a.clone();
    }

    public int getCode()
    {
        return b;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "0\b\031n:*\017\033m'4\036";
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
                obj = "0\b\031n:*\b\016p=0\t\037";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ":\021";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "1\017\033m!6\033\037d";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "0\b\031n:*\017\005j&:\r\005";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                OK = new x(z[2], 0, 1);
                DUPLICATE = new x(z[3], 1, 3);
                ERROR_UNKNOWN = new x(z[4], 2, 2);
                ERROR_REQUEST = new x(z[1], 3, 4);
                ERROR_UPLOAD = new x(z[0], 4, 5);
                a = (new x[] {
                    OK, DUPLICATE, ERROR_UNKNOWN, ERROR_REQUEST, ERROR_UPLOAD
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 312
    //                   0 335
    //                   1 342
    //                   2 349
    //                   3 356;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_356;
_L3:
        byte byte1 = 104;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 117;
          goto _L9
_L5:
        byte1 = 90;
          goto _L9
_L6:
        byte1 = 75;
          goto _L9
        byte1 = 33;
          goto _L9
    }
}
