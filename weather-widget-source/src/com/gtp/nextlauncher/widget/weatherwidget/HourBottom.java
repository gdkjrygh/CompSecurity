// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.Context;
import android.util.AttributeSet;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.graphics.GLDrawable;
import com.go.gl.view.GLLinearLayout;
import com.go.gl.widget.GLImageView;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            p, SizeAdapterTextView

public class HourBottom extends GLLinearLayout
{

    private GLImageView a;
    private SizeAdapterTextView b;
    private SizeAdapterTextView c;
    private SizeAdapterTextView d;
    private final int e = 8;
    private GLDrawable f[];
    private final int g = 2;
    private int h[] = {
        -1, 0, 1, -1, -1, -1, -1, -1
    };
    private GLDrawable i[];
    private String j;
    private GLDrawable k;

    public HourBottom(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new GLDrawable[8];
        i = new GLDrawable[2];
        k = null;
        a(context);
    }

    private void a(Context context)
    {
        boolean flag = false;
        for (int l = 0; l < 8; l++)
        {
            f[l] = p.a(context, (new int[] {
                0x7f0202d6, 0x7f0202d0, 0x7f0202c2, 0x7f0202c6, 0x7f0202ce, 0x7f0202c8, 0x7f0202cc, 0x7f0202d4
            })[l]);
        }

        for (int i1 = ((flag) ? 1 : 0); i1 < 2; i1++)
        {
            i[i1] = p.a(context, (new int[] {
                0x7f0202d2, 0x7f0202c4
            })[i1]);
        }

    }

    public void cleanup()
    {
        boolean flag = false;
        int l = 0;
        int i1;
        do
        {
            i1 = ((flag) ? 1 : 0);
            if (l >= 8)
            {
                break;
            }
            f[l].clear();
            l++;
        } while (true);
        for (; i1 < 2; i1++)
        {
            i[i1].clear();
        }

        super.cleanup();
    }

    public void clearData()
    {
        a.setImageDrawable(f[0]);
        k = f[0];
        d.setText("N/A");
        b.setText("N/A");
        j = "N/A";
        c.setText("N/A");
    }

    public void clearFouse()
    {
        b.setVisibility(0);
        a.setVisibility(0);
        c.setTextColor(0xffffff);
        d.setTextColor(0xff5b5a5a);
    }

    protected void dispatchDraw(GLCanvas glcanvas)
    {
        super.dispatchDraw(glcanvas);
    }

    public void draw(GLCanvas glcanvas)
    {
        super.draw(glcanvas);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (GLImageView)findViewById(0x7f090082);
        b = (SizeAdapterTextView)findViewById(0x7f0900b9);
        d = (SizeAdapterTextView)findViewById(0x7f0900ba);
        a.setIsClearForUpdate(false);
        c = (SizeAdapterTextView)findViewById(0x7f09040f);
        c.setMaxTextSize(25);
        c.setTextColor(0xffffff);
        b.setMaxTextSize(18);
        d.setMaxTextSize(18);
    }

    public void setFoucse()
    {
        a.setVisibility(4);
        b.setVisibility(4);
        c.setVisibility(0);
        c.setText(j);
        c.setTextColor(-1);
        d.setTextColor(-1);
        c.invalidate();
    }

    public void setWeather(int l, boolean flag, String s, String s1)
    {
        boolean flag1;
label0:
        {
            j = s;
            b.setText(s);
            c.setText(s);
            d.setText(s1);
            if (l < 0 || l >= 8)
            {
                return;
            }
            boolean flag2 = false;
            flag1 = flag2;
            if (!flag)
            {
                break label0;
            }
            int i1 = h[l];
            flag1 = flag2;
            if (i1 <= -1)
            {
                break label0;
            }
            if (k != null)
            {
                flag1 = flag2;
                if (i[i1] == null)
                {
                    break label0;
                }
            }
            k = i[i1];
            a.setImageDrawable(k);
            flag1 = true;
        }
        if (!flag1 && (k == null || f[l] != null))
        {
            k = f[l];
            a.setImageDrawable(k);
        }
        invalidate();
    }
}
