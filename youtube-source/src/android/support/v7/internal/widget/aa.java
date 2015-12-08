// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


// Referenced classes of package android.support.v7.internal.widget:
//            v

final class aa
    implements Runnable
{

    final v a;

    private aa(v v1)
    {
        a = v1;
        super();
    }

    aa(v v1, byte byte0)
    {
        this(v1);
    }

    public final void run()
    {
        if (a.u)
        {
            if (a.c() != null)
            {
                a.post(this);
            }
            return;
        } else
        {
            v.b(a);
            return;
        }
    }
}
