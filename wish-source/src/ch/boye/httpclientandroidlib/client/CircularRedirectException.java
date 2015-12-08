// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client;


// Referenced classes of package ch.boye.httpclientandroidlib.client:
//            RedirectException

public class CircularRedirectException extends RedirectException
{

    private static final long serialVersionUID = 0x5ec9428de010dedbL;

    public CircularRedirectException()
    {
    }

    public CircularRedirectException(String s)
    {
        super(s);
    }

    public CircularRedirectException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
