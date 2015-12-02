// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.regex.Pattern;

// Referenced classes of package com.whatsapp:
//            App

public class alw
{

    private static final String z[];

    public static String a()
    {
        String s;
label0:
        {
            String s1 = c().getLanguage();
            if (s1 != null)
            {
                s = s1;
                if (Pattern.matches(z[4], s1))
                {
                    break label0;
                }
            }
            Log.i((new StringBuilder()).append(z[5]).append(s1).toString());
            s = z[3];
        }
        return s;
    }

    public static String b()
    {
        String s;
label0:
        {
            String s1 = c().getCountry();
            if (s1 != null)
            {
                s = s1;
                if (Pattern.matches(z[2], s1))
                {
                    break label0;
                }
            }
            Log.i((new StringBuilder()).append(z[0]).append(s1).toString());
            s = z[1];
        }
        return s;
    }

    private static Locale c()
    {
        Locale locale1 = App.au.getResources().getConfiguration().locale;
        Locale locale = locale1;
        if (locale1 == null)
        {
            locale = Locale.getDefault();
        }
        return locale;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "tf7zE{m0~AgqjaFsv `Wal!v\fkm3rOkghpLwm1aZ\"";
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
                obj = "XY";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "YBhI~y18";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "xy";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "Ybhi~y18";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "tf7zE{m0~AgqjaFsv `Wal!v\fkm3rOkgh\177Bld0rDg#";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 245
    //                   2 251
    //                   3 258;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_258;
_L3:
        byte byte1 = 35;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 2;
          goto _L9
_L5:
        byte1 = 3;
          goto _L9
_L6:
        byte1 = 69;
          goto _L9
        byte1 = 19;
          goto _L9
    }
}
