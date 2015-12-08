// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package io.card.payment:
//            ac, s, ah, ag, 
//            ad, h, CreditCard, CardIOActivity

final class aa extends View
{

    private static final android.graphics.drawable.GradientDrawable.Orientation a[];
    private final WeakReference b;
    private h c;
    private Bitmap d;
    private Rect e;
    private CreditCard f;
    private int g;
    private int h;
    private boolean i;
    private String j;
    private GradientDrawable k;
    private final Paint l = new Paint(1);
    private final Paint m = new Paint(1);
    private Path n;
    private Rect o;
    private final ac p;
    private final s q;
    private Rect r;
    private Rect s;
    private final boolean t;
    private int u;
    private float v;

    public aa(CardIOActivity cardioactivity, AttributeSet attributeset, boolean flag)
    {
        super(cardioactivity, null);
        i = false;
        v = 1.0F;
        t = flag;
        b = new WeakReference(cardioactivity);
        u = 1;
        v = getResources().getDisplayMetrics().density / 1.5F;
        p = new ac(70F * v, 50F * v);
        q = new s(cardioactivity);
        m.clearShadowLayer();
        m.setStyle(android.graphics.Paint.Style.FILL);
        m.setColor(0xbb000000);
        j = ag.a(ah.l);
    }

    private Rect a(int i1, int j1, int k1, int l1)
    {
        int i2 = (int)(8F * v);
        Rect rect = new Rect();
        rect.left = Math.min(i1, k1) - i2;
        rect.right = Math.max(i1, k1) + i2;
        rect.top = Math.min(j1, l1) - i2;
        rect.bottom = i2 + Math.max(j1, l1);
        return rect;
    }

    public final Bitmap a()
    {
        if (d != null && !d.isRecycled())
        {
            return Bitmap.createBitmap(d, 0, 0, d.getWidth(), d.getHeight());
        } else
        {
            return null;
        }
    }

    public final void a(int i1)
    {
        h = i1;
    }

