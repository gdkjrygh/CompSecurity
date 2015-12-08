// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.bitmaps;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.Log;
import com.squareup.picasso.Transformation;

// Referenced classes of package com.weather.util.bitmaps:
//            BitmapUtil

public final class CircleImageTransform
    implements Transformation
{

    private static final String TAG = "CircleImageTransform";
    private final String key;
    private final int size;

    public CircleImageTransform(int i)
    {
        key = (new StringBuilder()).append("circle_").append(i).toString();
        size = i;
    }

    private void drawImageCircle(Bitmap bitmap, Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0xff424242);
        Rect rect = new Rect(0, 0, size, size);
        Rect rect1 = getCenterRect(bitmap);
        float f = (float)((double)size / 2D);
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect1, rect, paint);
    }

    private Rect getCenterRect(Bitmap bitmap)
    {
        int i;
        int j;
        int k;
        int l;
        if (size >= bitmap.getWidth())
        {
            i = 0;
            j = bitmap.getWidth();
        } else
        {
            i = (bitmap.getWidth() - size) / 2;
            j = size;
        }
        if (size >= bitmap.getHeight())
        {
            l = 0;
            k = bitmap.getHeight();
        } else
        {
            l = (bitmap.getHeight() - size) / 2;
            k = size;
        }
        return new Rect(i, l, i + j, l + k);
    }

    public String key()
    {
        return key;
    }

    public Bitmap transform(Bitmap bitmap)
    {
        Bitmap bitmap1 = Bitmap.createBitmap(size, size, android.graphics.Bitmap.Config.ARGB_8888);
        Log.d("CircleImageTransform", (new StringBuilder()).append("transform: ").append(BitmapUtil.getBitMapInfo(bitmap1)).toString());
        Canvas canvas = new Canvas(bitmap1);
        canvas.drawARGB(0, 0, 0, 0);
        drawImageCircle(bitmap, canvas);
        bitmap.recycle();
        return bitmap1;
    }
}
