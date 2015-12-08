// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//            e, ActionBarActivity

final class f
    implements Runnable
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public final void run()
    {
        android.support.v7.internal.view.menu.o o = e.a(a);
        if (a.a.a(0, o) && a.a.a(0, null, o))
        {
            e.a(a, o);
        } else
        {
            e.a(a, null);
        }
        e.a(a, false);
    }
}
