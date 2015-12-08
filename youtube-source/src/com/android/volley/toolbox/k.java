// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//            g, m

final class k
{

    final g a;
    private final Request b;
    private Bitmap c;
    private VolleyError d;
    private final LinkedList e = new LinkedList();

    public k(g g, Request request, m m)
    {
        a = g;
        super();
        b = request;
        e.add(m);
    }

    static Bitmap a(k k1, Bitmap bitmap)
    {
        k1.c = bitmap;
        return bitmap;
    }

    static LinkedList a(k k1)
    {
        return k1.e;
    }

    static Bitmap b(k k1)
    {
        return k1.c;
    }

    public final VolleyError a()
    {
        return d;
    }

    public final void a(VolleyError volleyerror)
    {
        d = volleyerror;
    }

    public final void a(m m)
    {
        e.add(m);
    }

    public final boolean b(m m)
    {
        e.remove(m);
        if (e.size() == 0)
        {
            b.f();
            return true;
        } else
        {
            return false;
        }
    }
}
