// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


public final class bl extends Enum
{

    public static final bl ADDRESSBOOK;
    public static final bl CALENDAR;
    public static final bl EMAIL_ADDRESS;
    public static final bl GEO;
    public static final bl ISBN;
    public static final bl PRODUCT;
    public static final bl SMS;
    public static final bl TEL;
    public static final bl TEXT;
    public static final bl URI;
    public static final bl VIN;
    public static final bl WIFI;
    private static final bl a[];
    public static int b;
    private static final String z[];

    private bl(String s, int i)
    {
        super(s, i);
    }

    public static bl valueOf(String s)
    {
        return (bl)Enum.valueOf(com/google/bl, s);
    }

    public static bl[] values()
    {
        return (bl[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[12];
        obj = "Y\025\005\023";
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
                obj = "Z\031\033\016";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "K\021\002\023*Q\035\007\0364K\017\020";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "^\016\f\0363M\b";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "]\021\020";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "G\017\001\024";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "X\025\r";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "[\016\n";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "I\031\f";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "Z\031\017";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "M\035\017\037(J\035\021";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "O\030\007\b#]\017\001\025)E";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                ADDRESSBOOK = new bl(z[11], 0);
                EMAIL_ADDRESS = new bl(z[2], 1);
                PRODUCT = new bl(z[3], 2);
                URI = new bl(z[7], 3);
                TEXT = new bl(z[1], 4);
                GEO = new bl(z[8], 5);
                TEL = new bl(z[9], 6);
                SMS = new bl(z[4], 7);
                CALENDAR = new bl(z[10], 8);
                WIFI = new bl(z[0], 9);
                ISBN = new bl(z[5], 10);
                VIN = new bl(z[6], 11);
                a = (new bl[] {
                    ADDRESSBOOK, EMAIL_ADDRESS, PRODUCT, URI, TEXT, GEO, TEL, SMS, CALENDAR, WIFI, 
                    ISBN, VIN
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 636
    //                   0 659
    //                   1 666
    //                   2 673
    //                   3 680;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_680;
_L3:
        byte byte1 = 102;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 14;
          goto _L9
_L5:
        byte1 = 92;
          goto _L9
_L6:
        byte1 = 67;
          goto _L9
        byte1 = 90;
          goto _L9
    }
}
