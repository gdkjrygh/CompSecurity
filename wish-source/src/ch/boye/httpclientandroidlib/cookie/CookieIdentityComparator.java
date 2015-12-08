// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.cookie;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package ch.boye.httpclientandroidlib.cookie:
//            Cookie

public class CookieIdentityComparator
    implements Serializable, Comparator
{

    private static final long serialVersionUID = 0x3dfc6d99bbaa936cL;

    public CookieIdentityComparator()
    {
    }

    public int compare(Cookie cookie, Cookie cookie1)
    {
        int j = cookie.getName().compareTo(cookie1.getName());
        int i = j;
        if (j == 0)
        {
            String s1 = cookie.getDomain();
            String s;
            String s2;
            int k;
            if (s1 == null)
            {
                s = "";
            } else
            {
                s = s1;
                if (s1.indexOf('.') == -1)
                {
                    s = (new StringBuilder()).append(s1).append(".local").toString();
                }
            }
            s2 = cookie1.getDomain();
            if (s2 == null)
            {
                s1 = "";
            } else
            {
                s1 = s2;
                if (s2.indexOf('.') == -1)
                {
                    s1 = (new StringBuilder()).append(s2).append(".local").toString();
                }
            }
            i = s.compareToIgnoreCase(s1);
        }
        k = i;
        if (i == 0)
        {
            s = cookie.getPath();
            cookie = s;
            if (s == null)
            {
                cookie = "/";
            }
            s = cookie1.getPath();
            cookie1 = s;
            if (s == null)
            {
                cookie1 = "/";
            }
            k = cookie.compareTo(cookie1);
        }
        return k;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Cookie)obj, (Cookie)obj1);
    }
}
