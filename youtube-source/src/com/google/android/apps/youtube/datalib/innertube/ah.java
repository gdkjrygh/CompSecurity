// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.l;
import com.google.a.a.a.a.nw;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.a.k;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            a, ak, InnerTubeServiceException, ai, 
//            r, p

public final class ah extends a
{

    private final b d;

    protected ah()
    {
        d = null;
    }

    public ah(r r1, p p, l l1, b b1)
    {
        super(r1, p, l1);
        d = (b)c.a(b1);
    }

    public final ak a()
    {
        return new ak(b);
    }

    public final PlayerResponse a(ak ak1)
    {
        c.b();
        k k1 = k.a();
        a(ak1, ((com.google.android.apps.youtube.datalib.a.l) (k1)));
        try
        {
            ak1 = (PlayerResponse)k1.get();
        }
        // Misplaced declaration of an exception variable
        catch (ak ak1)
        {
            throw new InnerTubeServiceException(ak1);
        }
        // Misplaced declaration of an exception variable
        catch (ak ak1)
        {
            throw new InnerTubeServiceException(ak1);
        }
        return ak1;
    }

    public final void a(ak ak1, com.google.android.apps.youtube.datalib.a.l l1)
    {
        l1 = new ai(this, l1, d.b());
        c.a(a.a(ak1, com/google/a/a/a/a/nw, l1));
    }
}
