// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import ch.boye.httpclientandroidlib.cookie.Cookie;
import ch.boye.httpclientandroidlib.cookie.CookieAttributeHandler;
import ch.boye.httpclientandroidlib.cookie.CookieOrigin;
import ch.boye.httpclientandroidlib.cookie.CookieRestrictionViolationException;
import ch.boye.httpclientandroidlib.cookie.MalformedCookieException;
import ch.boye.httpclientandroidlib.cookie.SetCookie;

public class BasicDomainHandler
    implements CookieAttributeHandler
{

    public BasicDomainHandler()
    {
    }

    public boolean match(Cookie cookie, CookieOrigin cookieorigin)
    {
        if (cookie == null)
        {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (cookieorigin == null)
        {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        String s = cookieorigin.getHost();
        cookieorigin = cookie.getDomain();
        if (cookieorigin != null)
        {
            if (s.equals(cookieorigin))
            {
                return true;
            }
            cookie = cookieorigin;
            if (!cookieorigin.startsWith("."))
            {
                cookie = (new StringBuilder()).append('.').append(cookieorigin).toString();
            }
            if (s.endsWith(cookie) || s.equals(cookie.substring(1)))
            {
                return true;
            }
        }
        return false;
    }

    public void parse(SetCookie setcookie, String s)
        throws MalformedCookieException
    {
        if (setcookie == null)
        {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (s == null)
        {
            throw new MalformedCookieException("Missing value for domain attribute");
        }
        if (s.trim().length() == 0)
        {
            throw new MalformedCookieException("Blank value for domain attribute");
        } else
        {
            setcookie.setDomain(s);
            return;
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieorigin)
        throws MalformedCookieException
    {
        if (cookie == null)
        {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (cookieorigin == null)
        {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        String s = cookieorigin.getHost();
        cookieorigin = cookie.getDomain();
        if (cookieorigin == null)
        {
            throw new CookieRestrictionViolationException("Cookie domain may not be null");
        }
        if (s.contains("."))
        {
            if (!s.endsWith(cookieorigin))
            {
                cookie = cookieorigin;
                if (cookieorigin.startsWith("."))
                {
                    cookie = cookieorigin.substring(1, cookieorigin.length());
                }
                if (!s.equals(cookie))
                {
                    throw new CookieRestrictionViolationException((new StringBuilder()).append("Illegal domain attribute \"").append(cookie).append("\". Domain of origin: \"").append(s).append("\"").toString());
                }
            }
        } else
        if (!s.equals(cookieorigin))
        {
            throw new CookieRestrictionViolationException((new StringBuilder()).append("Illegal domain attribute \"").append(cookieorigin).append("\". Domain of origin: \"").append(s).append("\"").toString());
        }
    }
}
