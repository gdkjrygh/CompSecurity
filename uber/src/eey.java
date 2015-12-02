// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.View;
import android.widget.FrameLayout;
import com.ubercab.client.feature.mobilemessage.MobileMessageDraggableLayout;

public final class eey extends android.support.v4.widget.ViewDragHelper.Callback
{

    final MobileMessageDraggableLayout a;

    private eey(MobileMessageDraggableLayout mobilemessagedraggablelayout)
    {
        a = mobilemessagedraggablelayout;
        super();
    }

    public eey(MobileMessageDraggableLayout mobilemessagedraggablelayout, byte byte0)
    {
        this(mobilemessagedraggablelayout);
    }

    public final int clampViewPositionVertical(View view, int i, int j)
    {
        j = -MobileMessageDraggableLayout.b(a).getHeight();
        int k = a.getHeight();
        return Math.min(Math.max(i, j), k);
    }

    public final int getViewVerticalDragRange(View view)
    {
        return a.getHeight();
    }

    public final void onViewPositionChanged(View view, int i, int j, int k, int l)
    {
        if (!MobileMessageDraggableLayout.g(a) || MobileMessageDraggableLayout.h(a) == null) goto _L2; else goto _L1
_L1:
        if (j > -view.getHeight()) goto _L4; else goto _L3
_L3:
        MobileMessageDraggableLayout.h(a).p_();
        MobileMessageDraggableLayout.i(a);
_L2:
        a.invalidate();
        return;
_L4:
        if (j >= a.getHeight())
        {
            MobileMessageDraggableLayout.h(a).q_();
            MobileMessageDraggableLayout.i(a);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void onViewReleased(View view, float f, float f1)
    {
        int i = MobileMessageDraggableLayout.c(a) - view.getTop();
        if ((Math.abs(f1) >= MobileMessageDraggableLayout.d(a) || Math.abs(i) > MobileMessageDraggableLayout.c()) && Math.abs(f1) < MobileMessageDraggableLayout.e(a)) goto _L2; else goto _L1
_L1:
        MobileMessageDraggableLayout.f(a).settleCapturedViewAt(MobileMessageDraggableLayout.b(a).getLeft(), MobileMessageDraggableLayout.c(a));
_L4:
        ViewCompat.postInvalidateOnAnimation(view);
        a.invalidate();
        return;
_L2:
        if (f1 > MobileMessageDraggableLayout.d(a) || i < MobileMessageDraggableLayout.c() && Math.abs(f1) < MobileMessageDraggableLayout.d(a))
        {
            MobileMessageDraggableLayout.f(a).smoothSlideViewTo(MobileMessageDraggableLayout.b(a), MobileMessageDraggableLayout.b(a).getLeft(), a.getHeight() + MobileMessageDraggableLayout.d());
        } else
        if (f1 < -MobileMessageDraggableLayout.d(a) || i > MobileMessageDraggableLayout.c() && Math.abs(f1) < MobileMessageDraggableLayout.d(a))
        {
            MobileMessageDraggableLayout.f(a).smoothSlideViewTo(MobileMessageDraggableLayout.b(a), MobileMessageDraggableLayout.b(a).getLeft(), -MobileMessageDraggableLayout.b(a).getHeight() - MobileMessageDraggableLayout.d());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean tryCaptureView(View view, int i)
    {
        return !MobileMessageDraggableLayout.a(a) && view == MobileMessageDraggableLayout.b(a);
    }
}
