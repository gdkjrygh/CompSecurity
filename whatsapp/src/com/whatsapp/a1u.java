// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.contact.a;
import com.whatsapp.contact.g;
import com.whatsapp.contact.i;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            ContactPickerHelp, a_r, atp, App, 
//            ug

class a1u extends AsyncTask
{

    private static final String z;
    final ContactPickerHelp a;

    private a1u(ContactPickerHelp contactpickerhelp)
    {
        a = contactpickerhelp;
        super();
    }

    a1u(ContactPickerHelp contactpickerhelp, ug ug)
    {
        this(contactpickerhelp);
    }

    protected Set a(Void avoid[])
    {
        return i.a(g.INVISIBLE_ONLY);
    }

    protected void a(Set set)
    {
label0:
        {
            a.removeDialog(1);
            if (set != null)
            {
                if (!set.isEmpty())
                {
                    a.findViewById(0x7f0b0131).setVisibility(0);
                    Log.i((new StringBuilder()).append(z).append(a.i.isChecked()).toString());
                    a.findViewById(0x7f0b0130).setVisibility(0);
                    a.findViewById(0x7f0b0133).setVisibility(0);
                }
                a.j.setVisibility(0);
                a.j.setText(a.getString(0x7f0e00e0, new Object[] {
                    Integer.valueOf(set.size())
                }));
                a.getListView().setVisibility(0);
                a.k.clear();
                a.k.addAll(set);
                Collections.sort(a.k, new a());
                a.m.notifyDataSetChanged();
                ListView listview = a.getListView();
                android.view.ViewGroup.LayoutParams layoutparams = listview.getLayoutParams();
                layoutparams.height = (int)((float)set.size() * a.getResources().getDimension(0x7f0a001f));
                listview.setLayoutParams(layoutparams);
                if (!set.isEmpty())
                {
                    ((ScrollView)a.findViewById(0x7f0b00fa)).post(new atp(this));
                }
                if (App.am == 0)
                {
                    break label0;
                }
            }
            a.a(0x7f0e00df);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Set)obj);
    }

    protected void onPreExecute()
    {
        a.showDialog(1);
        a.j.setVisibility(4);
        a.getListView().setVisibility(4);
        a.findViewById(0x7f0b0131).setVisibility(8);
        a.findViewById(0x7f0b0130).setVisibility(8);
        a.findViewById(0x7f0b0133).setVisibility(8);
    }

    static 
    {
        char ac[];
        int j;
        int k;
        ac = "\r\035T^4\r\006RO9\036]IB:\031\033T\\<\035\033XF0A\021XY!\017\006OYu".toCharArray();
        k = ac.length;
        j = 0;
_L7:
        char c;
        if (k <= j)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 85;
_L8:
        ac[j] = (char)(byte0 ^ c);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 110;
          goto _L8
_L3:
        byte0 = 114;
          goto _L8
_L4:
        byte0 = 58;
          goto _L8
        byte0 = 42;
          goto _L8
    }
}
