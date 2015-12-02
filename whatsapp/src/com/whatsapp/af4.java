// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import com.whatsapp.fieldstats.o;

// Referenced classes of package com.whatsapp:
//            ft, SettingsHelp

class af4
    implements android.preference.Preference.OnPreferenceClickListener
{

    private static final String z[];
    final SettingsHelp a;

    af4(SettingsHelp settingshelp)
    {
        a = settingshelp;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        ft.a(o.FAQ);
        preference = z[1];
        preference = new Intent(z[0], Uri.parse(preference));
        a.startActivity(preference);
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "V\026\000g\027^\034J|\026C\035\naVV\033\020|\027YV2\\=`";
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
                i = 1;
                obj = "_\f\020e\013\rWKb\017@V\023}\031C\013\005e\b\031\033\013xWQ\031\025:";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 120;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 55;
          goto _L9
_L5:
        byte0 = 120;
          goto _L9
_L6:
        byte0 = 100;
          goto _L9
        byte0 = 21;
          goto _L9
    }
}
