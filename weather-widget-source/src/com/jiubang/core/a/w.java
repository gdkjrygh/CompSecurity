// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.gtp.a.a.b.c;

// Referenced classes of package com.jiubang.core.a:
//            i, c, x

public class w extends i
    implements SensorEventListener
{

    private float A;
    private float B;
    private com.jiubang.core.a.c C;
    private SensorManager D;
    private Context E;
    private x F;
    private boolean G;
    private float H;
    private boolean I;
    private Rect J;
    private RectF K;
    private Matrix y;
    private Matrix z;

    public w(Context context, int k, int l, int i1, int j1, Bitmap bitmap, int k1, 
            int l1)
    {
        super(context, k, l, i1, j1, bitmap, k1, l1);
        G = false;
        H = 0.1F;
        I = true;
        J = new Rect();
        K = new RectF();
        E = context;
        j = bitmap;
        y = new Matrix();
        z = new Matrix();
        C = new com.jiubang.core.a.c();
        x();
    }

    private void a(float f, float f1)
    {
        boolean flag = false;
        if (Math.abs(f) > 1.0F || Math.abs(f1) > 1.0F)
        {
            throw new IllegalArgumentException("Parallax effect cannot translate more than 100% of its off-screen size");
        }
        if (Math.abs(f) >= 1.0F)
        {
            flag = true;
        } else
        {
            G = false;
        }
        if (G)
        {
            A = A + H;
        } else
        {
            float f2 = F.f() * f;
            if (A <= Math.abs(F.f()) && A >= -Math.abs(F.f()))
            {
                if (f < 0.0F && A < f2)
                {
                    A = A + c(Math.abs(A - f2));
                }
                if (f > 0.0F && A > f2)
                {
                    A = A - c(Math.abs(A - f2));
                }
            }
        }
        f = F.g() * f1;
        if (B <= Math.abs(F.g()) && B >= -Math.abs(F.g()))
        {
            if (f1 > 0.0F && B > f)
            {
                B = B - c(Math.abs(B - f));
            }
            if (f1 < 0.0F && B < f)
            {
                f1 = B;
                B = c(Math.abs(B - f)) + f1;
            }
        }
        if (B > Math.abs(F.g()))
        {
            B = Math.abs(F.g());
        }
        if (B < -Math.abs(F.g()))
        {
            B = -Math.abs(F.g());
        }
        if (A > Math.abs(F.f()))
        {
            A = Math.abs(F.f());
        }
        if (A < -Math.abs(F.f()))
        {
            A = -Math.abs(F.f());
        }
        if (flag && Math.abs(F.f()) - Math.abs(A) <= 5F)
        {
            G = true;
            if (A < 0.0F)
            {
                H = Math.abs(H);
            } else
            {
                H = -Math.abs(H);
            }
        }
        z();
    }

    private float c(float f)
    {
        float f1 = f / 55F;
        f = f1;
        if ((double)f1 > 1.5D)
        {
            f = 1.5F;
        }
        return f;
    }

    private void x()
    {
        F = new x(this);
        z();
    }

    private void y()
    {
        if (com.jiubang.core.a.x.a(F))
        {
            return;
        } else
        {
            z.setScale(F.e(), F.e());
            z.postTranslate(F.f(), F.g());
            return;
        }
    }

    private void z()
    {
        if (com.jiubang.core.a.x.a(F))
        {
            return;
        } else
        {
            y.setScale(F.e(), F.e());
            y.postTranslate(F.f() + A, F.g() + B);
            p();
            return;
        }
    }

    protected void a(Canvas canvas, float f, int k, int l)
    {
        I = true;
        if (p)
        {
            k = canvas.save();
            canvas.concat(y);
        } else
        {
            y();
            k = canvas.save();
            canvas.concat(z);
        }
        if (j != null)
        {
            if (q != null && l != 255)
            {
                J.set(0, 0, q.getWidth(), q.getHeight());
                K.set(0.0F, 0.0F, j.getWidth(), j.getHeight());
                canvas.drawBitmap(q, J, K, i);
            }
            int i1 = i.getAlpha();
            i.setAlpha(l);
            if (l != 0)
            {
                canvas.drawBitmap(j, 0.0F, 0.0F, i);
            }
            i.setAlpha(i1);
        }
        if (k != -1)
        {
            canvas.restoreToCount(k);
        }
    }

    protected void g()
    {
        super.g();
        v();
    }

    public void j()
    {
        if (j != null && !j.isRecycled())
        {
            j.recycle();
            j = null;
        }
        if (q != null && !q.isRecycled())
        {
            q.recycle();
            q = null;
        }
        w();
    }

    public void onAccuracyChanged(Sensor sensor, int k)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        for (sensorevent = C.a(E, sensorevent); sensorevent == null || !I;)
        {
            return;
        }

        a(sensorevent[2], sensorevent[1]);
        I = false;
    }

    public void r()
    {
        super.r();
        w();
    }

    public void s()
    {
        super.s();
        v();
    }

    public boolean u()
    {
        return t() != null;
    }

    public void v()
    {
label0:
        {
            if (D == null)
            {
                D = (SensorManager)E.getSystemService("sensor");
                if (D != null)
                {
                    break label0;
                }
            }
            return;
        }
        com.gtp.a.a.b.c.a("XSensorComponent", "registerSensorManager");
        D.registerListener(this, D.getDefaultSensor(3), 0);
    }

    public void w()
    {
        if (D != null)
        {
            D.unregisterListener(this);
            com.gtp.a.a.b.c.a("XSensorComponent", "unregisterSensorManager");
            D = null;
            a(0.0F, 0.0F);
        }
    }
}
