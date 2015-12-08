// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

interface 
{

    public abstract void notifySubtreeAccessibilityStateChanged(ViewParent viewparent, View view, View view1, int i);

    public abstract boolean onNestedFling(ViewParent viewparent, View view, float f, float f1, boolean flag);

    public abstract boolean onNestedPreFling(ViewParent viewparent, View view, float f, float f1);

    public abstract void onNestedPreScroll(ViewParent viewparent, View view, int i, int j, int ai[]);

    public abstract void onNestedScroll(ViewParent viewparent, View view, int i, int j, int k, int l);

    public abstract void onNestedScrollAccepted(ViewParent viewparent, View view, View view1, int i);

    public abstract boolean onStartNestedScroll(ViewParent viewparent, View view, View view1, int i);

    public abstract void onStopNestedScroll(ViewParent viewparent, View view);

    public abstract boolean requestSendAccessibilityEvent(ViewParent viewparent, View view, AccessibilityEvent accessibilityevent);
}
