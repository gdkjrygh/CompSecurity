// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class g extends Enum
{

    public static final g GROUP;
    public static final g INDIVIDUAL;
    private static final g a[];
    private static final String z[];

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/whatsapp/g, s);
    }

    public static g[] values()
    {
        return (g[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "VS?\016\n";
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
                obj = "XO4\022\fXE%\032\026";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                INDIVIDUAL = new g(z[1], 0);
                GROUP = new g(z[0], 1);
                a = (new g[] {
                    INDIVIDUAL, GROUP
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 188
    //                   0 209
    //                   1 215
    //                   2 220
    //                   3 226;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_226;
_L3:
        byte byte0 = 90;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 17;
          goto _L9
_L5:
        byte0 = 1;
          goto _L9
_L6:
        byte0 = 112;
          goto _L9
        byte0 = 91;
          goto _L9
    }
}
