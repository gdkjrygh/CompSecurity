// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            DialogToastPreferenceActivity, ab5, aoj, o6

public class SettingsContacts extends DialogToastPreferenceActivity
{

    private static final String z[];
    private CheckBoxPreference h;

    public SettingsContacts()
    {
    }

    static CheckBoxPreference a(SettingsContacts settingscontacts)
    {
        return settingscontacts.h;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(0x7f050008);
        findPreference(z[1]).setOnPreferenceClickListener(new ab5(this));
        findPreference(z[2]).setOnPreferenceClickListener(new aoj(this));
        h = (CheckBoxPreference)findPreference(z[0]);
        h.setOnPreferenceClickListener(new o6(this));
    }

    protected Dialog onCreateDialog(int i)
    {
        ProgressDialog progressdialog;
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 16: // '\020'
            progressdialog = new ProgressDialog(this);
            break;
        }
        progressdialog.setMessage(getString(0x7f0e0353));
        progressdialog.setIndeterminate(true);
        progressdialog.setCancelable(false);
        return progressdialog;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "`8@<Cr<C\024\177|>[*\177g#";
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
                obj = "g5C'Cr\017I9uv>K";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "c1V\024z|\"p*Cu\"F.rw";
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
        byte byte0 = 28;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 19;
          goto _L9
_L5:
        byte0 = 80;
          goto _L9
_L6:
        byte0 = 47;
          goto _L9
        byte0 = 75;
          goto _L9
    }
}
