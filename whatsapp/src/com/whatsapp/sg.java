// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.preference.Preference;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, SettingsHelp, yy, asw

class sg
    implements android.preference.Preference.OnPreferenceClickListener
{

    private static final String z;
    final SettingsHelp a;

    sg(SettingsHelp settingshelp)
    {
        a = settingshelp;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
label0:
        {
            if (!App.i())
            {
                Log.i(z);
                a.f(a.getString(0x7f0e0317, new Object[] {
                    a.getString(0x7f0e00c6)
                }));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            asw.a(new yy(a, a, true, true, ""), new String[0]);
        }
        return true;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "%\017\\s>8\r[(4>\017Kl$/\031\\b:%\036Is\"%EFhz5\005Fi25\036Aq>\"\023".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 87;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 86;
          goto _L8
_L3:
        byte0 = 106;
          goto _L8
_L4:
        byte0 = 40;
          goto _L8
        byte0 = 7;
          goto _L8
    }
}
