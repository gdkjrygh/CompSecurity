// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.util.Locale;

// Referenced classes of package com.whatsapp:
//            App, SpamWarningActivity

class yh
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final int a;
    final SpamWarningActivity b;

    yh(SpamWarningActivity spamwarningactivity, int i)
    {
        b = spamwarningactivity;
        a = i;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            int i = App.am;
            view = Locale.getDefault();
            String s = view.getLanguage();
            String s1 = view.getCountry();
            if (s.equals(""))
            {
                view = "";
                if (i == 0)
                {
                    break label0;
                }
            }
            if (!s1.equals("") || i != 0)
            {
                view = (new StringBuilder()).append(s).append("_").append(s1).toString();
            } else
            {
                view = s;
            }
        }
        b.startActivity(new Intent(z[0], Uri.parse((new StringBuilder()).append(z[1]).append(view).append(z[2]).append(a).toString())));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "h8af6`2+}7}3k`wh5q}6gxS]\034^";
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
                obj = "a\"qd*3y*c.~xr|8}%dd)'5jyvo7t;";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "&1`z<{7i;";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 194;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_194;
_L3:
        byte byte0 = 89;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 9;
          goto _L9
_L5:
        byte0 = 86;
          goto _L9
_L6:
        byte0 = 5;
          goto _L9
        byte0 = 20;
          goto _L9
    }
}
