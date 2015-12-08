// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

// Referenced classes of package com.jiubang.core.a:
//            i, q

public class p extends i
{

    public p(Context context, int k, int l, int i1, int j1, Bitmap bitmap, int k1, 
            int l1)
    {
        super(context, k, l, i1, j1, bitmap, k1, l1);
    }

    protected void a(Canvas canvas, float f, int k, int l)
    {
        f = (float)l / 255F;
        i.setAlpha((int)(f * 255F * m.b()));
        if (i.getAlpha() != 0 && j != null)
        {
            canvas.drawBitmap(j, m.a(), i);
        }
    }

    public void j()
    {
        if (j != null && !j.isRecycled())
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
