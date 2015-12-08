// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import android.view.Display;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//            bk, ap, bm, d, 
//            ar, c, ao, aq, 
//            bt

class bo extends bk
    implements ap
{

    private ao j;
    private ar k;

    public bo(Context context, bt bt)
    {
        super(context, bt);
    }

    protected void a(bm bm1, d d1)
    {
        super.a(bm1, d1);
        if (!((android.media.MediaRouter.RouteInfo)bm1.a).isEnabled())
        {
            d1.a(false);
        }
        if (a(bm1))
        {
            d1.b(true);
        }
        bm1 = ((android.media.MediaRouter.RouteInfo)bm1.a).getPresentationDisplay();
        if (bm1 != null)
        {
            d1.f(bm1.getDisplayId());
        }
    }

    protected boolean a(bm bm1)
    {
        if (k == null)
        {
            k = new ar();
        }
        return k.a(bm1.a);
    }

    public final void f(Object obj)
    {
        int i = g(obj);
        if (i >= 0)
        {
            bm bm1 = (bm)h.get(i);
            obj = ((android.media.MediaRouter.RouteInfo)obj).getPresentationDisplay();
            if (obj != null)
            {
                i = ((Display) (obj)).getDisplayId();
            } else
            {
                i = -1;
            }
            if (i != bm1.c.l())
            {
                bm1.c = (new d(bm1.c)).f(i).a();
                f();
            }
        }
    }

    protected void g()
    {
        super.g();
        if (j == null)
        {
            j = new ao(a(), b());
        }
        ao ao1 = j;
        int i;
        if (f)
        {
            i = e;
        } else
        {
            i = 0;
        }
        ao1.a(i);
    }

    protected final Object h()
    {
        return new aq(this);
    }
}
