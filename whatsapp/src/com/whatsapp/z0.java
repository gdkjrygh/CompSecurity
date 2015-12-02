// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            hd, App, MediaView, w7

class z0
    implements hd
{

    final MediaView a;
    final boolean b;
    final c4 c;

    z0(MediaView mediaview, c4 c4, boolean flag)
    {
        a = mediaview;
        c = c4;
        b = flag;
        super();
    }

    public void a()
    {
label0:
        {
            int i = App.am;
            MediaView.f(a);
            MediaView.m(a).remove(c);
            MediaView.j(a).notifyDataSetChanged();
            if (MediaView.m(a).isEmpty())
            {
                a.finish();
                if (i == 0)
                {
                    break label0;
                }
            }
            if (MediaView.p(a).getCurrentItem() == 0)
            {
                MediaView.h(a, MediaView.p(a).getCurrentItem());
                if (i == 0)
                {
                    break label0;
                }
            }
            if (!b)
            {
                MediaView.e(a, 1);
            }
        }
    }
}
