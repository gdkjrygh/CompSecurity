// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Handler;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import com.go.gl.graphics.BitmapGLDrawable;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.graphics.GLDrawable;
import com.go.gl.graphics.NinePatchGLDrawable;
import com.go.gl.view.GLLinearLayout;
import com.go.gl.view.GLView;
import com.go.gl.widget.GLImageView;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            k, z

public class GLDigitalClock extends GLLinearLayout
{

    private Rect A;
    private Rect B;
    private boolean C;
    private boolean D;
    private boolean E;
    private GLImageView F;
    private GLImageView G;
    private GLImageView H;
    private GLImageView I;
    private GLImageView J;
    private GLImageView K;
    private GLImageView L;
    private GLImageView M;
    private GLImageView N;
    private long O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private Handler T;
    private float U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    private int a;
    private boolean aa;
    private int ab;
    private boolean ac;
    private float ad;
    private int b;
    private GLLinearLayout c;
    private GLLinearLayout d;
    private GLLinearLayout e;
    private GLLinearLayout f;
    private GLLinearLayout g;
    private GLImageView h;
    private z i;
    private int j;
    private int k;
    private int l;
    private int m;
    private float n;
    private int o;
    private int p;
    private float q;
    private float r;
    private int s;
    private GLDrawable t[];
    private GLDrawable u;
    private GLDrawable v;
    private Rect w;
    private Rect x;
    private Rect y;
    private Rect z;

    public GLDigitalClock(Context context)
    {
        super(context);
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        n = 0.0F;
        p = 0;
        q = 8F;
        r = 8F;
        t = new GLDrawable[10];
        w = new Rect();
        x = new Rect();
        y = new Rect();
        z = new Rect();
        A = new Rect();
        B = new Rect();
        C = false;
        D = false;
        E = false;
        P = 500;
        Q = false;
        R = false;
        S = false;
        T = new k(this);
        X = 0;
        Y = 0;
        Z = 0;
        aa = true;
        ac = false;
        ad = 0.6F;
    }

    public GLDigitalClock(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        n = 0.0F;
        p = 0;
        q = 8F;
        r = 8F;
        t = new GLDrawable[10];
        w = new Rect();
        x = new Rect();
        y = new Rect();
        z = new Rect();
        A = new Rect();
        B = new Rect();
        C = false;
        D = false;
        E = false;
        P = 500;
        Q = false;
        R = false;
        S = false;
        T = new k(this);
        X = 0;
        Y = 0;
        Z = 0;
        aa = true;
        ac = false;
        ad = 0.6F;
    }

    private GLDrawable a(int i1)
    {
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(i1);
        if (drawable instanceof BitmapDrawable)
        {
            return new BitmapGLDrawable((BitmapDrawable)drawable);
        }
        if (drawable instanceof NinePatchDrawable)
        {
            return new NinePatchGLDrawable((NinePatchDrawable)drawable);
        } else
        {
            return null;
        }
    }

    private void a()
    {
        S = true;
        T.removeMessages(0);
        T.sendEmptyMessageDelayed(0, 500L);
    }

    private boolean b()
    {
        return DateFormat.is24HourFormat(getContext());
    }

    public void cleanup()
    {
        for (int i1 = 0; i1 < 10; i1++)
        {
            t[i1].clear();
        }

        u.clear();
        v.clear();
        super.cleanup();
    }

