// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.NameValuePair;
import ch.boye.httpclientandroidlib.cookie.Cookie;
import ch.boye.httpclientandroidlib.cookie.CookieAttributeHandler;
import ch.boye.httpclientandroidlib.cookie.CookieOrigin;
import ch.boye.httpclientandroidlib.cookie.MalformedCookieException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.cookie:
//            AbstractCookieSpec, BasicClientCookie

public abstract class CookieSpecBase extends AbstractCookieSpec
{

    public CookieSpecBase()
    {
    }

    protected static String getDefaultDomain(CookieOrigin cookieorigin)
    {
        return cookieorigin.getHost();
    }

    protected static String getDefaultPath(CookieOrigin cookieorigin)
    {
        String s = cookieorigin.getPath();
        int j = s.lastIndexOf('/');
        cookieorigin = s;
        if (j >= 0)
        {
            int i = j;
            if (j == 0)
            {
                i = 1;
            }
            cookieorigin = s.substring(0, i);
        }
        return cookieorigin;
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
        for (Iterator iterator = getAttribHandlers().iterator(); iterator.hasNext();)
        {
            if (!((CookieAttributeHandler)iterator.next()).match(cookie, cookieorigin))
            {
                return false;
            }
        }

        return true;
    }

    protected List parse(HeaderElement aheaderelement[], CookieOrigin cookieorigin)
        throws MalformedCookieException
    {
        ArrayList arraylist = new ArrayList(aheaderelement.length);
        int k = aheaderelement.length;
        for (int i = 0; i < k; i++)
        {
            HeaderElement headerelement = aheaderelement[i];
            Object obj = headerelement.getName();
            String s = headerelement.getValue();
            if (obj == null || ((String) (obj)).length() == 0)
            {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            obj = new BasicClientCookie(((String) (obj)), s);
            ((BasicClientCookie) (obj)).setPath(getDefaultPath(cookieorigin));
            ((BasicClientCookie) (obj)).setDomain(getDefaultDomain(cookieorigin));
            NameValuePair anamevaluepair[] = headerelement.getParameters();
            for (int j = anamevaluepair.length - 1; j >= 0; j--)
            {
                NameValuePair namevaluepair = anamevaluepair[j];
                Object obj1 = namevaluepair.getName().toLowerCase(Locale.ENGLISH);
                ((BasicClientCookie) (obj)).setAttribute(((String) (obj1)), namevaluepair.getValue());
                obj1 = findAttribHandler(((String) (obj1)));
                if (obj1 != null)
                {
                    ((CookieAttributeHandler) (obj1)).parse(((ch.boye.httpclientandroidlib.cookie.SetCookie) (obj)), namevaluepair.getValue());
                }
            }

            arraylist.add(obj);
        }

        return arraylist;
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
        for (Iterator iterator = getAttribHandlers().iterator(); iterator.hasNext(); ((CookieAttributeHandler)iterator.next()).validate(cookie, cookieorigin)) { }
    }
}
