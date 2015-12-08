// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            h, b, a, f

final class i
    implements Runnable
{

    final f a;
    final b b;
    final h c;

    i(h h1, f f, b b1)
    {
        c = h1;
        a = f;
        b = b1;
        super();
    }

    public final void run()
    {
        a a1 = (a)h.a(c).a(a).get();
        if (a1.a())
        {
            h.c(c).a(com.google.android.apps.youtube.core.identity.h.b(c).a(a1.d()), b);
            return;
        }
        try
        {
            b.a(null, new IllegalStateException("Authentication unsuccessful."));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            b.a(null, interruptedexception);
            return;
        }
        catch (ExecutionException executionexception)
        {
            b.a(null, executionexception);
        }
        return;
    }
}
