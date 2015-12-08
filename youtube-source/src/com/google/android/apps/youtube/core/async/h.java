// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.core.converter.d;
import java.io.IOException;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            g

final class h
    implements b, Runnable
{

    final g a;
    private final Object b;
    private final Object c;
    private final b d;
    private Object e;

    public h(g g1, Object obj, Object obj1, b b1)
    {
        a = g1;
        super();
        b = obj;
        c = obj1;
        d = b1;
    }

    public final void a(Object obj, Exception exception)
    {
        d.a(b, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        e = obj1;
        if (g.a(a) != null)
        {
            if (com.google.android.apps.youtube.core.async.g.b(a) != null)
            {
                com.google.android.apps.youtube.core.async.g.b(a).execute(this);
                return;
            } else
            {
                run();
                return;
            }
        } else
        {
            d.a(b, obj1);
            return;
        }
    }

    public final void run()
    {
        try
        {
            Object obj = g.a(a).a_(e);
            d.a(b, obj);
            return;
        }
        catch (IOException ioexception)
        {
            a.a(b, c, d, ioexception);
            return;
        }
        catch (ConverterException converterexception)
        {
            a.a(b, c, d, converterexception);
        }
    }
}
