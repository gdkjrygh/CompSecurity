// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ortiz.touch;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

// Referenced classes of package com.ortiz.touch:
//            TouchImageView

private class <init>
    implements android.view.er
{

    private PointF last;
    final TouchImageView this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        PointF pointf;
        TouchImageView.access$1000(TouchImageView.this).onTouchEvent(motionevent);
        TouchImageView.access$1100(TouchImageView.this).onTouchEvent(motionevent);
        pointf = new PointF(motionevent.getX(), motionevent.getY());
        if (TouchImageView.access$600(TouchImageView.this) != this._fld0 && TouchImageView.access$600(TouchImageView.this) != this._fld0 && TouchImageView.access$600(TouchImageView.this) != this._fld0) goto _L2; else goto _L1
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 0 6: default 128
    //                   0 191
    //                   1 374
    //                   2 233
    //                   3 128
    //                   4 128
    //                   5 128
    //                   6 374;
           goto _L2 _L3 _L4 _L5 _L2 _L2 _L2 _L4
_L2:
        setImageMatrix(TouchImageView.access$1800(TouchImageView.this));
        if (TouchImageView.access$2000(TouchImageView.this) != null)
        {
            TouchImageView.access$2000(TouchImageView.this)._mth0(view, motionevent);
        }
        if (TouchImageView.access$2100(TouchImageView.this) != null)
        {
            TouchImageView.access$2100(TouchImageView.this).onMove();
        }
        return true;
_L3:
        last.set(pointf);
        if (TouchImageView.access$400(TouchImageView.this) != null)
        {
            TouchImageView.access$400(TouchImageView.this)._mth0();
        }
        TouchImageView.access$1200(TouchImageView.this, this._fld0);
        continue; /* Loop/switch isn't completed */
_L5:
        if (TouchImageView.access$600(TouchImageView.this) == this._fld0)
        {
            float f2 = pointf.x;
            float f3 = last.x;
            float f = pointf.y;
            float f1 = last.y;
            f2 = TouchImageView.access$1500(TouchImageView.this, f2 - f3, TouchImageView.access$1300(TouchImageView.this), TouchImageView.access$1400(TouchImageView.this));
            f = TouchImageView.access$1500(TouchImageView.this, f - f1, TouchImageView.access$1600(TouchImageView.this), TouchImageView.access$1700(TouchImageView.this));
            TouchImageView.access$1800(TouchImageView.this).postTranslate(f2, f);
            TouchImageView.access$1900(TouchImageView.this);
            last.set(pointf.x, pointf.y);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        TouchImageView.access$1200(TouchImageView.this, this._fld0);
        if (true) goto _L2; else goto _L6
_L6:
    }

    private r()
    {
        this$0 = TouchImageView.this;
        super();
        last = new PointF();
    }

    last(last last1)
    {
        this();
    }
}
