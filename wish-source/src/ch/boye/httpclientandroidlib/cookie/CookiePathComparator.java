// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.cookie;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package ch.boye.httpclientandroidlib.cookie:
//            Cookie

public class CookiePathComparator
    implements Serializable, Comparator
{

    private static final long serialVersionUID = 0x68695b9a07ff953aL;

    public CookiePathComparator()
    {
    }

    private String normalizePath(Cookie cookie)
    {
        Object obj = cookie.getPath();
        cookie = ((Cookie) (obj));
        if (obj == null)
        {
            cookie = "/";
        }
        obj = cookie;
        if (!cookie.endsWith("/"))
        {
            obj = (new StringBuilder()).append(cookie).append('/').toString();
        }
        return ((String) (obj));
    }

    public int compare(Cookie cookie, Cookie cookie1)
    {
        cookie = normalizePath(cookie);
        cookie1 = normalizePath(cookie1);
        if (!cookie.equals(cookie1))
        {
            if (cookie.startsWith(cookie1))
            {
                return -1;
            }
            if (cookie1.startsWith(cookie))
            {
                return 1;
            }
        }
        return 0;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Cookie)obj, (Cookie)obj1);
    }
}
