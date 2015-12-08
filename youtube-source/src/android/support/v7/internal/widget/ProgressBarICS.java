// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v7.internal.widget:
//            am

public class ProgressBarICS extends View
{

    private static final int f[] = {
        0x1010136, 0x1010137, 0x1010138, 0x1010139, 0x101013a, 0x101013b, 0x101013c, 0x101013d, 0x101013e, 0x101013f, 
        0x101011f, 0x1010140, 0x1010120, 0x1010141
    };
    int a;
    int b;
    int c;
    int d;
    Bitmap e;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private Transformation n;
    private AlphaAnimation o;
    private Drawable p;
    private Drawable q;
    private Drawable r;
    private boolean s;
    private Interpolator t;
    private am u;
    private long v;
    private boolean w;
    private long x;
    private boolean y;

    public ProgressBarICS(Context context, AttributeSet attributeset, int i1, int j1)
    {
        boolean flag = false;
        super(context, null, 0);
        v = Thread.currentThread().getId();
        i = 100;
        g = 0;
        h = 0;
        l = false;
        m = false;
        k = 4000;
        j = 1;
        a = 24;
        b = 48;
        c = 24;
        d = 48;
        attributeset = context.obtainStyledAttributes(null, f, 0, j1);
        s = true;
        setMax(attributeset.getInt(0, i));
        setProgress(attributeset.getInt(1, g));
        setSecondaryProgress(attributeset.getInt(2, h));
        boolean flag1 = attributeset.getBoolean(3, l);
        m = attributeset.getBoolean(4, m);
        Drawable drawable = attributeset.getDrawable(5);
        if (drawable != null)
        {
            setIndeterminateDrawable(a(drawable));
        }
        drawable = attributeset.getDrawable(6);
        if (drawable != null)
        {
            setProgressDrawable(a(drawable, false));
        }
        k = attributeset.getInt(7, k);
        j = attributeset.getInt(8, j);
        a = attributeset.getDimensionPixelSize(9, a);
        b = attributeset.getDimensionPixelSize(10, b);
        c = attributeset.getDimensionPixelSize(11, c);
        d = attributeset.getDimensionPixelSize(12, d);
        i1 = attributeset.getResourceId(13, 0x10a000b);
        if (i1 > 0)
        {
            setInterpolator(context, i1);
        }
        attributeset.recycle();
        s = false;
        if (m || flag1)
        {
            flag = true;
        }
        setIndeterminate(flag);
    }

    private Drawable a(Drawable drawable)
    {
        Object obj = drawable;
        if (drawable instanceof AnimationDrawable)
        {
            drawable = (AnimationDrawable)drawable;
            int j1 = drawable.getNumberOfFrames();
            obj = new AnimationDrawable();
            ((AnimationDrawable) (obj)).setOneShot(drawable.isOneShot());
            for (int i1 = 0; i1 < j1; i1++)
            {
                Drawable drawable1 = a(drawable.getFrame(i1), true);
                drawable1.setLevel(10000);
                ((AnimationDrawable) (obj)).addFrame(drawable1, drawable.getDuration(i1));
            }

            ((AnimationDrawable) (obj)).setLevel(10000);
        }
        return ((Drawable) (obj));
    }

