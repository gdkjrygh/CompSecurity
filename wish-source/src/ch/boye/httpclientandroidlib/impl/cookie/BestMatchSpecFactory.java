// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import ch.boye.httpclientandroidlib.cookie.CookieSpec;
import ch.boye.httpclientandroidlib.cookie.CookieSpecFactory;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.util.Collection;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.cookie:
//            BestMatchSpec

public class BestMatchSpecFactory
    implements CookieSpecFactory
{

    public BestMatchSpecFactory()
    {
    }

    public CookieSpec newInstance(HttpParams httpparams)
    {
        if (httpparams != null)
        {
            String as[] = null;
            Collection collection = (Collection)httpparams.getParameter("http.protocol.cookie-datepatterns");
            if (collection != null)
            {
                as = (String[])collection.toArray(new String[collection.size()]);
            }
            return new BestMatchSpec(as, httpparams.getBooleanParameter("http.protocol.single-cookie-header", false));
        } else
        {
            return new BestMatchSpec();
        }
    }
}