    public final void a(Bitmap bitmap)
    {
        if (d != null)
        {
            d.recycle();
        }
        d = bitmap;
        if (d != null)
        {
            Object obj = new RectF(2.0F, 2.0F, d.getWidth() - 2, d.getHeight() - 2);
            float f1 = (float)d.getHeight() * 0.06666667F;
            bitmap = Bitmap.createBitmap(d.getWidth(), d.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            canvas.drawColor(0);
            Paint paint = new Paint(1);
            paint.setColor(0xff000000);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawRoundRect(((RectF) (obj)), f1, f1, paint);
            obj = new Paint();
            ((Paint) (obj)).setFilterBitmap(false);
            canvas = new Canvas(d);
            ((Paint) (obj)).setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(bitmap, 0.0F, 0.0F, ((Paint) (obj)));
            ((Paint) (obj)).setXfermode(null);
            bitmap.recycle();
        }
    }

    public final void a(Rect rect)
    {
        o = rect;
    }

    public final void a(Rect rect, int i1)
    {
        (new StringBuilder("setGuideAndRotation: ")).append(rect).append(", ").append(i1).toString();
        g = i1;
        e = rect;
        invalidate();
        if (g % 180 != 0)
        {
            rect = new Point((int)(v * 40F), (int)(v * 60F));
            u = -1;
        } else
        {
            rect = new Point((int)(v * 60F), (int)(v * 40F));
            u = 1;
        }
        if (o != null)
        {
            (new StringBuilder()).append(o).append(", ").append(rect).append(", ").append(o).append(", ").append(rect).toString();
            r = ad.a(new Point(o.left + ((Point) (rect)).x, o.top + ((Point) (rect)).y), (int)(70F * v), (int)(v * 50F));
            i1 = o.right;
            int j1 = ((Point) (rect)).x;
            int k1 = o.top;
            s = ad.a(new Point(i1 - j1, ((Point) (rect)).y + k1), (int)(100F * v), (int)(v * 50F));
            k = new GradientDrawable(a[(g / 90) % 4], new int[] {
                -1, 0xff000000
            });
            k.setGradientType(0);
            k.setBounds(e);
            k.setAlpha(50);
            n = new Path();
            n.addRect(new RectF(o), android.graphics.Path.Direction.CW);
            n.addRect(new RectF(e), android.graphics.Path.Direction.CCW);
        }
    }

    public final void a(CreditCard creditcard)
    {
        f = creditcard;
    }

    public final void a(h h1)
    {
        if (c != null && !c.a(h1))
        {
            invalidate();
        }
        c = h1;
    }

    public final void a(boolean flag)
    {
        p.a(flag);
        invalidate();
    }

    public final void b()
    {
        int i1 = 0;
        if (d != null)
        {
            if (f.h)
            {
                Matrix matrix = new Matrix();
                matrix.setRotate(180F, d.getWidth() / 2, d.getHeight() / 2);
                d = Bitmap.createBitmap(d, 0, 0, d.getWidth(), d.getHeight(), matrix, false);
            }
            Canvas canvas = new Canvas(d);
            Paint paint = new Paint();
            ad.a(paint);
            paint.setTextSize(28F * v);
            int j1 = f.a.length();
            float f1 = (float)d.getWidth() / 428F;
            int k1 = (int)((float)f.i * f1 - 6F);
            while (i1 < j1) 
            {
                int l1 = (int)((float)f.j[i1] * f1);
                canvas.drawText((new StringBuilder()).append(f.a.charAt(i1)).toString(), l1, k1, paint);
                i1++;
            }
        }
    }

    public final void b(boolean flag)
    {
        q.a(flag);
    }

    public final boolean c()
    {
        return false;
    }

    public final void onDraw(Canvas canvas)
    {
        if (e != null && o != null)
        {
            canvas.save();
            k.draw(canvas);
            int i1;
            if (g == 0 || g == 180)
            {
                i1 = (e.bottom - e.top) / 4;
            } else
            {
                i1 = (e.right - e.left) / 4;
            }
            if (c != null && c.d() == 4)
            {
                canvas.drawPath(n, m);
            }
            l.clearShadowLayer();
            l.setStyle(android.graphics.Paint.Style.FILL);
            l.setColor(h);
            canvas.drawRect(a(e.left, e.top, e.left + i1, e.top), l);
            canvas.drawRect(a(e.left, e.top, e.left, e.top + i1), l);
            canvas.drawRect(a(e.right, e.top, e.right - i1, e.top), l);
            canvas.drawRect(a(e.right, e.top, e.right, e.top + i1), l);
            canvas.drawRect(a(e.left, e.bottom, e.left + i1, e.bottom), l);
            canvas.drawRect(a(e.left, e.bottom, e.left, e.bottom - i1), l);
            canvas.drawRect(a(e.right, e.bottom, e.right - i1, e.bottom), l);
            canvas.drawRect(a(e.right, e.bottom, e.right, e.bottom - i1), l);
            if (c != null)
            {
                if (c.a)
                {
                    canvas.drawRect(a(e.left, e.top, e.right, e.top), l);
                }
                if (c.b)
                {
                    canvas.drawRect(a(e.left, e.bottom, e.right, e.bottom), l);
                }
                if (c.c)
                {
                    canvas.drawRect(a(e.left, e.top, e.left, e.bottom), l);
                }
                if (c.d)
                {
                    canvas.drawRect(a(e.right, e.top, e.right, e.bottom), l);
                }
                if (c.d() < 3)
                {
                    float f2 = 34F * v;
                    float f1 = 26F * v;
                    ad.a(l);
                    l.setTextAlign(android.graphics.Paint.Align.CENTER);
                    l.setTextSize(f1);
                    canvas.translate(e.left + e.width() / 2, e.top + e.height() / 2);
                    canvas.rotate(u * g);
                    if (j != null && j != "")
                    {
                        String as[] = j.split("\n");
                        f1 = -(((float)(as.length - 1) * f2 - f1) / 2.0F) - 3F;
                        for (i1 = 0; i1 < as.length; i1++)
                        {
                            canvas.drawText(as[i1], 0.0F, f1, l);
                            f1 += f2;
                        }

                    }
                }
            }
            canvas.restore();
            if (!i)
            {
                canvas.save();
                canvas.translate(s.exactCenterX(), s.exactCenterY());
                canvas.rotate(u * g);
                q.a(canvas, 100F * v, 50F * v);
                canvas.restore();
            }
            if (t)
            {
                canvas.save();
                canvas.translate(r.exactCenterX(), r.exactCenterY());
                canvas.rotate(u * g);
                p.a(canvas);
                canvas.restore();
                return;
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
label0:
        {
            if ((motionevent.getAction() & 0xff) != 0)
            {
                break label0;
            }
            motionevent = new Point((int)motionevent.getX(), (int)motionevent.getY());
            Rect rect = ad.a(motionevent, 20, 20);
            (new StringBuilder("onTouchEvent: ")).append(motionevent).toString();
            if (t && r != null && Rect.intersects(r, rect))
            {
                ((CardIOActivity)b.get()).a();
                break label0;
            }
            try
            {
                if (s == null || !Rect.intersects(s, rect))
                {
                    ((CardIOActivity)b.get()).b();
                }
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent) { }
        }
        return false;
    }

    static 
    {
        a = (new android.graphics.drawable.GradientDrawable.Orientation[] {
            android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT
        });
    }
}