    private Drawable a(Drawable drawable, boolean flag)
    {
        boolean flag1 = false;
        Object obj;
        if (drawable instanceof LayerDrawable)
        {
            drawable = (LayerDrawable)drawable;
            int k1 = drawable.getNumberOfLayers();
            Drawable adrawable[] = new Drawable[k1];
            int i1 = 0;
            while (i1 < k1) 
            {
                int l1 = drawable.getId(i1);
                Drawable drawable1 = drawable.getDrawable(i1);
                if (l1 == 0x102000d || l1 == 0x102000f)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                adrawable[i1] = a(drawable1, flag);
                i1++;
            }
            obj = new LayerDrawable(adrawable);
            for (int j1 = ((flag1) ? 1 : 0); j1 < k1; j1++)
            {
                ((LayerDrawable) (obj)).setId(j1, drawable.getId(j1));
            }

        } else
        {
            obj = drawable;
            if (drawable instanceof BitmapDrawable)
            {
                Object obj1 = ((BitmapDrawable)drawable).getBitmap();
                if (e == null)
                {
                    e = ((Bitmap) (obj1));
                }
                drawable = new ShapeDrawable(new RoundRectShape(new float[] {
                    5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
                }, null, null));
                obj1 = new BitmapShader(((Bitmap) (obj1)), android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
                drawable.getPaint().setShader(((android.graphics.Shader) (obj1)));
                if (flag)
                {
                    return new ClipDrawable(drawable, 3, 1);
                } else
                {
                    return drawable;
                }
            }
        }
        return ((Drawable) (obj));
    }

    static am a(ProgressBarICS progressbarics, am am1)
    {
        progressbarics.u = am1;
        return am1;
    }

    private void a()
    {
        if (getVisibility() != 0)
        {
            return;
        }
        if (p instanceof Animatable)
        {
            w = true;
            o = null;
        } else
        {
            if (t == null)
            {
                t = new LinearInterpolator();
            }
            n = new Transformation();
            o = new AlphaAnimation(0.0F, 1.0F);
            o.setRepeatMode(j);
            o.setRepeatCount(-1);
            o.setDuration(k);
            o.setInterpolator(t);
            o.setStartTime(-1L);
        }
        postInvalidate();
    }

    private void a(int i1, int j1)
    {
        this;
        JVM INSTR monitorenter ;
        if (i <= 0) goto _L2; else goto _L1
_L1:
        float f1 = (float)j1 / (float)i;
_L5:
        Object obj1 = r;
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        Object obj = null;
        if (obj1 instanceof LayerDrawable)
        {
            obj = ((LayerDrawable)obj1).findDrawableByLayerId(i1);
        }
        break MISSING_BLOCK_LABEL_83;
_L7:
        ((Drawable) (obj1)).setLevel(i1);
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f1 = 0.0F;
          goto _L5
_L4:
        invalidate();
          goto _L6
        obj;
        throw obj;
        i1 = (int)(f1 * 10000F);
        if (obj != null)
        {
            obj1 = obj;
        }
          goto _L7
    }

    private void a(int i1, int j1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (v != Thread.currentThread().getId()) goto _L2; else goto _L1
_L1:
        a(i1, j1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        if (u == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = u;
        u = null;
        ((am) (obj)).a(i1, j1, flag);
_L5:
        post(((Runnable) (obj)));
        if (true) goto _L4; else goto _L3
        obj;
        throw obj;
_L3:
        obj = new am(this, i1, j1, flag);
          goto _L5
    }

    private void a(int i1, boolean flag)
    {
        int j1 = 0;
        this;
        JVM INSTR monitorenter ;
        flag = l;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (i1 < 0)
        {
            i1 = j1;
        }
        j1 = i1;
        if (i1 > i)
        {
            j1 = i;
        }
        if (j1 != g)
        {
            g = j1;
            a(0x102000d, g, false);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static void a(ProgressBarICS progressbarics, int i1, int j1, boolean flag, boolean flag1)
    {
        progressbarics.a(i1, j1);
    }

    private void b()
    {
        o = null;
        n = null;
        if (p instanceof Animatable)
        {
            ((Animatable)p).stop();
            w = false;
        }
        postInvalidate();
    }

    private void b(int i1, int j1)
    {
        int k1;
        int l1;
        l1 = i1 - getPaddingRight() - getPaddingLeft();
        k1 = j1 - getPaddingBottom() - getPaddingTop();
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        if (!m || (p instanceof AnimationDrawable)) goto _L2; else goto _L1
_L1:
        float f1;
        float f2;
        int i2 = p.getIntrinsicWidth();
        int k2 = p.getIntrinsicHeight();
        f1 = (float)i2 / (float)k2;
        f2 = (float)i1 / (float)j1;
        if (f1 == f2) goto _L2; else goto _L3
_L3:
        if (f2 > f1)
        {
            j1 = (int)(f1 * (float)j1);
            int j2 = (i1 - j1) / 2;
            j1 += j2;
            i1 = k1;
            l1 = 0;
            k1 = j2;
        } else
        {
            float f3 = i1;
            i1 = (int)((1.0F / f1) * f3);
            k1 = (j1 - i1) / 2;
            j1 = l1;
            i1 += k1;
            l1 = k1;
            k1 = 0;
        }
_L4:
        p.setBounds(k1, l1, j1, i1);
_L5:
        if (q != null)
        {
            q.setBounds(0, 0, j1, i1);
        }
        return;
_L2:
        boolean flag = false;
        j1 = l1;
        i1 = k1;
        l1 = 0;
        k1 = ((flag) ? 1 : 0);
          goto _L4
        i1 = k1;
        j1 = l1;
          goto _L5
    }

    private void c()
    {
        int ai[] = getDrawableState();
        if (q != null && q.isStateful())
        {
            q.setState(ai);
        }
        if (p != null && p.isStateful())
        {
            p.setState(ai);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        c();
    }

    public void invalidateDrawable(Drawable drawable)
    {
label0:
        {
            if (!y)
            {
                if (!verifyDrawable(drawable))
                {
                    break label0;
                }
                drawable = drawable.getBounds();
                int i1 = getScrollX() + getPaddingLeft();
                int j1 = getScrollY() + getPaddingTop();
                invalidate(((Rect) (drawable)).left + i1, ((Rect) (drawable)).top + j1, i1 + ((Rect) (drawable)).right, ((Rect) (drawable)).bottom + j1);
            }
            return;
        }
        super.invalidateDrawable(drawable);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (l)
        {
            a();
        }
    }

    protected void onDetachedFromWindow()
    {
        if (l)
        {
            b();
        }
        if (u != null)
        {
            removeCallbacks(u);
        }
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        Drawable drawable;
        super.onDraw(canvas);
        drawable = r;
        if (drawable == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        float f1;
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        long l1 = getDrawingTime();
        if (o == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        o.getTransformation(l1, n);
        f1 = n.getAlpha();
        y = true;
        drawable.setLevel((int)(f1 * 10000F));
        y = false;
        if (SystemClock.uptimeMillis() - x >= 200L)
        {
            x = SystemClock.uptimeMillis();
            postInvalidateDelayed(200L);
        }
        drawable.draw(canvas);
        canvas.restore();
        if (w && (drawable instanceof Animatable))
        {
            ((Animatable)drawable).start();
            w = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        canvas;
        y = false;
        throw canvas;
        canvas;
        this;
        JVM INSTR monitorexit ;
        throw canvas;
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = 0;
        this;
        JVM INSTR monitorenter ;
        Drawable drawable = r;
        if (drawable == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        int l1;
        l1 = Math.max(a, Math.min(b, drawable.getIntrinsicWidth()));
        k1 = Math.max(c, Math.min(d, drawable.getIntrinsicHeight()));
_L1:
        c();
        int i2 = getPaddingLeft();
        int j2 = getPaddingRight();
        int k2 = getPaddingTop();
        int l2 = getPaddingBottom();
        setMeasuredDimension(resolveSize(l1 + (i2 + j2), i1), resolveSize(k1 + (k2 + l2), j1));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
        l1 = 0;
          goto _L1
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        setProgress(((SavedState) (parcelable)).progress);
        setSecondaryProgress(((SavedState) (parcelable)).secondaryProgress);
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.progress = g;
        savedstate.secondaryProgress = h;
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        b(i1, j1);
    }

    protected void onVisibilityChanged(View view, int i1)
    {
label0:
        {
            super.onVisibilityChanged(view, i1);
            if (l)
            {
                if (i1 != 8 && i1 != 4)
                {
                    break label0;
                }
                b();
            }
            return;
        }
        a();
    }

    public void postInvalidate()
    {
        if (!s)
        {
            super.postInvalidate();
        }
    }

    public void setIndeterminate(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (m && l || flag == l) goto _L2; else goto _L1
_L1:
        l = flag;
        if (!flag) goto _L4; else goto _L3
_L3:
        r = p;
        a();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        r = q;
        b();
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public void setIndeterminateDrawable(Drawable drawable)
    {
        if (drawable != null)
        {
            drawable.setCallback(this);
        }
        p = drawable;
        if (l)
        {
            r = drawable;
            postInvalidate();
        }
    }

    public void setInterpolator(Context context, int i1)
    {
        setInterpolator(AnimationUtils.loadInterpolator(context, i1));
    }

    public void setInterpolator(Interpolator interpolator)
    {
        t = interpolator;
    }

    public void setMax(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        int j1;
        j1 = i1;
        if (i1 < 0)
        {
            j1 = 0;
        }
        if (j1 != i)
        {
            i = j1;
            postInvalidate();
            if (g > j1)
            {
                g = j1;
            }
            a(0x102000d, g, false);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setProgress(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        a(i1, false);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setProgressDrawable(Drawable drawable)
    {
        boolean flag;
        if (q != null && drawable != q)
        {
            q.setCallback(null);
            flag = true;
        } else
        {
            flag = false;
        }
        if (drawable != null)
        {
            drawable.setCallback(this);
            int i1 = drawable.getMinimumHeight();
            if (d < i1)
            {
                d = i1;
                requestLayout();
            }
        }
        q = drawable;
        if (!l)
        {
            r = drawable;
            postInvalidate();
        }
        if (flag)
        {
            b(getWidth(), getHeight());
            c();
            a(0x102000d, g);
            a(0x102000f, h);
        }
    }

    public void setSecondaryProgress(int i1)
    {
        int j1 = 0;
        this;
        JVM INSTR monitorenter ;
        boolean flag = l;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (i1 < 0)
        {
            i1 = j1;
        }
        j1 = i1;
        if (i1 > i)
        {
            j1 = i;
        }
        if (j1 != h)
        {
            h = j1;
            a(0x102000f, h, false);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void setVisibility(int i1)
    {
label0:
        {
            if (getVisibility() != i1)
            {
                super.setVisibility(i1);
                if (l)
                {
                    if (i1 != 8 && i1 != 4)
                    {
                        break label0;
                    }
                    b();
                }
            }
            return;
        }
        a();
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == q || drawable == p || super.verifyDrawable(drawable);
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new an();
        int progress;
        int secondaryProgress;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(progress);
            parcel.writeInt(secondaryProgress);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            progress = parcel.readInt();
            secondaryProgress = parcel.readInt();
        }

        SavedState(Parcel parcel, al al)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
