// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.app.Activity;
import de.greenrobot.event.g;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package de.greenrobot.event.util:
//            e, d, i

public class j
{

    private g a;
    private Executor b;
    private Class c;

    private j()
    {
    }

    j(i i)
    {
        this();
    }

    public d a()
    {
        return a(null);
    }

    public d a(Activity activity)
    {
        return a(activity.getClass());
    }

    public d a(Object obj)
    {
        if (a == null)
        {
            a = g.a();
        }
        if (b == null)
        {
            b = Executors.newCachedThreadPool();
        }
        if (c == null)
        {
            c = de/greenrobot/event/util/e;
        }
        return new d(b, a, c, obj, null);
    }

    public j a(g g1)
    {
        a = g1;
        return this;
    }

    public j a(Class class1)
    {
        c = class1;
        return this;
    }

    public j a(Executor executor)
    {
        b = executor;
        return this;
    }
}
