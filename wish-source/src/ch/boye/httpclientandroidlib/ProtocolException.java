// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib;


// Referenced classes of package ch.boye.httpclientandroidlib:
//            HttpException

public class ProtocolException extends HttpException
{

    private static final long serialVersionUID = 0xe24081770b16ae3eL;

    public ProtocolException()
    {
    }

    public ProtocolException(String s)
    {
        super(s);
    }

    public ProtocolException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
