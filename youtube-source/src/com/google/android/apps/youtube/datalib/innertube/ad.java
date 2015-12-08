// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.l;
import com.google.a.a.a.a.mb;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.a.k;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            a, ae, r, InnerTubeServiceException, 
//            af, p

public final class ad extends a
{

    protected ad()
    {
    }

    public ad(r r1, p p, l l1)
    {
        super(r1, p, l1);
    }

    public final mb a(af af1)
    {
        c.b();
        k k1 = k.a();
        ae ae1 = new ae(this, k1);
        c.a(a.a(af1, com/google/a/a/a/a/mb, ae1));
        try
        {
            af1 = (mb)k1.get();
        }
        // Misplaced declaration of an exception variable
        catch (af af1)
        {
            throw new InnerTubeServiceException(af1);
        }
        // Misplaced declaration of an exception variable
        catch (af af1)
        {
            throw new InnerTubeServiceException(af1);
        }
        return af1;
    }

    public final af a()
    {
        return new af(b);
    }
}
