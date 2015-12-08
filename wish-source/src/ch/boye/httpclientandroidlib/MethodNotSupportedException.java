// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib;


// Referenced classes of package ch.boye.httpclientandroidlib:
//            HttpException

public class MethodNotSupportedException extends HttpException
{

    private static final long serialVersionUID = 0x2eb42836ac8256c1L;

    public MethodNotSupportedException(String s)
    {
        super(s);
    }

    public MethodNotSupportedException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
