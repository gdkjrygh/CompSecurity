// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Build;
import android.preference.ListPreference;
import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            SettingsNotifications

class a_7
    implements android.preference.Preference.OnPreferenceChangeListener
{

    private static final String z[];
    final SettingsNotifications a;

    a_7(SettingsNotifications settingsnotifications)
    {
        a = settingsnotifications;
        super();
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        if ((Build.MODEL.contains(z[2]) || Build.MODEL.contains(z[0])) && !obj.toString().equals(z[1]))
        {
            a.showDialog(7);
        }
        ListPreference listpreference = (ListPreference)preference;
        int i = listpreference.findIndexOfValue((String)obj);
        obj = listpreference.getEntries()[i].toString();
        preference.setTitle(a.getString(0x7f0e03bc, new Object[] {
            obj
        }));
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "F0<I<x+5";
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
                obj = "!i\026kj!";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "U<#D(t";
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
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 90;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 17;
          goto _L9
_L5:
        byte0 = 89;
          goto _L9
_L6:
        byte0 = 80;
          goto _L9
        byte0 = 45;
          goto _L9
    }
}
