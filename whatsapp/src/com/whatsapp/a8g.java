// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class a8g extends Enum
{

    public static final a8g CRASH;
    public static final a8g VOICE;
    private static final a8g b[];
    private static final String z[];
    private final String a;

    private a8g(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static a8g valueOf(String s)
    {
        return (a8g)Enum.valueOf(com/whatsapp/a8g, s);
    }

    public static a8g[] values()
    {
        return (a8g[])b.clone();
    }

    public String getType()
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
        obj = "&IBT\025";
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
                obj = "\006ibt5";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "3TJD\030";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\023tjd8";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                CRASH = new a8g(z[1], 0, z[0]);
                VOICE = new a8g(z[3], 1, z[2]);
                b = (new a8g[] {
                    CRASH, VOICE
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 240
    //                   0 261
    //                   1 267
    //                   2 273
    //                   3 279;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_279;
_L3:
        byte byte0 = 125;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 69;
          goto _L9
_L5:
        byte0 = 59;
          goto _L9
_L6:
        byte0 = 35;
          goto _L9
        byte0 = 39;
          goto _L9
    }
}
