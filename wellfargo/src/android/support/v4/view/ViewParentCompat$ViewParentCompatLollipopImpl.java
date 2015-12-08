// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            ViewParentCompatLollipop

class  extends 
{

    public boolean onNestedFling(ViewParent viewparent, View view, float f, float f1, boolean flag)
    {
        return ViewParentCompatLollipop.onNestedFling(viewparent, view, f, f1, flag);
    }

    public boolean onNestedPreFling(ViewParent viewparent, View view, float f, float f1)
    {
        return ViewParentCompatLollipop.onNestedPreFling(viewparent, view, f, f1);
    }

    public void onNestedPreScroll(ViewParent viewparent, View view, int i, int j, int ai[])
    {
        ViewParentCompatLollipop.onNestedPreScroll(viewparent, view, i, j, ai);
    }

    public void onNestedScroll(ViewParent viewparent, View view, int i, int j, int k, int l)
    {
        ViewParentCompatLollipop.onNestedScroll(viewparent, view, i, j, k, l);
    }

    public void onNestedScrollAccepted(ViewParent viewparent, View view, View view1, int i)
    {
        ViewParentCompatLollipop.onNestedScrollAccepted(viewparent, view, view1, i);
    }

    public boolean onStartNestedScroll(ViewParent viewparent, View view, View view1, int i)
    {
        return ViewParentCompatLollipop.onStartNestedScroll(viewparent, view, view1, i);
    }

    public void onStopNestedScroll(ViewParent viewparent, View view)
    {
        ViewParentCompatLollipop.onStopNestedScroll(viewparent, view);
    }

    ()
    {
    }
}
