// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.auth;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.protocol.HttpContext;

// Referenced classes of package ch.boye.httpclientandroidlib.auth:
//            AuthScheme, AuthenticationException, Credentials

public interface ContextAwareAuthScheme
    extends AuthScheme
{

    public abstract Header authenticate(Credentials credentials, HttpRequest httprequest, HttpContext httpcontext)
        throws AuthenticationException;
}
