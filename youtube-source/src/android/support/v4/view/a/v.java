// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.view.accessibility.AccessibilityRecord;

// Referenced classes of package android.support.v4.view.a:
//            z

class v extends z
{

    v()
    {
    }

    public final Object a()
    {
        return AccessibilityRecord.obtain();
    }

    public final void a(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setFromIndex(i);
    }

    public final void a(Object obj, boolean flag)
    {
        ((AccessibilityRecord)obj).setScrollable(flag);
    }

    public final void b(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setItemCount(i);
    }

    public final void c(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setToIndex(i);
    }
}
