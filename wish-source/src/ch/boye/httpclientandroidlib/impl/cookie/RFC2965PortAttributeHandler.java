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
import ch.boye.httpclientandroidlib.cookie.SetCookie2;
import java.util.StringTokenizer;

public class RFC2965PortAttributeHandler
    implements CookieAttributeHandler
{

    public RFC2965PortAttributeHandler()
    {
    }

    private static int[] parsePortAttribute(String s)
        throws MalformedCookieException
    {
        int ai[];
        int i;
        s = new StringTokenizer(s, ",");
        ai = new int[s.countTokens()];
        i = 0;
_L2:
        if (!s.hasMoreTokens())
        {
            break; /* Loop/switch isn't completed */
        }
        ai[i] = Integer.parseInt(s.nextToken().trim());
        if (ai[i] < 0)
        {
            try
            {
                throw new MalformedCookieException("Invalid Port attribute.");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new MalformedCookieException((new StringBuilder()).append("Invalid Port attribute: ").append(s.getMessage()).toString());
            }
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return ai;
    }

    private static boolean portMatch(int i, int ai[])
    {
        boolean flag1 = false;
        int j = 0;
        int k = ai.length;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < k)
                {
                    if (i != ai[j])
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j++;
        } while (true);
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
        int i = cookieorigin.getPort();
        if ((cookie instanceof ClientCookie) && ((ClientCookie)cookie).containsAttribute("port"))
        {
            if (cookie.getPorts() == null)
            {
                return false;
            }
            if (!portMatch(i, cookie.getPorts()))
            {
                return false;
            }
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
        if (setcookie instanceof SetCookie2)
        {
            setcookie = (SetCookie2)setcookie;
            if (s != null && s.trim().length() > 0)
            {
                setcookie.setPorts(parsePortAttribute(s));
            }
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
        int i = cookieorigin.getPort();
        if ((cookie instanceof ClientCookie) && ((ClientCookie)cookie).containsAttribute("port") && !portMatch(i, cookie.getPorts()))
        {
            throw new CookieRestrictionViolationException("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
        } else
        {
            return;
        }
    }
}
