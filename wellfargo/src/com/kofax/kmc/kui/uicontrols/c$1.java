// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            c

class a
    implements ad.UncaughtExceptionHandler
{

    final c a;

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        if (throwable.getClass().isInstance(java/lang/RuntimeException))
        {
            c.a(a, (RuntimeException)throwable);
            return;
        } else
        {
            c.a(a, new RuntimeException(throwable));
            return;
        }
    }

    nHandler(c c1)
    {
        a = c1;
        super();
    }
}
