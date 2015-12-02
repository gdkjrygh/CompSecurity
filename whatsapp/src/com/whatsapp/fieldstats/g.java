// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class g extends Enum
{

    public static final g APP_OPEN;
    public static final g CHAT_OPEN;
    public static final g OTHER;
    private static final g a[];
    private static final String z[];
    private final int b;

    private g(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/whatsapp/fieldstats/g, s);
    }

    public static g[] values()
    {
        return (g[])a.clone();
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
        obj = "a\034\000\027j";
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
                obj = "o\030\030\rw~\r\006";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "m\000\t\006ga\030\r\034";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                OTHER = new g(z[0], 0, 1);
                APP_OPEN = new g(z[1], 1, 2);
                CHAT_OPEN = new g(z[2], 2, 3);
                a = (new g[] {
                    OTHER, APP_OPEN, CHAT_OPEN
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 232
    //                   0 253
    //                   1 259
    //                   2 265
    //                   3 271;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_271;
_L3:
        byte byte0 = 56;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 46;
          goto _L9
_L5:
        byte0 = 72;
          goto _L9
_L6:
        byte0 = 72;
          goto _L9
        byte0 = 82;
          goto _L9
    }
}
