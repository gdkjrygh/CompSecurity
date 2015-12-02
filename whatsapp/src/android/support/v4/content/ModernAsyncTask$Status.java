// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;


public final class  extends Enum
{

    private static final FINISHED $VALUES[];
    public static final FINISHED FINISHED;
    public static final FINISHED PENDING;
    public static final FINISHED RUNNING;
    private static final String z[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(android/support/v4/content/ModernAsyncTask$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "MGpefSE";
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
                obj = "[Kph|UGz";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "OWpofSE";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                PENDING = new <init>(z[0], 0);
                RUNNING = new <init>(z[2], 1);
                FINISHED = new <init>(z[1], 2);
                $VALUES = (new .VALUES[] {
                    PENDING, RUNNING, FINISHED
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 228
    //                   0 249
    //                   1 255
    //                   2 260
    //                   3 266;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_266;
_L3:
        byte byte0 = 47;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 29;
          goto _L9
_L5:
        byte0 = 2;
          goto _L9
_L6:
        byte0 = 62;
          goto _L9
        byte0 = 33;
          goto _L9
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
