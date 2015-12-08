// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn;

import ch.boye.httpclientandroidlib.HttpClientConnection;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpInetConnection;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.io.IOException;
import java.net.Socket;

public interface OperatedClientConnection
    extends HttpClientConnection, HttpInetConnection
{

    public abstract Socket getSocket();

    public abstract HttpHost getTargetHost();

    public abstract boolean isSecure();

    public abstract void openCompleted(boolean flag, HttpParams httpparams)
        throws IOException;

    public abstract void opening(Socket socket, HttpHost httphost)
        throws IOException;

    public abstract void update(Socket socket, HttpHost httphost, boolean flag, HttpParams httpparams)
        throws IOException;
}
