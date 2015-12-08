// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

// Referenced classes of package com.jiubang.core.a:
//            i, t

public class l extends i
{

    public l(Context context, int k, int i1, int j1, int k1, Bitmap bitmap, int l1, 
            int i2)
    {
        super(context, k, i1, j1, k1, bitmap, l1, i2);
    }

    protected void a(Canvas canvas, float f, int k, int i1)
    {
        if (j != null)
        {
            k = i.getAlpha();
            i.setAlpha(i1);
            if (!n.h() && !n.b())
            {
                canvas.drawBitmap(j, n.a(), n.g(), i);
            }
            if (!n.d() && !n.f())
            {
                canvas.drawBitmap(j, n.c(), n.e(), i);
            }
            i.setAlpha(k);
        }
    }

    public void j()
    {
        if (j != null && j.isRecycled())
        {
            j.recycle();
            j = null;
        }
    }

    public boolean u()
    {
        return t() != null;
    }
}
