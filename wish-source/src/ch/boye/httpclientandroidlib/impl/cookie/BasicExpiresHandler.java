// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import ch.boye.httpclientandroidlib.cookie.MalformedCookieException;
import ch.boye.httpclientandroidlib.cookie.SetCookie;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.cookie:
//            AbstractCookieAttributeHandler, DateParseException, DateUtils

public class BasicExpiresHandler extends AbstractCookieAttributeHandler
{

    private final String datepatterns[];

    public BasicExpiresHandler(String as[])
    {
        if (as == null)
        {
            throw new IllegalArgumentException("Array of date patterns may not be null");
        } else
        {
            datepatterns = as;
            return;
        }
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
            throw new MalformedCookieException("Missing value for expires attribute");
        }
        try
        {
            setcookie.setExpiryDate(DateUtils.parseDate(s, datepatterns));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SetCookie setcookie)
        {
            throw new MalformedCookieException((new StringBuilder()).append("Unable to parse expires attribute: ").append(s).toString());
        }
    }
}
