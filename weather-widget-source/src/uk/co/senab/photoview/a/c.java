// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

// Referenced classes of package uk.co.senab.photoview.a:
//            b, d

public class c extends b
{

    protected final ScaleGestureDetector f;

    public c(Context context)
    {
        super(context);
        f = new ScaleGestureDetector(context, new d(this));
    }

    public boolean a()
    {
        return f.isInProgress();
    }

    public boolean c(MotionEvent motionevent)
    {
        f.onTouchEvent(motionevent);
        return super.c(motionevent);
    }
}
