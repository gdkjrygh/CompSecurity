// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.trip;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

// Referenced classes of package com.ubercab.rds.feature.trip:
//            TripReceiptActivity

final class a
    implements android.view.balLayoutListener
{

    final TripReceiptActivity a;

    private void a()
    {
        if (android.os.lobalLayoutListener >= 16)
        {
            a.k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            return;
        } else
        {
            a.k.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            return;
        }
    }

    public final void onGlobalLayout()
    {
        a();
        a.h = a.a(a.k);
        a.f();
    }

    r(TripReceiptActivity tripreceiptactivity)
    {
        a = tripreceiptactivity;
        super();
    }
}
