// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

// Referenced classes of package com.jiubang.core.a:
//            s

public class m extends s
{

    private Bitmap E;
    private boolean F;

    public m(Context context, int i, int k, int l, int i1, Bitmap bitmap, Bitmap bitmap1, 
            int j1, int k1)
    {
        super(context, i, k, l, i1, bitmap, j1, k1);
        F = false;
        E = bitmap1;
    }

    private void a(Bitmap bitmap, int i, int k, int l, int i1)
    {
        int j1 = ((int)((((float)bitmap.getHeight() * 1.0F) / (float)bitmap.getWidth()) * (float)(l - i)) - (i1 - k)) / 2;
        if (j1 > 0)
        {
            b(i, k - j1, l, j1 + i1);
            return;
        } else
        {
            int k1 = ((int)((((float)bitmap.getWidth() * 1.0F) / (float)bitmap.getHeight()) * (float)(i1 - k)) - (l - i)) / 2;
            b(i - k1, k, k1 + l, i1);
            return;
        }
    }

    public void a(int i, int k, int l, int i1)
    {
label0:
        {
            super.a(i, k, l, i1);
            if (j != null)
            {
                if (!F)
                {
                    b(i, k, l, i1);
                } else
                {
                    a(j, i, k, l, i1);
                }
            }
            if (E != null)
            {
                if (F)
                {
                    break label0;
                }
                b(i, k, l, i1);
            }
            return;
        }
        a(j, i, k, l, i1);
    }

    public void a(Canvas canvas, float f, float f1, float f2, int i, int k)
    {
        super.a(canvas, f, f1, f2, i, k);
        if (E != null)
        {
            i = this.i.getAlpha();
            this.i.setAlpha(k);
            canvas.drawBitmap(E, null, this.k, this.i);
            this.i.setAlpha(i);
        }
    }

    public void a(Canvas canvas, float f, float f1, float f2, int i, int k, boolean flag)
    {
        p = flag;
        super.a(canvas, f, f1, f2, i, k, flag);
        if (E != null)
        {
            i = this.i.getAlpha();
            this.i.setAlpha(k);
            canvas.drawBitmap(E, null, this.k, this.i);
            this.i.setAlpha(i);
        }
    }

    public void b(boolean flag)
    {
        F = flag;
    }

    public void j()
    {
        super.j();
        if (E != null && !E.isRecycled())
        {
            E.recycle();
            E = null;
        }
    }
}
