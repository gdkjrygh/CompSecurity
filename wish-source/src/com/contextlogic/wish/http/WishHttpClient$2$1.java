// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;

import ch.boye.httpclientandroidlib.cookie.Cookie;
import ch.boye.httpclientandroidlib.cookie.CookieOrigin;
import ch.boye.httpclientandroidlib.cookie.CookieSpec;
import ch.boye.httpclientandroidlib.cookie.CookieSpecFactory;
import ch.boye.httpclientandroidlib.cookie.MalformedCookieException;
import ch.boye.httpclientandroidlib.impl.cookie.BrowserCompatSpec;
import ch.boye.httpclientandroidlib.params.HttpParams;

// Referenced classes of package com.contextlogic.wish.http:
//            WishHttpClient

class erCompatSpec extends BrowserCompatSpec
{

    final ookieException this$1;

    public void validate(Cookie cookie, CookieOrigin cookieorigin)
        throws MalformedCookieException
    {
        throw new MalformedCookieException();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/http/WishHttpClient$2

/* anonymous class */
    class WishHttpClient._cls2
        implements CookieSpecFactory
    {

        final WishHttpClient this$0;

        public CookieSpec newInstance(HttpParams httpparams)
        {
            return new WishHttpClient._cls2._cls1();
        }

            
            {
                this$0 = WishHttpClient.this;
                super();
            }
    }

}
