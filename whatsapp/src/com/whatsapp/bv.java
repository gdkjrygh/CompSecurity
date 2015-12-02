// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import java.io.File;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            App, VideoTimelineView

class bv extends AsyncTask
{

    final int a;
    final VideoTimelineView b;
    final float c;
    long d;
    final float e;

    bv(VideoTimelineView videotimelineview, float f, float f1, int i)
    {
        b = videotimelineview;
        e = f;
        c = f1;
        a = i;
        super();
    }

    protected Void a(Void avoid[])
    {
        MediaMetadataRetriever mediametadataretriever;
        RectF rectf;
        Rect rect;
        int i;
        int j;
        long l1;
        j = App.am;
        mediametadataretriever = new MediaMetadataRetriever();
        mediametadataretriever.setDataSource(VideoTimelineView.b(b).getAbsolutePath());
        l1 = Long.parseLong(mediametadataretriever.extractMetadata(9));
        d = System.currentTimeMillis();
        rectf = new RectF(0.0F, 0.0F, e, c);
        rect = new Rect();
        i = 0;
_L2:
        long l2;
        if (i >= a)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag;
        try
        {
            flag = isCancelled();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            throw avoid;
        }
        if (flag)
        {
            return null;
        }
        l2 = (1000L * l1 * (long)i) / (long)a;
        avoid = null;
        Object obj = mediametadataretriever.getFrameAtTime(l2);
        avoid = ((Void []) (obj));
_L3:
        float f;
        int k;
        int l;
        if (avoid == null)
        {
            break MISSING_BLOCK_LABEL_371;
        }
        k = avoid.getWidth();
        l = avoid.getHeight();
        f = k;
        if (f <= e)
        {
            break MISSING_BLOCK_LABEL_371;
        }
        float f1 = l;
        float f2;
        try
        {
            f2 = c;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            throw avoid;
        }
        if (f1 <= f2)
        {
            break MISSING_BLOCK_LABEL_371;
        }
        obj = Bitmap.createBitmap((int)e, (int)c, avoid.getConfig());
        if (k > l)
        {
            try
            {
                rect.top = 0;
                rect.bottom = l;
                rect.left = (k - l) / 2;
                rect.right = rect.left + l;
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                throw avoid;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_287;
            }
        }
        rect.left = 0;
        rect.right = k;
        rect.top = (l - k) / 2;
        rect.bottom = k + rect.top;
        (new Canvas(((Bitmap) (obj)))).drawBitmap(avoid, rect, rectf, VideoTimelineView.a(b));
_L4:
        if (obj != avoid)
        {
            try
            {
                avoid.recycle();
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                throw avoid;
            }
        }
        publishProgress(new Bitmap[] {
            obj
        });
        i++;
        if (j == 0) goto _L2; else goto _L1
_L1:
        mediametadataretriever.release();
        return null;
        obj;
          goto _L3
        obj;
          goto _L3
        obj = avoid;
          goto _L4
    }

    protected void a(Void void1)
    {
        b.invalidate();
    }

    protected void a(Bitmap abitmap[])
    {
        int j = App.am;
        int k = abitmap.length;
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            Bitmap bitmap = abitmap[i];
            VideoTimelineView.c(b).add(bitmap);
            i++;
        } while (j == 0);
        if (System.currentTimeMillis() > d + 500L)
        {
            d = System.currentTimeMillis();
            b.invalidate();
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onProgressUpdate(Object aobj[])
    {
        a((Bitmap[])aobj);
    }
}
