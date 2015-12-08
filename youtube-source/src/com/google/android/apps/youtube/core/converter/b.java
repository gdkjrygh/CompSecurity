// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter;

import android.text.TextUtils;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.converter.http.dj;
import com.google.android.apps.youtube.core.converter.http.gt;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.legacy.model.bf;
import com.google.android.apps.youtube.datalib.legacy.model.bg;
import java.io.ByteArrayInputStream;

// Referenced classes of package com.google.android.apps.youtube.core.converter:
//            d, n, f, e

public final class b
    implements d
{

    private final n a;
    private final e b;

    public b(n n1, com.google.android.apps.youtube.common.e.b b1, dj dj)
    {
        a = (n)c.a(n1);
        n1 = new f();
        gt.a(n1, b1, dj);
        b = n1.a();
    }

    public final bf a(PlayerResponse playerresponse)
    {
        c.a(playerresponse);
        playerresponse = playerresponse.getVmapXml();
        if (TextUtils.isEmpty(playerresponse))
        {
            return null;
        } else
        {
            return ((bg)a.a(new ByteArrayInputStream(playerresponse.getBytes("UTF-8")), b)).a();
        }
    }

    public final Object a_(Object obj)
    {
        return a((PlayerResponse)obj);
    }
}
