// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.l;
import com.google.a.a.a.a.ra;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.a.k;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            a, r, InnerTubeServiceException, ac, 
//            p

public final class ab extends a
{

    protected ab()
    {
    }

    public ab(r r1, p p, l l1)
    {
        super(r1, p, l1);
    }

    public final ra a(ac ac1)
    {
        c.b();
        k k1 = k.a();
        c.a(a.a(ac1, com/google/a/a/a/a/ra, k1));
        try
        {
            ac1 = (ra)k1.get();
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw new InnerTubeServiceException(ac1);
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw new InnerTubeServiceException(ac1);
        }
        return ac1;
    }

    public final ac a()
    {
        return new ac(b, (byte)0);
    }
}
