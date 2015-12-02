// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.view.View;
import java.io.File;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            App, bv

public class VideoTimelineView extends View
{

    private File a;
    private Rect b;
    private AsyncTask c;
    private RectF d;
    private Paint e;
    private ArrayList f;
    private int g;

    public VideoTimelineView(Context context)
    {
        super(context);
        e = new Paint(1);
        d = new RectF();
        b = new Rect();
    }

    static Paint a(VideoTimelineView videotimelineview)
    {
        return videotimelineview.e;
    }

    static File b(VideoTimelineView videotimelineview)
    {
        return videotimelineview.a;
    }

    static ArrayList c(VideoTimelineView videotimelineview)
    {
        return videotimelineview.f;
    }

    protected void onDraw(Canvas canvas)
    {
        int k;
        k = App.am;
        super.onDraw(canvas);
        if (a != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (g != getWidth())
        {
            g = getWidth();
            f = null;
            if (c != null)
            {
                c.cancel(true);
                c = null;
            }
        }
        if (f != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (c != null) goto _L1; else goto _L3
_L3:
        int i = getWidth() / getHeight();
        float f1 = getHeight();
        float f3 = (float)getWidth() / (float)i;
        f = new ArrayList(i);
        c = new bv(this, f3, f1, i);
        c.execute(new Void[0]);
        if (k == 0) goto _L1; else goto _L4
_L4:
        float f2;
        int j;
        j = getWidth() / getHeight();
        f2 = (float)getWidth() / (float)j;
        d.top = 0.0F;
        d.bottom = getHeight();
        j = 0;
_L7:
        if (j >= f.size()) goto _L1; else goto _L5
_L5:
        Bitmap bitmap;
label0:
        {
            d.left = (float)j * f2;
            d.right = d.left + f2;
            bitmap = (Bitmap)f.get(j);
            if (bitmap == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            int l = bitmap.getWidth();
            int i1 = bitmap.getHeight();
            if (l > i1)
            {
                b.top = 0;
                b.bottom = i1;
                b.left = (l - i1) / 2;
                b.right = b.left + i1;
                if (k == 0)
                {
                    break label0;
                }
            }
            b.left = 0;
            b.right = l;
            b.top = (i1 - l) / 2;
            b.bottom = l + b.top;
        }
        canvas.drawBitmap(bitmap, b, d, e);
        if (k != 0) goto _L1; else goto _L6
_L6:
        j++;
          goto _L7
    }

    public void setVideoFile(File file)
    {
        a = file;
        f = null;
        if (c != null)
        {
            c.cancel(true);
            c = null;
        }
        invalidate();
    }
}
