// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.Collection;

// Referenced classes of package com.whatsapp:
//            wd, MediaView, App, k, 
//            og

class xv
    implements wd
{

    final MediaView a;

    xv(MediaView mediaview)
    {
        a = mediaview;
        super();
    }

    public void a()
    {
    }

    public void a(String s)
    {
    }

    public void a(Collection collection)
    {
    }

    public void b(String s)
    {
    }

    public void c(String s)
    {
    }

    public void d(String s)
    {
label0:
        {
            if (MediaView.n(a) != null && MediaView.n(a).equals(s))
            {
                a.removeDialog(1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            oh oh = App.az.f();
            if (oh != null && s.equals(((og) (oh)).a))
            {
                a.removeDialog(0);
            }
        }
    }
}
