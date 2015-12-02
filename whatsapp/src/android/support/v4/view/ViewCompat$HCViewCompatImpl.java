// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewCompatHC

class _cls9 extends _cls9
{

    long getFrameTime()
    {
        return ViewCompatHC.getFrameTime();
    }

    public int getLayerType(View view)
    {
        return ViewCompatHC.getLayerType(view);
    }

    public float getScaleX(View view)
    {
        return ViewCompatHC.getScaleX(view);
    }

    public void setLayerPaint(View view, Paint paint)
    {
        setLayerType(view, getLayerType(view), paint);
        view.invalidate();
    }

    public void setLayerType(View view, int i, Paint paint)
    {
        ViewCompatHC.setLayerType(view, i, paint);
    }

    public void setScaleX(View view, float f)
    {
        ViewCompatHC.setScaleX(view, f);
    }

    public void setScaleY(View view, float f)
    {
        ViewCompatHC.setScaleY(view, f);
    }

    _cls9()
    {
    }
}
