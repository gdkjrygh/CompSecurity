// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class mw extends Enum
{

    public static final mw BLOCKED;
    public static final mw ERROR_BAD_TOKEN;
    public static final mw FORMAT_WRONG;
    public static final mw INCORRECT;
    public static final mw LENGTH_LONG;
    public static final mw LENGTH_SHORT;
    public static final mw OLD_VERSION;
    public static final mw TEMPORARILY_UNAVAILABLE;
    private static final mw a[];
    private static final String z[];

    private mw(String s, int i)
    {
        super(s, i);
    }

    public static mw valueOf(String s)
    {
        return (mw)Enum.valueOf(com/whatsapp/mw, s);
    }

    public static mw[] values()
    {
        return (mw[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "I+s!3C5d7*H";
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
                obj = "O)t17T\"t*";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "R\"z.*T&e7)_8b0$P&~2$D+r";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "J\"y91N8{1+A";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "J\"y91N8d6*T3";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "@(e3$R8`,*H ";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                obj = "C5e17Y%v::R(|;+";
                byte0 = 5;
                i = 6;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "D+x=.C#";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                INCORRECT = new mw(z[1], 0);
                BLOCKED = new mw(z[7], 1);
                LENGTH_LONG = new mw(z[3], 2);
                LENGTH_SHORT = new mw(z[4], 3);
                FORMAT_WRONG = new mw(z[5], 4);
                TEMPORARILY_UNAVAILABLE = new mw(z[2], 5);
                OLD_VERSION = new mw(z[0], 6);
                ERROR_BAD_TOKEN = new mw(z[6], 7);
                a = (new mw[] {
                    INCORRECT, BLOCKED, LENGTH_LONG, LENGTH_SHORT, FORMAT_WRONG, TEMPORARILY_UNAVAILABLE, OLD_VERSION, ERROR_BAD_TOKEN
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 448
    //                   0 471
    //                   1 478
    //                   2 485
    //                   3 492;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_492;
_L3:
        byte byte1 = 101;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 6;
          goto _L9
_L5:
        byte1 = 103;
          goto _L9
_L6:
        byte1 = 55;
          goto _L9
        byte1 = 126;
          goto _L9
    }
}
