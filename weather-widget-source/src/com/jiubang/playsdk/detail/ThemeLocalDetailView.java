// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.detail;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.jiubang.playsdk.detail.a.l;
import com.jiubang.playsdk.f.j;
import com.jiubang.playsdk.main.e;
import com.jiubang.playsdk.views.HorizontalListView;

public class ThemeLocalDetailView extends FrameLayout
    implements e
{

    private HorizontalListView a;
    private HorizontalListView b;
    private TextView c;
    private View d;
    private int e;
    private View f;
    private TextView g;
    private LinearLayout h;
    private LinearLayout i;

    public ThemeLocalDetailView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private int c()
    {
        int k = getContext().getResources().getDimensionPixelSize(0x7f0c0018);
        int i1 = getContext().getResources().getDimensionPixelSize(0x7f0c001d);
        return (j.c - k * 2 - i1 * 2) / 3;
    }

    public void a()
    {
        g.setVisibility(8);
    }

    public void a(int k)
    {
        c.setText(k);
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        h.setOnClickListener(onclicklistener);
    }

    public void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        android.widget.ListAdapter listadapter = b.a();
        if (listadapter instanceof l)
        {
            ((l)listadapter).a(onitemclicklistener);
        }
    }

    public void a(BaseAdapter baseadapter)
    {
        a.a(baseadapter);
        a.getLayoutParams().height = (int)((double)e * 1.6499999999999999D);
    }

    public void b()
    {
        d.setVisibility(8);
    }

    public void b(int k)
    {
        g.setVisibility(0);
        g.setText(k);
    }

    public void b(BaseAdapter baseadapter)
    {
    }

    public void c(int k)
    {
        Drawable drawable = getContext().getResources().getDrawable(k);
        drawable.setBounds(0, 0, j.a(22F), j.a(21F));
        g.setCompoundDrawables(drawable, null, null, null);
    }

    public void c(BaseAdapter baseadapter)
    {
        b = (HorizontalListView)((ViewStub)findViewById(0x7f0903fc)).inflate();
        b.a(baseadapter);
        b.getLayoutParams().height = (int)((double)e * 1.6499999999999999D);
        b.setEmptyView(f);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        i = (LinearLayout)findViewById(0x7f0903f6);
        a = (HorizontalListView)i.findViewById(0x7f0903f8);
        c = (TextView)i.findViewById(0x7f0903fa);
        d = i.findViewById(0x7f0903fd);
        f = findViewById(0x7f0903fe);
        e = c();
        g = (TextView)i.findViewById(0x7f0903fb);
        h = (LinearLayout)i.findViewById(0x7f0903f9);
    }
}
