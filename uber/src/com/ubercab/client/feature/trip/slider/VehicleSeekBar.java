// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SeekBar;
import cgh;
import cgt;
import cha;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.rider.realtime.model.VehicleView;
import cwn;
import cwu;
import dfp;
import drf;
import dsh;
import gds;
import gdz;
import geb;
import geg;
import gjy;
import gka;
import gki;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class VehicleSeekBar extends SeekBar
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    private static final int b = cwu.a(52);
    public cgh a;
    private final Set c;
    private final List d;
    private final Map e;
    private float f;
    private int g;
    private boolean h;
    private int i;
    private int j;
    private Drawable k;
    private Interpolator l;
    private Uri m;
    private Drawable n;
    private LayerDrawable o;
    private List p;
    private Rect q;
    private geb r;

    public VehicleSeekBar(Context context)
    {
        this(context, null);
    }

    public VehicleSeekBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public VehicleSeekBar(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = new HashSet();
        d = new CopyOnWriteArrayList();
        e = new HashMap();
        q = new Rect();
        r = new geb(this);
        ViewCompat.setAccessibilityDelegate(this, r);
        setMax(1000);
        g = ViewConfiguration.get(context).getScaledTouchSlop();
        n = getResources().getDrawable(0x7f020333);
        setOnSeekBarChangeListener(this);
        if (!isInEditMode())
        {
            ((RiderApplication)context.getApplicationContext()).b().a(this);
        }
    }

    private dsh a(Bitmap bitmap)
    {
        Bitmap bitmap1 = bitmap;
        if (bitmap == null)
        {
            bitmap1 = Bitmap.createBitmap(30, 30, android.graphics.Bitmap.Config.ARGB_8888);
        }
        bitmap = cwn.a(bitmap1, cwu.a(30));
        return new dsh(new BitmapDrawable(getResources(), bitmap));
    }

    static Set a(VehicleSeekBar vehicleseekbar)
    {
        return vehicleseekbar.c;
    }

    static void a(VehicleSeekBar vehicleseekbar, VehicleView vehicleview)
    {
        vehicleseekbar.b(vehicleview);
    }

    static void a(VehicleSeekBar vehicleseekbar, VehicleView vehicleview, Uri uri, Bitmap bitmap)
    {
        vehicleseekbar.a(vehicleview, uri, bitmap);
    }

    private void a(VehicleView vehicleview)
    {
        Uri uri = drf.a(getContext(), vehicleview);
        m = uri;
        vehicleview = new cha(vehicleview, uri) {

            final VehicleView a;
            final Uri b;
            final VehicleSeekBar c;

            public final void a()
            {
                VehicleSeekBar.a(c, a);
                VehicleSeekBar.a(c).remove(this);
            }

            public final void a(Bitmap bitmap)
            {
                VehicleSeekBar.a(c, a, b, bitmap);
                VehicleSeekBar.a(c).remove(this);
            }

            public final void b()
            {
                VehicleSeekBar.a(c).add(this);
            }

            
            {
                c = VehicleSeekBar.this;
                a = vehicleview;
                b = uri;
                super();
            }
        };
        a.a(uri).f().a(vehicleview);
    }

    private void a(VehicleView vehicleview, Uri uri, Bitmap bitmap)
    {
        vehicleview = vehicleview.getId();
        if (uri.equals(m))
        {
            uri = a(bitmap);
            e.put(vehicleview, uri);
            a(((String) (vehicleview)), ((dsh) (uri)));
        }
    }

    private void a(String s, dsh dsh1)
    {
        if (dsh1 == null)
        {
            return;
        }
        int i1 = (b - dsh1.getIntrinsicHeight()) / 2;
        int j1 = (b - dsh1.getIntrinsicWidth()) / 2;
        dsh1.a(0x10100a7, -1);
        dsh1.a(0x101009e, 0xff000000);
        dsh1.setState(o.getState());
        s = b(s);
        char c1;
        if (s != null && s.e())
        {
            c1 = '\377';
        } else
        {
            c1 = 'P';
        }
        dsh1.setAlpha(c1);
        o.setLayerInset(1, j1, i1, j1, i1);
        o.setDrawableByLayerId(0x7f0e06aa, dsh1);
        s = o.copyBounds();
        o.setBounds(0, 0, 0, 0);
        o.setBounds(s);
        invalidate();
    }

    private void a(String s, boolean flag)
    {
        int j1 = p.indexOf(b(s));
        int i1 = j;
        j1 = (j1 * getMax()) / Math.max(1, p.size() - 1);
        if (i > 1)
        {
            i1 = getProgress();
        }
        if (flag)
        {
            s = ValueAnimator.ofInt(new int[] {
                i1, j1
            });
            s.setDuration(200L);
            s.setInterpolator(l);
            s.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final VehicleSeekBar a;

                public final void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    a.setProgress(((Integer)valueanimator.getAnimatedValue()).intValue());
                }

            
            {
                a = VehicleSeekBar.this;
                super();
            }
            });
            s.start();
            return;
        } else
        {
            setProgress(j1);
            return;
        }
    }

    private int b(int i1)
    {
        int j1 = getMax();
        int k1 = p.size();
        if (k1 == 0)
        {
            return -1;
        }
        if (k1 > 1)
        {
            return (i1 / (j1 / ((k1 - 1) * 2)) + 1) / 2;
        } else
        {
            return 0;
        }
    }

    private geg b(String s)
    {
        return (geg)gki.d(p, new gka(s) {

            final String a;
            final VehicleSeekBar b;

            private boolean a(geg geg1)
            {
                return geg1.a(a);
            }

            public final boolean apply(Object obj)
            {
                return a((geg)obj);
            }

            
            {
                b = VehicleSeekBar.this;
                a = s;
                super();
            }
        }).d();
    }

    private void b(VehicleView vehicleview)
    {
        Uri uri = drf.a(vehicleview);
        m = uri;
        vehicleview = new cha(vehicleview, uri) {

            final VehicleView a;
            final Uri b;
            final VehicleSeekBar c;

            public final void a()
            {
                VehicleSeekBar.a(c).remove(this);
            }

            public final void a(Bitmap bitmap)
            {
                VehicleSeekBar.a(c, a, b, bitmap);
                VehicleSeekBar.a(c).remove(this);
            }

            public final void b()
            {
                VehicleSeekBar.a(c).add(this);
            }

            
            {
                c = VehicleSeekBar.this;
                a = vehicleview;
                b = uri;
                super();
            }
        };
        a.a(uri).f().a(vehicleview);
    }

    private boolean b(float f1)
    {
        return Math.abs(f1 - f) > (float)g;
    }

    private void c(String s)
    {
        if (e.containsKey(s))
        {
            a(s, (dsh)e.get(s));
        } else
        {
            o.setDrawableByLayerId(0x7f0e06aa, new ColorDrawable(0));
            s = b(s);
            if (s != null)
            {
                a(s.c());
                return;
            }
        }
    }

    public final int a()
    {
        if (p == null)
        {
            return 0;
        } else
        {
            return p.size();
        }
    }

    public final int a(float f1)
    {
        if (p == null || p.isEmpty())
        {
            return -1;
        } else
        {
            return b(Math.round((f1 / (float)getWidth()) * (float)getMax()));
        }
    }

    public final String a(int i1)
    {
        if (p != null && p.size() > i1)
        {
            geg geg1 = (geg)p.get(i1);
            if (geg1 != null)
            {
                return geg1.b();
            }
        }
        return null;
    }

    public final void a(gdz gdz1)
    {
        d.add(gdz1);
    }

    final void a(String s)
    {
        geg geg1 = b(s);
        if (geg1 != null)
        {
            c(geg1.a());
            if (!isPressed())
            {
                a(s, false);
                return;
            }
        }
    }

    final void a(List list)
    {
        p = list;
        int i1;
        if (list.size() < 2)
        {
            setMax(0);
            setThumbOffset(0);
            getLayoutParams().width = -2;
        } else
        {
            setMax(1000);
            setThumbOffset(o.getIntrinsicWidth() / 2);
            getLayoutParams().width = -1;
        }
        i1 = gds.a(getContext(), list.size());
        setPadding(i1, getPaddingTop(), i1, getPaddingBottom());
        requestLayout();
        invalidate();
    }

    protected boolean dispatchHoverEvent(MotionEvent motionevent)
    {
        if (r.dispatchHoverEvent(motionevent))
        {
            return true;
        } else
        {
            return super.dispatchHoverEvent(motionevent);
        }
    }

    public Drawable getThumb()
    {
        return o;
    }

    protected void onDraw(Canvas canvas)
    {
        int i1 = 1;
        this;
        JVM INSTR monitorenter ;
        boolean flag = isInEditMode();
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int j1 = p.size();
        if (j1 <= 1) goto _L4; else goto _L3
_L3:
        float f1;
        int k1;
        int l1;
        int i2;
        i2 = getWidth();
        int j2 = getPaddingLeft();
        int l2 = getPaddingRight();
        k1 = getHeight();
        l1 = getPaddingLeft();
        n.getPadding(q);
        int j3 = (l1 - q.left) + k.getIntrinsicWidth() / 2;
        int k3 = getWidth();
        n.setBounds(j3, 0, k3 - j3, getHeight());
        n.draw(canvas);
        i2 = (i2 - j2 - l2) / (j1 - 1);
        f1 = (float)k.getIntrinsicWidth() / 2.0F;
_L5:
        int k2;
        if (i1 >= j1 - 1)
        {
            break; /* Loop/switch isn't completed */
        }
        k2 = (int)((float)(i2 * i1 + l1) - f1);
        int i3 = (int)(((float)k1 / 2.0F - (float)k.getIntrinsicHeight() / 2.0F) + (float)getPaddingTop() / 2.0F);
        canvas.save();
        canvas.translate(k2, i3);
        k.draw(canvas);
        canvas.restore();
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
        super.onDraw(canvas);
        if (true) goto _L1; else goto _L6
_L6:
        canvas;
        throw canvas;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        k = getResources().getDrawable(0x7f020338);
        k.setBounds(0, 0, k.getIntrinsicWidth(), k.getIntrinsicHeight());
        o = (LayerDrawable)getResources().getDrawable(0x7f020334);
        setThumb(o);
        l = new DecelerateInterpolator();
        setInterpolator(l);
    }

    protected void onMeasure(int i1, int j1)
    {
        int l1 = 0;
        this;
        JVM INSTR monitorenter ;
        if (o != null) goto _L2; else goto _L1
_L1:
        int k1 = 0;
_L6:
        if (o != null) goto _L4; else goto _L3
_L3:
        int i2 = getPaddingLeft();
        int j2 = getPaddingRight();
        int k2 = getPaddingTop();
        int l2 = getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(k1 + (i2 + j2), i1, 0), resolveSizeAndState(l1 + (k2 + l2), j1, 0));
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        k1 = o.getIntrinsicWidth();
        continue; /* Loop/switch isn't completed */
