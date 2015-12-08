// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityManagerCompatIcs

static final class val.bridge
    implements android.view.accessibility.tyStateChangeListener
{

    final cessibilityStateChangeListenerBridge val$bridge;

    public void onAccessibilityStateChanged(boolean flag)
    {
        val$bridge.onAccessibilityStateChanged(flag);
    }

    cessibilityStateChangeListenerBridge(cessibilityStateChangeListenerBridge cessibilitystatechangelistenerbridge)
    {
        val$bridge = cessibilitystatechangelistenerbridge;
        super();
    }
}
