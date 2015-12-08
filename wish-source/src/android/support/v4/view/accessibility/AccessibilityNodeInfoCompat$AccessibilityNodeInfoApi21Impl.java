// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompatApi21

static class  extends 
{

    public void addAction(Object obj, int i, CharSequence charsequence)
    {
        AccessibilityNodeInfoCompatApi21.addAction(obj, i, charsequence);
    }

    public List getActionList(Object obj)
    {
        return AccessibilityNodeInfoCompatApi21.getActionList(obj);
    }

    public boolean isCollectionItemSelected(Object obj)
    {
        return ted(obj);
    }

    public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
    {
        return AccessibilityNodeInfoCompatApi21.obtainCollectionInfo(i, j, flag, k);
    }

    public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
    {
        return AccessibilityNodeInfoCompatApi21.obtainCollectionItemInfo(i, j, k, l, flag, flag1);
    }

    ()
    {
    }
}
