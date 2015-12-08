// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import ch.boye.httpclientandroidlib.cookie.CookieSpec;
import ch.boye.httpclientandroidlib.cookie.CookieSpecFactory;
import ch.boye.httpclientandroidlib.params.HttpParams;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.cookie:
//            IgnoreSpec

public class IgnoreSpecFactory
    implements CookieSpecFactory
{

    public IgnoreSpecFactory()
    {
    }

    public CookieSpec newInstance(HttpParams httpparams)
    {
        return new IgnoreSpec();
    }
}
