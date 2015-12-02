// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.os.Build;
import com.whatsapp.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class afm
{

    private static final Pattern a;
    private static String b;
    private static final String z[];

    public static String a()
    {
        return b;
    }

    static void a(Context context)
    {
        String s;
        String s1;
        String s3;
        String s4;
        String s5;
        s3 = z[0].replace(' ', '_');
        s4 = z[5].replace(' ', '_');
        s5 = context.getString(0x7f0e0047).replace(' ', '_');
        context = z[8];
        s = z[6];
        s1 = z[1];
        String s2 = a.matcher(android.os.Build.VERSION.RELEASE).replaceAll("_");
        context = s2;
_L1:
        s2 = a.matcher(Build.MANUFACTURER).replaceAll("_");
        s = s2;
_L2:
        s2 = a.matcher(Build.MODEL).replaceAll("_");
        s1 = s2;
_L3:
        b = (new StringBuilder()).append(s5).append("/").append(s3).append(" ").append(s4).append("/").append(context).append(z[3]).append(s).append("-").append(s1).toString();
        return;
        NoSuchFieldError nosuchfielderror;
        nosuchfielderror;
        Log.a(z[7], nosuchfielderror);
          goto _L1
        nosuchfielderror;
        Log.a(z[2], nosuchfielderror);
          goto _L2
        nosuchfielderror;
        Log.a(z[4], nosuchfielderror);
          goto _L3
    }

    static 
    {
        char ac[];
        String as[];
        byte byte0;
        int i;
        as = new String[9];
        ac = ">~{\n\b9c{";
        byte0 = -1;
        i = 0;
_L20:
        String as1[];
        int k;
        int l;
        as1 = as;
        ac = ac.toCharArray();
        l = ac.length;
        k = 0;
_L18:
        if (l > k) goto _L2; else goto _L1
_L1:
        ac = (new String(ac)).intern();
        byte0;
        JVM INSTR tableswitch 0 7: default 96
    //                   0 112
    //                   1 128
    //                   2 144
    //                   3 160
    //                   4 176
    //                   5 193
    //                   6 211
    //                   7 229;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        as1[i] = ac;
        ac = "y>!UI{>";
        i = 1;
        byte0 = 0;
        break; /* Loop/switch isn't completed */
_L4:
        as1[i] = ac;
        ac = "m :\024S\17758\026Gk5$O\ta1$N@m3>NTi\"";
        i = 2;
        byte0 = 1;
        break; /* Loop/switch isn't completed */
_L5:
        as1[i] = ac;
        ac = ",\024/MOo5e";
        i = 3;
        byte0 = 2;
        break; /* Loop/switch isn't completed */
_L6:
        as1[i] = ac;
        ac = "m :\024S\17758\026Gk5$O\ta?.^J";
        i = 4;
        byte0 = 3;
        break; /* Loop/switch isn't completed */
_L7:
        as1[i] = ac;
        i = 5;
        ac = "M>.IIe4";
        byte0 = 4;
        break; /* Loop/switch isn't completed */
_L8:
        as1[i] = ac;
        i = 6;
        ac = "y>!UI{>";
        byte0 = 5;
        break; /* Loop/switch isn't completed */
_L9:
        as1[i] = ac;
        i = 7;
        ac = "m :\024S\17758\026Gk5$O\t~5&^G\1775";
        byte0 = 6;
        break; /* Loop/switch isn't completed */
_L10:
        as1[i] = ac;
        i = 8;
        ac = "y>!UI{>";
        byte0 = 7;
        break; /* Loop/switch isn't completed */
_L11:
        int j;
        as1[i] = ac;
        z = as;
        ac = "W\016fg\bP'\026\026z$\fcf".toCharArray();
        j = ac.length;
        i = 0;
          goto _L12
_L2:
        c = ac[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 316
    //                   0 339
    //                   1 346
    //                   2 353
    //                   3 360;
           goto _L13 _L14 _L15 _L16 _L17
_L17:
        break MISSING_BLOCK_LABEL_360;
_L13:
        j = 38;
_L19:
        ac[k] = (char)(j ^ c);
        k++;
          goto _L18
_L14:
        j = 12;
          goto _L19
_L15:
        j = 80;
          goto _L19
_L16:
        j = 74;
          goto _L19
        j = 59;
          goto _L19
        if (true) goto _L20; else goto _L2
_L12:
        char c;
        if (j <= i)
        {
            a = Pattern.compile((new String(ac)).intern());
            return;
        }
        k = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 408
    //                   0 429
    //                   1 435
    //                   2 441
    //                   3 447;
           goto _L21 _L22 _L23 _L24 _L25
_L25:
        break MISSING_BLOCK_LABEL_447;
_L22:
        break; /* Loop/switch isn't completed */
_L21:
        byte0 = 38;
_L27:
        ac[i] = (char)(byte0 ^ k);
        i++;
        if (true) goto _L12; else goto _L26
_L26:
        byte0 = 12;
          goto _L27
_L23:
        byte0 = 80;
          goto _L27
_L24:
        byte0 = 74;
          goto _L27
        byte0 = 59;
          goto _L27
    }
}
