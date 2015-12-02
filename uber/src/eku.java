// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.ubercab.client.feature.notification.model.TripNotificationData;
import java.io.IOException;
import java.util.Locale;

public final class eku
{

    private final cgh a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final Paint j = new Paint(1);
    private final Paint k = new Paint(1);
    private final Paint l = new Paint(1);
    private final Paint m = new Paint(1);
    private final Paint n = new Paint(1);
    private final Paint o = new Paint(1);
    private final Paint p = new Paint(1);
    private final Bitmap q;
    private final Context r;

    public eku(Context context, cgh cgh1)
    {
        r = context;
        a = cgh1;
        cgh1 = context.getResources();
        b = cgh1.getDimensionPixelSize(0x7f080113);
        c = cgh1.getDimensionPixelSize(0x7f080114);
        d = cgh1.getDimensionPixelSize(0x7f08011d);
        e = cgh1.getDimensionPixelSize(0x7f080115);
        h = cgh1.getDimensionPixelSize(0x7f080117);
        f = cgh1.getColor(0x7f0d0074);
        q = ((BitmapDrawable)cgh1.getDrawable(0x7f020088)).getBitmap();
        int i1 = cgh1.getColor(0x7f0d008b);
        android.graphics.Typeface typeface = hoq.b(context);
        j.setColor(cgh1.getColor(0x7f0d0071));
        j.setStyle(android.graphics.Paint.Style.FILL);
        int j1 = cgh1.getDimensionPixelSize(0x7f08011b);
        l.setTypeface(typeface);
        l.setColor(i1);
        l.setTextSize(j1);
        j1 = cgh1.getDimensionPixelSize(0x7f08011c);
        k.setTypeface(typeface);
        k.setColor(i1);
        k.setTextSize(j1);
        i1 = cgh1.getColor(0x7f0d008e);
        m.setStyle(android.graphics.Paint.Style.FILL);
        m.setColor(i1);
        j1 = cgh1.getDimensionPixelOffset(0x7f080118);
        n.setStyle(android.graphics.Paint.Style.STROKE);
        n.setStrokeWidth(j1);
        n.setColor(i1);
        j1 = cgh1.getDimensionPixelSize(0x7f080119);
        o.setTypeface(typeface);
        o.setTextSize(j1);
        o.setColor(i1);
        j1 = cgh1.getDimensionPixelSize(0x7f08011a);
        p.setTypeface(typeface);
        p.setTextSize(j1);
        p.setColor(i1);
        cgh1 = new Rect();
        o.getTextBounds("W", 0, 1, cgh1);
        g = cgh1.height();
        i = context.getResources().getDimensionPixelSize(0x7f080116);
    }

    static Context a(eku eku1)
    {
        return eku1.r;
    }

