// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import ch.boye.httpclientandroidlib.cookie.Cookie;
import ch.boye.httpclientandroidlib.cookie.CookieOrigin;
import ch.boye.httpclientandroidlib.cookie.CookieRestrictionViolationException;
import ch.boye.httpclientandroidlib.cookie.MalformedCookieException;
import java.util.Locale;
import java.util.StringTokenizer;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.cookie:
//            BasicDomainHandler

public class NetscapeDomainHandler extends BasicDomainHandler
{

    public NetscapeDomainHandler()
    {
    }

    private static boolean isSpecialDomain(String s)
    {
        s = s.toUpperCase(Locale.ENGLISH);
        return s.endsWith(".COM") || s.endsWith(".EDU") || s.endsWith(".NET") || s.endsWith(".GOV") || s.endsWith(".MIL") || s.endsWith(".ORG") || s.endsWith(".INT");
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
        cookieorigin = cookieorigin.getHost();
        cookie = cookie.getDomain();
        if (cookie == null)
        {
            return false;
        } else
        {
            return cookieorigin.endsWith(cookie);
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieorigin)
        throws MalformedCookieException
    {
        super.validate(cookie, cookieorigin);
        cookieorigin = cookieorigin.getHost();
        cookie = cookie.getDomain();
        if (cookieorigin.contains("."))
        {
            int i = (new StringTokenizer(cookie, ".")).countTokens();
            if (isSpecialDomain(cookie))
            {
                if (i < 2)
                {
                    throw new CookieRestrictionViolationException((new StringBuilder()).append("Domain attribute \"").append(cookie).append("\" violates the Netscape cookie specification for ").append("special domains").toString());
                }
            } else
            if (i < 3)
            {
                throw new CookieRestrictionViolationException((new StringBuilder()).append("Domain attribute \"").append(cookie).append("\" violates the Netscape cookie specification").toString());
            }
        }
    }
}
