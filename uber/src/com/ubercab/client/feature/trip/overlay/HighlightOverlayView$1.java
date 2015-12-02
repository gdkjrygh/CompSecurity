// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.overlay;

import android.graphics.Rect;

// Referenced classes of package com.ubercab.client.feature.trip.overlay:
//            HighlightOverlayView, RectangleClipView

final class a
    implements Runnable
{

    final Rect a;
    final HighlightOverlayView b;

    public final void run()
    {
        HighlightOverlayView.a(b, a);
        int i = HighlightOverlayView.a(b)[1];
        Rect rect = HighlightOverlayView.b(b);
        rect.top = rect.top - i;
        rect = HighlightOverlayView.b(b);
        rect.bottom = rect.bottom - i;
        boolean flag = HighlightOverlayView.a(HighlightOverlayView.b(b), b.getMeasuredHeight());
        HighlightOverlayView.a(flag, b.mContainer, b.mTextContainer, b.mCoachPathView, b.getResources());
        b.mRectangleClipView.a(HighlightOverlayView.b(b));
        HighlightOverlayView.c(b);
        HighlightOverlayView.a(b, HighlightOverlayView.b(b), b.mContainer, flag);
    }

    (HighlightOverlayView highlightoverlayview, Rect rect)
    {
        b = highlightoverlayview;
        a = rect;
        super();
    }
}
