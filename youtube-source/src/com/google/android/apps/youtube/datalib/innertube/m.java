// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.l;
import com.google.a.a.a.a.gt;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.a.k;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            a, n, r, InnerTubeServiceException, 
//            o, p

public final class m extends a
{

    protected m()
    {
    }

    public m(r r1, p p, l l1)
    {
        super(r1, p, l1);
    }

    public final gt a(o o1)
    {
        c.b();
        k k1 = k.a();
        n n1 = new n(this, k1);
        c.a(a.a(o1, com/google/a/a/a/a/gt, n1));
        try
        {
            o1 = (gt)k1.get();
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            throw new InnerTubeServiceException(o1);
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            throw new InnerTubeServiceException(o1);
        }
        return o1;
    }

    public final o a()
    {
        return new o(b, (byte)0);
    }
}
