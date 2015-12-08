// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import android.content.Context;
import android.util.AttributeSet;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.view.GLContentView;
import com.go.gl.view.GLRelativeLayout;
import com.go.gl.widget.GLTextView;

public class WeatherDespView extends GLRelativeLayout
{

    private float a;
    private float b;
    private GLTextView c;
    private GLTextView d;
    private GLTextView e;
    private GLTextView f;
    private GLTextView g;
    private GLTextView h;
    private GLTextView i;
    private GLTextView j;
    private boolean k;

    public WeatherDespView(Context context)
    {
        super(context);
        a = 1.0F;
        b = 0.0F;
        k = false;
        a(context);
    }

    public WeatherDespView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 1.0F;
        b = 0.0F;
        k = false;
        a(context);
    }

    private void a(Context context)
    {
        mContext = context;
        setPadding(10, 0, 10, 0);
    }

    public void cleanup()
    {
        k = false;
        super.cleanup();
    }

    protected void dispatchDraw(GLCanvas glcanvas)
    {
        if (!k)
        {
            return;
        } else
        {
            glcanvas.translate(0.0F, 0.0F, b);
            super.dispatchDraw(glcanvas);
            glcanvas.translate(0.0F, 0.0F, -b);
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        c = (GLTextView)findViewById(0x7f09022e);
        d = (GLTextView)findViewById(0x7f090455);
        e = (GLTextView)findViewById(0x7f090456);
        f = (GLTextView)findViewById(0x7f090458);
        g = (GLTextView)findViewById(0x7f090457);
        j = (GLTextView)findViewById(0x7f09045a);
        h = (GLTextView)findViewById(0x7f090459);
        i = (GLTextView)findViewById(0x7f09045b);
        k = true;
    }

    protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        super.onLayout(flag, l, i1, j1, k1);
    }

    protected void onSizeChanged(int l, int i1, int j1, int k1)
    {
        super.onSizeChanged(l, i1, j1, k1);
        GLContentView glcontentview = getGLRootView();
        if (glcontentview != null)
        {
            b = glcontentview.getDepthForProjectScale(a);
        }
    }

    public void setCityName(String s)
    {
        if (!k)
        {
            return;
        } else
        {
            c.setText(s);
            return;
        }
    }

    public void setDrawingCacheEnabled(boolean flag)
    {
        super.setDrawingCacheEnabled(flag);
    }

    public void setHTempDesp(String s)
    {
        if (!k)
        {
            return;
        } else
        {
            f.setText(s);
            return;
        }
    }

    public void setHumidity(String s)
    {
        if (!k)
        {
            return;
        } else
        {
            i.setText(s);
            return;
        }
    }

    public void setLTempDesp(String s)
    {
        if (!k)
        {
            return;
        } else
        {
            g.setText(s);
            return;
        }
    }

    public void setNight(boolean flag)
    {
        if (!k)
        {
            return;
        }
        int l;
        if (flag)
        {
            l = 0xffd7dfe4;
            c.showTextShadow();
            d.showTextShadow();
            e.showTextShadow();
            f.showTextShadow();
            g.showTextShadow();
            j.showTextShadow();
            h.showTextShadow();
            i.showTextShadow();
        } else
        {
            h.hideTextShadow();
            c.hideTextShadow();
            d.hideTextShadow();
            e.hideTextShadow();
            f.hideTextShadow();
            g.hideTextShadow();
            j.hideTextShadow();
            i.hideTextShadow();
            l = 0xff31364c;
        }
        c.setTextColor(l);
        d.setTextColor(l);
        e.setTextColor(l);
        f.setTextColor(l);
        g.setTextColor(l);
        j.setTextColor(l);
        h.setTextColor(l);
        i.setTextColor(l);
    }

    public void setNowTemp(String s)
    {
        if (!k)
        {
            return;
        } else
        {
            d.setText(s);
            return;
        }
    }

    public void setNowTempUnit(String s)
    {
        if (!k)
        {
            return;
        } else
        {
            e.setText(s);
            return;
        }
    }

    public void setWeatherDesp(String s)
    {
        if (!k)
        {
            return;
        } else
        {
            h.setText(s);
            return;
        }
    }

    public void setWindDesp(String s)
    {
        if (!k)
        {
            return;
        } else
        {
            j.setText(s);
            return;
        }
    }
}
