// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            App, SettingsChat, ContactPicker

class qp
    implements android.preference.Preference.OnPreferenceClickListener
{

    private static final String z;
    final SettingsChat a;

    qp(SettingsChat settingschat)
    {
        a = settingschat;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
label0:
        {
            if (App.ae || App.aC)
            {
                preference = a;
                int i;
                if (App.m())
                {
                    i = 0x7f0e0287;
                } else
                {
                    i = 0x7f0e0288;
                }
                preference.a(i);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            preference = new Intent(a, com/whatsapp/ContactPicker);
            preference.putExtra(z, true);
            a.startActivityForResult(preference, 104);
        }
        return true;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "[\001\023U\027a\004\033O\017Q\036\013".toCharArray();
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
        byte byte0 = 123;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 62;
          goto _L8
_L3:
        byte0 = 108;
          goto _L8
_L4:
        byte0 = 114;
          goto _L8
        byte0 = 60;
          goto _L8
    }
}
