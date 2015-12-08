// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.viewex;


// Referenced classes of package com.go.weatherex.viewex:
//            FrameImageView

class b
    implements Runnable
{

    protected boolean a;
    final FrameImageView b;

    b(FrameImageView frameimageview)
    {
        b = frameimageview;
        super();
    }

    private void a()
    {
        int i;
        if (FrameImageView.a(b))
        {
            i = FrameImageView.b(b).length;
        } else
        {
            i = FrameImageView.c(b).length;
        }
        if (i != 0)
        {
            if (!a)
            {
                FrameImageView.d(b);
                if (FrameImageView.e(b) >= i)
                {
                    a = true;
                    FrameImageView.f(b);
                    FrameImageView.a(b, FrameImageView.e(b) % i);
                }
                return;
            } else
            {
                a = false;
                return;
            }
        } else
        {
            FrameImageView.a(b, -1);
            return;
        }
    }

    public void run()
    {
        a();
        if (a)
        {
            b.postDelayed(this, FrameImageView.g(b));
        } else
        if (FrameImageView.e(b) != -1)
        {
            if (FrameImageView.a(b))
            {
                b.setImageBitmap(FrameImageView.b(b)[FrameImageView.e(b)]);
            } else
            {
                b.setImageResource(FrameImageView.c(b)[FrameImageView.e(b)]);
            }
            if (FrameImageView.h(b) == -1 || FrameImageView.i(b) < FrameImageView.h(b))
            {
                b.postDelayed(this, FrameImageView.j(b));
                return;
            } else
            {
                FrameImageView.k(b);
                return;
            }
        }
    }
}
