// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.util.Pair;
import com.google.a.a.a.a.ii;
import com.google.a.a.a.a.tx;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.a.e;
import com.google.android.apps.youtube.datalib.a.f;
import com.google.android.apps.youtube.datalib.a.p;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            b, l, f, a

public final class k
    implements e, f, p
{

    private static final Pair b = Pair.create("", "");
    private final b c;
    private final l d;

    public k(b b1, l l1)
    {
        c = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        d = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
    }

    private Pair a()
    {
        Object obj;
        com.google.android.apps.youtube.common.fromguava.c.b();
        obj = d.g();
        if (obj == f.a)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj = (a)c.a(((com.google.android.apps.youtube.core.identity.f) (obj))).get();
        if (!((a) (obj)).a())
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj = ((a) (obj)).d();
        return ((Pair) (obj));
        Object obj1;
        obj1;
_L2:
        return b;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(ii ii1)
    {
        com.google.android.apps.youtube.core.identity.f f1 = d.g();
        if (f1.d())
        {
            ii1.c = new tx();
            ii1.c.b = f1.a();
        }
    }

    public final void a(Map map)
    {
        Pair pair = a();
        if (pair != b)
        {
            map.put(pair.first, pair.second);
        }
    }

    public final void a(HttpUriRequest httpurirequest)
    {
        Pair pair = a();
        if (pair != b)
        {
            httpurirequest.addHeader((String)pair.first, (String)pair.second);
        }
    }

}
