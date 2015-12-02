// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class ao extends Enum
{

    public static final ao DELAYED;
    public static final ao FAILED;
    public static final ao IN_PROGRESS;
    public static final ao NETWORK_UNAVAILABLE;
    public static final ao UP_TO_DATE;
    public static final ao USER_IS_EXPIRED;
    private static final ao a[];
    private static final String z[];
    private final int b;

    private ao(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static ao valueOf(String s)
    {
        return (ao)Enum.valueOf(com/whatsapp/fieldstats/ao, s);
    }

    public static ao[] values()
    {
        return (ao[])a.clone();
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
        as = new String[6];
        obj = "!p'\031r'y*\fs;";
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
                obj = "=n'\035o7z9\035e";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ",{4\by-z";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "&{,\036o:u'\034n)h9\000l)|4\f";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = ".\1771\005e,";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "=m=\033\177!m'\fx8w*\fd";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                NETWORK_UNAVAILABLE = new ao(z[3], 0, 1);
                IN_PROGRESS = new ao(z[0], 1, 2);
                UP_TO_DATE = new ao(z[1], 2, 3);
                FAILED = new ao(z[4], 3, 4);
                DELAYED = new ao(z[2], 4, 5);
                USER_IS_EXPIRED = new ao(z[5], 5, 6);
                a = (new ao[] {
                    NETWORK_UNAVAILABLE, IN_PROGRESS, UP_TO_DATE, FAILED, DELAYED, USER_IS_EXPIRED
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 360
    //                   0 383
    //                   1 390
    //                   2 397
    //                   3 404;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_404;
_L3:
        byte byte1 = 32;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 104;
          goto _L9
_L5:
        byte1 = 62;
          goto _L9
_L6:
        byte1 = 120;
          goto _L9
        byte1 = 73;
          goto _L9
    }
}
