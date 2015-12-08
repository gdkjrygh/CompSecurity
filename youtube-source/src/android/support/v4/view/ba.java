// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            az

class ba extends az
{

    ba()
    {
    }

    final long a()
    {
        return ValueAnimator.getFrameDelay();
    }

    public final void a(View view, int i, Paint paint)
    {
        view.setLayerType(i, paint);
    }

    public void a(View view, Paint paint)
    {
        a(view, view.getLayerType(), paint);
        view.invalidate();
    }

    public final int d(View view)
    {
        return view.getLayerType();
    }
}