    protected void dispatchDraw(GLCanvas glcanvas)
    {
        if (O == -1L)
        {
            O = getDrawingTime();
        }
        if (Q)
        {
            float f1 = Math.max(0.0F, Math.min((float)(getDrawingTime() - O) / (float)P, 1.0F));
            if (R)
            {
                onTimeAnimation(f1);
            }
        }
        int i1 = glcanvas.save();
        if (aa)
        {
            glcanvas.translate(N.getWidth(), 0.0F, 0.0F);
        }
        int j1 = glcanvas.save();
        glcanvas.translate(y.left, y.top);
        glcanvas.clipRect(0.0F, 0.0F, c.getWidth(), c.getHeight());
        glcanvas.translate(0.0F, (float)(-o) + n + (float)l + (float)X);
        if (d.getVisibility() == 0)
        {
            d.draw(glcanvas);
        }
        glcanvas.translate(0.0F, o);
        if (c.getVisibility() == 0)
        {
            c.draw(glcanvas);
        }
        glcanvas.restoreToCount(j1);
        j1 = glcanvas.save();
        glcanvas.translate(0.0F, X);
        glcanvas.translate(A.left, A.top);
        h.draw(glcanvas);
        glcanvas.restoreToCount(j1);
        j1 = glcanvas.save();
        glcanvas.translate(z.left, z.top);
        glcanvas.clipRect(0.0F, 0.0F, e.getWidth(), e.getHeight());
        glcanvas.translate(0.0F, -o + m + X);
        if (f.getVisibility() == 0)
        {
            f.draw(glcanvas);
        }
        glcanvas.translate(0.0F, o);
        if (e.getVisibility() == 0)
        {
            e.draw(glcanvas);
        }
        glcanvas.restoreToCount(j1);
        glcanvas.save();
        if (!aa)
        {
            glcanvas.translate(x.left, x.top);
            N.draw(glcanvas);
        }
        glcanvas.restoreToCount(i1);
    }

    public void initDigitalClock(z z1)
    {
        i = z1;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        N = (GLImageView)findViewById(0x7f090288);
        N.setIsClearForUpdate(false);
        g = (GLLinearLayout)findViewById(0x7f090278);
        c = (GLLinearLayout)findViewById(0x7f09027a);
        d = (GLLinearLayout)findViewById(0x7f09027d);
        F = (GLImageView)findViewById(0x7f09027b);
        F.setIsClearForUpdate(false);
        G = (GLImageView)findViewById(0x7f09027c);
        G.setIsClearForUpdate(false);
        H = (GLImageView)findViewById(0x7f09027e);
        H.setIsClearForUpdate(false);
        I = (GLImageView)findViewById(0x7f09027f);
        I.setIsClearForUpdate(false);
        e = (GLLinearLayout)findViewById(0x7f090282);
        f = (GLLinearLayout)findViewById(0x7f090285);
        J = (GLImageView)findViewById(0x7f090283);
        J.setIsClearForUpdate(false);
        K = (GLImageView)findViewById(0x7f090284);
        K.setIsClearForUpdate(false);
        L = (GLImageView)findViewById(0x7f090286);
        L.setIsClearForUpdate(false);
        M = (GLImageView)findViewById(0x7f090287);
        M.setIsClearForUpdate(false);
        for (int i1 = 0; i1 < 10; i1++)
        {
            t[i1] = a((new int[] {
                0x7f02036c, 0x7f02036d, 0x7f02036e, 0x7f02036f, 0x7f020370, 0x7f020371, 0x7f020372, 0x7f020373, 0x7f020374, 0x7f020375
            })[i1]);
        }

        u = a(0x7f020353);
        v = a(0x7f020377);
        h = (GLImageView)findViewById(0x7f090280);
        U = (float)t[0].getIntrinsicWidth() / (float)t[0].getIntrinsicHeight();
        aa = b();
        invalidate();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        i1 = (int)((float)(int)((double)(k1 - i1) / 11D) / U);
        W = i1;
        V = i1 / 2;
        Y = i1;
        getWidth();
        getHeight();
        w.left = g.getLeft();
        w.top = g.getTop();
        w.right = g.getRight();
        w.bottom = g.getBottom();
        GLView glview = findViewById(0x7f090279);
        y.left = c.getLeft() + glview.getLeft();
        Rect rect = y;
        i1 = c.getTop();
        rect.top = glview.getTop() + i1;
        y.right = y.left + c.getWidth();
        y.bottom = y.top + c.getHeight();
        A.left = h.getLeft();
        A.right = h.getRight();
        A.top = h.getTop();
        A.bottom = h.getBottom();
        glview = findViewById(0x7f090281);
        z.left = e.getLeft() + glview.getLeft();
        z.right = z.left + e.getWidth();
        rect = z;
        i1 = e.getTop();
        rect.top = glview.getTop() + i1;
        z.bottom = z.top + e.getHeight();
        x.left = N.getLeft();
        x.right = N.getRight();
        x.top = N.getTop();
        x.bottom = N.getBottom();
        o = g.getHeight();
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
    }

