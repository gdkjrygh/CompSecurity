// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class b extends Enum
{

    public static final b APP_RESUMED;
    public static final b CORRUPTED;
    public static final b LOW_BATTERY;
    public static final b NOT_CONNECTED;
    public static final b NOT_ENOUGH_SPACE;
    public static final b NOT_REGISTERED;
    public static final b NOT_SIGNED_IN;
    public static final b NO_CHAT_STORE;
    public static final b OUT_OF_TIME;
    public static final b TOO_LARGE;
    public static final b TOO_OLD;
    public static final b UPLOAD;
    private static final b a[];
    private static final String z[];
    private final int b;

    private b(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/whatsapp/fieldstats/b, s);
    }

    public static b[] values()
    {
        return (b[])a.clone();
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
        int i;
        as = new String[12];
        obj = "!\035AkC.\006A{_ \000[";
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
                obj = "#\035IwI.\006JmY6";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ",\035Lz^?\006[l";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ".\002NwY*\001KeN+";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "!\035JwH \034PmH;\027Z";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "!\035JwN!\035KoC0\001NiH*";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = ";\035QwG.\000Ym";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "!\035JwX&\025PmO0\033P";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "!\035JwY*\025W{_*\000[l";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = ":\002RgJ+";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = " \007JwD)\rJaF*";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = ";\035QwD#\026";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                NOT_REGISTERED = new b(z[8], 0, 1);
                NOT_SIGNED_IN = new b(z[7], 1, 2);
                NO_CHAT_STORE = new b(z[0], 2, 3);
                CORRUPTED = new b(z[2], 3, 4);
                NOT_ENOUGH_SPACE = new b(z[5], 4, 5);
                TOO_LARGE = new b(z[6], 5, 6);
                UPLOAD = new b(z[9], 6, 7);
                TOO_OLD = new b(z[11], 7, 8);
                LOW_BATTERY = new b(z[1], 8, 9);
                OUT_OF_TIME = new b(z[10], 9, 10);
                APP_RESUMED = new b(z[3], 10, 11);
                NOT_CONNECTED = new b(z[4], 11, 12);
                a = (new b[] {
                    NOT_REGISTERED, NOT_SIGNED_IN, NO_CHAT_STORE, CORRUPTED, NOT_ENOUGH_SPACE, TOO_LARGE, UPLOAD, TOO_OLD, LOW_BATTERY, OUT_OF_TIME, 
                    APP_RESUMED, NOT_CONNECTED
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 656
    //                   0 679
    //                   1 686
    //                   2 693
    //                   3 700;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_700;
_L3:
        byte byte1 = 11;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 111;
          goto _L9
_L5:
        byte1 = 82;
          goto _L9
_L6:
        byte1 = 30;
          goto _L9
        byte1 = 40;
          goto _L9
    }
}
