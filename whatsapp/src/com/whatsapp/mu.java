// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import android.widget.CheckBox;
import com.whatsapp.contact.b;
import com.whatsapp.contact.j;
import com.whatsapp.contact.n;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            ContactPickerHelp, App, gl, s3, 
//            a84, ug

class mu extends AsyncTask
{

    private static final String z[];
    final ContactPickerHelp a;

    private mu(ContactPickerHelp contactpickerhelp)
    {
        a = contactpickerhelp;
        super();
    }

    mu(ContactPickerHelp contactpickerhelp, ug ug)
    {
        this(contactpickerhelp);
    }

    protected n a(Void avoid[])
    {
        return b.b(a.getApplicationContext(), j.INTERACTIVE_FULL);
    }

    protected void a(n n1)
    {
        int i;
        i = App.am;
        a.removeDialog(2);
        gl.a[n1.ordinal()];
        JVM INSTR tableswitch 1 5: default 56
    //                   1 57
    //                   2 128
    //                   3 210
    //                   4 210
    //                   5 299;
           goto _L1 _L2 _L3 _L4 _L4 _L5
_L1:
        return;
_L2:
        App.ay.c(true);
        App.au.a(System.currentTimeMillis());
        Log.i((new StringBuilder()).append(z[3]).append(a.i.isChecked()).toString());
        a.a(0x7f0e00dc, new a84(this));
        if (i == 0) goto _L1; else goto _L3
_L3:
        a.l = true;
        a.i.toggle();
        Log.i((new StringBuilder()).append(z[0]).append(a.i.isChecked()).toString());
        App.c(a, a.i.isChecked());
        a.a(0x7f0e009a);
        if (i == 0) goto _L1; else goto _L4
_L4:
        App.ay.a(true);
        a.l = true;
        a.i.toggle();
        Log.i((new StringBuilder()).append(z[1]).append(a.i.isChecked()).toString());
        App.c(a, a.i.isChecked());
        a.a(0x7f0e0099);
        if (i == 0) goto _L1; else goto _L5
_L5:
        a.l = true;
        a.i.toggle();
        Log.i((new StringBuilder()).append(z[2]).append(a.i.isChecked()).toString());
        App.c(a, a.i.isChecked());
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
        a.showDialog(2);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\000MI3'\000VO\"*\023\rT>(\000\rA&/\017GCh%\001QS&2\026Q\007";
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
                obj = "\000MI3'\000VO\"*\023\rT>(\000\rA&/\017GCh%\001QS&2\026Q\007";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\000MI3'\000VO\"*\023\rT>(\000\rA&/\017GCh%\001QS&2\026Q\007";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\000MI3'\000VO\"*\023\rT>(\000\rT2%\000GT4i\000@T3'\027WTg";
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
        byte byte0 = 70;
_L9:
        obj[k] = (char)(byte0 ^ c);
        k++;
          goto _L8
_L4:
        byte0 = 99;
          goto _L9
_L5:
        byte0 = 34;
          goto _L9
_L6:
        byte0 = 39;
          goto _L9
        byte0 = 71;
          goto _L9
    }
}
