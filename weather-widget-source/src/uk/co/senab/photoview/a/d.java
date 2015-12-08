// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview.a;

import android.view.ScaleGestureDetector;

// Referenced classes of package uk.co.senab.photoview.a:
//            c, f

class d
    implements android.view.ScaleGestureDetector.OnScaleGestureListener
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        a.a.a(scalegesturedetector.getScaleFactor(), scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
    }
}
