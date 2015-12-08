// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

class AccessibilityNodeInfoCompatApi21
{
    static class AccessibilityAction
    {

        static int getId(Object obj)
        {
            return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj).getId();
        }

        static CharSequence getLabel(Object obj)
        {
            return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj).getLabel();
        }

        AccessibilityAction()
        {
        }
    }

    static class CollectionItemInfo
    {

        public static boolean isSelected(Object obj)
        {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj).isSelected();
        }

        CollectionItemInfo()
        {
        }
    }


    AccessibilityNodeInfoCompatApi21()
    {
    }

    static void addAction(Object obj, int i, CharSequence charsequence)
    {
        charsequence = new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i, charsequence);
        ((AccessibilityNodeInfo)obj).addAction(charsequence);
    }

    static List getActionList(Object obj)
    {
        return (List)((AccessibilityNodeInfo)obj).getActionList();
    }

    public static Object obtainCollectionInfo(int i, int j, boolean flag, int k)
    {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag, k);
    }

    public static Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
    {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag, flag1);
    }
}
