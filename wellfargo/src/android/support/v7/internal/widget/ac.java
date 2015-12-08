// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


// Referenced classes of package android.support.v7.internal.widget:
//            w, x

class ac
    implements Runnable
{

    final w a;

    private ac(w w1)
    {
        a = w1;
        super();
    }

    ac(w w1, x x)
    {
        this(w1);
    }

    public void run()
    {
        if (a.u)
        {
            if (a.getAdapter() != null)
            {
                a.post(this);
            }
            return;
        } else
        {
            w.b(a);
            return;
        }
    }
}
