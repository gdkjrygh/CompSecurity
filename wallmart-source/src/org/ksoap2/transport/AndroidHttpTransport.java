// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2.transport;

import java.io.IOException;

// Referenced classes of package org.ksoap2.transport:
//            HttpTransportSE, AndroidServiceConnection, ServiceConnection

public class AndroidHttpTransport extends HttpTransportSE
{

    public AndroidHttpTransport(String s)
    {
        super(s);
    }

    protected ServiceConnection getServiceConnection()
        throws IOException
    {
        return new AndroidServiceConnection(super.url);
    }
}
