// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            ab, ac

class aj
    implements Runnable
{

    final ab a;

    private aj(ab ab1)
    {
        a = ab1;
        super();
    }

    aj(ab ab1, ac ac)
    {
        this(ab1);
    }

    public void run()
    {
        a.e();
    }
}
