// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;

// Referenced classes of package com.whatsapp:
//            DialogToastPreferenceActivity, a_7, jx, ec, 
//            App, a_s

public class SettingsNotifications extends DialogToastPreferenceActivity
{

    private static final String z[];
    private android.preference.Preference.OnPreferenceChangeListener h;
    private android.preference.Preference.OnPreferenceChangeListener i;
    private android.preference.Preference.OnPreferenceChangeListener j;

    public SettingsNotifications()
    {
        j = new a_7(this);
        i = new jx(this);
        h = new ec(this);
    }

    private void a(PreferenceScreen preferencescreen, String s)
    {
        if (preferencescreen != null && s != null)
        {
            if ((s = findPreference(s)) != null)
            {
                preferencescreen.removePreference(s);
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(0x7f05000b);
        Object obj = (ListPreference)findPreference(z[5]);
        ((ListPreference) (obj)).setTitle(getString(0x7f0e03bc, new Object[] {
            ((ListPreference) (obj)).getEntry()
        }));
        ((ListPreference) (obj)).setOnPreferenceChangeListener(j);
        bundle = (ListPreference)findPreference(z[6]);
        bundle.setTitle(getString(0x7f0e03bc, new Object[] {
            bundle.getEntry()
        }));
        bundle.setOnPreferenceChangeListener(j);
        ListPreference listpreference = (ListPreference)findPreference(z[0]);
        listpreference.setTitle(getString(0x7f0e03c2, new Object[] {
            listpreference.getEntry()
        }));
        listpreference.setOnPreferenceChangeListener(i);
        listpreference = (ListPreference)findPreference(z[7]);
        listpreference.setTitle(getString(0x7f0e03c2, new Object[] {
            listpreference.getEntry()
        }));
        listpreference.setOnPreferenceChangeListener(i);
        listpreference = (ListPreference)findPreference(z[9]);
        listpreference.setTitle(getString(0x7f0e03c2, new Object[] {
            listpreference.getEntry()
        }));
        listpreference.setOnPreferenceChangeListener(i);
        listpreference = (ListPreference)findPreference(z[3]);
        listpreference.setSummary(listpreference.getEntry());
        listpreference.setOnPreferenceChangeListener(h);
        listpreference = (ListPreference)findPreference(z[1]);
        listpreference.setSummary(listpreference.getEntry());
        listpreference.setOnPreferenceChangeListener(h);
        if (Build.MANUFACTURER.replace(' ', '_').equalsIgnoreCase(z[8]) && getPreferenceScreen() != null)
        {
            PreferenceCategory preferencecategory = (PreferenceCategory)findPreference(z[4]);
            if (preferencecategory != null)
            {
                preferencecategory.removePreference(((android.preference.Preference) (obj)));
            }
            obj = (PreferenceCategory)findPreference(z[2]);
            if (obj != null)
            {
                ((PreferenceCategory) (obj)).removePreference(bundle);
            }
        }
        if (!App.aq())
        {
            a(getPreferenceScreen(), z[10]);
        }
    }

    protected Dialog onCreateDialog(int k)
    {
        switch (k)
        {
        default:
            return super.onCreateDialog(k);

        case 7: // '\007'
            return (new android.app.AlertDialog.Builder(this)).setMessage(getString(0x7f0e0218)).setNeutralButton(0x7f0e02ba, new a_s(this)).create();
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int k;
        as = new String[11];
        obj = "~;\021{ti\013\023{pb5\021wM|1\013ufx";
        byte0 = -1;
        k = 0;
_L2:
        String as1[];
        int l;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L8:
label0:
        {
            if (i1 > l)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[k] = ((String) (obj));
                obj = "w&\ngbO:\nf{v-:b}`!\025M\177\1770\0";
                k = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[k] = ((String) (obj));
                obj = "w&\ngbO:\nf{v=\006sfy;\013";
                k = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[k] = ((String) (obj));
                obj = "~;\021{ti\013\025}be$:\177}t1";
                k = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[k] = ((String) (obj));
                obj = "~;\021{ty7\004f{\177:";
                k = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[k] = ((String) (obj));
                k = 5;
                obj = "~;\021{ti\013\t{ux :q}|;\027";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[k] = ((String) (obj));
                k = 6;
                obj = "w&\ngbO:\nf{v-:~{w<\021Mq\1778\n`";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[k] = ((String) (obj));
                k = 7;
                obj = "w&\ngbO:\nf{v-:d{r&\004fwO8\000|ud<";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[k] = ((String) (obj));
                k = 8;
                obj = "h,\035jjh,";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[k] = ((String) (obj));
                k = 9;
                obj = "s5\t~Mf=\007`sd1:~w~3\021z";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[k] = ((String) (obj));
                k = 10;
                obj = "s5\t~Mc1\021f{~3\026";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[k] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 324
    //                   0 347
    //                   1 354
    //                   2 361
    //                   3 368;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_368;
_L3:
        byte byte1 = 18;
_L9:
        obj[l] = (char)(byte1 ^ c);
        l++;
          goto _L8
_L4:
        byte1 = 16;
          goto _L9
_L5:
        byte1 = 84;
          goto _L9
_L6:
        byte1 = 101;
          goto _L9
        byte1 = 18;
          goto _L9
    }
}
