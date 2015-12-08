// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.cookie.CookieOrigin;
import ch.boye.httpclientandroidlib.cookie.MalformedCookieException;
import java.util.Collections;
import java.util.List;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.cookie:
//            CookieSpecBase

public class IgnoreSpec extends CookieSpecBase
{

    public IgnoreSpec()
    {
    }

    public List formatCookies(List list)
    {
        return Collections.emptyList();
    }

    public int getVersion()
    {
        return 0;
    }

    public Header getVersionHeader()
    {
        return null;
    }

    public List parse(Header header, CookieOrigin cookieorigin)
        throws MalformedCookieException
    {
        return Collections.emptyList();
    }
}
