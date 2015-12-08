// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompatKitKat

static class _cls2Impl extends _cls2Impl
{

    public Object getCollectionInfo(Object obj)
    {
        return AccessibilityNodeInfoCompatKitKat.getCollectionInfo(obj);
    }

    public int getCollectionInfoColumnCount(Object obj)
    {
        return unt(obj);
    }

    public int getCollectionInfoRowCount(Object obj)
    {
        return (obj);
    }

    public int getCollectionItemColumnIndex(Object obj)
    {
        return mnIndex(obj);
    }

    public int getCollectionItemColumnSpan(Object obj)
    {
        return mnSpan(obj);
    }

    public Object getCollectionItemInfo(Object obj)
    {
        return AccessibilityNodeInfoCompatKitKat.getCollectionItemInfo(obj);
    }

    public int getCollectionItemRowIndex(Object obj)
    {
        return ndex(obj);
    }

    public int getCollectionItemRowSpan(Object obj)
    {
        return pan(obj);
    }

    public int getLiveRegion(Object obj)
    {
        return AccessibilityNodeInfoCompatKitKat.getLiveRegion(obj);
    }

    public Object getRangeInfo(Object obj)
    {
        return AccessibilityNodeInfoCompatKitKat.getRangeInfo(obj);
    }

    public boolean isCollectionInfoHierarchical(Object obj)
    {
        return cal(obj);
    }

    public boolean isCollectionItemHeading(Object obj)
    {
        return ng(obj);
    }

    public boolean isContentInvalid(Object obj)
    {
        return AccessibilityNodeInfoCompatKitKat.isContentInvalid(obj);
    }

    public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
    {
        return AccessibilityNodeInfoCompatKitKat.obtainCollectionInfo(i, j, flag, k);
    }

    public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
    {
        return AccessibilityNodeInfoCompatKitKat.obtainCollectionItemInfo(i, j, k, l, flag);
    }

    public void setCollectionInfo(Object obj, Object obj1)
    {
        AccessibilityNodeInfoCompatKitKat.setCollectionInfo(obj, obj1);
    }

    public void setCollectionItemInfo(Object obj, Object obj1)
    {
        AccessibilityNodeInfoCompatKitKat.setCollectionItemInfo(obj, obj1);
    }

    public void setContentInvalid(Object obj, boolean flag)
    {
        AccessibilityNodeInfoCompatKitKat.setContentInvalid(obj, flag);
    }

    public void setLiveRegion(Object obj, int i)
    {
        AccessibilityNodeInfoCompatKitKat.setLiveRegion(obj, i);
    }

    _cls2Impl()
    {
    }
}
