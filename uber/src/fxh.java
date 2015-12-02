// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.ubercab.rider.realtime.model.ProductGroup;

final class fxh
    implements android.view.View.OnTouchListener
{

    final fxf a;
    private final ImageView b;
    private final ProductGroup c;
    private float d;
    private float e;
    private boolean f;

    fxh(fxf fxf1, ImageView imageview, ProductGroup productgroup)
    {
        a = fxf1;
        super();
        b = imageview;
        c = productgroup;
    }

    private void a()
    {
        f = true;
    }

    private void a(MotionEvent motionevent)
    {
        if (!f || c(motionevent))
        {
            a.a(b, c);
            a.a(c);
            fxf.a(a, c, n.ht);
            return;
        } else
        {
            b();
            return;
        }
    }

    private void b()
    {
        if (fxf.e(a) != null && fxf.e(a).equals(b))
        {
            fxf.b(a, b);
            return;
        } else
        {
            fxf.c(a, b);
            return;
        }
    }

    private void b(MotionEvent motionevent)
    {
        fxf.a(a, b);
        f = false;
        e = motionevent.getX();
        d = motionevent.getY();
    }

    private boolean c(MotionEvent motionevent)
    {
        return Math.abs(motionevent.getY() - d) < (float)fxf.f(a) && Math.abs(motionevent.getX() - e) < (float)fxf.g(a);
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 42
    //                   2 50;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        b(motionevent);
        continue; /* Loop/switch isn't completed */
_L3:
        a(motionevent);
        continue; /* Loop/switch isn't completed */
_L4:
        a();
        if (true) goto _L1; else goto _L5
_L5:
    }
}
