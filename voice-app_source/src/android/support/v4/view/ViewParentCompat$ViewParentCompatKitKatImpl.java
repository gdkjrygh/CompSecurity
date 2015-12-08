// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            ViewParentCompat, ViewParentCompatKitKat

static class I extends I
{

    public void notifySubtreeAccessibilityStateChanged(ViewParent viewparent, View view, View view1, int i)
    {
        ViewParentCompatKitKat.notifySubtreeAccessibilityStateChanged(viewparent, view, view1, i);
    }

    I()
    {
    }
}