    public void onTimeAnimation(float f1)
    {
        if (C)
        {
            if (j != a)
            {
                l = (int)((float)o * f1);
            } else
            {
                l = 0;
            }
        }
        if (D)
        {
            if (k != b)
            {
                m = (int)((float)o * f1);
            } else
            {
                m = 0;
            }
        }
        if (f1 == 1.0F)
        {
            onTimeAnimationEnd();
        }
        invalidate();
    }

    public void onTimeAnimationEnd()
    {
        l = 0;
        a = j;
        F.setImageDrawable(t[a / 10]);
        G.setImageDrawable(t[a % 10]);
        d.setVisibility(8);
        if (!aa)
        {
            N.setVisibility(0);
            if (ab > 11)
            {
                N.setImageDrawable(v);
            } else
            {
                N.setImageDrawable(u);
            }
        } else
        {
            N.setVisibility(4);
        }
        if (ab > 11)
        {
            N.setImageDrawable(v);
        } else
        {
            N.setImageDrawable(u);
        }
        m = 0;
        b = k;
        J.setImageDrawable(t[b / 10]);
        K.setImageDrawable(t[b % 10]);
        f.setVisibility(8);
        R = false;
        Q = false;
        invalidate();
    }

    public void onZoneAnimation(float f1)
    {
        n = (float)(o * s) * f1 - (float)(p * o);
        if (n >= (float)o || f1 == 0.0F)
        {
            if (f1 != 0.0F)
            {
                p = p + 1;
            }
            if (j > a)
            {
                F.setImageDrawable(t[a / 10]);
                G.setImageDrawable(t[a % 10]);
                H.setImageDrawable(t[(a + 1) / 10]);
                I.setImageDrawable(t[(a + 1) % 10]);
                for (a = a + 1; a >= 24; a = a - 24) { }
                for (; a < 0; a = a + 24) { }
            } else
            if (j < a)
            {
                F.setImageDrawable(t[a / 10]);
                G.setImageDrawable(t[a % 10]);
                H.setImageDrawable(t[(a - 1) / 10]);
                I.setImageDrawable(t[((a - 1) + 24) % 24 % 10]);
                a = a - 1;
                if (a >= 24)
                {
                    a = a - 24;
                } else
                if (a < 0)
                {
                    a = a + 24;
                }
            }
        }
        if (k != b && f1 >= ad)
        {
            if (!ac)
            {
                ac = true;
                f.setVisibility(0);
                J.setImageDrawable(t[b / 10]);
                K.setImageDrawable(t[b % 10]);
                L.setImageDrawable(t[k / 10]);
                M.setImageDrawable(t[k % 10]);
                m = 0;
                return;
            } else
            {
                m = (int)(Math.min(1.0F, Math.max(0.0F, (f1 - ad) / (1.0F - ad))) * (float)o);
                return;
            }
        } else
        {
            m = 0;
            return;
        }
    }

    public void onZoneChangeAnimationEnd()
    {
        a = j;
        b = k;
        r = q;
        n = 0.0F;
        m = 0;
        F.setImageDrawable(t[a / 10]);
        G.setImageDrawable(t[a % 10]);
        J.setImageDrawable(t[b / 10]);
        K.setImageDrawable(t[b % 10]);
        d.setVisibility(8);
        f.setVisibility(8);
        if (i.a() > 11)
        {
            N.setImageDrawable(v);
        } else
        {
            N.setImageDrawable(u);
        }
        invalidate();
    }

