// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatKitKat
{

    AccessibilityNodeInfoCompatKitKat()
    {
    }

    static Object getCollectionInfo(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getCollectionInfo();
    }

    static Object getCollectionItemInfo(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getCollectionItemInfo();
    }

    static int getLiveRegion(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getLiveRegion();
    }

    static Object getRangeInfo(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getRangeInfo();
    }

    public static boolean isContentInvalid(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isContentInvalid();
    }

    public static Object obtainCollectionInfo(int i, int j, boolean flag, int k)
    {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag);
    }

    public static Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag)
    {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag);
    }

    public static void setCollectionInfo(Object obj, Object obj1)
    {
        ((AccessibilityNodeInfo)obj).setCollectionInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj1);
    }

    public static void setCollectionItemInfo(Object obj, Object obj1)
    {
        ((AccessibilityNodeInfo)obj).setCollectionItemInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj1);
    }

    public static void setContentInvalid(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setContentInvalid(flag);
    }

    static void setLiveRegion(Object obj, int i)
    {
        ((AccessibilityNodeInfo)obj).setLiveRegion(i);
    }
}
