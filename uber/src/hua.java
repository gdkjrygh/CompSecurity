// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceView;
import android.view.ViewGroup;

public class hua extends ViewGroup
{

    public static final boolean a;
    private static final String b = hua.getSimpleName();
    private int c;
    private int d;
    private SurfaceView e;

    public hua(Context context)
    {
        super(context, null);
        c = 480;
        d = 640;
        e = new SurfaceView(context);
        addView(e);
    }

    public final SurfaceView a()
    {
        if (!a && e == null)
        {
            throw new AssertionError();
        } else
        {
            return e;
        }
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawARGB(255, 255, 0, 0);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
label0:
        {
            if (flag && getChildCount() > 0)
            {
                if (!a && e == null)
                {
                    throw new AssertionError();
                }
                i = k - i;
                j = l - j;
                if (d * i <= c * j)
                {
                    break label0;
                }
                k = (c * j) / d;
                e.layout((i - k) / 2, 0, (i + k) / 2, j);
            }
            return;
        }
        k = (d * i) / c;
        e.layout(0, (j - k) / 2, i, (j + k) / 2);
    }

    protected void onMeasure(int i, int j)
    {
        int k = resolveSize(getSuggestedMinimumWidth(), i);
        int l = resolveSize(getSuggestedMinimumHeight(), j);
        String.format("Preview.onMeasure(w:%d, h:%d) setMeasuredDimension(w:%d, h:%d)", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l)
        });
        setMeasuredDimension(k, l);
    }

    static 
    {
        boolean flag;
        if (!hua.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
