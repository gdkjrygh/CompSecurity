// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import ch.boye.httpclientandroidlib.cookie.MalformedCookieException;
import ch.boye.httpclientandroidlib.cookie.SetCookie;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.cookie:
//            AbstractCookieAttributeHandler

public class BasicCommentHandler extends AbstractCookieAttributeHandler
{

    public BasicCommentHandler()
    {
    }

    public void parse(SetCookie setcookie, String s)
        throws MalformedCookieException
    {
        if (setcookie == null)
        {
            throw new IllegalArgumentException("Cookie may not be null");
        } else
        {
            setcookie.setComment(s);
            return;
        }
    }
}
