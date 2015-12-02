// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class b_ extends Enum
{

    public static final b_ EMAIL;
    public static final b_ SELF;
    public static final b_ SMS;
    public static final b_ VOICE;
    private static final b_ b[];
    private static final String z[];
    private final int a;

    private b_(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static b_ valueOf(String s)
    {
        return (b_)Enum.valueOf(com/whatsapp/fieldstats/b_, s);
    }

    public static b_[] values()
    {
        return (b_[])b.clone();
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
        as = new String[4];
        obj = "n~\177\002\013";
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
                obj = "ktz\007";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "}|w\b\002";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "k|e";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                SMS = new b_(z[3], 0, 1);
                VOICE = new b_(z[0], 1, 2);
                EMAIL = new b_(z[2], 2, 3);
                SELF = new b_(z[1], 3, 4);
                b = (new b_[] {
                    SMS, VOICE, EMAIL, SELF
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
        byte byte0 = 78;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 56;
          goto _L9
_L5:
        byte0 = 49;
          goto _L9
_L6:
        byte0 = 54;
          goto _L9
        byte0 = 65;
          goto _L9
    }
}
