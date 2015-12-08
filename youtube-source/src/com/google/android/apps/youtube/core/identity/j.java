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

final class j
    implements Runnable
{

    final f a;
    final b b;
    final h c;

    j(h h1, f f1, b b1)
    {
        c = h1;
        a = f1;
        b = b1;
        super();
    }

    public final void run()
    {
        a a1 = (a)h.a(c).a(a).get();
        if (!a1.a()) goto _L2; else goto _L1
_L1:
        Object obj;
        if (!a.d())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        obj = a.a();
_L3:
        h.d(c).a(com.google.android.apps.youtube.core.identity.h.b(c).a(a1.d(), ((String) (obj))), b);
        return;
_L2:
        try
        {
            b.a(null, new IllegalStateException("Authentication unsuccessful."));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b.a(null, ((Exception) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b.a(null, ((Exception) (obj)));
        }
        return;
        obj = null;
          goto _L3
    }
}
