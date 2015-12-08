// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            ScrollingTabContainerView

private class <init> extends BaseAdapter
{

    final ScrollingTabContainerView this$0;

    public int getCount()
    {
        return ScrollingTabContainerView.access$200(ScrollingTabContainerView.this).getChildCount();
    }

    public Object getItem(int i)
    {
        return ((this._cls0)ScrollingTabContainerView.access$200(ScrollingTabContainerView.this).getChildAt(i)).Tab();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            return ScrollingTabContainerView.access$300(ScrollingTabContainerView.this, (android.support.v7.app.)getItem(i), true);
        } else
        {
            ((getItem)view).dTab((android.support.v7.app..TabView.bindTab)getItem(i));
            return view;
        }
    }

    private ()
    {
        this$0 = ScrollingTabContainerView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
