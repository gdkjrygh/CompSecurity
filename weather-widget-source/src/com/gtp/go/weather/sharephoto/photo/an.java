// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.gau.go.launcherex.gowidget.weather.view.pullrefresh.a;
import com.jiubang.pla.listview.MultiColumnListView;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            PhotoTouchRefresh

public class an
{

    private PhotoTouchRefresh a;
    private MultiColumnListView b;
    private float c;
    private boolean d;
    private boolean e;
    private PointF f;
    private boolean g;
    private float h;
    private float i;
    private a j;
    private boolean k;

    public an(PhotoTouchRefresh phototouchrefresh)
    {
        b = null;
        d = true;
        e = false;
        g = false;
        i = 0.0F;
        k = false;
        a = phototouchrefresh;
        a.a(this);
        float f1 = a.getContext().getResources().getDisplayMetrics().density;
        c = 6F * f1;
        h = f1 * 80F;
        f = new PointF();
        b = (MultiColumnListView)a.findViewById(0x7f090488);
    }

    private boolean c(MotionEvent motionevent)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (motionevent.getY() - f.y > c)
        {
            double d1 = (Math.toDegrees(Math.atan((motionevent.getY() - f.y) / (motionevent.getX() - f.x))) + 180D) % 180D;
            flag = flag1;
            if (d1 > 50D)
            {
                flag = flag1;
                if (d1 < 130D)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private void d()
    {
        if (j != null)
        {
            j.a();
        }
    }

    private void e()
    {
        f.x = 0.0F;
        f.y = 0.0F;
        if (j != null)
        {
            j.a(i);
        }
    }

    private void f()
    {
        if (i == 1.0F)
        {
            g = true;
            if (j != null)
            {
                j.b();
            }
        } else
        if (j != null)
        {
            j.b(i);
            return;
        }
    }

    public void a(a a1)
    {
        j = a1;
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public boolean a()
    {
        return d;
    }

    protected boolean a(MotionEvent motionevent)
    {
        if (!a() || g || !b.j())
        {
            return false;
        }
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 69
    //                   1 155
    //                   2 99
    //                   3 155;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return e;
_L2:
        f.y = motionevent.getY();
        f.x = motionevent.getX();
        k = false;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!k && !e && c(motionevent))
        {
            e = true;
            f.y = motionevent.getY();
            f.x = motionevent.getX();
            d();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!k)
        {
            if (e)
            {
                e = false;
                e();
            }
            k = false;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public boolean b()
    {
        return g;
    }

    protected boolean b(MotionEvent motionevent)
    {
        float f1;
        f1 = 1.0F;
        if (!a() || g)
        {
            return false;
        }
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 58
    //                   1 226
    //                   2 85
    //                   3 226;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return true;
_L2:
        f.y = motionevent.getY();
        f.x = motionevent.getX();
        k = false;
_L4:
        if (!k)
        {
            if (!e)
            {
                if (c(motionevent))
                {
                    e = true;
                    f.y = motionevent.getY();
                    f.x = motionevent.getX();
                    d();
                }
            } else
            {
                float f2 = motionevent.getY() - f.y;
                if (f2 < 0.0F)
                {
                    k = true;
                    e = false;
                    e();
                } else
                {
                    i = (0.3F * f2 * (i + 1.0F)) / h;
                    if (i <= 1.0F)
                    {
                        f1 = i;
                    }
                    i = f1;
                    f();
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!k)
        {
            if (e)
            {
                e = false;
                e();
            }
            k = false;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void c()
    {
        if (g)
        {
            f.x = 0.0F;
            f.y = 0.0F;
            i = 0.0F;
            g = false;
            e = false;
            k = true;
            if (j != null)
            {
                j.i_();
            }
        }
    }
}
