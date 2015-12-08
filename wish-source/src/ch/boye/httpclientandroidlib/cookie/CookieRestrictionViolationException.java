// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.cookie;


// Referenced classes of package ch.boye.httpclientandroidlib.cookie:
//            MalformedCookieException

public class CookieRestrictionViolationException extends MalformedCookieException
{

    private static final long serialVersionUID = 0x664be3b3ef7da655L;

    public CookieRestrictionViolationException()
    {
    }

    public CookieRestrictionViolationException(String s)
    {
        super(s);
    }
}
