// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

interface 
{

    public abstract void appendRecord(AccessibilityEvent accessibilityevent, Object obj);

    public abstract int getContentChangeTypes(AccessibilityEvent accessibilityevent);

    public abstract Object getRecord(AccessibilityEvent accessibilityevent, int i);

    public abstract int getRecordCount(AccessibilityEvent accessibilityevent);

    public abstract void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i);
}
