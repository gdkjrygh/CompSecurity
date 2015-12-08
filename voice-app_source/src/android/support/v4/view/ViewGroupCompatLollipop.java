// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewGroup;

class ViewGroupCompatLollipop
{

    ViewGroupCompatLollipop()
    {
    }

    public static int getNestedScrollAxes(ViewGroup viewgroup)
    {
        return viewgroup.getNestedScrollAxes();
    }

    public static boolean isTransitionGroup(ViewGroup viewgroup)
    {
        return viewgroup.isTransitionGroup();
    }

    public static void setTransitionGroup(ViewGroup viewgroup, boolean flag)
    {
        viewgroup.setTransitionGroup(flag);
    }
}
