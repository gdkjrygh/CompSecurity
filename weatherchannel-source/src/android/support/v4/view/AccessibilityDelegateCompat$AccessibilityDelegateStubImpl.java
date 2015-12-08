// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            AccessibilityDelegateCompat

static class 
    implements 
{

    public boolean dispatchPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        return false;
    }

    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(Object obj, View view)
    {
        return null;
    }

    public Object newAccessiblityDelegateBridge(AccessibilityDelegateCompat accessibilitydelegatecompat)
    {
        return null;
    }

    public Object newAccessiblityDelegateDefaultImpl()
    {
        return null;
    }

    public void onInitializeAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
    }

    public void onInitializeAccessibilityNodeInfo(Object obj, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
    }

    public void onPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
    }

    public boolean onRequestSendAccessibilityEvent(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return true;
    }

    public boolean performAccessibilityAction(Object obj, View view, int i, Bundle bundle)
    {
        return false;
    }

    public void sendAccessibilityEvent(Object obj, View view, int i)
    {
    }

    public void sendAccessibilityEventUnchecked(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
    }

    ()
    {
    }
}
