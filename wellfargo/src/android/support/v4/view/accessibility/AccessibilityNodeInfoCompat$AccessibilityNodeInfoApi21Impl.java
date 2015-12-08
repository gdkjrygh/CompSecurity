// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompatApi21

class  extends 
{

    public void addAction(Object obj, Object obj1)
    {
        AccessibilityNodeInfoCompatApi21.addAction(obj, obj1);
    }

    public int getAccessibilityActionId(Object obj)
    {
        return AccessibilityNodeInfoCompatApi21.getAccessibilityActionId(obj);
    }

    public CharSequence getAccessibilityActionLabel(Object obj)
    {
        return AccessibilityNodeInfoCompatApi21.getAccessibilityActionLabel(obj);
    }

    public List getActionList(Object obj)
    {
        return AccessibilityNodeInfoCompatApi21.getActionList(obj);
    }

    public CharSequence getError(Object obj)
    {
        return AccessibilityNodeInfoCompatApi21.getError(obj);
    }

    public boolean isCollectionItemSelected(Object obj)
    {
        return ted(obj);
    }

    public Object newAccessibilityAction(int i, CharSequence charsequence)
    {
        return AccessibilityNodeInfoCompatApi21.newAccessibilityAction(i, charsequence);
    }

    public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
    {
        return AccessibilityNodeInfoCompatApi21.obtainCollectionInfo(i, j, flag, k);
    }

    public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
    {
        return AccessibilityNodeInfoCompatApi21.obtainCollectionItemInfo(i, j, k, l, flag, flag1);
    }

    public void setError(Object obj, CharSequence charsequence)
    {
        AccessibilityNodeInfoCompatApi21.setError(obj, charsequence);
    }

    public void setLabelFor(Object obj, View view)
    {
        AccessibilityNodeInfoCompatApi21.setLabelFor(obj, view);
    }

    public void setLabelFor(Object obj, View view, int i)
    {
        AccessibilityNodeInfoCompatApi21.setLabelFor(obj, view, i);
    }

    ()
    {
    }
}
