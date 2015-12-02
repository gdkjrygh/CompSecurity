// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class b1 extends Enum
{

    public static final b1 NO_BACKUP_FOUND;
    public static final b1 ONLY_LOCAL_BACKUP_FOUND;
    public static final b1 ONLY_REMOTE_BACKUP_FOUND;
    public static final b1 REMOTE_AND_LOCAL_BACKUP_FOUND;
    private static final b1 b[];
    private static final String z[];
    private final int a;

    private b1(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static b1 valueOf(String s)
    {
        return (b1)Enum.valueOf(com/whatsapp/fieldstats/b1, s);
    }

    public static b1[] values()
    {
        return (b1[])b.clone();
    }

    public int getCode()
    {
        return a;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "-=p\037\021.<\177\007\002=1}\005\0057#c\000\0017=x";
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
                obj = "-=p\037\02106q\t\032',~\007\r)&l\031\b-&r\002";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "06q\t\032',}\b\n=?s\005\017.,~\007\r)&l\031\b-&r\002";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ",<c\004\017!8i\026\021$<i\b\n";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                REMOTE_AND_LOCAL_BACKUP_FOUND = new b1(z[2], 0, 1);
                ONLY_REMOTE_BACKUP_FOUND = new b1(z[1], 1, 2);
                ONLY_LOCAL_BACKUP_FOUND = new b1(z[0], 2, 3);
                NO_BACKUP_FOUND = new b1(z[3], 3, 4);
                b = (new b1[] {
                    REMOTE_AND_LOCAL_BACKUP_FOUND, ONLY_REMOTE_BACKUP_FOUND, ONLY_LOCAL_BACKUP_FOUND, NO_BACKUP_FOUND
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
        byte byte0 = 78;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 98;
          goto _L9
_L5:
        byte0 = 115;
          goto _L9
_L6:
        byte0 = 60;
          goto _L9
        byte0 = 70;
          goto _L9
    }
}
