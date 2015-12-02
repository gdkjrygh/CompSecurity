// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.whatsapp:
//            CallsFragment, e7, yj, App

class xd
    implements android.widget.AdapterView.OnItemClickListener
{

    final CallsFragment a;

    xd(CallsFragment callsfragment)
    {
        a = callsfragment;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i >= 0 && i < CallsFragment.f(a).getCount())
        {
            App.b(CallsFragment.f(a).a(i).e(), a.getActivity());
        }
    }
}
