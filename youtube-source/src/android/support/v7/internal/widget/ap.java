// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.app.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ScrollingTabContainerView

final class ap extends BaseAdapter
{

    final ScrollingTabContainerView a;

    private ap(ScrollingTabContainerView scrollingtabcontainerview)
    {
        a = scrollingtabcontainerview;
        super();
    }

    ap(ScrollingTabContainerView scrollingtabcontainerview, byte byte0)
    {
        this(scrollingtabcontainerview);
    }

    public final int getCount()
    {
        return ScrollingTabContainerView.a(a).getChildCount();
    }

    public final Object getItem(int i)
    {
        return ((ScrollingTabContainerView.TabView)ScrollingTabContainerView.a(a).getChildAt(i)).a();
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            return ScrollingTabContainerView.a(a, (c)getItem(i), true);
        } else
        {
            ((ScrollingTabContainerView.TabView)view).a((c)getItem(i));
            return view;
        }
    }
}
