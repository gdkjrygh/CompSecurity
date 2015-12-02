// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.preference.Preference;
import com.whatsapp.fieldstats.o;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            ft, App, SettingsHelp, ChangeNumber, 
//            yy, asw

class ek
    implements android.preference.Preference.OnPreferenceClickListener
{

    private static final String z[];
    final SettingsHelp a;

    ek(SettingsHelp settingshelp)
    {
        a = settingshelp;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
label0:
        {
            ft.a(o.CONTACT_US);
            if (!App.i())
            {
                Log.i(z[2]);
                if (a.isFinishing())
                {
                    break label0;
                }
                a.showDialog(102);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            preference = ChangeNumber.e(a);
            if (preference == null)
            {
                preference = z[1];
            } else
            {
                preference = (new StringBuilder()).append(z[0]).append(preference).toString();
            }
            asw.a(new yy(a, a, false, true, preference), new String[0]);
        }
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "%\030P\rX8\032WVP4\022Q\r\0365\025J\f\\v";
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
                obj = "%\030P\rX8\032WVP4\022Q\r";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "7\037K\fEy\023KTR9\023J\034R\"\024R\020E/";
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
        byte byte0 = 49;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 86;
          goto _L9
_L5:
        byte0 = 125;
          goto _L9
_L6:
        byte0 = 36;
          goto _L9
        byte0 = 121;
          goto _L9
    }
}
