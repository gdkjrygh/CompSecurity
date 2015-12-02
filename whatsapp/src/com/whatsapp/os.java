// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class os extends Enum
{

    public static final os VOICE;
    private static final os b[];
    private static final String z[];
    private final String a;

    private os(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static os valueOf(String s)
    {
        return (os)Enum.valueOf(com/whatsapp/os, s);
    }

    public static os[] values()
    {
        return (os[])b.clone();
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
        as = new String[2];
        obj = "$\017XU\034";
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
                obj = "\004/xu<";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                VOICE = new os(z[0], 0, z[1]);
                b = (new os[] {
                    VOICE
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 168
    //                   0 189
    //                   1 195
    //                   2 201
    //                   3 207;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_207;
_L3:
        byte byte0 = 89;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 114;
          goto _L9
_L5:
        byte0 = 64;
          goto _L9
_L6:
        byte0 = 17;
          goto _L9
        byte0 = 22;
          goto _L9
    }
}
