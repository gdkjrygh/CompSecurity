// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.exception;


// Referenced classes of package oauth.signpost.exception:
//            OAuthException

public class OAuthCommunicationException extends OAuthException
{

    private String responseBody;

    public OAuthCommunicationException(Exception exception)
    {
        super((new StringBuilder()).append("Communication with the service provider failed: ").append(exception.getLocalizedMessage()).toString(), exception);
    }

    public OAuthCommunicationException(String s, String s1)
    {
        super(s);
        responseBody = s1;
    }

    public String getResponseBody()
    {
        return responseBody;
    }
}
