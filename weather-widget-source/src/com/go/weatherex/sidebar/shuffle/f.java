// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.Window;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.jiubang.commerce.utils.b;
import com.jiubang.commerce.utils.k;
import java.lang.reflect.Method;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            b, ShuffleLoadingActivity

public class f
{

    private static final int a = com.go.weatherex.sidebar.shuffle.b.a(24F);
    private static final int b = com.go.weatherex.sidebar.shuffle.b.a(16F);
    private static final int c = com.go.weatherex.sidebar.shuffle.b.a(3F);
    private static final int d = com.go.weatherex.sidebar.shuffle.b.b(9F);
    private static final int e = com.go.weatherex.sidebar.shuffle.b.a(1.0F);
    private static final int f = com.go.weatherex.sidebar.shuffle.b.a(1.0F);
    private static Paint g;
    private static Canvas h;
    private static int i;

    public static Bitmap a(int j)
    {
        Bitmap bitmap = Bitmap.createBitmap(a, b, android.graphics.Bitmap.Config.ARGB_8888);
        Paint paint = b();
        paint.setColor(j);
        Canvas canvas = c();
        canvas.setBitmap(bitmap);
        canvas.drawRoundRect(new RectF(0.0F, 0.0F, a, b), c, c, paint);
        j = c + com.go.weatherex.sidebar.shuffle.b.a(1.0F);
        canvas.drawRect(new RectF(0.0F, 0.0F, j, j), paint);
        canvas.drawRect(new RectF(a - j, b - j, a, b), paint);
        new Paint();
        paint = new Paint();
        paint.reset();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setColor(-1);
        paint.setTextSize(d);
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        android.graphics.Paint.FontMetricsInt fontmetricsint = paint.getFontMetricsInt();
        paint.setShadowLayer(e, 0.0F, f, 0x99000000);
        canvas.drawText("AD", a / 2, ((b - fontmetricsint.bottom) + fontmetricsint.top) / 2 - fontmetricsint.top, paint);
        return bitmap;
    }

    public static Bitmap a(Bitmap bitmap, int j, int l, int i1)
    {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap bitmap1 = Bitmap.createBitmap(j, l, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        canvas.drawRoundRect(new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight() + i1), i1, i1, paint);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, paint);
        return bitmap1;
    }

    public static Bitmap a(Drawable drawable)
    {
        int j;
        int l;
        if (drawable == null)
        {
            return null;
        }
        j = drawable.getIntrinsicWidth();
        l = drawable.getIntrinsicHeight();
        Object obj;
        if (drawable.getOpacity() == -1)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        obj = android.graphics.Bitmap.Config.ARGB_8888;
_L1:
        obj = Bitmap.createBitmap(j, l, ((android.graphics.Bitmap.Config) (obj)));
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        drawable.setBounds(0, 0, j, l);
        drawable.draw(canvas);
        return ((Bitmap) (obj));
        try
        {
            obj = android.graphics.Bitmap.Config.RGB_565;
        }
        // Misplaced declaration of an exception variable
        catch (Drawable drawable)
        {
            return null;
        }
          goto _L1
    }

    public static BitmapDrawable a(Context context, Drawable drawable, int j, int l)
    {
        if (drawable != null)
        {
            int i1 = drawable.getIntrinsicWidth();
            int j1 = drawable.getIntrinsicHeight();
            Matrix matrix;
            if (drawable instanceof BitmapDrawable)
            {
                drawable = ((BitmapDrawable)drawable).getBitmap();
            } else
            {
                drawable = a(drawable);
            }
            matrix = new Matrix();
            matrix.postScale((float)j / (float)i1, (float)l / (float)j1);
            drawable = Bitmap.createBitmap(drawable, 0, 0, i1, j1, matrix, true);
            return new BitmapDrawable(context.getResources(), drawable);
        } else
        {
            return null;
        }
    }

    public static void a(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            return;
        }
        Class class1 = Integer.TYPE;
        Class class2 = Integer.TYPE;
        try
        {
            android/view/Window.getMethod("setFlags", new Class[] {
                class1, class2
            }).invoke(activity.getWindow(), new Object[] {
                Integer.valueOf(0x1000000), Integer.valueOf(0x1000000)
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return;
        }
    }

    public static void a(String s)
    {
        if (k.a(GoWidgetApplication.b()))
        {
            Intent intent = new Intent(GoWidgetApplication.b(), com/go/weatherex/sidebar/shuffle/ShuffleLoadingActivity);
            intent.putExtra("facebook_id", s);
            intent.setFlags(0x10000000);
            GoWidgetApplication.b().startActivity(intent);
            return;
        } else
        {
            Toast.makeText(GoWidgetApplication.b(), 0x7f08023d, 0).show();
            return;
        }
    }

    public static boolean a()
    {
        boolean flag2 = false;
        boolean flag3 = com.jiubang.commerce.utils.b.a(GoWidgetApplication.b(), "com.facebook.katana");
        boolean flag;
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag2;
        if (a(((Context) (GoWidgetApplication.b()))))
        {
            flag1 = flag2;
            if (flag3)
            {
                flag1 = flag2;
                if (flag)
                {
                    flag1 = true;
                }
            }
        }
        return flag1;
    }

    private static boolean a(Context context)
    {
        if (context != null)
        {
            context = (ConnectivityManager)context.getSystemService("connectivity");
            if (context != null)
            {
                context = context.getActiveNetworkInfo();
                if (context != null && context.isConnected())
                {
                    return true;
                }
            }
        }
        return false;
    }

    private static Paint b()
    {
        if (g == null)
        {
            g = new Paint();
            g.reset();
            g.setAntiAlias(true);
            g.setFilterBitmap(true);
        }
        return g;
    }

    private static Canvas c()
    {
        if (h == null)
        {
            h = new Canvas();
            i = h.getSaveCount();
            h.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        }
        if (i != h.getSaveCount())
        {
            h.restoreToCount(i);
        }
        return h;
    }

}
