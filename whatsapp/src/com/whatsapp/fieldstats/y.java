// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class y extends Enum
{

    public static final y CONNECTED;
    public static final y DISCONNECTED;
    public static final y PASSWORD_FAIL;
    public static final y SOCKET_CONNECTING;
    public static final y XMPP_CONNECTING;
    private static final y b[];
    private static final String z[];
    private final int a;

    private y(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static y valueOf(String s)
    {
        return (y)Enum.valueOf(com/whatsapp/fieldstats/y, s);
    }

    public static y[] values()
    {
        return (y[])b.clone();
    }

    public int getCode()
    {
        return a;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "\"Yf1r%If5y?Sf.~?Q";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = ")[u*h2Yk4r2Bl4p";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "2Yk4r2B`>";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "5_v9x?X`9c4R";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "!Wv)`>Da%q0_i";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                CONNECTED = new y(z[2], 0, 0);
                SOCKET_CONNECTING = new y(z[0], 1, 1);
                XMPP_CONNECTING = new y(z[1], 2, 2);
                DISCONNECTED = new y(z[3], 3, 3);
                PASSWORD_FAIL = new y(z[4], 4, 4);
                b = (new y[] {
                    CONNECTED, SOCKET_CONNECTING, XMPP_CONNECTING, DISCONNECTED, PASSWORD_FAIL
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 312
    //                   0 335
    //                   1 342
    //                   2 349
    //                   3 356;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_356;
_L3:
        byte byte1 = 55;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 113;
          goto _L9
_L5:
        byte1 = 22;
          goto _L9
_L6:
        byte1 = 37;
          goto _L9
        byte1 = 122;
          goto _L9
    }
}
