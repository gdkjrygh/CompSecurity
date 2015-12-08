// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

// Referenced classes of package com.facebook.internal:
//            ImageResponseCache, Utility

private static class connection extends BufferedInputStream
{

    HttpURLConnection connection;

    public void close()
        throws IOException
    {
        super.close();
        Utility.disconnectQuietly(connection);
    }

    (InputStream inputstream, HttpURLConnection httpurlconnection)
    {
        super(inputstream, 8192);
        connection = httpurlconnection;
    }
}
