// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;

public final class czo extends czr
{

    private final Handler a = new Handler(Looper.getMainLooper());
    private final dcq b[];

    public transient czo(dcq adcq[])
    {
        b = adcq;
    }

    static dcq[] a(czo czo1)
    {
        return czo1.b;
    }

    public final void b()
    {
        dcq adcq[] = b;
        int j = adcq.length;
        for (int i = 0; i < j; i++)
        {
            adcq[i].d();
        }

    }

    public final void c()
    {
        a.postDelayed(new Runnable() {

            final czo a;

            public final void run()
            {
                dcq adcq[] = czo.a(a);
                int j = adcq.length;
                for (int i = 0; i < j; i++)
                {
                    adcq[i].e();
                }

            }

            
            {
                a = czo.this;
                super();
            }
        }, 1000L);
    }
}
