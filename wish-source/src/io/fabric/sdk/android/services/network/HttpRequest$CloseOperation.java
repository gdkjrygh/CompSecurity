// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            HttpRequest

protected static abstract class ignoreCloseExceptions extends ignoreCloseExceptions
{

    private final Closeable closeable;
    private final boolean ignoreCloseExceptions;

    protected void done()
        throws IOException
    {
        if (closeable instanceof Flushable)
        {
            ((Flushable)closeable).flush();
        }
        if (ignoreCloseExceptions)
        {
            try
            {
                closeable.close();
                return;
            }
            catch (IOException ioexception)
            {
                return;
            }
        } else
        {
            closeable.close();
            return;
        }
    }

    protected (Closeable closeable1, boolean flag)
    {
        closeable = closeable1;
        ignoreCloseExceptions = flag;
    }
}
