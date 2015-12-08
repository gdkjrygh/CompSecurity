// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost;

import java.io.Serializable;
import java.util.Map;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.exception.OAuthNotAuthorizedException;
import oauth.signpost.http.HttpParameters;

// Referenced classes of package oauth.signpost:
//            OAuthProviderListener, OAuthConsumer

public interface OAuthProvider
    extends Serializable
{

    public abstract String getAccessTokenEndpointUrl();

    public abstract String getAuthorizationWebsiteUrl();

    public abstract Map getRequestHeaders();

    public abstract String getRequestTokenEndpointUrl();

    public abstract HttpParameters getResponseParameters();

    public abstract boolean isOAuth10a();

    public abstract void removeListener(OAuthProviderListener oauthproviderlistener);

    public transient abstract void retrieveAccessToken(OAuthConsumer oauthconsumer, String s, String as[])
        throws OAuthMessageSignerException, OAuthNotAuthorizedException, OAuthExpectationFailedException, OAuthCommunicationException;

    public transient abstract String retrieveRequestToken(OAuthConsumer oauthconsumer, String s, String as[])
        throws OAuthMessageSignerException, OAuthNotAuthorizedException, OAuthExpectationFailedException, OAuthCommunicationException;

    public abstract void setListener(OAuthProviderListener oauthproviderlistener);

    public abstract void setOAuth10a(boolean flag);

    public abstract void setRequestHeader(String s, String s1);

    public abstract void setResponseParameters(HttpParameters httpparameters);
}
