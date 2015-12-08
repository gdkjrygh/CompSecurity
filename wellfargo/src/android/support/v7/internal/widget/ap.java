// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.app.d;
import android.support.v7.widget.z;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            an, ar, ao

class ap extends BaseAdapter
{

    final an a;

    private ap(an an1)
    {
        a = an1;
        super();
    }

    ap(an an1, ao ao)
    {
        this(an1);
    }

    public int getCount()
    {
        return an.a(a).getChildCount();
    }

    public Object getItem(int i)
    {
        return ((ar)an.a(a).getChildAt(i)).b();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            return an.a(a, (d)getItem(i), true);
        } else
        {
            ((ar)view).a((d)getItem(i));
            return view;
        }
    }
}
