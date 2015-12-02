// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.protocol.cr;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            td, ya

class _i
    implements android.widget.AdapterView.OnItemClickListener
{

    final td a;

    _i(td td1)
    {
        a = td1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        boolean flag = true;
        adapterview = (cr)a.e.get(i);
        if (a.o.size() != 1 || a.o.get(0) != adapterview)
        {
            flag = false;
        }
        a.o.clear();
        a.o.add(a.e.get(i));
        td.e(a).notifyDataSetChanged();
        a.a(adapterview, flag);
    }
}
