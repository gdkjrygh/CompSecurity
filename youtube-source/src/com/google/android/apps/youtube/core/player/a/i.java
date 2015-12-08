// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.a;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.Util;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import org.apache.http.entity.AbstractHttpEntity;

// Referenced classes of package com.google.android.apps.youtube.core.player.a:
//            e, j

final class i extends AbstractHttpEntity
{

    private final File a;
    private final long b;
    private final long c;
    private final Key d;

    public i(File file, String s, long l, long l1, Key key)
    {
        a = (File)com.google.android.apps.youtube.common.fromguava.c.a(file);
        boolean flag;
        if (l <= l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "begin must be less than or equal to end");
        b = l;
        c = l1;
        d = key;
        setContentType(com.google.android.apps.youtube.common.fromguava.c.a(s, "contentType cannot be empty"));
    }

    public final InputStream getContent()
    {
        if (d != null)
        {
            return new e(a, b, c, d);
        } else
        {
            return new j(a, b, c);
        }
    }

    public final long getContentLength()
    {
        return (c - b) + 1L;
    }

    public final boolean isRepeatable()
    {
        return true;
    }

    public final boolean isStreaming()
    {
        return false;
    }

    public final void writeTo(OutputStream outputstream)
    {
        InputStream inputstream = getContent();
        Util.a(inputstream, outputstream);
        inputstream.close();
        return;
        outputstream;
        inputstream.close();
        throw outputstream;
    }
}
