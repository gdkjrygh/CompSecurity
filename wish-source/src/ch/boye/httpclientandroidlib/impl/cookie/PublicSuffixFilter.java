// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import ch.boye.httpclientandroidlib.client.utils.Punycode;
import ch.boye.httpclientandroidlib.cookie.Cookie;
import ch.boye.httpclientandroidlib.cookie.CookieAttributeHandler;
import ch.boye.httpclientandroidlib.cookie.CookieOrigin;
import ch.boye.httpclientandroidlib.cookie.MalformedCookieException;
import ch.boye.httpclientandroidlib.cookie.SetCookie;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PublicSuffixFilter
    implements CookieAttributeHandler
{

    private Set exceptions;
    private Set suffixes;
    private final CookieAttributeHandler wrapped;

    public PublicSuffixFilter(CookieAttributeHandler cookieattributehandler)
    {
        wrapped = cookieattributehandler;
    }

    private boolean isForPublicSuffix(Cookie cookie)
    {
        String s = cookie.getDomain();
        cookie = s;
        if (s.startsWith("."))
        {
            cookie = s.substring(1);
        }
        cookie = Punycode.toUnicode(cookie);
        break MISSING_BLOCK_LABEL_29;
_L2:
        do
        {
            return false;
        } while (exceptions != null && exceptions.contains(cookie) || suffixes == null);
        do
        {
            if (suffixes.contains(cookie))
            {
                return true;
            }
            Object obj = cookie;
            if (cookie.startsWith("*."))
            {
                obj = cookie.substring(2);
            }
            int i = ((String) (obj)).indexOf('.');
            if (i == -1)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (new StringBuilder()).append("*").append(((String) (obj)).substring(i)).toString();
            cookie = ((Cookie) (obj));
            if (((String) (obj)).length() <= 0)
            {
                return false;
            }
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean match(Cookie cookie, CookieOrigin cookieorigin)
    {
        if (isForPublicSuffix(cookie))
        {
            return false;
        } else
        {
            return wrapped.match(cookie, cookieorigin);
        }
    }

    public void parse(SetCookie setcookie, String s)
        throws MalformedCookieException
    {
        wrapped.parse(setcookie, s);
    }

    public void setExceptions(Collection collection)
    {
        exceptions = new HashSet(collection);
    }

    public void setPublicSuffixes(Collection collection)
    {
        suffixes = new HashSet(collection);
    }

    public void validate(Cookie cookie, CookieOrigin cookieorigin)
        throws MalformedCookieException
    {
        wrapped.validate(cookie, cookieorigin);
    }
}
