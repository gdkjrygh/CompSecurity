// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.imageload;

import android.graphics.Bitmap;
import com.android.a.aa;
import com.android.a.p;
import java.util.LinkedList;

// Referenced classes of package com.jiubang.playsdk.imageload:
//            d, j

class h
{

    final d a;
    private final p b;
    private Bitmap c;
    private aa d;
    private final LinkedList e = new LinkedList();

    public h(d d1, p p1, j j)
    {
        a = d1;
        super();
        b = p1;
        e.add(j);
    }

    static Bitmap a(h h1, Bitmap bitmap)
    {
        h1.c = bitmap;
        return bitmap;
    }

    static LinkedList a(h h1)
    {
        return h1.e;
    }

    static Bitmap b(h h1)
    {
        return h1.c;
    }

    public aa a()
    {
        return d;
    }

    public void a(aa aa)
    {
        d = aa;
    }

    public void a(j j)
    {
        e.add(j);
    }

    public boolean b(j j)
    {
        e.remove(j);
        if (e.size() == 0)
        {
            b.g();
            return true;
        } else
        {
            return false;
        }
    }
}
