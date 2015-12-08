// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.j;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ae

abstract class e
    implements ae
{

    protected final View a;
    private final TextView b;

    private e(View view)
    {
        a = view;
        b = (TextView)a.findViewById(j.D);
    }

    e(View view, ViewGroup viewgroup)
    {
        this(view);
    }

    public final View a(int i, Object obj)
    {
        if (b(obj))
        {
            b.setText(p.cl);
            b.setVisibility(0);
        } else
        if (a(obj))
        {
            b.setText(p.ga);
            b.setVisibility(0);
        } else
        {
            b.setVisibility(8);
        }
        return a;
    }

    protected abstract boolean a(Object obj);

    protected abstract boolean b(Object obj);
}
