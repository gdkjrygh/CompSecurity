// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            ag, ac

class ai
    implements Runnable
{

    final ag a;

    private ai(ag ag1)
    {
        a = ag1;
        super();
    }

    ai(ag ag1, ac ac)
    {
        this(ag1);
    }

    public void run()
    {
        ag.b(a);
    }
}
