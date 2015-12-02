// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Bundle;
import android.preference.Preference;
import com.whatsapp.fieldstats.o;

// Referenced classes of package com.whatsapp:
//            DialogToastPreferenceActivity, ft, ej, xj, 
//            afr, a3v, a9z, a3w

public class Settings extends DialogToastPreferenceActivity
{

    private static final String z[];

    public Settings()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ft.a(o.SETTINGS);
        addPreferencesFromResource(0x7f050004);
        findPreference(z[4]).setOnPreferenceClickListener(new ej(this));
        findPreference(z[2]).setOnPreferenceClickListener(new xj(this));
        findPreference(z[1]).setOnPreferenceClickListener(new afr(this));
        findPreference(z[3]).setOnPreferenceClickListener(new a3v(this));
        findPreference(z[5]).setOnPreferenceClickListener(new a9z(this));
        findPreference(z[0]).setOnPreferenceClickListener(new a3w(this));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "~\013\002RPy\007\027O_\177\n\005";
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
                obj = "`\026\031]_|\001)RXv\013";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "s\013\030OWs\020)RXv\013";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "q\007\025TC~\020)RXv\013";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "c\001\002O_~\003\005d^u\b\006";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "c\001\002O_~\003\005dUx\005\002";
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
        byte byte1 = 54;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 16;
          goto _L9
_L5:
        byte1 = 100;
          goto _L9
_L6:
        byte1 = 118;
          goto _L9
        byte1 = 59;
          goto _L9
    }
}
