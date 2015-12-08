// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat

public class <init>
{

    private final Object mInfo;

    public static <init> obtain(int i, int j, int k, int l, boolean flag, boolean flag1)
    {
        return new <init>(AccessibilityNodeInfoCompat.access$000().obtainCollectionItemInfo(i, j, k, l, flag, flag1));
    }

    public int getColumnIndex()
    {
        return AccessibilityNodeInfoCompat.access$000().getCollectionItemColumnIndex(mInfo);
    }

    public int getColumnSpan()
    {
        return AccessibilityNodeInfoCompat.access$000().getCollectionItemColumnSpan(mInfo);
    }

    public int getRowIndex()
    {
        return AccessibilityNodeInfoCompat.access$000().getCollectionItemRowIndex(mInfo);
    }

    public int getRowSpan()
    {
        return AccessibilityNodeInfoCompat.access$000().getCollectionItemRowSpan(mInfo);
    }

    public boolean isHeading()
    {
        return AccessibilityNodeInfoCompat.access$000().isCollectionItemHeading(mInfo);
    }

    public boolean isSelected()
    {
        return AccessibilityNodeInfoCompat.access$000().isCollectionItemSelected(mInfo);
    }


    private (Object obj)
    {
        mInfo = obj;
    }

    mInfo(Object obj, mInfo minfo)
    {
        this(obj);
    }
}
