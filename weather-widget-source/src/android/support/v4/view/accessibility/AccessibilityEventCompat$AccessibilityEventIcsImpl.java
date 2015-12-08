// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityEventCompat, AccessibilityEventCompatIcs

static class  extends 
{

    public void appendRecord(AccessibilityEvent accessibilityevent, Object obj)
    {
        AccessibilityEventCompatIcs.appendRecord(accessibilityevent, obj);
    }

    public Object getRecord(AccessibilityEvent accessibilityevent, int i)
    {
        return AccessibilityEventCompatIcs.getRecord(accessibilityevent, i);
    }

    public int getRecordCount(AccessibilityEvent accessibilityevent)
    {
        return AccessibilityEventCompatIcs.getRecordCount(accessibilityevent);
    }

    ()
    {
    }
}
