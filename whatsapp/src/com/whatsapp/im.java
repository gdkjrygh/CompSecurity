// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class im extends Enum
{

    public static final im FAILED;
    public static final im SUCCESS_CREATED;
    public static final im SUCCESS_RESTORED;
    private static final im a[];
    private static final String z[];

    private im(String s, int i)
    {
        super(s, i);
    }

    public static im valueOf(String s)
    {
        return (im)Enum.valueOf(com/whatsapp/im, s);
    }

    public static im[] values()
    {
        return (im[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "4h~3\0134nb\"\0134ir\"\013#";
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
                obj = "!|t<\013#";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "4h~3\0134nb3\034\"|i5\n";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                FAILED = new im(z[1], 0);
                SUCCESS_RESTORED = new im(z[0], 1);
                SUCCESS_CREATED = new im(z[2], 2);
                a = (new im[] {
                    FAILED, SUCCESS_RESTORED, SUCCESS_CREATED
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 228
    //                   0 249
    //                   1 255
    //                   2 261
    //                   3 267;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_267;
_L3:
        byte byte0 = 78;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 103;
          goto _L9
_L5:
        byte0 = 61;
          goto _L9
_L6:
        byte0 = 61;
          goto _L9
        byte0 = 112;
          goto _L9
    }
}
