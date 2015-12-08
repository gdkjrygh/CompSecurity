// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.media;

import android.net.Uri;
import com.google.a.a.a.a.fj;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model.media:
//            FormatStream

public final class b
{

    private final fj a;
    private android.net.Uri.Builder b;
    private String c;
    private final long d;

    public b()
    {
        this(0L);
    }

    private b(long l)
    {
        a = new fj();
        b = new android.net.Uri.Builder();
        c = null;
        d = 0L;
    }

    private b(FormatStream formatstream)
    {
        a = formatstream.getFormatStreamProto();
        b = FormatStream.access$100(formatstream).buildUpon();
        c = FormatStream.access$200(formatstream);
        d = FormatStream.access$300(formatstream);
    }

    b(FormatStream formatstream, byte byte0)
    {
        this(formatstream);
    }

    public final FormatStream a()
    {
        a.c = b.build().toString();
        return new FormatStream(a, c, d);
    }

    public final b a(long l)
    {
        a.m = l;
        return this;
    }
}
