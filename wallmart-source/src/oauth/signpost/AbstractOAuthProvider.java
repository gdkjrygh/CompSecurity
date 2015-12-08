// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.exception.OAuthNotAuthorizedException;
import oauth.signpost.http.HttpParameters;
import oauth.signpost.http.HttpRequest;
import oauth.signpost.http.HttpResponse;

// Referenced classes of package oauth.signpost:
//            OAuthProvider, OAuthConsumer, OAuth, OAuthProviderListener

public abstract class AbstractOAuthProvider
    implements OAuthProvider
{

    private static final long serialVersionUID = 1L;
    private String accessTokenEndpointUrl;
    private String authorizationWebsiteUrl;
    private Map defaultHeaders;
    private boolean isOAuth10a;
    private transient OAuthProviderListener listener;
    private String requestTokenEndpointUrl;
    private HttpParameters responseParameters;

    public AbstractOAuthProvider(String s, String s1, String s2)
    {
        requestTokenEndpointUrl = s;
        accessTokenEndpointUrl = s1;
        authorizationWebsiteUrl = s2;
        responseParameters = new HttpParameters();
        defaultHeaders = new HashMap();
    }

    protected void closeConnection(HttpRequest httprequest, HttpResponse httpresponse)
        throws Exception
    {
    }

    protected abstract HttpRequest createRequest(String s)
        throws Exception;

    public String getAccessTokenEndpointUrl()
    {
        return accessTokenEndpointUrl;
    }

    public String getAuthorizationWebsiteUrl()
    {
        return authorizationWebsiteUrl;
    }

    public Map getRequestHeaders()
    {
        return defaultHeaders;
    }

    public String getRequestTokenEndpointUrl()
    {
        return requestTokenEndpointUrl;
    }

    protected String getResponseParameter(String s)
    {
        return responseParameters.getFirst(s);
    }

    public HttpParameters getResponseParameters()
    {
        return responseParameters;
    }

    protected void handleUnexpectedResponse(int i, HttpResponse httpresponse)
        throws Exception
    {
        if (httpresponse == null)
        {
            return;
        }
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(httpresponse.getContent()));
        StringBuilder stringbuilder = new StringBuilder();
        for (String s = bufferedreader.readLine(); s != null; s = bufferedreader.readLine())
        {
            stringbuilder.append(s);
        }

        switch (i)
        {
        default:
            throw new OAuthCommunicationException((new StringBuilder()).append("Service provider responded in error: ").append(i).append(" (").append(httpresponse.getReasonPhrase()).append(")").toString(), stringbuilder.toString());

        case 401: 
            throw new OAuthNotAuthorizedException(stringbuilder.toString());
        }
    }

    public boolean isOAuth10a()
    {
        return isOAuth10a;
    }

    public void removeListener(OAuthProviderListener oauthproviderlistener)
    {
        listener = null;
    }

    public transient void retrieveAccessToken(OAuthConsumer oauthconsumer, String s, String as[])
        throws OAuthMessageSignerException, OAuthNotAuthorizedException, OAuthExpectationFailedException, OAuthCommunicationException
    {
        this;
        JVM INSTR monitorenter ;
        if (oauthconsumer.getToken() == null || oauthconsumer.getTokenSecret() == null)
        {
            throw new OAuthExpectationFailedException("Authorized request token or token secret not set. Did you retrieve an authorized request token before?");
        }
        break MISSING_BLOCK_LABEL_35;
        oauthconsumer;
        this;
        JVM INSTR monitorexit ;
        throw oauthconsumer;
        HttpParameters httpparameters;
        httpparameters = new HttpParameters();
        httpparameters.putAll(as, true);
        if (!isOAuth10a || s == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        httpparameters.put("oauth_verifier", s, true);
        retrieveToken(oauthconsumer, accessTokenEndpointUrl, httpparameters);
        this;
        JVM INSTR monitorexit ;
    }

    public transient String retrieveRequestToken(OAuthConsumer oauthconsumer, String s, String as[])
        throws OAuthMessageSignerException, OAuthNotAuthorizedException, OAuthExpectationFailedException, OAuthCommunicationException
    {
        this;
        JVM INSTR monitorenter ;
        oauthconsumer.setTokenWithSecret(null, null);
        HttpParameters httpparameters = new HttpParameters();
        httpparameters.putAll(as, true);
        httpparameters.put("oauth_callback", s, true);
        retrieveToken(oauthconsumer, requestTokenEndpointUrl, httpparameters);
        as = responseParameters.getFirst("oauth_callback_confirmed");
        responseParameters.remove("oauth_callback_confirmed");
        isOAuth10a = Boolean.TRUE.toString().equals(as);
        if (!isOAuth10a) goto _L2; else goto _L1
_L1:
        oauthconsumer = OAuth.addQueryParameters(authorizationWebsiteUrl, new String[] {
            "oauth_token", oauthconsumer.getToken()
        });
_L4:
        this;
        JVM INSTR monitorexit ;
        return oauthconsumer;
_L2:
        oauthconsumer = OAuth.addQueryParameters(authorizationWebsiteUrl, new String[] {
            "oauth_token", oauthconsumer.getToken(), "oauth_callback", s
        });
        if (true) goto _L4; else goto _L3
_L3:
        oauthconsumer;
        throw oauthconsumer;
    }

    protected void retrieveToken(OAuthConsumer oauthconsumer, String s, HttpParameters httpparameters)
        throws OAuthMessageSignerException, OAuthCommunicationException, OAuthNotAuthorizedException, OAuthExpectationFailedException
    {
        String s1;
        HttpParameters httpparameters1;
        String s2;
        HttpParameters httpparameters2;
        String s3;
        HttpParameters httpparameters3;
        String s4;
        HttpParameters httpparameters4;
        HttpParameters httpparameters5;
        String s5;
        String s6;
        Object obj;
        Map map;
        map = getRequestHeaders();
        if (oauthconsumer.getConsumerKey() == null || oauthconsumer.getConsumerSecret() == null)
        {
            throw new OAuthExpectationFailedException("Consumer key or secret not set");
        }
        s1 = null;
        s3 = null;
        s4 = null;
        s2 = null;
        s5 = null;
        s6 = null;
        obj = null;
        httpparameters5 = null;
        httpparameters2 = httpparameters5;
        httpparameters1 = s5;
        httpparameters3 = s6;
        httpparameters4 = obj;
        s = createRequest(s);
        s2 = s;
        httpparameters2 = httpparameters5;
        s1 = s;
        httpparameters1 = s5;
        s3 = s;
        httpparameters3 = s6;
        s4 = s;
        httpparameters4 = obj;
        Iterator iterator = map.keySet().iterator();
_L2:
        s2 = s;
        httpparameters2 = httpparameters5;
        s1 = s;
        httpparameters1 = s5;
        s3 = s;
        httpparameters3 = s6;
        s4 = s;
        httpparameters4 = obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = s;
        httpparameters2 = httpparameters5;
        s1 = s;
        httpparameters1 = s5;
        s3 = s;
        httpparameters3 = s6;
        s4 = s;
        httpparameters4 = obj;
        String s7 = (String)iterator.next();
        s2 = s;
        httpparameters2 = httpparameters5;
        s1 = s;
        httpparameters1 = s5;
        s3 = s;
        httpparameters3 = s6;
        s4 = s;
        httpparameters4 = obj;
        s.setHeader(s7, (String)map.get(s7));
        if (true) goto _L2; else goto _L1
        oauthconsumer;
        s1 = s2;
        httpparameters1 = httpparameters2;
        throw oauthconsumer;
        oauthconsumer;
        int i;
        boolean flag;
        try
        {
            closeConnection(s1, httpparameters1);
        }
        // Misplaced declaration of an exception variable
        catch (OAuthConsumer oauthconsumer)
        {
            throw new OAuthCommunicationException(oauthconsumer);
        }
        throw oauthconsumer;
_L1:
        if (httpparameters == null)
        {
            break MISSING_BLOCK_LABEL_347;
        }
        s2 = s;
        httpparameters2 = httpparameters5;
        s1 = s;
        httpparameters1 = s5;
        s3 = s;
        httpparameters3 = s6;
        s4 = s;
        httpparameters4 = obj;
        if (httpparameters.isEmpty())
        {
            break MISSING_BLOCK_LABEL_347;
        }
        s2 = s;
        httpparameters2 = httpparameters5;
        s1 = s;
        httpparameters1 = s5;
        s3 = s;
        httpparameters3 = s6;
        s4 = s;
        httpparameters4 = obj;
        oauthconsumer.setAdditionalParameters(httpparameters);
        s2 = s;
        httpparameters2 = httpparameters5;
        s1 = s;
        httpparameters1 = s5;
        s3 = s;
        httpparameters3 = s6;
        s4 = s;
        httpparameters4 = obj;
        if (listener == null)
        {
            break MISSING_BLOCK_LABEL_420;
        }
        s2 = s;
        httpparameters2 = httpparameters5;
        s1 = s;
        httpparameters1 = s5;
        s3 = s;
        httpparameters3 = s6;
        s4 = s;
        httpparameters4 = obj;
        listener.prepareRequest(s);
        s2 = s;
        httpparameters2 = httpparameters5;
        s1 = s;
        httpparameters1 = s5;
        s3 = s;
        httpparameters3 = s6;
        s4 = s;
        httpparameters4 = obj;
        oauthconsumer.sign(s);
        s2 = s;
        httpparameters2 = httpparameters5;
        s1 = s;
        httpparameters1 = s5;
        s3 = s;
        httpparameters3 = s6;
        s4 = s;
        httpparameters4 = obj;
        if (listener == null)
        {
            break MISSING_BLOCK_LABEL_529;
        }
        s2 = s;
        httpparameters2 = httpparameters5;
        s1 = s;
        httpparameters1 = s5;
        s3 = s;
        httpparameters3 = s6;
        s4 = s;
        httpparameters4 = obj;
        listener.prepareSubmission(s);
        s2 = s;
        httpparameters2 = httpparameters5;
        s1 = s;
        httpparameters1 = s5;
        s3 = s;
        httpparameters3 = s6;
        s4 = s;
        httpparameters4 = obj;
        httpparameters = sendRequest(s);
        s2 = s;
        httpparameters2 = httpparameters;
        s1 = s;
        httpparameters1 = httpparameters;
        s3 = s;
        httpparameters3 = httpparameters;
        s4 = s;
        httpparameters4 = httpparameters;
        i = httpparameters.getStatusCode();
        flag = false;
        s2 = s;
        httpparameters2 = httpparameters;
        s1 = s;
        httpparameters1 = httpparameters;
        s3 = s;
        httpparameters3 = httpparameters;
        s4 = s;
        httpparameters4 = httpparameters;
        if (listener == null)
        {
            break MISSING_BLOCK_LABEL_666;
        }
        s2 = s;
        httpparameters2 = httpparameters;
        s1 = s;
        httpparameters1 = httpparameters;
        s3 = s;
        httpparameters3 = httpparameters;
        s4 = s;
        httpparameters4 = httpparameters;
        flag = listener.onResponseReceived(s, httpparameters);
        if (flag)
        {
            try
            {
                closeConnection(s, httpparameters);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OAuthConsumer oauthconsumer)
            {
                throw new OAuthCommunicationException(oauthconsumer);
            }
        }
        if (i < 300)
        {
            break MISSING_BLOCK_LABEL_727;
        }
        s2 = s;
        httpparameters2 = httpparameters;
        s1 = s;
        httpparameters1 = httpparameters;
        s3 = s;
        httpparameters3 = httpparameters;
        s4 = s;
        httpparameters4 = httpparameters;
        handleUnexpectedResponse(i, httpparameters);
        s2 = s;
        httpparameters2 = httpparameters;
        s1 = s;
        httpparameters1 = httpparameters;
        s3 = s;
        httpparameters3 = httpparameters;
        s4 = s;
        httpparameters4 = httpparameters;
        httpparameters5 = OAuth.decodeForm(httpparameters.getContent());
        s2 = s;
        httpparameters2 = httpparameters;
        s1 = s;
        httpparameters1 = httpparameters;
        s3 = s;
        httpparameters3 = httpparameters;
        s4 = s;
        httpparameters4 = httpparameters;
        s5 = httpparameters5.getFirst("oauth_token");
        s2 = s;
        httpparameters2 = httpparameters;
        s1 = s;
        httpparameters1 = httpparameters;
        s3 = s;
        httpparameters3 = httpparameters;
        s4 = s;
        httpparameters4 = httpparameters;
        s6 = httpparameters5.getFirst("oauth_token_secret");
        s2 = s;
        httpparameters2 = httpparameters;
        s1 = s;
        httpparameters1 = httpparameters;
        s3 = s;
        httpparameters3 = httpparameters;
        s4 = s;
        httpparameters4 = httpparameters;
        httpparameters5.remove("oauth_token");
        s2 = s;
        httpparameters2 = httpparameters;
        s1 = s;
        httpparameters1 = httpparameters;
        s3 = s;
        httpparameters3 = httpparameters;
        s4 = s;
        httpparameters4 = httpparameters;
        httpparameters5.remove("oauth_token_secret");
        s2 = s;
        httpparameters2 = httpparameters;
        s1 = s;
        httpparameters1 = httpparameters;
        s3 = s;
        httpparameters3 = httpparameters;
        s4 = s;
        httpparameters4 = httpparameters;
        setResponseParameters(httpparameters5);
        if (s5 != null && s6 != null)
        {
            break MISSING_BLOCK_LABEL_980;
        }
        s2 = s;
        httpparameters2 = httpparameters;
        s1 = s;
        httpparameters1 = httpparameters;
        s3 = s;
        httpparameters3 = httpparameters;
        s4 = s;
        httpparameters4 = httpparameters;
        throw new OAuthExpectationFailedException("Request token or token secret not set in server reply. The service provider you use is probably buggy.");
        oauthconsumer;
        s1 = s3;
        httpparameters1 = httpparameters3;
        throw oauthconsumer;
        s2 = s;
        httpparameters2 = httpparameters;
        s1 = s;
        httpparameters1 = httpparameters;
        s3 = s;
        httpparameters3 = httpparameters;
        s4 = s;
        httpparameters4 = httpparameters;
        oauthconsumer.setTokenWithSecret(s5, s6);
        try
        {
            closeConnection(s, httpparameters);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OAuthConsumer oauthconsumer)
        {
            throw new OAuthCommunicationException(oauthconsumer);
        }
        oauthconsumer;
        s1 = s4;
        httpparameters1 = httpparameters4;
        throw new OAuthCommunicationException(oauthconsumer);
    }

    protected abstract HttpResponse sendRequest(HttpRequest httprequest)
        throws Exception;

    public void setListener(OAuthProviderListener oauthproviderlistener)
    {
        listener = oauthproviderlistener;
    }

    public void setOAuth10a(boolean flag)
    {
        isOAuth10a = flag;
    }

    public void setRequestHeader(String s, String s1)
    {
        defaultHeaders.put(s, s1);
    }

    public void setResponseParameters(HttpParameters httpparameters)
    {
        responseParameters = httpparameters;
    }
}
