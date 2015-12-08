// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityManagerCompat

static class nerCompat
    implements pl
{

    public boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, nerCompat nercompat)
    {
        return false;
    }

    public List getEnabledAccessibilityServiceList(AccessibilityManager accessibilitymanager, int i)
    {
        return Collections.emptyList();
    }

    public List getInstalledAccessibilityServiceList(AccessibilityManager accessibilitymanager)
    {
        return Collections.emptyList();
    }

    public boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager)
    {
        return false;
    }

    public Object newAccessiblityStateChangeListener(nerCompat nercompat)
    {
        return null;
    }

    public boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, nerCompat nercompat)
    {
        return false;
    }

    nerCompat()
    {
    }
}
