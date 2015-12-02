// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Environment;
import android.preference.Preference;
import com.whatsapp.fieldstats.o;

// Referenced classes of package com.whatsapp:
//            ft, SettingsChat, bc, asw

class a30
    implements android.preference.Preference.OnPreferenceClickListener
{

    private static final String z[];
    final SettingsChat a;

    a30(SettingsChat settingschat)
    {
        a = settingschat;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        ft.a(o.BACKUP_CONVERSATIONS);
        preference = Environment.getExternalStorageState();
        if (preference.equals(z[0]))
        {
            a.showDialog(9);
            return true;
        }
        if (!preference.equals(z[1]))
        {
            a.showDialog(10);
            return true;
        } else
        {
            asw.a(new bc(a, null), new Void[0]);
            return true;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\037zs\022\037\027qY\016\004";
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
                obj = "\037zs\022\037\027q";
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
        byte byte0 = 107;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 114;
          goto _L9
_L5:
        byte0 = 21;
          goto _L9
_L6:
        byte0 = 6;
          goto _L9
        byte0 = 124;
          goto _L9
    }
}
