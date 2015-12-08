// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;
import java.io.Writer;

// Referenced classes of package com.google.common.io:
//            GwtWorkarounds

static final class val.writer
    implements arOutput
{

    final Writer val$writer;

    public void close()
        throws IOException
    {
        val$writer.close();
    }

    public void flush()
        throws IOException
    {
        val$writer.flush();
    }

    public void write(char c)
        throws IOException
    {
        val$writer.append(c);
    }

    arOutput(Writer writer1)
    {
        val$writer = writer1;
        super();
    }
}
