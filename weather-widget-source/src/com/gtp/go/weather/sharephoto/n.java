// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.view.View;
import android.widget.ImageView;
import com.a.c.c;
import com.gtp.go.weather.sharephoto.d.p;
import com.gtp.go.weather.sharephoto.d.s;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class n
    implements s
{

    final PhotoDetailActivity a;

    n(PhotoDetailActivity photodetailactivity)
    {
        a = photodetailactivity;
        super();
    }

    public void a(boolean flag)
    {
        float f1 = 1.0F;
        if (com.gtp.go.weather.sharephoto.PhotoDetailActivity.c(a))
        {
            Object obj = PhotoDetailActivity.d(a);
            float f;
            boolean flag1;
            if (flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ((ImageView) (obj)).setEnabled(flag1);
            PhotoDetailActivity.a(a, PhotoDetailActivity.d(a));
            obj = c.a(PhotoDetailActivity.d(a));
            if (flag)
            {
                f = 1.0F;
            } else
            {
                f = 0.0F;
            }
            obj = ((c) (obj)).a(f);
            if (flag)
            {
                f = f1;
            } else
            {
                f = 0.0F;
            }
            ((c) (obj)).b(f).a(PhotoDetailActivity.e(a)).a();
        }
        if (PhotoDetailActivity.a(a) == 1)
        {
            PhotoDetailActivity.g(a).removeCallbacks(PhotoDetailActivity.f(a));
            if (flag)
            {
                if (PhotoDetailActivity.h(a).getVisibility() != 0)
                {
                    PhotoDetailActivity.a(a, PhotoDetailActivity.h(a));
                    PhotoDetailActivity.h(a).startAnimation(PhotoDetailActivity.i(a));
                }
            } else
            {
                PhotoDetailActivity.h(a).startAnimation(PhotoDetailActivity.j(a));
            }
        }
        if (flag)
        {
            if (PhotoDetailActivity.k(a).getVisibility() != 0)
            {
                PhotoDetailActivity.a(a, PhotoDetailActivity.k(a));
                PhotoDetailActivity.k(a).startAnimation(PhotoDetailActivity.l(a));
            }
        } else
        {
            PhotoDetailActivity.k(a).startAnimation(PhotoDetailActivity.m(a));
        }
        if (flag)
        {
            PhotoDetailActivity.b(a).a(3000);
            return;
        } else
        {
            PhotoDetailActivity.b(a).f();
            return;
        }
    }
}
