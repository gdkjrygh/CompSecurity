// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.viewex;

import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.gau.go.launcherex.gowidget.weather.util.t;

// Referenced classes of package com.go.weatherex.viewex:
//            f, d

public class e extends f
{

    protected float a;
    private Animation c;
    private final Transformation d = new Transformation();
    private boolean e;
    private final RectF f = new RectF();
    private final PaintFlagsDrawFilter g = new PaintFlagsDrawFilter(0, 3);
    private boolean h;

    public e(d d1, Animation animation)
    {
        super(d1);
        e = false;
        h = false;
        c = animation;
    }

    public void a(float f1)
    {
        a = f1;
        b();
    }

    public void a(boolean flag)
    {
        e = flag;
    }

    public boolean a()
    {
        return e;
    }

    public boolean a(View view, Canvas canvas)
    {
        c.initialize(view.getWidth(), view.getHeight(), view.getWidth(), view.getHeight());
        c.setStartTime(0L);
        long l = (long)((float)c.getDuration() * a);
        c.getTransformation(l, d);
        canvas.concat(d.getMatrix());
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            t.a(view, d.getAlpha());
        } else
        {
            f.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            f.set(canvas.getClipBounds());
            canvas.saveLayerAlpha(f, (int)(d.getAlpha() * 255F), 31);
        }
        if (h)
        {
            canvas.setDrawFilter(g);
        }
        return true;
    }
}
