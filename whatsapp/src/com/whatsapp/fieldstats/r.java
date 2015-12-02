// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class r extends Enum
{

    public static final r CHAT_DB_ERROR;
    public static final r DOWNLOAD_ERROR;
    public static final r NOT_ENOUGH_SPACE;
    public static final r NOT_SIGNED_IN;
    public static final r NO_BACKUP;
    public static final r SKIPPED;
    public static final r SUCCESS;
    public static final r TAR_ERROR;
    private static final r b[];
    private static final String z[];
    private final int a;

    private r(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static r valueOf(String s)
    {
        return (r)Enum.valueOf(com/whatsapp/fieldstats/r, s);
    }

    public static r[] values()
    {
        return (r[])b.clone();
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
        as = new String[8];
        obj = "F/w\032\035P ";
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
                obj = "[+j\025\036\\#p\017\tJ-p";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "[+a\b\fV/k\032";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "[+j\025\b[+k\r\005J7n\013\016P";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "V,\177\036\022Q&a\017\037G+l";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "Q+i\004\001Z%z\025\bG6q\030";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "F1}\t\bF7";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "A%l\025\bG6q\030";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                NOT_SIGNED_IN = new r(z[1], 0, 1);
                NO_BACKUP = new r(z[2], 1, 2);
                SKIPPED = new r(z[0], 2, 3);
                SUCCESS = new r(z[6], 3, 4);
                CHAT_DB_ERROR = new r(z[4], 4, 5);
                TAR_ERROR = new r(z[7], 5, 6);
                DOWNLOAD_ERROR = new r(z[5], 6, 7);
                NOT_ENOUGH_SPACE = new r(z[3], 7, 8);
                b = (new r[] {
                    NOT_SIGNED_IN, NO_BACKUP, SKIPPED, SUCCESS, CHAT_DB_ERROR, TAR_ERROR, DOWNLOAD_ERROR, NOT_ENOUGH_SPACE
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 460
    //                   0 483
    //                   1 490
    //                   2 497
    //                   3 504;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_504;
_L3:
        byte byte1 = 77;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 21;
          goto _L9
_L5:
        byte1 = 100;
          goto _L9
_L6:
        byte1 = 62;
          goto _L9
        byte1 = 74;
          goto _L9
    }
}
