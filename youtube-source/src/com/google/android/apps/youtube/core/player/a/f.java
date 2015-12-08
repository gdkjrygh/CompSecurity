// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.a;

import com.google.android.apps.youtube.common.fromguava.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.exoplayer.upstream.i;
import com.google.android.exoplayer.upstream.j;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;

public final class f extends AbstractHttpEntity
{

    final j a;
    private final i b;

    public f(i i, j j1, String s)
    {
        b = i;
        a = j1;
        setContentType(c.a(s, "contentType cannot be empty."));
    }

    public final InputStream getContent()
    {
        return new com.google.android.exoplayer.e.c(b, a);
    }

    public final long getContentLength()
    {
        return a.e;
    }

    public final boolean isRepeatable()
    {
        return true;
    }

    public final boolean isStreaming()
    {
        return true;
    }

    public final void writeTo(OutputStream outputstream)
    {
        InputStream inputstream;
        c.a(outputstream);
        inputstream = getContent();
        com.google.android.apps.youtube.common.fromguava.a.a(inputstream, outputstream);
        inputstream.close();
        outputstream.close();
        return;
        Exception exception;
        exception;
        inputstream.close();
        outputstream.close();
        throw exception;
    }
}
