// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.whatsapp.wallpaper.ImageViewTouchBase;
import com.whatsapp.wallpaper.s;

// Referenced classes of package com.whatsapp:
//            y_, a1g, a_8, _m

public class TouchImageView extends ImageViewTouchBase
{

    private static float n = 3F;
    public static int o = 0;
    public static float r = -1F;
    public static Paint z;
    public float A;
    a1g B;
    int p;
    boolean q;
    protected boolean s;
    private long t;
    boolean u;
    boolean v;
    boolean w;
    private Handler x;
    boolean y;

    public TouchImageView(Context context)
    {
        super(context);
        q = false;
        p = 0;
        u = true;
        w = false;
        v = false;
        y = true;
        x = new y_(this);
        A = 1.0F;
        B = a1g.a();
        setRecycler(new a_8(this));
    }

    public TouchImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        q = false;
        p = 0;
        u = true;
        w = false;
        v = false;
        y = true;
        x = new y_(this);
        A = 1.0F;
        B = a1g.a();
        setRecycler(new _m(this));
    }

    static long a(TouchImageView touchimageview)
    {
        return touchimageview.t;
    }

    public void a(float f, float f1, float f2)
    {
        super.a(f, f1, f2);
    }

    public void b(float f, float f1)
    {
        super.b(f, f1);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (w)
        {
            Paint paint = new Paint();
            paint.setDither(true);
            Bitmap bitmap = ((BitmapDrawable)getResources().getDrawable(0x7f0205d5)).getBitmap();
            Matrix matrix = new Matrix(getImageMatrix());
            if (m.a() != null)
            {
                float af[] = new float[2];
                af[0] = m.c() / 2;
                af[1] = m.f() / 2;
                matrix.mapPoints(af);
                canvas.drawBitmap(bitmap, ((float)getPaddingLeft() + af[0]) - (float)(bitmap.getWidth() / 2), getHeight() / 2 - bitmap.getHeight() / 2, paint);
            }
        }
        if (s && !q)
        {
            Rect rect = new Rect(getWidth() - B.A, 0, getWidth(), getHeight());
            Rect rect1 = new Rect(getWidth() - B.A, 0, getWidth(), getHeight());
            canvas.drawRect(rect, z);
            canvas.drawRect(rect1, z);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (m.a() == null);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return false;
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        q = false;
        super.setImageBitmap(bitmap);
    }

    static 
    {
        z = new Paint();
        z.setColor(0xff000000);
    }
}
