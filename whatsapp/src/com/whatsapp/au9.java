// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import android.preference.CheckBoxPreference;
import com.whatsapp.contact.b;
import com.whatsapp.contact.j;
import com.whatsapp.contact.n;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            SettingsContacts, App, as0, s3, 
//            ab5

class au9 extends AsyncTask
{

    private static final String z[];
    final SettingsContacts a;

    private au9(SettingsContacts settingscontacts)
    {
        a = settingscontacts;
        super();
    }

    au9(SettingsContacts settingscontacts, ab5 ab5)
    {
        this(settingscontacts);
    }

    private void a(CheckBoxPreference checkboxpreference)
    {
        boolean flag;
        if (!checkboxpreference.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkboxpreference.setChecked(flag);
    }

    protected n a(Void avoid[])
    {
        return b.b(a.getApplicationContext(), j.INTERACTIVE_FULL);
    }

    protected void a(n n1)
    {
        int i;
        i = App.am;
        a.removeDialog(16);
        as0.a[n1.ordinal()];
        JVM INSTR tableswitch 1 5: default 56
    //                   1 57
    //                   2 120
    //                   3 178
    //                   4 178
    //                   5 243;
           goto _L1 _L2 _L3 _L4 _L4 _L5
_L1:
        return;
_L2:
        App.ay.c(true);
        App.au.a(System.currentTimeMillis());
        Log.i((new StringBuilder()).append(z[0]).append(SettingsContacts.a(a).isChecked()).toString());
        a.a(0x7f0e00dc);
        if (i == 0) goto _L1; else goto _L3
_L3:
        a(SettingsContacts.a(a));
        Log.i((new StringBuilder()).append(z[3]).append(SettingsContacts.a(a).isChecked()).toString());
        a.a(0x7f0e009a);
        if (i == 0) goto _L1; else goto _L4
_L4:
        App.ay.a(true);
        a(SettingsContacts.a(a));
        Log.i((new StringBuilder()).append(z[2]).append(SettingsContacts.a(a).isChecked()).toString());
        a.a(0x7f0e0099);
        if (i == 0) goto _L1; else goto _L5
_L5:
        a(SettingsContacts.a(a));
        Log.i((new StringBuilder()).append(z[1]).append(SettingsContacts.a(a).isChecked()).toString());
        a.a(0x7f0e009b);
        return;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((n)obj);
    }

    protected void onPreExecute()
    {
        a.showDialog(16);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "$z\032l`9x\0357z.q\r7z\"|\r}z$0\rzz#~\032mzw";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "$z\032l`9x\0357z.q\r7o6v\002}mx|\fk}6k\033k)";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "$z\032l`9x\0357z.q\r7o6v\002}mx|\fk}6k\033k)";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "$z\032l`9x\0357z.q\r7o6v\002}mx|\fk}6k\033k)";
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
        char c = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 9;
_L9:
        obj[k] = (char)(byte0 ^ c);
        k++;
          goto _L8
_L4:
        byte0 = 87;
          goto _L9
_L5:
        byte0 = 31;
          goto _L9
_L6:
        byte0 = 110;
          goto _L9
        byte0 = 24;
          goto _L9
    }
}
