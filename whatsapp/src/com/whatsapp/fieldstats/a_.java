// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class a_ extends Enum
{

    public static final a_ BALANCE_PERSONAL;
    public static final a_ BALANCE_WORKSPACE;
    public static final a_ PERSONAL;
    public static final a_ WORKSPACE;
    private static final a_ b[];
    private static final String z[];
    private final int a;

    private a_(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static a_ valueOf(String s)
    {
        return (a_)Enum.valueOf(com/whatsapp/fieldstats/a_, s);
    }

    public static a_[] values()
    {
        return (a_[])b.clone();
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
        obj = "\rqOa+\fu\\p \035cLn$\003";
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
                obj = "\037uQs*\001qO";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\rqOa+\fu\\w*\035{Pp$\fu";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\030\177Qk6\037q@e";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                PERSONAL = new a_(z[1], 0, 1);
                WORKSPACE = new a_(z[3], 1, 2);
                BALANCE_PERSONAL = new a_(z[0], 2, 3);
                BALANCE_WORKSPACE = new a_(z[2], 3, 4);
                b = (new a_[] {
                    PERSONAL, WORKSPACE, BALANCE_PERSONAL, BALANCE_WORKSPACE
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
    //                   3 314;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_314;
_L3:
        byte byte0 = 101;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 79;
          goto _L9
_L5:
        byte0 = 48;
          goto _L9
_L6:
        byte0 = 3;
          goto _L9
        byte0 = 32;
          goto _L9
    }
}
