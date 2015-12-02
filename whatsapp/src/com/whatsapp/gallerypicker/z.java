// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;


final class z extends Enum
{

    public static final z ALLOW;
    public static final z CANCEL;
    private static final z a[];
    private static final String z[];

    private z(String s, int i)
    {
        super(s, i);
    }

    public static z valueOf(String s)
    {
        return (z)Enum.valueOf(com/whatsapp/gallerypicker/z, s);
    }

    public static z[] values()
    {
        return (z[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\0264V\003\b\031";
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
                obj = "\0249T\017\032";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                CANCEL = new z(z[0], 0);
                ALLOW = new z(z[1], 1);
                a = (new z[] {
                    CANCEL, ALLOW
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
        byte byte0 = 77;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 85;
          goto _L9
_L5:
        byte0 = 117;
          goto _L9
_L6:
        byte0 = 24;
          goto _L9
        byte0 = 64;
          goto _L9
    }
}
