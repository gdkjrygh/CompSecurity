// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import java.util.List;

class AccessibilityManagerCompatIcs
{

    AccessibilityManagerCompatIcs()
    {
    }

    public static boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, Object obj)
    {
        return accessibilitymanager.addAccessibilityStateChangeListener((android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener)obj);
    }

    public static List getEnabledAccessibilityServiceList(AccessibilityManager accessibilitymanager, int i)
    {
        return accessibilitymanager.getEnabledAccessibilityServiceList(i);
    }

    public static List getInstalledAccessibilityServiceList(AccessibilityManager accessibilitymanager)
    {
        return accessibilitymanager.getInstalledAccessibilityServiceList();
    }

    public static boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager)
    {
        return accessibilitymanager.isTouchExplorationEnabled();
    }

    public static Object newAccessibilityStateChangeListener(final AccessibilityStateChangeListenerBridge bridge)
    {
        return new _cls1();
    }

    public static boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, Object obj)
    {
        return accessibilitymanager.removeAccessibilityStateChangeListener((android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener)obj);
    }

    private class _cls1
        implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    {

        final AccessibilityStateChangeListenerBridge val$bridge;

        public void onAccessibilityStateChanged(boolean flag)
        {
            bridge.onAccessibilityStateChanged(flag);
        }

        _cls1()
        {
            bridge = accessibilitystatechangelistenerbridge;
            super();
        }

        private class AccessibilityStateChangeListenerBridge
        {

            public abstract void onAccessibilityStateChanged(boolean flag);
        }

    }

}
