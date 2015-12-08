// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import com.gtp.a.a.b.c;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            ao, an

public class a extends ao
{

    private Context l;

    public a(an an1)
    {
        l = an1.h();
        a = an1.e();
        b.x = an1.f();
        b.y = an1.g();
        c = an1.b;
        d = an1.c;
        g = an1.f;
        i = an1.h;
        h = an1.g;
        f = an1.e;
        e = an1.d;
    }

    public Bitmap a(int i, int j)
    {
        Object obj2 = null;
        Object obj = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        Object obj1 = obj;
_L2:
        if (canvas != null)
        {
            float f = (g * (float)i) / (float)c;
            obj = an.a(l, a);
            ((an) (obj)).a(this.j, k);
            obj = ((an) (obj)).d();
            ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(h, 0), android.view.View.MeasureSpec.makeMeasureSpec(this.i, 0));
            ((View) (obj)).layout(0, 0, ((View) (obj)).getMeasuredWidth(), ((View) (obj)).getMeasuredHeight());
            j = (int)((float)j * b.y);
            i = (int)((float)i * b.x);
            canvas.save();
            canvas.translate(i, j);
            canvas.scale(f, f);
            ((View) (obj)).draw(canvas);
            canvas.restore();
        }
        return ((Bitmap) (obj1));
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        obj = null;
_L3:
        obj1 = obj;
        canvas = obj2;
        if (c.a())
        {
            outofmemoryerror.printStackTrace();
            obj1 = obj;
            canvas = obj2;
        }
        if (true) goto _L2; else goto _L1
_L1:
        outofmemoryerror;
          goto _L3
    }
}
