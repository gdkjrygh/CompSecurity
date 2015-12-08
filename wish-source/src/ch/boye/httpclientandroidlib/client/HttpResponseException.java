// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client;


// Referenced classes of package ch.boye.httpclientandroidlib.client:
//            ClientProtocolException

public class HttpResponseException extends ClientProtocolException
{

    private static final long serialVersionUID = 0x9c43f7f02a6bd533L;
    private final int statusCode;

    public HttpResponseException(int i, String s)
    {
        super(s);
        statusCode = i;
    }

    public int getStatusCode()
    {
        return statusCode;
    }
}
