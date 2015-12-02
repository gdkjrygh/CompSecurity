// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.contact;


public final class m extends Enum
{

    public static final m BACKGROUND;
    public static final m INTERACTIVE;
    public static final m REGISTRATION;
    private static final m a[];
    private static final String z[];
    private final String b;

    private m(String s, int i, String s1)
    {
        super(s, i);
        b = s1;
    }

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(com/whatsapp/contact/m, s);
    }

    public static m[] values()
    {
        return (m[])a.clone();
    }

    public String getContextString()
    {
        return b;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "\002/Xjr\0048^wh\037$";
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
                obj = "\031$Kfs\021)Kjw\025";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "2\013|HF\"\005jME";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\022+\\hf\002%Jme";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "9\004kFS1\tkJW5";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\"\017xJR$\030~WH?\004";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                REGISTRATION = new m(z[5], 0, z[0]);
                INTERACTIVE = new m(z[4], 1, z[1]);
                BACKGROUND = new m(z[2], 2, z[3]);
                a = (new m[] {
                    REGISTRATION, INTERACTIVE, BACKGROUND
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 304
    //                   0 326
    //                   1 333
    //                   2 340
    //                   3 347;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_347;
_L3:
        byte byte1 = 1;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 112;
          goto _L9
_L5:
        byte1 = 74;
          goto _L9
_L6:
        byte1 = 63;
          goto _L9
        byte1 = 3;
          goto _L9
    }
}
