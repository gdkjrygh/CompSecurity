// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Bundle;
import android.preference.Preference;
import com.whatsapp.fieldstats.o;

// Referenced classes of package com.whatsapp:
//            DialogToastPreferenceActivity, ft, i1, b7, 
//            _o, t5, a1_

public class SettingsAccount extends DialogToastPreferenceActivity
{

    private static final String z[];

    public SettingsAccount()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ft.a(o.ACCOUNT);
        addPreferencesFromResource(0x7f050005);
        findPreference(z[3]).setOnPreferenceClickListener(new i1(this));
        findPreference(z[4]).setOnPreferenceClickListener(new b7(this));
        findPreference(z[2]).setOnPreferenceClickListener(new _o(this));
        findPreference(z[1]).setOnPreferenceClickListener(new t5(this));
        findPreference(z[0]).setOnPreferenceClickListener(new a1_(this));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "G!~?%T*";
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
                obj = "S6{,0R\fv*'X&y=";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "T;v'#R\fy<)U6e";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "V0t&1Y'H *Q<";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "Y6c>+E8H<7V4r";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 68;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 55;
          goto _L9
_L5:
        byte1 = 83;
          goto _L9
_L6:
        byte1 = 23;
          goto _L9
        byte1 = 73;
          goto _L9
    }
}
