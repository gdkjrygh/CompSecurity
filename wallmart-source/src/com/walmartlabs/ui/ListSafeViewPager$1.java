// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.view.MotionEvent;

// Referenced classes of package com.walmartlabs.ui:
//            ListSafeViewPager

class stureListener extends android.view.leOnGestureListener
{

    final ListSafeViewPager this$0;

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (Math.abs(f) > Math.abs(f1))
        {
            return true;
        } else
        {
            ListSafeViewPager.access$102(ListSafeViewPager.this, true);
            return false;
        }
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        if (ListSafeViewPager.access$000(ListSafeViewPager.this) != null)
        {
            ListSafeViewPager.access$000(ListSafeViewPager.this).onClick(ListSafeViewPager.this);
        }
        return super.onSingleTapUp(motionevent);
    }

    stureListener()
    {
        this$0 = ListSafeViewPager.this;
        super();
    }
}
