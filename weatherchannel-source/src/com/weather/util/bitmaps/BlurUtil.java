// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.bitmaps;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.google.common.base.Preconditions;
import com.paveldudka.util.FastBlur;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.util.bitmaps:
//            BitmapUtil

public class BlurUtil
{

    private static final String TAG = "BlurUtil";

    private BlurUtil()
    {
    }

    public static Bitmap getBlurAsBitmap(Bitmap bitmap, float f, float f1, float f2, float f3, float f4, float f5, ColorFilter colorfilter)
    {
        int i = (int)(f / f4);
        Bitmap bitmap1;
        Canvas canvas;
        Paint paint;
        int j;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        j = (int)(f1 / f4);
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        bitmap1 = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        LogUtil.d("BlurUtil", LoggingMetaTags.TWC_UI, "getBlurAsBitmap: %s", new Object[] {
            BitmapUtil.getBitMapInfo(bitmap1)
        });
        canvas = new Canvas(bitmap1);
        canvas.translate(-f2 / f4, -f3 / f4);
        canvas.scale(1.0F / f4, 1.0F / f4);
        paint = new Paint();
        paint.setFlags(2);
        if (colorfilter != null)
        {
            paint.setColorFilter(colorfilter);
        }
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, paint);
        i = (int)f5;
        try
        {
            bitmap = FastBlur.doBlur(bitmap1, i, true);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            Log.e("BlurUtil", bitmap.toString(), bitmap);
            return bitmap1;
        }
        return bitmap;
    }

    public static BitmapDrawable getBlurAsCircularBitmapDrawable(Resources resources, Bitmap bitmap, float f, float f1, float f2, float f3, float f4, float f5)
    {
        bitmap = getBlurAsBitmap(bitmap, f, f1, f2, f3, f4, f5, null);
        Bitmap bitmap1 = Bitmap.createBitmap((int)f, (int)f1, android.graphics.Bitmap.Config.ARGB_8888);
        LogUtil.d("BlurUtil", LoggingMetaTags.TWC_UI, "getBlurAsCircularBitmapDrawable: %s", new Object[] {
            BitmapUtil.getBitMapInfo(bitmap1)
        });
        Canvas canvas = new Canvas(bitmap1);
        Object obj = new Path();
        ((Path) (obj)).addCircle(f / 2.0F, f1 / 2.0F, Math.min(f, f1) / 2.0F, android.graphics.Path.Direction.CCW);
        canvas.clipPath(((Path) (obj)));
        obj = new Paint();
        ((Paint) (obj)).setFlags(2);
        ((Paint) (obj)).setColorFilter(new PorterDuffColorFilter(0x4d808080, android.graphics.PorterDuff.Mode.SRC_OVER));
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, (int)f, (int)f1), ((Paint) (obj)));
        return new BitmapDrawable(resources, bitmap1);
    }

    private static void setBackground(View view, Drawable drawable)
    {
        view.setBackground(drawable);
    }

    private static void setBackgroundDrawable(View view, Drawable drawable)
    {
        view.setBackgroundDrawable(drawable);
    }

    public static void setBackgroundOfView(View view, Drawable drawable)
    {
        Preconditions.checkNotNull(view);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            setBackground(view, drawable);
            return;
        } else
        {
            setBackgroundDrawable(view, drawable);
            return;
        }
    }
}
