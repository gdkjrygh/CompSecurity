// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;

import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//            ICUCompat

public class TextUtilsCompat
{

    private static String ARAB_SCRIPT_SUBTAG;
    private static String HEBR_SCRIPT_SUBTAG;
    public static final Locale ROOT;

    private static int getLayoutDirectionFromFirstChar(Locale locale)
    {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0)))
        {
        default:
            return 0;

        case 1: // '\001'
        case 2: // '\002'
            return 1;
        }
    }

    public static int getLayoutDirectionFromLocale(Locale locale)
    {
        if (locale != null && !locale.equals(ROOT))
        {
            String s = ICUCompat.getScript(ICUCompat.addLikelySubtags(locale.toString()));
            if (s == null)
            {
                return getLayoutDirectionFromFirstChar(locale);
            }
            if (s.equalsIgnoreCase(ARAB_SCRIPT_SUBTAG) || s.equalsIgnoreCase(HEBR_SCRIPT_SUBTAG))
            {
                return 1;
            }
        }
        return 0;
    }

    static 
    {
        Object obj;
        byte byte1;
        ROOT = new Locale("", "");
        obj = "\006(;R";
        byte1 = -1;
_L10:
        int i;
        int j;
        obj = ((String) (obj)).toCharArray();
        j = obj.length;
        i = 0;
_L7:
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte0;
            char c;
            switch (byte1)
            {
            default:
                ARAB_SCRIPT_SUBTAG = ((String) (obj));
                obj = "\017?8B";
                byte1 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                HEBR_SCRIPT_SUBTAG = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 120
    //                   0 137
    //                   1 143
    //                   2 149
    //                   3 155;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_155;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte0 = 1;
_L8:
        obj[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 71;
          goto _L8
_L3:
        byte0 = 90;
          goto _L8
_L4:
        byte0 = 90;
          goto _L8
        byte0 = 48;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
    }
}
