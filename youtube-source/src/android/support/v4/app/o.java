// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            m, FragmentActivity

final class o
    implements Runnable
{

    final int a;
    final int b;
    final m c;

    o(m m1, int i, int j)
    {
        c = m1;
        a = i;
        b = j;
        super();
    }

    public final void run()
    {
        m m1 = c;
        android.os.Handler handler = c.o.a;
        m1.a(null, a, b);
    }
}
