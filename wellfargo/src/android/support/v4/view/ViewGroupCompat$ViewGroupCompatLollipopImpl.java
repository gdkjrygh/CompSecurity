// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//            ViewGroupCompatLollipop

class mpl extends mpl
{

    public int getNestedScrollAxes(ViewGroup viewgroup)
    {
        return ViewGroupCompatLollipop.getNestedScrollAxes(viewgroup);
    }

    public boolean isTransitionGroup(ViewGroup viewgroup)
    {
        return ViewGroupCompatLollipop.isTransitionGroup(viewgroup);
    }

    public void setTransitionGroup(ViewGroup viewgroup, boolean flag)
    {
        ViewGroupCompatLollipop.setTransitionGroup(viewgroup, flag);
    }

    mpl()
    {
    }
}
