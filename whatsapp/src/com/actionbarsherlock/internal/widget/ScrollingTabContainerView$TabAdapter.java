// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            ScrollingTabContainerView, IcsLinearLayout, AbsActionBarView

class <init> extends BaseAdapter
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
label0:
        {
            if (view == null)
            {
                view = ScrollingTabContainerView.access$300(ScrollingTabContainerView.this, (com.actionbarsherlock.app.)getItem(i), true);
                viewgroup = view;
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            ((getItem)view).dTab((com.actionbarsherlock.app..TabView.bindTab)getItem(i));
            viewgroup = view;
        }
        return viewgroup;
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
