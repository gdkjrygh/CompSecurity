// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.MotionEvent;
import com.ubercab.client.feature.trip.overlay.HighlightOverlayView;
import java.util.Iterator;
import java.util.List;

public final class gcn extends android.view.GestureDetector.SimpleOnGestureListener
{

    final HighlightOverlayView a;

    public gcn(HighlightOverlayView highlightoverlayview)
    {
        a = highlightoverlayview;
        super();
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        if (a.a.isEmpty())
        {
            return false;
        }
        boolean flag = HighlightOverlayView.b(a).contains(Math.round(motionevent.getX()), Math.round(motionevent.getY()));
        for (motionevent = a.a.iterator(); motionevent.hasNext(); ((gcm)motionevent.next()).a(flag)) { }
        return true;
    }
}
