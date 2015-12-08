// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import uk.co.senab.photoview.a.e;
import uk.co.senab.photoview.a.f;
import uk.co.senab.photoview.a.g;

// Referenced classes of package uk.co.senab.photoview:
//            c, d, g, PhotoView, 
//            f, e, h, j, 
//            i

public class b
    implements android.view.GestureDetector.OnDoubleTapListener, android.view.View.OnTouchListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, f
{

    static final Interpolator a = new AccelerateDecelerateInterpolator();
    private float A;
    private float b;
    private float c;
    private float d;
    private boolean e;
    private WeakReference f;
    private GestureDetector g;
    private e h;
    private final Matrix i = new Matrix();
    private final Matrix j = new Matrix();
    private final Matrix k = new Matrix();
    private final RectF l = new RectF();
    private final float m[] = new float[9];
    private uk.co.senab.photoview.g n;
    private h o;
    private j p;
    private android.view.View.OnLongClickListener q;
    private i r;
    private int s;
    private int t;
    private int u;
    private int v;
    private uk.co.senab.photoview.f w;
    private int x;
    private boolean y;
    private android.widget.ImageView.ScaleType z;

    public b(ImageView imageview)
    {
        b = 1.0F;
        c = 1.75F;
        d = 3F;
        e = true;
        x = 2;
        z = android.widget.ImageView.ScaleType.FIT_CENTER;
        A = 0.0F;
        f = new WeakReference(imageview);
        imageview.setOnTouchListener(this);
        ViewTreeObserver viewtreeobserver = imageview.getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            viewtreeobserver.addOnGlobalLayoutListener(this);
        }
        b(imageview);
        if (imageview.isInEditMode())
        {
            return;
        } else
        {
            h = uk.co.senab.photoview.a.g.a(imageview.getContext(), this);
            g = new GestureDetector(imageview.getContext(), new c(this));
            g.setOnDoubleTapListener(this);
            a(true);
            return;
        }
    }

    private float a(Matrix matrix, int i1)
    {
        matrix.getValues(m);
        return m[i1];
    }

    private RectF a(Matrix matrix)
    {
        Object obj = c();
        if (obj != null)
        {
            obj = ((ImageView) (obj)).getDrawable();
            if (obj != null)
            {
                l.set(0.0F, 0.0F, ((Drawable) (obj)).getIntrinsicWidth(), ((Drawable) (obj)).getIntrinsicHeight());
                matrix.mapRect(l);
                return l;
            }
        }
        return null;
    }

    static android.view.View.OnLongClickListener a(b b1)
    {
        return b1.q;
    }

    private void a(Drawable drawable)
    {
        float f1;
        float f2;
        float f3;
        float f4;
        int i1;
        int j1;
        ImageView imageview = c();
        if (imageview == null || drawable == null)
        {
            return;
        }
        f1 = c(imageview);
        f2 = d(imageview);
        i1 = drawable.getIntrinsicWidth();
        j1 = drawable.getIntrinsicHeight();
        i.reset();
        f3 = f1 / (float)i1;
        f4 = f2 / (float)j1;
        if (z != android.widget.ImageView.ScaleType.CENTER) goto _L2; else goto _L1
_L1:
        i.postTranslate((f1 - (float)i1) / 2.0F, (f2 - (float)j1) / 2.0F);
_L4:
        l();
        return;
_L2:
        if (z == android.widget.ImageView.ScaleType.CENTER_CROP)
        {
            f3 = Math.max(f3, f4);
            i.postScale(f3, f3);
            i.postTranslate((f1 - (float)i1 * f3) / 2.0F, (f2 - (float)j1 * f3) / 2.0F);
            continue; /* Loop/switch isn't completed */
        }
        if (z != android.widget.ImageView.ScaleType.CENTER_INSIDE)
        {
            break; /* Loop/switch isn't completed */
        }
        f3 = Math.min(1.0F, Math.min(f3, f4));
        i.postScale(f3, f3);
        i.postTranslate((f1 - (float)i1 * f3) / 2.0F, (f2 - (float)j1 * f3) / 2.0F);
        if (true) goto _L4; else goto _L3
_L3:
        drawable = new RectF(0.0F, 0.0F, i1, j1);
        RectF rectf = new RectF(0.0F, 0.0F, f1, f2);
        switch (d.a[z.ordinal()])
        {
        case 2: // '\002'
            i.setRectToRect(drawable, rectf, android.graphics.Matrix.ScaleToFit.START);
            break;

        case 4: // '\004'
            i.setRectToRect(drawable, rectf, android.graphics.Matrix.ScaleToFit.CENTER);
            break;

        case 3: // '\003'
            i.setRectToRect(drawable, rectf, android.graphics.Matrix.ScaleToFit.END);
            break;

        case 5: // '\005'
            i.setRectToRect(drawable, rectf, android.graphics.Matrix.ScaleToFit.FILL);
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    static void a(b b1, Matrix matrix)
    {
        b1.b(matrix);
    }

    private static boolean a(ImageView imageview)
    {
        return imageview != null && imageview.getDrawable() != null;
    }

    static Matrix b(b b1)
    {
        return b1.k;
    }

    private void b(Matrix matrix)
    {
        ImageView imageview = c();
        if (imageview != null)
        {
            j();
            imageview.setImageMatrix(matrix);
            if (n != null)
            {
                matrix = a(matrix);
                if (matrix != null)
                {
                    n.a(matrix);
                }
            }
        }
    }

    private static void b(ImageView imageview)
    {
        if (imageview != null && !(imageview instanceof PhotoView) && !android.widget.ImageView.ScaleType.MATRIX.equals(imageview.getScaleType()))
        {
            imageview.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        }
    }

    private static boolean b(android.widget.ImageView.ScaleType scaletype)
    {
        if (scaletype == null)
        {
            return false;
        }
        switch (d.a[scaletype.ordinal()])
        {
        default:
            return true;

        case 1: // '\001'
            throw new IllegalArgumentException((new StringBuilder()).append(scaletype.name()).append(" is not supported in PhotoView").toString());
        }
    }

    private int c(ImageView imageview)
    {
        if (imageview == null)
        {
            return 0;
        } else
        {
            return imageview.getWidth() - imageview.getPaddingLeft() - imageview.getPaddingRight();
        }
    }

    static void c(b b1)
    {
        b1.i();
    }

    private int d(ImageView imageview)
    {
        if (imageview == null)
        {
            return 0;
        } else
        {
            return imageview.getHeight() - imageview.getPaddingTop() - imageview.getPaddingBottom();
        }
    }

    private void h()
    {
        if (w != null)
        {
            w.a();
            w = null;
        }
    }

    private void i()
    {
        if (k())
        {
            b(g());
        }
    }

    private void j()
    {
        ImageView imageview = c();
        if (imageview != null && !(imageview instanceof PhotoView) && !android.widget.ImageView.ScaleType.MATRIX.equals(imageview.getScaleType()))
        {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
        } else
        {
            return;
        }
    }

    private boolean k()
    {
        float f1;
        float f2;
        float f3;
        ImageView imageview;
        RectF rectf;
        int i1;
        f2 = 0.0F;
        imageview = c();
        if (imageview == null)
        {
            return false;
        }
        rectf = a(g());
        if (rectf == null)
        {
            return false;
        }
        f1 = rectf.height();
        f3 = rectf.width();
        i1 = d(imageview);
        if (f1 > (float)i1) goto _L2; else goto _L1
_L1:
        d.a[z.ordinal()];
        JVM INSTR tableswitch 2 3: default 92
    //                   2 187
    //                   3 197;
           goto _L3 _L4 _L5
_L3:
        f1 = ((float)i1 - f1) / 2.0F - rectf.top;
_L9:
        i1 = c(imageview);
        if (f3 > (float)i1)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        d.a[z.ordinal()];
        JVM INSTR tableswitch 2 3: default 156
    //                   2 257
    //                   3 267;
           goto _L6 _L7 _L8
_L6:
        f2 = ((float)i1 - f3) / 2.0F - rectf.left;
_L10:
        x = 2;
_L11:
        k.postTranslate(f2, f1);
        return true;
_L4:
        f1 = -rectf.top;
          goto _L9
_L5:
        f1 = (float)i1 - f1 - rectf.top;
          goto _L9
_L2:
        if (rectf.top > 0.0F)
        {
            f1 = -rectf.top;
        } else
        if (rectf.bottom < (float)i1)
        {
            f1 = (float)i1 - rectf.bottom;
        } else
        {
            f1 = 0.0F;
        }
          goto _L9
_L7:
        f2 = -rectf.left;
          goto _L10
_L8:
        f2 = (float)i1 - f3 - rectf.left;
          goto _L10
        if (rectf.left > 0.0F)
        {
            x = 0;
            f2 = -rectf.left;
        } else
        if (rectf.right < (float)i1)
        {
            f2 = (float)i1 - rectf.right;
            x = 1;
        } else
        {
            x = -1;
        }
          goto _L11
    }

    private void l()
    {
        k.reset();
        b(g());
        k();
    }

    public final void a()
    {
        if (f == null)
        {
            return;
        }
        ImageView imageview = (ImageView)f.get();
        if (imageview != null)
        {
            ViewTreeObserver viewtreeobserver = imageview.getViewTreeObserver();
            if (viewtreeobserver != null && viewtreeobserver.isAlive())
            {
                viewtreeobserver.removeGlobalOnLayoutListener(this);
            }
            imageview.setOnTouchListener(null);
            h();
        }
        if (g != null)
        {
            g.setOnDoubleTapListener(null);
        }
        n = null;
        o = null;
        p = null;
        f = null;
    }

    public final void a(float f1, float f2)
    {
        Object obj = c();
        k.postTranslate(f1, f2);
        i();
        if (e && !h.a() && (x == 2 || x == 0 && f1 >= 1.0F || x == 1 && f1 <= -1F))
        {
            obj = ((ImageView) (obj)).getParent();
            if (obj != null)
            {
                ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    public final void a(float f1, float f2, float f3)
    {
        if (d() < d || f1 < 1.0F)
        {
            k.postScale(f1, f1, f2, f3);
            i();
        }
    }

    public final void a(float f1, float f2, float f3, float f4)
    {
        ImageView imageview = c();
        w = new uk.co.senab.photoview.f(this, imageview.getContext());
        w.a(c(imageview), d(imageview), (int)f3, (int)f4);
        imageview.post(w);
    }

    public void a(float f1, float f2, float f3, boolean flag)
    {
        ImageView imageview = c();
        if (imageview == null || f1 < b || f1 > d)
        {
            return;
        }
        if (flag)
        {
            imageview.post(new uk.co.senab.photoview.e(this, d(), f1, f2, f3));
            return;
        } else
        {
            k.setScale(f1, f1, f2, f3);
            i();
            return;
        }
    }

    public final void a(android.view.View.OnLongClickListener onlongclicklistener)
    {
        q = onlongclicklistener;
    }

    public final void a(android.widget.ImageView.ScaleType scaletype)
    {
        if (b(scaletype) && scaletype != z)
        {
            z = scaletype;
            f();
        }
    }

    public final void a(j j1)
    {
        p = j1;
    }

    public final void a(boolean flag)
    {
        y = flag;
        f();
    }

    public final RectF b()
    {
        k();
        return a(g());
    }

    public final ImageView c()
    {
        ImageView imageview = null;
        if (f != null)
        {
            imageview = (ImageView)f.get();
        }
        if (imageview == null)
        {
            a();
            Log.i("PhotoViewAttacher", "ImageView no longer exists. You should not use this PhotoViewAttacher any more.");
        }
        return imageview;
    }

    public final float d()
    {
        return (float)Math.sqrt((float)Math.pow(a(k, 0), 2D) + (float)Math.pow(a(k, 3), 2D));
    }

    public final android.widget.ImageView.ScaleType e()
    {
        return z;
    }

    public final void f()
    {
label0:
        {
            ImageView imageview = c();
            if (imageview != null)
            {
                if (!y)
                {
                    break label0;
                }
                b(imageview);
                a(imageview.getDrawable());
            }
            return;
        }
        l();
    }

    protected Matrix g()
    {
        j.set(i);
        j.postConcat(k);
        return j;
    }

    public final boolean onDoubleTap(MotionEvent motionevent)
    {
        float f1;
        float f2;
        float f3;
        f1 = d();
        f2 = motionevent.getX();
        f3 = motionevent.getY();
        if (f1 >= c)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        a(c, f2, f3, true);
        return true;
        if (f1 < c || f1 >= d)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        a(d, f2, f3, true);
        return true;
        try
        {
            a(b, f2, f3, true);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return true;
        }
        return true;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionevent)
    {
        return false;
    }

    public final void onGlobalLayout()
    {
        ImageView imageview = c();
        if (imageview != null && y)
        {
            int i1 = imageview.getTop();
            int j1 = imageview.getRight();
            int k1 = imageview.getBottom();
            int l1 = imageview.getLeft();
            if (i1 != s || k1 != u || l1 != v || j1 != t)
            {
                a(imageview.getDrawable());
                s = i1;
                t = j1;
                u = k1;
                v = l1;
            }
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        ImageView imageview = c();
        if (o != null)
        {
            RectF rectf = b();
            if (rectf != null)
            {
                float f2 = motionevent.getX();
                float f1 = motionevent.getY();
                if (rectf.contains(f2, f1))
                {
                    f2 = (f2 - rectf.left) / rectf.width();
                    f1 = (f1 - rectf.top) / rectf.height();
                    o.a(imageview, f2, f1);
                    return true;
                }
            }
        }
        if (p != null)
        {
            p.a(imageview, motionevent.getX(), motionevent.getY());
        }
        return false;
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (!y) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (!a((ImageView)view)) goto _L2; else goto _L3
_L3:
        ViewParent viewparent;
        if (r != null)
        {
            r.a(view, motionevent);
        }
        viewparent = view.getParent();
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 84
    //                   0 158
    //                   1 192
    //                   2 84
    //                   3 192;
           goto _L4 _L5 _L6 _L4 _L6
_L4:
        flag = false;
_L9:
        flag1 = flag;
        if (g != null)
        {
            flag1 = flag;
            if (g.onTouchEvent(motionevent))
            {
                flag1 = true;
            }
        }
        if (!flag1 && viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(false);
        }
        if (h == null || !h.c(motionevent)) goto _L8; else goto _L7
_L7:
        flag = true;
_L2:
        return flag;
_L5:
        if (viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(true);
        } else
        {
            Log.i("PhotoViewAttacher", "onTouch getParent() returned null");
        }
        h();
        flag = false;
          goto _L9
_L6:
        if (d() >= b) goto _L4; else goto _L10
_L10:
        RectF rectf = b();
        if (rectf == null) goto _L4; else goto _L11
_L11:
        view.post(new uk.co.senab.photoview.e(this, d(), b, rectf.centerX(), rectf.centerY()));
        flag = true;
          goto _L9
_L8:
        return flag1;
    }

}
