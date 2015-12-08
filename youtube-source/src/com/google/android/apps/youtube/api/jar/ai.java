// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.view.View;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.p;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            aa

public final class ai
    implements p
{

    private final p a;
    private final aa b;
    private boolean c;

    public ai(p p1, aa aa1)
    {
        a = (p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
        b = (aa)com.google.android.apps.youtube.common.fromguava.c.a(aa1);
    }

    private void o()
    {
        if (c || !p() || !b.c())
        {
            a.n();
        }
    }

    private static boolean p()
    {
        ClassLoader classloader = android/view/View.getClassLoader();
        ClassLoader classloader1 = com/google/android/apps/youtube/api/jar/aa.getClassLoader();
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        int j1 = astacktraceelement.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            Object obj = astacktraceelement[i1];
            try
            {
                obj = Class.forName(((StackTraceElement) (obj)).getClassName());
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                return false;
            }
            if (!((Class) (obj)).getClassLoader().equals(classloader) && !((Class) (obj)).getClassLoader().equals(classloader1))
            {
                return false;
            }
            i1++;
        }
        return true;
    }

    public final void a()
    {
        o();
        a.a();
    }

    public final void a(int i1)
    {
        o();
        a.a(i1);
    }

    public final void a(boolean flag)
    {
        c = flag;
    }

    public final void a_(SubtitleTrack subtitletrack)
    {
        o();
        a.a_(subtitletrack);
    }

    public final void b()
    {
        o();
        a.b();
    }

    public final void b(boolean flag)
    {
        o();
        a.b(flag);
    }

    public final void c()
    {
        o();
        a.c();
    }

    public final void d()
    {
        o();
        a.d();
    }

    public final void e()
    {
        o();
        a.e();
    }

    public final void f()
    {
        o();
        a.f();
    }

    public final void g()
    {
        o();
        a.g();
    }

    public final void h()
    {
        o();
        a.h();
    }

    public final void i()
    {
        o();
        a.i();
    }

    public final void j()
    {
        o();
        a.j();
    }

    public final void k()
    {
        o();
        a.k();
    }

    public final void l()
    {
        o();
        a.l();
    }

    public final void m()
    {
        o();
        a.m();
    }

    public final void n()
    {
        a.n();
    }
}
