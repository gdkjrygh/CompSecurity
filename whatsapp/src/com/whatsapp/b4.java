// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.SurfaceHolder;

// Referenced classes of package com.whatsapp:
//            VideoView

class b4
    implements android.view.SurfaceHolder.Callback
{

    final VideoView a;

    b4(VideoView videoview)
    {
        a = videoview;
        super();
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        boolean flag = true;
        VideoView.c(a, j);
        VideoView.b(a, k);
        if (VideoView.e(a) == 3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (VideoView.k(a) == j && VideoView.j(a) == k)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 0;
        }
        if (VideoView.d(a) != null && i != 0 && j != 0)
        {
            if (VideoView.f(a) != 0)
            {
                a.seekTo(VideoView.f(a));
            }
            a.start();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        VideoView.a(a, surfaceholder);
        VideoView.h(a);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        VideoView.a(a, null);
        VideoView.a(a, true);
    }
}
