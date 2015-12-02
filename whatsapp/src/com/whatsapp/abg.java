// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.CheckBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            App, og, a5, MultipleContactPicker

class abg
    implements android.view.View.OnClickListener
{

    final a5 a;

    abg(a5 a5_1)
    {
        a = a5_1;
        super();
    }

    public void onClick(View view)
    {
        Object obj;
        boolean flag;
        int i;
        flag = false;
        i = App.am;
        obj = (CheckBox)view.findViewById(0x7f0b0247);
        view = (og)((CheckBox) (obj)).getTag();
        if (!App.C(((og) (view)).a)) goto _L2; else goto _L1
_L1:
        return;
_L2:
label0:
        {
            if (((og) (view)).L)
            {
                ((CheckBox) (obj)).setChecked(false);
                view.L = false;
                if (i == 0)
                {
                    break label0;
                }
            }
            if (MultipleContactPicker.d(a.a).size() == MultipleContactPicker.a(a.a))
            {
                a.a.f(String.format(a.a.getString(MultipleContactPicker.e(a.a)), new Object[] {
                    Integer.valueOf(MultipleContactPicker.a(a.a))
                }));
                ((CheckBox) (obj)).setChecked(false);
                if (i == 0)
                {
                    break label0;
                }
            }
            ((CheckBox) (obj)).setChecked(true);
            view.L = true;
        }
label1:
        {
            if (((og) (view)).L)
            {
                MultipleContactPicker.d(a.a).add(((og) (view)).a);
                if (i == 0)
                {
                    break label1;
                }
            }
            MultipleContactPicker.d(a.a).remove(((og) (view)).a);
        }
        MultipleContactPicker.a(a.a, MultipleContactPicker.d(a.a).size());
        obj = MultipleContactPicker.f(a.a).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            og og1 = (og)((Iterator) (obj)).next();
            if (og1 != view && ((og) (view)).a.equals(og1.a))
            {
                og1.L = ((og) (view)).L;
                flag = true;
            }
        } while (i == 0);
        if (flag)
        {
            a.notifyDataSetChanged();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
