// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            ab8, og, App, w2, 
//            ContactPicker

class afx
    implements android.widget.AdapterView.OnItemLongClickListener
{

    final ListView a;
    final w2 b;

    afx(w2 w2_1, ListView listview)
    {
        b = w2_1;
        a = listview;
        super();
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (ab8)a.getAdapter();
        if (!ab8.c(adapterview, i) && !ab8.a(adapterview, i) && !ab8.b(adapterview, i))
        {
            adapterview = adapterview.b(i);
            if (App.C(((og) (adapterview)).a))
            {
                return false;
            }
            ContactPicker.a(b.a, new HashMap());
            ContactPicker.r(b.a).put(((og) (adapterview)).a, adapterview);
            b.a.j();
            ContactPicker.i(b.a);
        }
        return true;
    }
}
