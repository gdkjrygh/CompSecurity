// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class ws extends Enum
{

    public static final ws CANCEL;
    public static final ws FAILED_CANNOT_RESUME;
    public static final ws FAILED_GENERIC;
    public static final ws FAILED_HASH_MISMATCH;
    public static final ws FAILED_INSUFFICIENT_SPACE;
    public static final ws FAILED_INVALID_URL;
    public static final ws FAILED_OUTPUT_STREAM;
    public static final ws FAILED_TOO_OLD;
    public static final ws SUCCESS;
    private static final ws a[];
    private static final String z[];

    private ws(String s, int i)
    {
        super(s, i);
    }

    public static ws valueOf(String s)
    {
        return (ws)Enum.valueOf(com/whatsapp/ws, s);
    }

    public static ws[] values()
    {
        return (ws[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[9];
        obj = "$Pr\025s$V";
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
                obj = "1Dx\032s3Zr\027x9Je\td2Vd\033s";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "1Dx\032s3Zv\023x2Wx\025";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "1Dx\032s3Z~\003b'Pe\te#Wt\027{";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "4D\177\025s;";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                obj = "1Dx\032s3Zx\030`6Ix\022i\"W}";
                byte0 = 4;
                i = 5;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "1Dx\032s3Ze\031y(J}\022";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "1Dx\032s3Zx\030e\"Cw\037u>@\177\002i$Up\025s";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "1Dx\032s3Zy\027e?Z|\037e:De\025~";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                z = as;
                FAILED_GENERIC = new ws(z[2], 0);
                SUCCESS = new ws(z[0], 1);
                FAILED_INSUFFICIENT_SPACE = new ws(z[7], 2);
                FAILED_TOO_OLD = new ws(z[6], 3);
                FAILED_CANNOT_RESUME = new ws(z[1], 4);
                FAILED_HASH_MISMATCH = new ws(z[8], 5);
                FAILED_INVALID_URL = new ws(z[5], 6);
                FAILED_OUTPUT_STREAM = new ws(z[3], 7);
                CANCEL = new ws(z[4], 8);
                a = (new ws[] {
                    FAILED_GENERIC, SUCCESS, FAILED_INSUFFICIENT_SPACE, FAILED_TOO_OLD, FAILED_CANNOT_RESUME, FAILED_HASH_MISMATCH, FAILED_INVALID_URL, FAILED_OUTPUT_STREAM, CANCEL
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 496
    //                   0 519
    //                   1 526
    //                   2 532
    //                   3 539;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_539;
_L3:
        byte byte1 = 54;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 119;
          goto _L9
_L5:
        byte1 = 5;
          goto _L9
_L6:
        byte1 = 49;
          goto _L9
        byte1 = 86;
          goto _L9
    }
}
