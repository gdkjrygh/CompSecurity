// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            iv, MediaView, PhotoView, ow

class b_
    implements iv
{

    final MediaView.MediaViewPager a;
    final MediaView b;

    b_(MediaView.MediaViewPager mediaviewpager, MediaView mediaview)
    {
        a = mediaviewpager;
        b = mediaview;
        super();
    }

    public ow a(float f, float f1)
    {
        boolean flag = false;
        if (!a.g.isFinishing())
        {
            Object obj = MediaView.b(a.g, a.getCurrentItem());
            obj = MediaView.a(a.g, ((com.whatsapp.protocol.c4) (obj)));
            boolean flag1;
            if (obj != null)
            {
                flag1 = ((PhotoView) (obj)).b(f, f1);
                flag = ((PhotoView) (obj)).c(f, f1);
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                if (flag)
                {
                    return ow.BOTH;
                } else
                {
                    return ow.LEFT;
                }
            }
            if (flag)
            {
                return ow.RIGHT;
            }
        }
        return ow.NONE;
    }
}
