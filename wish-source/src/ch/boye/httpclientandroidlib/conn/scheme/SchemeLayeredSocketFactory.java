// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn.scheme;

import ch.boye.httpclientandroidlib.params.HttpParams;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

// Referenced classes of package ch.boye.httpclientandroidlib.conn.scheme:
//            SchemeSocketFactory

public interface SchemeLayeredSocketFactory
    extends SchemeSocketFactory
{

    public abstract Socket createLayeredSocket(Socket socket, String s, int i, HttpParams httpparams)
        throws IOException, UnknownHostException;
}
