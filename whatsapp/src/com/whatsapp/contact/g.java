// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.contact;


public final class g extends Enum
{

    public static final g BOTH;
    public static final g INVISIBLE_ONLY;
    public static final g VISIBLE_ONLY;
    private static final g b[];
    private static final String z[];
    private final String a[];

    private g(String s, int i, String as[])
    {
        super(s, i);
        a = as;
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/whatsapp/contact/g, s);
    }

    public static g[] values()
    {
        return (g[])b.clone();
    }

    public String[] getWhereArgs()
    {
        return a;
    }

    public String getWhereClause()
    {
        if (a != null)
        {
            return z[0];
        } else
        {
            return null;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "D\024F \036^\023{:\022r\035k9\002]Z$vH";
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
                obj = "o5M\036";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "{3J\0375a?F\0319a#";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "d4O\037$d8U\023(b4U\017";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                BOTH = new g(z[1], 0, null);
                VISIBLE_ONLY = new g(z[2], 1, new String[] {
                    "1"
                });
                INVISIBLE_ONLY = new g(z[3], 2, new String[] {
                    "0"
                });
                b = (new g[] {
                    BOTH, VISIBLE_ONLY, INVISIBLE_ONLY
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 268
    //                   0 289
    //                   1 295
    //                   2 301
    //                   3 307;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_307;
_L3:
        byte byte0 = 119;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 45;
          goto _L9
_L5:
        byte0 = 122;
          goto _L9
_L6:
        byte0 = 25;
          goto _L9
        byte0 = 86;
          goto _L9
    }
}
