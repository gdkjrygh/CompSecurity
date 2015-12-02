// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class qa extends Enum
{

    public static final qa CANCEL;
    public static final qa FAILED_BAD_MEDIA;
    public static final qa FAILED_GENERIC;
    public static final qa FAILED_INSUFFICIENT_SPACE;
    public static final qa FAILED_IO;
    public static final qa FAILED_NO_PERMISSIONS;
    public static final qa FAILED_OOM;
    public static final qa SUCCESS;
    private static final qa a[];
    private static final String z[];

    private qa(String s, int i)
    {
        super(s, i);
    }

    public static qa valueOf(String s)
    {
        return (qa)Enum.valueOf(com/whatsapp/qa, s);
    }

    public static qa[] values()
    {
        return (qa[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "[\007E\b6Y\031N\0057B\013I\000:\\";
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
                obj = "[\007E\b6Y\031E\013";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "[\007E\b6Y\031E\n H\000J\r0T\003B\020,N\026M\0076";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "[\007E\b6Y\031C\013>";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "[\007E\b6Y\031B\013,M\003^\t:N\025E\013=N";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "^\007B\0076Q";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "[\007E\b6Y\031K\001=X\024E\007";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "N\023O\0076N\025";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                SUCCESS = new qa(z[7], 0);
                FAILED_GENERIC = new qa(z[6], 1);
                FAILED_INSUFFICIENT_SPACE = new qa(z[2], 2);
                FAILED_IO = new qa(z[1], 3);
                FAILED_OOM = new qa(z[3], 4);
                FAILED_BAD_MEDIA = new qa(z[0], 5);
                FAILED_NO_PERMISSIONS = new qa(z[4], 6);
                CANCEL = new qa(z[5], 7);
                a = (new qa[] {
                    SUCCESS, FAILED_GENERIC, FAILED_INSUFFICIENT_SPACE, FAILED_IO, FAILED_OOM, FAILED_BAD_MEDIA, FAILED_NO_PERMISSIONS, CANCEL
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
        byte byte1 = 115;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 29;
          goto _L9
_L5:
        byte1 = 70;
          goto _L9
_L6:
        byte1 = 12;
          goto _L9
        byte1 = 68;
          goto _L9
    }
}
