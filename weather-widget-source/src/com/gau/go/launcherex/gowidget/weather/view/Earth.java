// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            s

public class Earth extends View
{

    private Bitmap a;
    private Bitmap b;
    private Bitmap c;
    private Paint d;
    private Bitmap e;
    private Canvas f;
    private float g;
    private float h;
    private float i;
    private Runnable j;

    public Earth(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = new s(this);
        a();
    }

    private void a()
    {
        d = new Paint(1);
        d.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        i = getContext().getResources().getDisplayMetrics().density;
        a = BitmapFactory.decodeResource(getResources(), 0x7f020206);
        b = BitmapFactory.decodeResource(getResources(), 0x7f020208);
        c = BitmapFactory.decodeResource(getResources(), 0x7f020207);
        e = Bitmap.createBitmap(a.getWidth(), a.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        f = new Canvas(e);
        h = a.getWidth() - c.getWidth();
    }

    static void a(Earth earth)
    {
        earth.b();
    }

    private void b()
    {
        g = g + 1.0F * i;
        if (g > 0.0F)
        {
            g = h;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        e.eraseColor(0);
        f.drawBitmap(c, g, 0.0F, null);
        f.drawBitmap(b, 0.0F, 0.0F, d);
        canvas.drawBitmap(a, 0.0F, 0.0F, null);
        canvas.drawBitmap(e, 0.0F, 0.0F, null);
        postDelayed(j, 50L);
    }

    protected void onMeasure(int k, int l)
    {
        setMeasuredDimension(a.getWidth(), a.getHeight());
    }
}