    public void setTimeDirectly(int i1, int j1)
    {
        aa = b();
        if (aa) goto _L2; else goto _L1
_L1:
        int k1;
        N.setVisibility(0);
        if (i1 > 11)
        {
            N.setImageDrawable(v);
        } else
        {
            N.setImageDrawable(u);
        }
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        k1 = 12;
_L6:
        a = k1;
        b = j1;
        F.setImageDrawable(t[a / 10]);
        G.setImageDrawable(t[a % 10]);
        J.setImageDrawable(t[b / 10]);
        K.setImageDrawable(t[b % 10]);
        invalidate();
        return;
_L4:
        k1 = i1;
        if (i1 > 12)
        {
            k1 = i1 % 12;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        N.setVisibility(4);
        k1 = i1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void startTimeChangeAnimation(int i1, int j1)
    {
        if (!R && !S)
        {
            R = true;
            O = -1L;
        }
        a = j;
        b = k;
        boolean flag = b();
        ab = i1;
        int k1 = i1;
        if (!aa)
        {
            if (i1 == 0)
            {
                k1 = 12;
            } else
            {
                k1 = i1;
                if (i1 > 12)
                {
                    k1 = i1 % 12;
                }
            }
        }
        if (k1 == a)
        {
            if (!aa)
            {
                N.setVisibility(0);
                if (ab > 11)
                {
                    N.setImageDrawable(v);
                } else
                {
                    N.setImageDrawable(u);
                }
            } else
            {
                N.setVisibility(4);
            }
        }
        C = false;
        D = false;
        if (aa != flag)
        {
            C = true;
        }
        if (k1 >= 0 && k1 != a || flag != aa)
        {
            j = k1;
            if (S)
            {
                F.setImageDrawable(t[k1 / 10]);
                G.setImageDrawable(t[k1 % 10]);
            } else
            {
                C = true;
                d.setVisibility(0);
                F.setImageDrawable(t[a / 10]);
                G.setImageDrawable(t[a % 10]);
                H.setImageDrawable(t[j / 10]);
                I.setImageDrawable(t[j % 10]);
            }
            l = 0;
        }
        if (j1 >= 0 && j1 != b)
        {
            k = j1;
            if (S)
            {
                J.setImageDrawable(t[j1 / 10]);
                K.setImageDrawable(t[j1 % 10]);
            } else
            {
                D = true;
                f.setVisibility(0);
                J.setImageDrawable(t[b / 10]);
                K.setImageDrawable(t[b % 10]);
                L.setImageDrawable(t[k / 10]);
                M.setImageDrawable(t[k % 10]);
            }
            m = 0;
        }
        Q = true;
        aa = flag;
        a();
        invalidate();
    }

    public int startZoneChangeAnimation(float f1, z z1)
    {
        byte byte0 = 0;
        if (z1 == null && i == null)
        {
            byte0 = -1;
        } else
        {
            if (z1 != null)
            {
                i = z1;
            }
            j = i.a();
            if (!aa)
            {
                if (j == 0)
                {
                    j = 12;
                } else
                if (j > 12)
                {
                    j = j % 12;
                }
            }
            k = i.b();
            if (f1 != r)
            {
                q = f1;
                s = Math.abs(j - a);
                d.setVisibility(0);
                if (k != b)
                {
                    m = 0;
                }
                p = 0;
                n = 0.0F;
                ac = false;
                return s;
            }
        }
        return byte0;
    }

    public void updateCurrentZone(float f1)
    {
        r = f1;
    }


/*
    static boolean access$002(GLDigitalClock gldigitalclock, boolean flag)
    {
        gldigitalclock.S = flag;
        return flag;
    }

*/
}
