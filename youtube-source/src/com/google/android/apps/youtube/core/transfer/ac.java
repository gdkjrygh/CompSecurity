// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.InputStreamEntity;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            ad, aa

final class ac extends InputStreamEntity
{

    final aa a;
    private final long b;

    public ac(aa aa, InputStream inputstream, long l, long l1)
    {
        a = aa;
        super(inputstream, l);
        b = l1;
    }

    public final void writeTo(OutputStream outputstream)
    {
        super.writeTo(new ad(a, outputstream, b));
    }
}
