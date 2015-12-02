// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class a8 extends Enum
{

    public static final a8 CREATE_DATA;
    public static final a8 DELETE_DATA;
    public static final a8 GET_DATA;
    public static final a8 SET_DATA;
    private static final a8 a[];
    private static final String z[];
    private final int b;

    private a8(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static a8 valueOf(String s)
    {
        return (a8)Enum.valueOf(com/whatsapp/fieldstats/a8, s);
    }

    public static a8[] values()
    {
        return (a8[])a.clone();
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
        obj = "\013$!\013.\03154";
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
                obj = "\034$9\021>\035>1\025>\031";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\03330\025>\035>1\025>\031";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\037$!\013.\03154";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                SET_DATA = new a8(z[0], 0, 1);
                GET_DATA = new a8(z[3], 1, 2);
                CREATE_DATA = new a8(z[2], 2, 3);
                DELETE_DATA = new a8(z[1], 3, 4);
                a = (new a8[] {
                    SET_DATA, GET_DATA, CREATE_DATA, DELETE_DATA
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
        byte byte0 = 106;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 88;
          goto _L9
_L5:
        byte0 = 97;
          goto _L9
_L6:
        byte0 = 117;
          goto _L9
        byte0 = 84;
          goto _L9
    }
}
