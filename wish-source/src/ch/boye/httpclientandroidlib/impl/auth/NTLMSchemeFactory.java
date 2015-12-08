// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.auth;

import ch.boye.httpclientandroidlib.auth.AuthScheme;
import ch.boye.httpclientandroidlib.auth.AuthSchemeFactory;
import ch.boye.httpclientandroidlib.params.HttpParams;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.auth:
//            NTLMScheme, NTLMEngineImpl

public class NTLMSchemeFactory
    implements AuthSchemeFactory
{

    public NTLMSchemeFactory()
    {
    }

    public AuthScheme newInstance(HttpParams httpparams)
    {
        return new NTLMScheme(new NTLMEngineImpl());
    }
}
