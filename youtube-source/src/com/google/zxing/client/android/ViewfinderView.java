// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.client.android.a.c;
import com.google.zxing.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.zxing.client.android:
//            i

public final class ViewfinderView extends View
{

    private static final int a[] = {
        0, 64, 128, 192, 255, 192, 128, 64
    };
    private c b;
    private final Paint c = new Paint(1);
    private Bitmap d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private int j;
    private List k;
    private List l;

    public ViewfinderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = getResources();
        e = context.getColor(com.google.zxing.client.android.i.g);
        f = context.getColor(i.d);
        g = context.getColor(i.e);
        h = context.getColor(i.f);
        i = context.getColor(i.a);
        j = 0;
        k = new ArrayList(5);
        l = null;
    }

    public final void a()
    {
        Bitmap bitmap = d;
        d = null;
        if (bitmap != null)
        {
            bitmap.recycle();
        }
        invalidate();
    }

    public final void a(g g1)
    {
        List list = k;
        g1;
        JVM INSTR monitorenter ;
        int i1;
        list.add(g1);
        i1 = list.size();
        if (i1 <= 20)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        list.subList(0, i1 - 10).clear();
        g1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        g1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onDraw(Canvas canvas)
    {
        float f1;
        float f2;
        Rect rect;
        Object obj;
        Object obj1;
        int i1;
        int j1;
        rect = b.d();
        if (rect == null)
        {
            return;
        }
        j1 = canvas.getWidth();
        int k1 = canvas.getHeight();
        obj = c;
        if (d != null)
        {
            i1 = f;
        } else
        {
            i1 = e;
        }
        ((Paint) (obj)).setColor(i1);
        canvas.drawRect(0.0F, 0.0F, j1, rect.top, c);
        canvas.drawRect(0.0F, rect.top, rect.left, rect.bottom + 1, c);
        canvas.drawRect(rect.right + 1, rect.top, j1, rect.bottom + 1, c);
        canvas.drawRect(0.0F, rect.bottom + 1, j1, k1, c);
        if (d != null)
        {
            c.setAlpha(160);
            canvas.drawBitmap(d, null, rect, c);
            return;
        }
        c.setColor(g);
        canvas.drawRect(rect.left, rect.top, rect.right + 1, rect.top + 2, c);
        canvas.drawRect(rect.left, rect.top + 2, rect.left + 2, rect.bottom - 1, c);
        canvas.drawRect(rect.right - 1, rect.top, rect.right + 1, rect.bottom - 1, c);
        canvas.drawRect(rect.left, rect.bottom - 1, rect.right + 1, rect.bottom + 1, c);
        c.setColor(h);
        c.setAlpha(a[j]);
        j = (j + 1) % a.length;
        i1 = rect.height() / 2 + rect.top;
        canvas.drawRect(rect.left + 2, i1 - 1, rect.right - 1, i1 + 2, c);
        obj = b.e();
        f1 = (float)rect.width() / (float)((Rect) (obj)).width();
        f2 = (float)rect.height() / (float)((Rect) (obj)).height();
        obj1 = k;
        obj = l;
        i1 = rect.left;
        j1 = rect.top;
        if (!((List) (obj1)).isEmpty()) goto _L2; else goto _L1
_L1:
        l = null;
_L6:
        if (obj == null) goto _L4; else goto _L3
_L3:
        c.setAlpha(80);
        c.setColor(i);
        obj;
        JVM INSTR monitorenter ;
        g g1;
        for (obj1 = ((List) (obj)).iterator(); ((Iterator) (obj1)).hasNext(); canvas.drawCircle((int)(g1.a() * f1) + i1, (int)(g1.b() * f2) + j1, 3F, c))
        {
            g1 = (g)((Iterator) (obj1)).next();
        }

          goto _L5
        canvas;
        throw canvas;
_L2:
        k = new ArrayList(5);
        l = ((List) (obj1));
        c.setAlpha(160);
        c.setColor(i);
        obj1;
        JVM INSTR monitorenter ;
        g g2;
        for (Iterator iterator = ((List) (obj1)).iterator(); iterator.hasNext(); canvas.drawCircle((int)(g2.a() * f1) + i1, (int)(g2.b() * f2) + j1, 6F, c))
        {
            g2 = (g)iterator.next();
        }

        break MISSING_BLOCK_LABEL_746;
        canvas;
        throw canvas;
        obj1;
        JVM INSTR monitorexit ;
          goto _L6
_L5:
        obj;
        JVM INSTR monitorexit ;
_L4:
        postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        return;
    }

    public final void setCameraManager(c c1)
    {
        b = c1;
    }

}
