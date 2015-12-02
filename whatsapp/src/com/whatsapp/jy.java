// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            ov

public final class jy extends Enum
{

    public static final jy ALLOW;
    public static final jy FORWARD;
    public static final jy NONE;
    public static final jy UPGRADE;
    private static final jy a[];
    private static final String z[];
    private final String b;

    private jy(String s, int i, String s1)
    {
        super(s, i);
        b = s1;
    }

    public static jy fromText(String s)
    {
        boolean flag = ov.e;
        jy ajy[] = values();
        int j = ajy.length;
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    jy jy1 = ajy[i];
                    if (jy1.getText().equals(s))
                    {
                        return jy1;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return getDefault();
            }
            i++;
        } while (true);
    }

    public static jy getDefault()
    {
        return ALLOW;
    }

    public static jy valueOf(String s)
    {
        return (jy)Enum.valueOf(com/whatsapp/jy, s);
    }

    public static jy[] values()
    {
        return (jy[])a.clone();
    }

    public String getText()
    {
        return b;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "I_\021{";
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
                obj = "a\177-IWut";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "F\\\023qa";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "r`8LWcu";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "A_\riwUT";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "i\1771[";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "f|3QA";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "R@\030lwCU";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                ALLOW = new jy(z[6], 0, z[2]);
                UPGRADE = new jy(z[3], 1, z[7]);
                FORWARD = new jy(z[1], 2, z[4]);
                NONE = new jy(z[5], 3, z[0]);
                a = (new jy[] {
                    ALLOW, UPGRADE, FORWARD, NONE
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 376
    //                   0 399
    //                   1 406
    //                   2 413
    //                   3 420;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_420;
_L3:
        byte byte1 = 22;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 39;
          goto _L9
_L5:
        byte1 = 48;
          goto _L9
_L6:
        byte1 = 127;
          goto _L9
        byte1 = 30;
          goto _L9
    }
}
