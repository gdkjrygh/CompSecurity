// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;
import java.io.Reader;

// Referenced classes of package com.google.common.io:
//            GwtWorkarounds

static final class val.reader
    implements arInput
{

    final Reader val$reader;

    public void close()
        throws IOException
    {
        val$reader.close();
    }

    public int read()
        throws IOException
    {
        return val$reader.read();
    }

    arInput(Reader reader1)
    {
        val$reader = reader1;
        super();
    }
}
