// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.whatsapp:
//            PhotoView, MediaView

class it> extends PhotoView
{

    final MediaView Q;

    public boolean b(float f, float f1)
    {
        return super.b(f, f1);
    }

    public boolean c(float f, float f1)
    {
        return super.c(f, f1);
    }

    public boolean onDoubleTap(MotionEvent motionevent)
    {
        MediaView mediaview = Q;
        boolean flag;
        if (g() != h())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        MediaView.b(mediaview, flag);
        return super.onDoubleTap(motionevent);
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        MediaView.b(Q, false);
        return super.onScaleBegin(scalegesturedetector);
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        super.onScaleEnd(scalegesturedetector);
        scalegesturedetector = Q;
        boolean flag;
        if (g() == h())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        MediaView.b(scalegesturedetector, flag);
    }

    etector(MediaView mediaview, Context context)
    {
        Q = mediaview;
        super(context);
    }
}
