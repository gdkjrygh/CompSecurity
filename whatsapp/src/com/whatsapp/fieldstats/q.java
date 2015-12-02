// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class q extends Enum
{

    public static final q AUDIO;
    public static final q CONTACT;
    public static final q LOCATION;
    public static final q NONE;
    public static final q PHOTO;
    public static final q PTT;
    public static final q VIDEO;
    private static final q b[];
    private static final String z[];
    private final int a;

    private q(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static q valueOf(String s)
    {
        return (q)Enum.valueOf(com/whatsapp/fieldstats/q, s);
    }

    public static q[] values()
    {
        return (q[])b.clone();
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
        as = new String[7];
        obj = "'\177\033zy";
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
                obj = "!~\020ky";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "=y\034~b8y\021";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "?y\021z";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "2y\021kw2b";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "0c\033vy";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "!b\013";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                NONE = new q(z[3], 0, 1);
                PHOTO = new q(z[1], 1, 2);
                VIDEO = new q(z[0], 2, 3);
                AUDIO = new q(z[5], 3, 4);
                PTT = new q(z[6], 4, 5);
                LOCATION = new q(z[2], 5, 6);
                CONTACT = new q(z[4], 6, 7);
                b = (new q[] {
                    NONE, PHOTO, VIDEO, AUDIO, PTT, LOCATION, CONTACT
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 408
    //                   0 431
    //                   1 438
    //                   2 445
    //                   3 452;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_452;
_L3:
        byte byte1 = 54;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 113;
          goto _L9
_L5:
        byte1 = 54;
          goto _L9
_L6:
        byte1 = 95;
          goto _L9
        byte1 = 63;
          goto _L9
    }
}
