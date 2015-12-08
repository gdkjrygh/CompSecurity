// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import ch.boye.httpclientandroidlib.cookie.Cookie;
import ch.boye.httpclientandroidlib.cookie.CookieAttributeHandler;
import ch.boye.httpclientandroidlib.cookie.CookieOrigin;
import ch.boye.httpclientandroidlib.cookie.CookieRestrictionViolationException;
import ch.boye.httpclientandroidlib.cookie.MalformedCookieException;
import ch.boye.httpclientandroidlib.cookie.SetCookie;
import java.util.Locale;

public class RFC2965DomainAttributeHandler
    implements CookieAttributeHandler
{

    public RFC2965DomainAttributeHandler()
    {
    }

    public boolean domainMatch(String s, String s1)
    {
        return s.equals(s1) || s1.startsWith(".") && s.endsWith(s1);
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
        cookieorigin = cookieorigin.getHost().toLowerCase(Locale.ENGLISH);
        for (cookie = cookie.getDomain(); !domainMatch(cookieorigin, cookie) || cookieorigin.substring(0, cookieorigin.length() - cookie.length()).indexOf('.') != -1;)
        {
            return false;
        }

        return true;
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
        }
        String s1 = s.toLowerCase(Locale.ENGLISH);
        s = s1;
        if (!s1.startsWith("."))
        {
            s = (new StringBuilder()).append('.').append(s1).toString();
        }
        setcookie.setDomain(s);
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
        cookieorigin = cookieorigin.getHost().toLowerCase(Locale.ENGLISH);
        if (cookie.getDomain() == null)
        {
            throw new CookieRestrictionViolationException("Invalid cookie state: domain not specified");
        }
        String s = cookie.getDomain().toLowerCase(Locale.ENGLISH);
        if ((cookie instanceof ClientCookie) && ((ClientCookie)cookie).containsAttribute("domain"))
        {
            if (!s.startsWith("."))
            {
                throw new CookieRestrictionViolationException((new StringBuilder()).append("Domain attribute \"").append(cookie.getDomain()).append("\" violates RFC 2109: domain must start with a dot").toString());
            }
            int i = s.indexOf('.', 1);
            if ((i < 0 || i == s.length() - 1) && !s.equals(".local"))
            {
                throw new CookieRestrictionViolationException((new StringBuilder()).append("Domain attribute \"").append(cookie.getDomain()).append("\" violates RFC 2965: the value contains no embedded dots ").append("and the value is not .local").toString());
            }
            if (!domainMatch(cookieorigin, s))
            {
                throw new CookieRestrictionViolationException((new StringBuilder()).append("Domain attribute \"").append(cookie.getDomain()).append("\" violates RFC 2965: effective host name does not ").append("domain-match domain attribute.").toString());
            }
            if (cookieorigin.substring(0, cookieorigin.length() - s.length()).indexOf('.') != -1)
            {
                throw new CookieRestrictionViolationException((new StringBuilder()).append("Domain attribute \"").append(cookie.getDomain()).append("\" violates RFC 2965: ").append("effective host minus domain may not contain any dots").toString());
            }
        } else
        if (!cookie.getDomain().equals(cookieorigin))
        {
            throw new CookieRestrictionViolationException((new StringBuilder()).append("Illegal domain attribute: \"").append(cookie.getDomain()).append("\".").append("Domain of origin: \"").append(cookieorigin).append("\"").toString());
        }
    }
}
