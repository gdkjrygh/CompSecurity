// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.cookie;


// Referenced classes of package ch.boye.httpclientandroidlib.cookie:
//            MalformedCookieException, Cookie, CookieOrigin, SetCookie

public interface CookieAttributeHandler
{

    public abstract boolean match(Cookie cookie, CookieOrigin cookieorigin);

    public abstract void parse(SetCookie setcookie, String s)
        throws MalformedCookieException;

    public abstract void validate(Cookie cookie, CookieOrigin cookieorigin)
        throws MalformedCookieException;
}
