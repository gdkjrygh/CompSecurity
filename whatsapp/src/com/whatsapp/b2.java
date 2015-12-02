// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            MultipleContactsSelector, App, og, a8_

class b2
    implements android.widget.AdapterView.OnItemClickListener
{

    final MultipleContactsSelector a;

    b2(MultipleContactsSelector multiplecontactsselector)
    {
        a = multiplecontactsselector;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            if (view == null)
            {
                return;
            }
            if (a.h() > 0 && a.j.size() >= a.h())
            {
                a.f(String.format(a.getString(a.e()), new Object[] {
                    Integer.valueOf(a.h())
                }));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            a.j.add((og)view.getTag());
        }
        a.q.setText("");
        MultipleContactsSelector.c(a).notifyDataSetChanged();
        a.i();
    }
}
