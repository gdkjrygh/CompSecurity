// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.graphics.Point;
import android.util.Log;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            ImgReviewEditCntrl

public class a extends android.view.istener
{

    final ImgReviewEditCntrl a;

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        float f = a.scaleGestureDetector.getScaleFactor();
        ImgReviewEditCntrl.a(a, f * ImgReviewEditCntrl.a(a));
        Log.i("Zoom", (new StringBuilder()).append("focus.x= ").append(scalegesturedetector.getFocusX()).append(" focus.y = ").append(scalegesturedetector.getFocusY()).toString());
        scalegesturedetector = new Point((int)scalegesturedetector.getFocusX(), (int)scalegesturedetector.getFocusY());
        if (ImgReviewEditCntrl.b(a) != ImgReviewEditCntrl.c(a))
        {
            ImgReviewEditCntrl.a(a, true);
        }
        if (ImgReviewEditCntrl.d(a))
        {
            ImgReviewEditCntrl.a(a, false);
            ImgReviewEditCntrl.a(a, ImgReviewEditCntrl.b(a, scalegesturedetector));
        }
        if (ImgReviewEditCntrl.a(a) < 1.0F)
        {
            ImgReviewEditCntrl.a(a, 1.0F);
        }
        if (ImgReviewEditCntrl.a(a) > 3F)
        {
            ImgReviewEditCntrl.a(a, 3F);
        }
        if (ImgReviewEditCntrl.a(a) == 1.0F)
        {
            ImgReviewEditCntrl.e(a).x = 0;
            ImgReviewEditCntrl.e(a).y = 0;
            ImgReviewEditCntrl.a(a, 0);
            Log.i("State", (new StringBuilder()).append("state = ").append(ImgReviewEditCntrl.f(a)).toString());
            ImgReviewEditCntrl.b(a, false);
        }
        ImgReviewEditCntrl.b(a, ImgReviewEditCntrl.a(a));
        Point point = ImgReviewEditCntrl.c(a, ImgReviewEditCntrl.g(a));
        scalegesturedetector = new Point(((Point) (scalegesturedetector)).x - point.x, ((Point) (scalegesturedetector)).y - point.y);
        point = ImgReviewEditCntrl.e(a);
        point.x = point.x + ((Point) (scalegesturedetector)).x;
        point = ImgReviewEditCntrl.e(a);
        point.y = point.y + ((Point) (scalegesturedetector)).y;
        ImgReviewEditCntrl.b(a, ImgReviewEditCntrl.c(a));
        Log.i("State", (new StringBuilder()).append("prevnumtouches = ").append(ImgReviewEditCntrl.b(a)).append(" numtouches = ").append(ImgReviewEditCntrl.c(a)).toString());
        a.invalidate();
        return true;
    }

    public (ImgReviewEditCntrl imgrevieweditcntrl)
    {
        a = imgrevieweditcntrl;
        super();
    }
}
