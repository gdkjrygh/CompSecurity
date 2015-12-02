// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;

final class dfr extends cev
{

    private final Handler a;

    private dfr()
    {
        a = new Handler(Looper.getMainLooper());
    }

    dfr(byte byte0)
    {
        this();
    }

    public final void c(Object obj)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            super.c(obj);
            return;
        } else
        {
            a.post(new Runnable(obj) {

                final Object a;
                final dfr b;

                public final void run()
                {
                    b.c(a);
                }

            
            {
                b = dfr.this;
                a = obj;
                super();
            }
            });
            return;
        }
    }
}
