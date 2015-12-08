// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.internal.view:
//            i

public class h
{

    private final ArrayList a = new ArrayList();
    private long b;
    private Interpolator c;
    private ViewPropertyAnimatorListener d;
    private boolean e;
    private final ViewPropertyAnimatorListenerAdapter f = new i(this);

    public h()
    {
        b = -1L;
    }

    static ViewPropertyAnimatorListener a(h h1)
    {
        return h1.d;
    }

    static void b(h h1)
    {
        h1.c();
    }

    static ArrayList c(h h1)
    {
        return h1.a;
    }

    private void c()
    {
        e = false;
    }

    public h a(long l)
    {
        if (!e)
        {
            b = l;
        }
        return this;
    }

    public h a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        if (!e)
        {
            a.add(viewpropertyanimatorcompat);
        }
        return this;
    }

    public h a(ViewPropertyAnimatorListener viewpropertyanimatorlistener)
    {
        if (!e)
        {
            d = viewpropertyanimatorlistener;
        }
        return this;
    }

    public h a(Interpolator interpolator)
    {
        if (!e)
        {
            c = interpolator;
        }
        return this;
    }

    public void a()
    {
        if (e)
        {
            return;
        }
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); viewpropertyanimatorcompat.start())
        {
            viewpropertyanimatorcompat = (ViewPropertyAnimatorCompat)iterator.next();
            if (b >= 0L)
            {
                viewpropertyanimatorcompat.setDuration(b);
            }
            if (c != null)
            {
                viewpropertyanimatorcompat.setInterpolator(c);
            }
            if (d != null)
            {
                viewpropertyanimatorcompat.setListener(f);
            }
        }

        e = true;
    }

    public void b()
    {
        if (!e)
        {
            return;
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((ViewPropertyAnimatorCompat)iterator.next()).cancel()) { }
        e = false;
    }
}
