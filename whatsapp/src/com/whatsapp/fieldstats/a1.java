// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class a1 extends Enum
{

    public static final a1 CANCELLED;
    public static final a1 SENT;
    public static final a1 TOO_SHORT;
    private static final a1 a[];
    private static final String z[];
    private final int b;

    private a1(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static a1 valueOf(String s)
    {
        return (a1)Enum.valueOf(com/whatsapp/fieldstats/a1, s);
    }

    public static a1[] values()
    {
        return (a1[])a.clone();
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
        obj = "\004F\004\020";
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
                obj = "\024B\004\007+\033O\017\0";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\003L\005\033=\037L\030\020";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                SENT = new a1(z[0], 0, 1);
                CANCELLED = new a1(z[1], 1, 2);
                TOO_SHORT = new a1(z[2], 2, 3);
                a = (new a1[] {
                    SENT, CANCELLED, TOO_SHORT
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
    //                   2 264
    //                   3 270;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_270;
_L3:
        byte byte0 = 110;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 87;
          goto _L9
_L5:
        byte0 = 3;
          goto _L9
_L6:
        byte0 = 74;
          goto _L9
        byte0 = 68;
          goto _L9
    }
}
