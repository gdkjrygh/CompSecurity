// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.preference.Preference;
import com.whatsapp.preference.WaPrivacyPreference;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            App, SettingsPrivacy, a_d

class ao3
    implements android.preference.Preference.OnPreferenceChangeListener
{

    private static final String z[];
    final SettingsPrivacy a;

    ao3(SettingsPrivacy settingsprivacy)
    {
        a = settingsprivacy;
        super();
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        int i;
        if (!App.i())
        {
            App.b(a, 0x7f0e009b, 0);
            return false;
        }
        WaPrivacyPreference waprivacypreference = (WaPrivacyPreference)preference;
        i = waprivacypreference.findIndexOfValue((String)obj);
        waprivacypreference.setSummary(waprivacypreference.getEntries()[i].toString());
        waprivacypreference.a(true);
        waprivacypreference.setEnabled(false);
        obj = preference.getKey();
        preference = null;
        if (!z[3].equals(obj)) goto _L2; else goto _L1
_L1:
        preference = z[1];
_L4:
        obj = SettingsPrivacy.a(i);
        SettingsPrivacy.d().put(preference, new a_d(preference, ((String) (obj))));
        App.aP();
        App.b(preference, ((String) (obj)));
        SettingsPrivacy.e().removeCallbacks(SettingsPrivacy.b());
        SettingsPrivacy.e().postDelayed(SettingsPrivacy.b(), 20000L);
        return true;
_L2:
        if (z[0].equals(obj))
        {
            preference = z[2];
        } else
        if (z[5].equals(obj))
        {
            preference = z[4];
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "+gUVI8lcPZ4sULM\004eTO\\4";
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
                obj = "7tOT";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "+gSFA7p";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "+gUVI8lcLI(acSM>{";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "(a]T](";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "+gUVI8lcS\\:aIS";
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
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 40;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 91;
          goto _L9
_L5:
        byte1 = 21;
          goto _L9
_L6:
        byte1 = 60;
          goto _L9
        byte1 = 32;
          goto _L9
    }
}
