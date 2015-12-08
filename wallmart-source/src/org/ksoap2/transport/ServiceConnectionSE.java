// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2.transport;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package org.ksoap2.transport:
//            ServiceConnection

public class ServiceConnectionSE
    implements ServiceConnection
{

    private HttpURLConnection connection;

    public ServiceConnectionSE(String s)
        throws IOException
    {
        connection = (HttpURLConnection)(new URL(s)).openConnection();
        connection.setUseCaches(false);
        connection.setDoOutput(true);
        connection.setDoInput(true);
    }

    public void connect()
        throws IOException
    {
        connection.connect();
    }

    public void disconnect()
    {
        connection.disconnect();
    }

    public InputStream getErrorStream()
    {
        return connection.getErrorStream();
    }

    public InputStream openInputStream()
        throws IOException
    {
        return connection.getInputStream();
    }

    public OutputStream openOutputStream()
        throws IOException
    {
        return connection.getOutputStream();
    }

    public void setRequestMethod(String s)
        throws IOException
    {
        connection.setRequestMethod(s);
    }

    public void setRequestProperty(String s, String s1)
    {
        connection.setRequestProperty(s, s1);
    }
}
