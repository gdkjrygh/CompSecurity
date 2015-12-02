// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class i extends Enum
{

    public static final i AUTH_FAILED;
    public static final i BACKUP_SERVER_UNREACHABLE;
    public static final i DATA_CONNECTION_REQUIRED_BUT_MISSING;
    public static final i NO_SPACE_AVAILABLE;
    public static final i OK;
    public static final i UNKNOWN_ERROR;
    public static final i WIFI_REQUIRED_BUT_MISSING;
    private static final i a[];
    private static final String z[];
    private final int b;

    private i(String s, int j, int k)
    {
        super(s, j);
        b = k;
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/whatsapp/fieldstats/i, s);
    }

    public static i[] values()
    {
        return (i[])a.clone();
    }

    public int getCode()
    {
        return b;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[7];
        obj = "=\007w./:\tm!5:\022j >&\024f>%0\024f+/;\023w0=0\025p&>>";
        byte0 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = ";\007`$%)\031p*\"/\003q0%7\024f.31\007a#5";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "7\t|< 8\005f01/\007j#1;\nf";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "8\023w'/?\007j#5=";
                j = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                obj = ",\bh!?.\b|*\"+\tq";
                j = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "6\r";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = ".\017e&/+\003r:9+\003g02,\022|\"9*\025j!7";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[j] = ((String) (obj));
                z = as;
                OK = new i(z[5], 0, 1);
                UNKNOWN_ERROR = new i(z[4], 1, 2);
                NO_SPACE_AVAILABLE = new i(z[2], 2, 3);
                DATA_CONNECTION_REQUIRED_BUT_MISSING = new i(z[0], 3, 7);
                WIFI_REQUIRED_BUT_MISSING = new i(z[6], 4, 4);
                BACKUP_SERVER_UNREACHABLE = new i(z[1], 5, 5);
                AUTH_FAILED = new i(z[3], 6, 6);
                a = (new i[] {
                    OK, UNKNOWN_ERROR, NO_SPACE_AVAILABLE, DATA_CONNECTION_REQUIRED_BUT_MISSING, WIFI_REQUIRED_BUT_MISSING, BACKUP_SERVER_UNREACHABLE, AUTH_FAILED
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 408
    //                   0 431
    //                   1 438
    //                   2 445
    //                   3 452;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_452;
_L3:
        byte byte1 = 112;
_L9:
        obj[k] = (char)(byte1 ^ c);
        k++;
          goto _L8
_L4:
        byte1 = 121;
          goto _L9
_L5:
        byte1 = 70;
          goto _L9
_L6:
        byte1 = 35;
          goto _L9
        byte1 = 111;
          goto _L9
    }
}
