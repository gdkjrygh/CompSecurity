// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//            v, u

final class w
    implements Runnable
{

    final v a;

    w(v v1)
    {
        a = v1;
        super();
    }

    public final void run()
    {
        if (u.a(a.a))
        {
            u.a(a.a, false);
            u.b(a.a);
        }
    }
}
