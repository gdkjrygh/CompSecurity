// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class p extends Enum
{

    public static final p ERROR_FAILED;
    public static final p ERROR_PROVIDER;
    public static final p ERROR_REQUEST;
    public static final p SUCCESS;
    private static final p a[];
    private static final String z[];
    private final int b;

    private p(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static p valueOf(String s)
    {
        return (p)Enum.valueOf(com/whatsapp/fieldstats/p, s);
    }

    public static p[] values()
    {
        return (p[])a.clone();
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
        obj = ".k8\031\0264i8\031\022\"}/\004";
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
                obj = "8l)\025\0018j";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ".k8\031\0264k/\007\021.j>";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ".k8\031\0264\177+\037\b.}";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                SUCCESS = new p(z[1], 0, 1);
                ERROR_PROVIDER = new p(z[0], 1, 2);
                ERROR_REQUEST = new p(z[2], 2, 3);
                ERROR_FAILED = new p(z[3], 3, 4);
                a = (new p[] {
                    SUCCESS, ERROR_PROVIDER, ERROR_REQUEST, ERROR_FAILED
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
        byte byte0 = 68;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 107;
          goto _L9
_L5:
        byte0 = 57;
          goto _L9
_L6:
        byte0 = 106;
          goto _L9
        byte0 = 86;
          goto _L9
    }
}
