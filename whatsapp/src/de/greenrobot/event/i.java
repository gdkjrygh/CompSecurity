// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;


public final class i extends Enum
{

    public static final i Async;
    public static final i BackgroundThread;
    public static final i MainThread;
    public static final i PostThread;
    public static boolean a;
    private static final i b[];
    private static final String z[];

    private i(String s, int j)
    {
        super(s, j);
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(de/greenrobot/event/i, s);
    }

    public static i[] values()
    {
        return (i[])b.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int j;
        as = new String[4];
        obj = "'\016XsQ";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "+\034Hsf\016\017D|V";
                j = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "6\022Rif\016\017D|V";
                j = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "$\034BvU\024\022TsV2\025SxS\002";
                j = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                z = as;
                PostThread = new i(z[2], 0);
                MainThread = new i(z[1], 1);
                BackgroundThread = new i(z[3], 2);
                Async = new i(z[0], 3);
                b = (new i[] {
                    PostThread, MainThread, BackgroundThread, Async
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 272
    //                   0 293
    //                   1 299
    //                   2 305
    //                   3 311;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_311;
_L3:
        byte byte0 = 50;
_L9:
        obj[k] = (char)(byte0 ^ c);
        k++;
          goto _L8
_L4:
        byte0 = 102;
          goto _L9
_L5:
        byte0 = 125;
          goto _L9
_L6:
        byte0 = 33;
          goto _L9
        byte0 = 29;
          goto _L9
    }
}
