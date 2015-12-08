// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            FacebookException, FacebookRequestError

public class FacebookServiceException extends FacebookException
{

    private static final long serialVersionUID = 1L;
    private final FacebookRequestError error;

    public FacebookServiceException(FacebookRequestError facebookrequesterror, String s)
    {
        super(s);
        error = facebookrequesterror;
    }

    public final FacebookRequestError getRequestError()
    {
        return error;
    }

    public final String toString()
    {
        return (new StringBuilder()).append("{FacebookServiceException: ").append("httpResponseCode: ").append(error.getRequestStatusCode()).append(", facebookErrorCode: ").append(error.getErrorCode()).append(", facebookErrorType: ").append(error.getErrorType()).append(", message: ").append(error.getErrorMessage()).append("}").toString();
    }
}
