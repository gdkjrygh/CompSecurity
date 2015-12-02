// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.format.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public final class dte
{

    private static final SimpleDateFormat a;
    private static final SimpleDateFormat b;
    private static final SimpleDateFormat c;
    private final Drawable d;
    private final Drawable e;
    private final Paint f = new Paint(1);
    private final Paint g = new Paint(1);
    private final String h;
    private final boolean i;
    private final int j;

    public dte(Context context)
    {
        i = DateFormat.is24HourFormat(context);
        h = context.getString(0x7f0702b3).toUpperCase(Locale.getDefault());
        Resources resources = context.getResources();
        d = resources.getDrawable(0x7f020285);
        e = resources.getDrawable(0x7f020284);
        j = resources.getDimensionPixelSize(0x7f0802d8);
        d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
        e.setBounds(0, 0, e.getIntrinsicWidth(), e.getIntrinsicHeight());
        f.setColor(-1);
        f.setTypeface(hoq.a(context, 0x7f070699));
        f.setTextSize(resources.getDimensionPixelSize(0x7f08024d));
        f.setTextAlign(android.graphics.Paint.Align.CENTER);
        g.setColor(-1);
        g.setTypeface(hoq.a(context, 0x7f070695));
        g.setTextSize(resources.getDimensionPixelSize(0x7f08024e));
        g.setTextAlign(android.graphics.Paint.Align.CENTER);
    }

    private Bitmap a(Drawable drawable, String s, String s1)
    {
        Paint paint = f;
        Paint paint2 = g;
        Object obj = drawable.getBounds();
        Rect rect = new Rect();
        paint.getTextBounds(s, 0, s.length(), rect);
        Rect rect1 = new Rect();
        if (!TextUtils.isEmpty(s1))
        {
            paint2.getTextBounds(s1, 0, s1.length(), rect1);
        }
        Bitmap bitmap = Bitmap.createBitmap(((Rect) (obj)).width(), ((Rect) (obj)).height(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Rect rect2 = new Rect();
        drawable.getPadding(rect2);
        rect2 = new Rect(rect2.left, rect2.top, ((Rect) (obj)).width() - rect2.right, ((Rect) (obj)).height() - rect2.bottom);
        obj = new Paint(paint);
        do
        {
label0:
            {
                Paint paint1 = ((Paint) (obj));
                float f1;
                if (rect.width() > rect2.width())
                {
                    f1 = ((Paint) (obj)).getTextSize() - 0.5F;
                    if (f1 > 0.0F)
                    {
                        break label0;
                    }
                    paint1 = f;
                }
                drawable.draw(canvas);
                canvas.translate(rect2.left, rect2.top);
                int l = rect.height() + rect1.height();
                int k = l;
                if (!TextUtils.isEmpty(s1))
                {
                    k = l + j;
                }
                if (!TextUtils.isEmpty(s1))
                {
                    f1 = (float)rect2.width() / 2.0F;
                    float f3 = ((float)rect2.height() / 2.0F - (float)k / 2.0F) + (float)rect.height();
                    canvas.drawText(s, f1, f3, paint1);
                    canvas.drawText(s1, (float)rect2.width() / 2.0F, f3 + (float)(rect1.height() + j), paint2);
                    return bitmap;
                } else
                {
                    float f2 = (float)rect2.width() / 2.0F;
                    float f4 = (float)rect2.height() / 2.0F;
                    canvas.drawText(s, f2, (float)k / 2.0F + f4, paint1);
                    return bitmap;
                }
            }
            ((Paint) (obj)).setTextSize(f1);
            ((Paint) (obj)).getTextBounds(s, 0, s.length(), rect);
        } while (true);
    }

    public final Bitmap a(int k, boolean flag)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, k);
        Object obj = calendar.getTime();
        if (flag)
        {
            if (i)
            {
                String s = b.format(((java.util.Date) (obj)));
                return a(e, s, null);
            } else
            {
                String s1 = a.format(((java.util.Date) (obj)));
                obj = c.format(((java.util.Date) (obj)));
                return a(e, s1, ((String) (obj)));
            }
        } else
        {
            k /= 60;
            return a(e, String.valueOf(k), h);
        }
    }

    public final Bitmap a(String s)
    {
        int k;
        if (!TextUtils.isEmpty(s))
        {
            if ((k = s.indexOf(" ")) > 0)
            {
                return a(d, s.substring(0, k), h);
            }
        }
        return null;
    }

    static 
    {
        a = new SimpleDateFormat("h:mm", Locale.US);
        b = new SimpleDateFormat("H:mm", Locale.US);
        c = new SimpleDateFormat("aa", Locale.US);
    }
}
