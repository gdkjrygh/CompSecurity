// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;

public class NestedScrollingParentHelper
{

    private int mNestedScrollAxes;
    private final ViewGroup mViewGroup;

    public NestedScrollingParentHelper(ViewGroup viewgroup)
    {
        mViewGroup = viewgroup;
    }

    public int getNestedScrollAxes()
    {
        return mNestedScrollAxes;
    }

    public void onNestedScrollAccepted(View view, View view1, int i)
    {
        mNestedScrollAxes = i;
    }

    public void onStopNestedScroll(View view)
    {
        mNestedScrollAxes = 0;
    }
}
