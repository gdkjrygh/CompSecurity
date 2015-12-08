// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.view.GLLinearLayout;
import com.go.gl.widget.GLImageView;
import com.go.gl.widget.GLTextViewWrapper;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            b

public class CityNameView extends GLLinearLayout
{

    private GLTextViewWrapper a;
    private GLImageView b;
    private String c;
    private Rect d;
    private boolean e;
    private boolean f;
    private Handler g;
    private boolean h;
    private long i;
    private int j;
    private boolean k;
    private float l;
    private float m;
    private float n[] = {
        0.5F, 0.1F
    };
    private double o;

    public CityNameView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = false;
        f = false;
        g = new b(this);
        h = false;
        i = 0L;
        j = 1000;
        k = false;
        l = 0.0F;
        m = 0.0F;
        o = 12.566370614359172D;
    }

    private void a()
    {
        f = true;
        g.removeMessages(0);
        g.sendEmptyMessageDelayed(0, 500L);
    }

    private void a(float f1)
    {
        if ((double)f1 < 0.29999999999999999D)
        {
            m = (float)(((double)f1 / 0.29999999999999999D) * (double)l);
        } else
        {
            if (!k)
            {
                k = true;
                setCityName(c);
            }
            if ((double)f1 < 0.5D)
            {
                m = (float)((1.0D - ((double)f1 - 0.29999999999999999D) / 0.20000000000000001D) * (double)l);
            } else
            {
                float f2 = (f1 - 0.5F) / 0.5F;
                m = (float)(Math.sin(o * (double)(1.0F - f2)) * (double)l * 0.30000001192092896D * (double)(1.0F - f2));
            }
        }
        if (f1 == 1.0F)
        {
            c();
        }
        invalidate();
    }

    private void b()
    {
        if (!h && !f)
        {
            h = true;
            i = -1L;
        }
        k = false;
        invalidate();
    }

    private void c()
    {
        h = false;
        invalidate();
    }

    public void changeCity(String s)
    {
        c = s;
        b();
        a();
    }

    public void draw(GLCanvas glcanvas)
    {
        if (!e)
        {
            return;
        }
        int i1 = glcanvas.save();
        if (i == -1L)
        {
            i = getDrawingTime();
        }
        if (h)
        {
            a(Math.max(0.0F, Math.min((float)(getDrawingTime() - i) / (float)j, 1.0F)));
        }
        glcanvas.clipRect(d);
        glcanvas.translate(0.0F, m, 0.0F);
        super.draw(glcanvas);
        glcanvas.restoreToCount(i1);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (GLTextViewWrapper)findViewById(0x7f090231);
        a.showTextShadow();
        b = (GLImageView)findViewById(0x7f090454);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        l = -j1;
        d = new Rect(0, -j1, i1, j1);
        e = true;
    }

    public void setCityName(String s)
    {
        a.setText(s);
        requestLayout();
        invalidate();
    }

    public void setCityNum(int i1)
    {
        if (i1 > 1)
        {
            b.setVisibility(0);
            return;
        } else
        {
            b.setVisibility(4);
            return;
        }
    }


/*
    static boolean access$002(CityNameView citynameview, boolean flag)
    {
        citynameview.f = flag;
        return flag;
    }

*/
}
