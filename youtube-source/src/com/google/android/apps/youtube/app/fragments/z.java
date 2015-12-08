// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.youtube.datalib.innertube.model.a.b;
import com.google.android.apps.youtube.uilib.a.h;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            GuideFragment

final class z
    implements android.widget.AdapterView.OnItemClickListener
{

    final GuideFragment a;

    z(GuideFragment guidefragment)
    {
        a = guidefragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (GuideFragment.f(a).getItem(i)));
        if (adapterview instanceof b)
        {
            adapterview = (b)adapterview;
            boolean flag;
            if (!adapterview.c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            adapterview.a(flag);
            GuideFragment.g(a);
        }
    }
}
