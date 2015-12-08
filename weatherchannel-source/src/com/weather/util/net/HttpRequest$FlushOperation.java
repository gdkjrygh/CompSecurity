// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.net;

import java.io.Flushable;
import java.io.IOException;

// Referenced classes of package com.weather.util.net:
//            HttpRequest

protected static abstract class flushable extends flushable
{

    private final Flushable flushable;

    protected void done()
        throws IOException
    {
        flushable.flush();
    }

    protected (Flushable flushable1)
    {
        flushable = flushable1;
    }
}
