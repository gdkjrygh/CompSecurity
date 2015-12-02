// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class ab extends Enum
{

    public static final ab MIXED;
    public static final ab P2P;
    public static final ab TCP_RELAY;
    public static final ab UDP_RELAY;
    private static final ab a[];
    private static final String z[];
    private final int b;

    private ab(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static ab valueOf(String s)
    {
        return (ab)Enum.valueOf(com/whatsapp/fieldstats/ab, s);
    }

    public static ab[] values()
    {
        return (ab[])a.clone();
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
        obj = "\r\\_2|";
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
                obj = "\025QW(j\005YF.";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\024VW(j\005YF.";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\020'W";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                P2P = new ab(z[3], 0, 1);
                UDP_RELAY = new ab(z[1], 1, 2);
                TCP_RELAY = new ab(z[2], 2, 3);
                MIXED = new ab(z[0], 3, 4);
                a = (new ab[] {
                    P2P, UDP_RELAY, TCP_RELAY, MIXED
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
        byte byte0 = 56;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 64;
          goto _L9
_L5:
        byte0 = 21;
          goto _L9
_L6:
        byte0 = 7;
          goto _L9
        byte0 = 119;
          goto _L9
    }
}
