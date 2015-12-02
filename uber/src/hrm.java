// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;

public final class hrm extends LinearLayout
{

    private static final int a;
    private final int b;
    private final Paint c;
    private final int d;
    private final Paint e;
    private int f;
    private float g;
    private hrl h;
    private final hrn i;

    public hrm(Context context)
    {
        this(context, (byte)0);
    }

    private hrm(Context context, byte byte0)
    {
        super(context, null);
        setWillNotDraw(false);
        float f1 = getResources().getDisplayMetrics().density;
        TypedValue typedvalue = new TypedValue();
        context.getTheme().resolveAttribute(0x1010030, typedvalue, true);
        byte0 = a(typedvalue.data);
        i = new hrn((byte)0);
        i.a(new int[] {
            context.getResources().getColor(a)
        });
        b = (int)(0.0F * f1);
        c = new Paint();
        c.setColor(byte0);
        d = (int)(f1 * 2.0F);
        e = new Paint();
    }

    private static int a(int j)
    {
        return Color.argb(38, Color.red(j), Color.green(j), Color.blue(j));
    }

    private static int a(int j, int k, float f1)
    {
        float f2 = 1.0F - f1;
        float f3 = Color.red(j);
        float f4 = Color.red(k);
        float f5 = Color.green(j);
        float f6 = Color.green(k);
        float f7 = Color.blue(j);
        float f8 = Color.blue(k);
        return Color.rgb((int)(f3 * f1 + f4 * f2), (int)(f5 * f1 + f6 * f2), (int)(f2 * f8 + f7 * f1));
    }

    final void a(int j, float f1)
    {
        f = j;
        g = f1;
        invalidate();
    }

    protected final void onDraw(Canvas canvas)
    {
        int k1 = getHeight();
        int j = getChildCount();
        Object obj;
        if (h != null)
        {
            obj = h;
        } else
        {
            obj = i;
        }
        if (j > 0)
        {
            View view = getChildAt(f);
            int j1 = view.getLeft();
            int i1 = view.getRight();
            int l = ((hrl) (obj)).a(f);
            int k;
            if (g > 0.0F && f < getChildCount() - 1)
            {
                int l1 = ((hrl) (obj)).a(f + 1);
                k = l;
                if (l != l1)
                {
                    k = a(l1, l, g);
                }
                obj = getChildAt(f + 1);
                float f1 = g;
                float f2 = ((View) (obj)).getLeft();
                float f3 = g;
                l = (int)((float)j1 * (1.0F - f3) + f1 * f2);
                f1 = g;
                f2 = ((View) (obj)).getRight();
                f3 = g;
                i1 = (int)((float)i1 * (1.0F - f3) + f2 * f1);
            } else
            {
                k = l;
                l = j1;
            }
            e.setColor(k);
            canvas.drawRect(l, k1 - d, i1, k1, e);
        }
        canvas.drawRect(0.0F, k1 - b, getWidth(), k1, c);
    }

    static 
    {
        a = hqw.ub__uber_blue_100;
    }
}
