// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn;


// Referenced classes of package ch.boye.httpclientandroidlib.conn:
//            ConnectTimeoutException

public class ConnectionPoolTimeoutException extends ConnectTimeoutException
{

    private static final long serialVersionUID = 0x92618f2e641d1178L;

    public ConnectionPoolTimeoutException()
    {
    }

    public ConnectionPoolTimeoutException(String s)
    {
        super(s);
    }
}