_L4:
        l1 = o.getIntrinsicHeight();
          goto _L3
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onProgressChanged(SeekBar seekbar, int i1, boolean flag)
    {
        if (flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        i = i + 1;
        i1 = b(getProgress());
        if (i1 != -1)
        {
            seekbar = (geg)p.get(i1);
            c(seekbar.a());
            Iterator iterator = d.iterator();
            while (iterator.hasNext()) 
            {
                ((gdz)iterator.next()).a(seekbar.a());
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        i = 0;
        j = seekbar.getProgress();
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        int i1 = b(getProgress());
        if (i1 == -1)
        {
            return;
        } else
        {
            a(((geg)p.get(i1)).a(), true);
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 42
    //                   1 197
    //                   2 164
    //                   3 282;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        h = false;
        float f1;
        boolean flag;
        if (p.size() == 1)
        {
            f1 = motionevent.getX() - (float)getPaddingLeft();
        } else
        {
            f1 = motionevent.getX() - (float)n.getBounds().left;
        }
        if (f1 > (float)o.getBounds().left && f1 < (float)o.getBounds().right)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            setPressed(true);
            invalidate(o.getBounds());
        }
        f = motionevent.getX();
        continue; /* Loop/switch isn't completed */
_L4:
        if (isPressed() && !h && b(motionevent.getX()))
        {
            h = true;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (isPressed())
        {
            setPressed(false);
            invalidate(o.getBounds());
            if (!h && !b(motionevent.getX()))
            {
                for (Iterator iterator = d.iterator(); iterator.hasNext(); ((gdz)iterator.next()).c()) { }
            }
        }
        h = false;
        continue; /* Loop/switch isn't completed */
_L5:
        setPressed(false);
        invalidate(o.getBounds());
        h = false;
        if (true) goto _L1; else goto _L6
_L6:
    }

}
