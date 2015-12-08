// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter.a;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.model.a.b;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.youtube.d;
import com.google.android.youtube.f;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

public final class a
    implements g
{

    private final View a;
    private final TextView b;
    private final TextView c;
    private final Drawable d;

    public a(Activity activity, ViewGroup viewgroup)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(activity);
        com.google.android.apps.youtube.common.fromguava.c.a(viewgroup);
        a = activity.getLayoutInflater().inflate(l.aa, viewgroup, false);
        b = (TextView)a.findViewById(j.fF);
        c = (TextView)a.findViewById(j.ff);
        viewgroup = new TypedValue();
        activity.getTheme().resolveAttribute(d.a, viewgroup, true);
        d = activity.getResources().getDrawable(((TypedValue) (viewgroup)).resourceId);
    }

    public final View a(com.google.android.apps.youtube.uilib.a.f f1, Object obj)
    {
        f1 = (b)obj;
        b.setText(f1.b());
        obj = f1.f();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            c.setText(((CharSequence) (obj)));
            c.setVisibility(0);
        } else
        {
            c.setVisibility(8);
        }
        if (f1 != a.getTag())
        {
            a.setTag(f1);
        }
        if (f1.g())
        {
            a.setBackgroundResource(f.f);
        } else
        {
            a.setBackgroundDrawable(d);
        }
        return a;
    }
}
