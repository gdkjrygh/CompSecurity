// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            DialogToastPreferenceActivity, a9m, af4, sg, 
//            ek, vd, ut, e4, 
//            ba

public class SettingsHelp extends DialogToastPreferenceActivity
{

    private static final String z[];

    public SettingsHelp()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(0x7f050009);
        findPreference(z[1]).setOnPreferenceClickListener(new a9m(this));
        findPreference(z[3]).setOnPreferenceClickListener(new af4(this));
        findPreference(z[2]).setOnPreferenceClickListener(new sg(this));
        findPreference(z[0]).setOnPreferenceClickListener(new ek(this));
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 122: // 'z'
            ProgressDialog progressdialog = new ProgressDialog(this);
            progressdialog.setMessage(getString(0x7f0e031a));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            return progressdialog;

        case 123: // '{'
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e03b6).setPositiveButton(0x7f0e04b5, new vd(this)).setNegativeButton(0x7f0e007b, new ut(this)).create();

        case 101: // 'e'
            e4 e4_1 = new e4(this);
            e4_1.setTitle(getString(0x7f0e0354));
            e4_1.setMessage(getString(0x7f0e0353));
            e4_1.setIndeterminate(true);
            e4_1.setCancelable(false);
            return e4_1;

        case 102: // 'f'
            return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f0e02aa).setMessage(getString(0x7f0e0325, new Object[] {
                getString(0x7f0e00c6)
            })).setNeutralButton(0x7f0e02ba, new ba(this)).create();
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\fI\025V2\fR$W ";
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
                obj = "\016D\024W'";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\034_\bV6\002y\bV2\033S\b";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\007C\027R";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 83;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 111;
          goto _L9
_L5:
        byte0 = 38;
          goto _L9
_L6:
        byte0 = 123;
          goto _L9
        byte0 = 34;
          goto _L9
    }
}
