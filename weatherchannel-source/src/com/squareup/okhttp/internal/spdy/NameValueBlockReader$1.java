// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            NameValueBlockReader

class this._cls0 extends ForwardingSource
{

    final NameValueBlockReader this$0;

    public long read(Buffer buffer, long l)
        throws IOException
    {
        if (NameValueBlockReader.access$000(NameValueBlockReader.this) == 0)
        {
            return -1L;
        }
        l = super.read(buffer, Math.min(l, NameValueBlockReader.access$000(NameValueBlockReader.this)));
        if (l == -1L)
        {
            return -1L;
        } else
        {
            NameValueBlockReader.access$002(NameValueBlockReader.this, (int)((long)NameValueBlockReader.access$000(NameValueBlockReader.this) - l));
            return l;
        }
    }

    (Source source)
    {
        this$0 = NameValueBlockReader.this;
        super(source);
    }
}
