// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.View;
import android.widget.FrameLayout;
import com.ubercab.client.feature.trip.capacity.CapacityDraggableLayout;

public final class fug extends android.support.v4.widget.ViewDragHelper.Callback
{

    final CapacityDraggableLayout a;

    public fug(CapacityDraggableLayout capacitydraggablelayout)
    {
        a = capacitydraggablelayout;
        super();
    }

    public final int clampViewPositionVertical(View view, int i, int j)
    {
        j = a.getHeight();
        int k = a.mContentContainer.getHeight();
        int l = a.getHeight();
        return Math.min(Math.max(i, j - k), l);
    }

    public final int getViewVerticalDragRange(View view)
    {
        return a.mContentContainer.getHeight();
    }

    public final void onViewPositionChanged(View view, int i, int j, int k, int l)
    {
        if (CapacityDraggableLayout.e(a) && CapacityDraggableLayout.f(a) != null && j >= a.getHeight())
        {
            CapacityDraggableLayout.f(a).o_();
            CapacityDraggableLayout.g(a);
        }
        a.invalidate();
    }

    public final void onViewReleased(View view, float f, float f1)
    {
        int i = CapacityDraggableLayout.b(a) - view.getTop();
        if ((Math.abs(f1) >= CapacityDraggableLayout.c(a) || Math.abs(i) > CapacityDraggableLayout.a) && Math.abs(f1) < CapacityDraggableLayout.d(a)) goto _L2; else goto _L1
_L1:
        a.c.settleCapturedViewAt(a.mContentContainer.getLeft(), CapacityDraggableLayout.b(a));
_L4:
        ViewCompat.postInvalidateOnAnimation(view);
        a.invalidate();
        return;
_L2:
        if (f1 > CapacityDraggableLayout.c(a) || Math.abs(i) > CapacityDraggableLayout.a && Math.abs(f1) < CapacityDraggableLayout.c(a))
        {
            a.c.smoothSlideViewTo(a.mContentContainer, a.mContentContainer.getLeft(), a.getHeight());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean tryCaptureView(View view, int i)
    {
        return !CapacityDraggableLayout.a(a) && view == a.mContentContainer;
    }
}