    private Bitmap a(String s, int i1, int j1)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        Bitmap bitmap;
        try
        {
            bitmap = a.a(s).b(i1, j1).c().g();
        }
        catch (IOException ioexception)
        {
            ijg.a(ioexception, (new StringBuilder("Failed to load bitmap for notification: ")).append(s).toString(), new Object[0]);
            return null;
        }
        return bitmap;
    }

    private Paint a(Bitmap bitmap, float f1, float f2)
    {
        bitmap = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        Object obj = new Matrix();
        ((Matrix) (obj)).setTranslate(f1 - (float)e, f2 - (float)e);
        bitmap.setLocalMatrix(((Matrix) (obj)));
        obj = new Paint(1);
        ((Paint) (obj)).setShader(bitmap);
        return ((Paint) (obj));
    }

    private void a(Canvas canvas, Paint paint, float f1, float f2, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            Rect rect = new Rect();
            paint.getTextBounds(s, 0, s.length(), rect);
            canvas.drawText(s, f1 - (float)rect.width() / 2.0F - (float)rect.left, (float)e + f2 + (float)h + (float)g, paint);
            return;
        }
    }

    private int b()
    {
        return e;
    }

    private int c()
    {
        return cwt.j(r).x;
    }

    public final int a()
    {
        return i;
    }

    public final Bitmap a(int i1)
    {
        int j1 = i;
        int k1 = i;
        String s = String.valueOf(i1);
        String s1 = r.getString(0x7f0702b3).toUpperCase(Locale.getDefault());
        Bitmap bitmap = Bitmap.createBitmap(j1, k1, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawOval(new RectF(0.0F, 0.0F, j1, k1), j);
        Rect rect = new Rect();
        k.getTextBounds(s, 0, s.length(), rect);
        Rect rect1 = new Rect();
        l.getTextBounds(s1, 0, s1.length(), rect1);
        i1 = rect.height();
        int l1 = rect1.height();
        int i2 = c;
        float f1 = (float)j1 / 2.0F;
        float f2 = (float)k1 / 2.0F - (float)(i2 + i1 + l1) / 2.0F;
        canvas.drawText(s, f1 - (float)rect.width() / 2.0F - (float)rect.left, (float)i1 + f2, k);
        float f3 = c + i1;
        canvas.drawText(s1, f1 - (float)rect1.width() / 2.0F - (float)rect1.left, f2 + f3 + (float)l1, l);
        return bitmap;
    }

    public final Bitmap a(TripNotificationData tripnotificationdata, boolean flag)
    {
        int i1 = c();
        int j1 = d;
        int k1 = b() * 2;
        Object obj = a(tripnotificationdata.getVehiclePhotoUrl(), k1);
        if (obj == null)
        {
            obj = a(tripnotificationdata.getVehicleViewMonoImageUrl(), k1, false);
        }
        Bitmap bitmap1 = a(tripnotificationdata.getDriverPhotoUrl(), k1);
        Bitmap bitmap = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(f);
        Paint paint1 = new Paint();
        paint1.setShader(new BitmapShader(q, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.REPEAT));
        canvas.drawRect(0.0F, 0.0F, i1, j1, paint1);
        if (flag)
        {
            canvas.translate(0.0F, -(b / 2));
        }
        float f2 = (float)i1 / 4F;
        float f1 = (float)j1 / 2.0F - (float)g;
        canvas.drawCircle(f2, f1, e, m);
        if (obj != null)
        {
            obj = a(((Bitmap) (obj)), f2, f1);
            canvas.drawCircle(f2, f1, e, ((Paint) (obj)));
            canvas.drawCircle(f2, f1, e, n);
        }
        a(canvas, o, f2, f1, tripnotificationdata.getVehicleDisplayName());
        f2 *= 3F;
        canvas.drawCircle(f2, f1, e, m);
        if (bitmap1 != null)
        {
            Paint paint = a(bitmap1, f2, f1);
            canvas.drawCircle(f2, f1, e, paint);
            canvas.drawCircle(f2, f1, e, n);
        }
        a(canvas, o, f2, f1, tripnotificationdata.getDriverName());
        a(canvas, p, f2, f1 + (float)g, tripnotificationdata.getDriverExtra());
        return bitmap;
    }

    public final Bitmap a(String s)
    {
        s = a(s, c(), d - b);
        if (s == null)
        {
            return s;
        } else
        {
            Bitmap bitmap = Bitmap.createBitmap(c(), d, android.graphics.Bitmap.Config.ARGB_8888);
            (new Canvas(bitmap)).drawBitmap(s, 0.0F, 0.0F, null);
            return bitmap;
        }
    }

    public final Bitmap a(String s, int i1)
    {
        return a(s, i1, i1);
    }

    public final Bitmap a(String s, int i1, boolean flag)
    {
        Object obj;
        cgt cgt1;
        try
        {
            cgt1 = a.a(s).a(new ekv(i1));
        }
        catch (IOException ioexception)
        {
            ijg.a(ioexception, (new StringBuilder("Failed to load mono bitmap for notification: ")).append(s).toString(), new Object[0]);
            return null;
        }
        obj = cgt1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        obj = cgt1.a(new ekw(this, (byte)0));
        obj = ((cgt) (obj)).g();
        return ((Bitmap) (obj));
    }
}
