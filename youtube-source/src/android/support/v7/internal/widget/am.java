// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


// Referenced classes of package android.support.v7.internal.widget:
//            ProgressBarICS

final class am
    implements Runnable
{

    final ProgressBarICS a;
    private int b;
    private int c;
    private boolean d;

    am(ProgressBarICS progressbarics, int i, int j, boolean flag)
    {
        a = progressbarics;
        super();
        b = i;
        c = j;
        d = flag;
    }

    public final void a(int i, int j, boolean flag)
    {
        b = i;
        c = j;
        d = flag;
    }

    public final void run()
    {
        ProgressBarICS.a(a, b, c, d, true);
        ProgressBarICS.a(a, this);
    }
}
