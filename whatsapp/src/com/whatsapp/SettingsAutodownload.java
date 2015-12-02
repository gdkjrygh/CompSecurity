// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.preference.WaMultiSelectListPreference;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            DialogToastPreferenceActivity, App, oz, le, 
//            a89, zr

public class SettingsAutodownload extends DialogToastPreferenceActivity
{

    private static final String z[];

    public SettingsAutodownload()
    {
    }

    private static int a(CharSequence acharsequence[])
    {
        int i = 0;
        int l = App.am;
        int i1 = acharsequence.length;
        int j = 0;
        int k;
        do
        {
            k = i;
            if (j >= i1)
            {
                break;
            }
            k = i | 1 << Integer.parseInt(acharsequence[j].toString());
            j++;
            i = k;
        } while (l == 0);
        return k;
    }

    private static CharSequence[] a(int i)
    {
        int k = App.am;
        ArrayList arraylist = new ArrayList();
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        do
        {
            if (j == 0)
            {
                break;
            }
            if ((j & 1) != 0)
            {
                arraylist.add(Integer.toString(i));
            }
            j >>= 1;
            i++;
        } while (k == 0);
        return (CharSequence[])arraylist.toArray(new CharSequence[0]);
    }

    static int b(CharSequence acharsequence[])
    {
        return a(acharsequence);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(0x7f050006);
        bundle = (WaMultiSelectListPreference)findPreference(z[0]);
        bundle.c(getString(0x7f0e0391));
        bundle.a(getString(0x7f0e038e));
        bundle.a(a(App.b(2)));
        bundle.setOnPreferenceChangeListener(new oz(this));
        bundle = (WaMultiSelectListPreference)findPreference(z[1]);
        bundle.c(getString(0x7f0e0391));
        bundle.a(getString(0x7f0e038e));
        bundle.a(a(App.b(1)));
        bundle.setOnPreferenceChangeListener(new le(this));
        bundle = (WaMultiSelectListPreference)findPreference(z[2]);
        bundle.c(getString(0x7f0e0391));
        bundle.a(getString(0x7f0e038e));
        bundle.a(a(App.b(3)));
        bundle.setOnPreferenceChangeListener(new a89(this));
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 1: // '\001'
            return (new android.app.AlertDialog.Builder(this)).setMessage(getString(0x7f0e0393)).setNeutralButton(0x7f0e02ba, new zr(this)).create();
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "jD\bA\020dF\022B\033jU#M\021g]\tB\025y";
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
                obj = "jD\bA\020dF\022B\033jU#Y\035mX";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "jD\bA\020dF\022B\033jU#\\\033j\\\025@\023";
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
        byte byte0 = 116;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 11;
          goto _L9
_L5:
        byte0 = 49;
          goto _L9
_L6:
        byte0 = 124;
          goto _L9
        byte0 = 46;
          goto _L9
    }
}
