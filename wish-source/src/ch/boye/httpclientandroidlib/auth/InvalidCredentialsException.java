// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.auth;


// Referenced classes of package ch.boye.httpclientandroidlib.auth:
//            AuthenticationException

public class InvalidCredentialsException extends AuthenticationException
{

    private static final long serialVersionUID = 0xbcea2b1f9f1b46d8L;

    public InvalidCredentialsException()
    {
    }

    public InvalidCredentialsException(String s)
    {
        super(s);
    }

    public InvalidCredentialsException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
