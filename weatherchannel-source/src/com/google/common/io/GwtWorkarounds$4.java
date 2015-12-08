// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.common.io:
//            GwtWorkarounds

static final class val.output extends OutputStream
{

    final teOutput val$output;

    public void close()
        throws IOException
    {
        val$output.close();
    }

    public void flush()
        throws IOException
    {
        val$output.flush();
    }

    public void write(int i)
        throws IOException
    {
        val$output.write((byte)i);
    }

    teOutput(teOutput teoutput)
    {
        val$output = teoutput;
        super();
    }
}
