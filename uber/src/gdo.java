// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.widget.ViewDragHelper;
import android.view.View;
import com.ubercab.client.feature.trip.slider.SlidePanelLayout;

public final class gdo extends android.support.v4.widget.ViewDragHelper.Callback
{

    final SlidePanelLayout a;

    private gdo(SlidePanelLayout slidepanellayout)
    {
        a = slidepanellayout;
        super();
    }

    public gdo(SlidePanelLayout slidepanellayout, byte byte0)
    {
        this(slidepanellayout);
    }

    public final int clampViewPositionVertical(View view, int i, int j)
    {
        j = SlidePanelLayout.b(a, 0.0F);
        return Math.min(Math.max(i, SlidePanelLayout.b(a, 1.0F)), j);
    }

    public final int getViewVerticalDragRange(View view)
    {
        return SlidePanelLayout.c(a);
    }

    public final void onViewPositionChanged(View view, int i, int j, int k, int l)
    {
        float f = SlidePanelLayout.a(a, j);
        if (SlidePanelLayout.b(a) == f)
        {
            return;
        } else
        {
            SlidePanelLayout.a(a, f);
            SlidePanelLayout.b(a, l);
            a.invalidate();
            return;
        }
    }

    public final void onViewReleased(View view, float f, float f1)
    {
        f = -f1;
        int i;
        if (f > 0.0F)
        {
            i = SlidePanelLayout.b(a, 1.0F);
        } else
        if (f < 0.0F)
        {
            i = SlidePanelLayout.b(a, 0.0F);
        } else
        {
            i = SlidePanelLayout.b(a, SlidePanelLayout.d(a));
        }
        SlidePanelLayout.e(a).settleCapturedViewAt(view.getLeft(), i);
        a.invalidate();
    }

    public final boolean tryCaptureView(View view, int i)
    {
        return view == SlidePanelLayout.a(a);
    }
}
