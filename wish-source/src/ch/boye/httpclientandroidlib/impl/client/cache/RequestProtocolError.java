// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;


final class RequestProtocolError extends Enum
{

    private static final RequestProtocolError $VALUES[];
    public static final RequestProtocolError BODY_BUT_NO_LENGTH_ERROR;
    public static final RequestProtocolError NO_CACHE_DIRECTIVE_WITH_FIELD_NAME;
    public static final RequestProtocolError UNKNOWN;
    public static final RequestProtocolError WEAK_ETAG_AND_RANGE_ERROR;
    public static final RequestProtocolError WEAK_ETAG_ON_PUTDELETE_METHOD_ERROR;

    private RequestProtocolError(String s, int i)
    {
        super(s, i);
    }

    public static RequestProtocolError valueOf(String s)
    {
        return (RequestProtocolError)Enum.valueOf(ch/boye/httpclientandroidlib/impl/client/cache/RequestProtocolError, s);
    }

    public static RequestProtocolError[] values()
    {
        return (RequestProtocolError[])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new RequestProtocolError("UNKNOWN", 0);
        BODY_BUT_NO_LENGTH_ERROR = new RequestProtocolError("BODY_BUT_NO_LENGTH_ERROR", 1);
        WEAK_ETAG_ON_PUTDELETE_METHOD_ERROR = new RequestProtocolError("WEAK_ETAG_ON_PUTDELETE_METHOD_ERROR", 2);
        WEAK_ETAG_AND_RANGE_ERROR = new RequestProtocolError("WEAK_ETAG_AND_RANGE_ERROR", 3);
        NO_CACHE_DIRECTIVE_WITH_FIELD_NAME = new RequestProtocolError("NO_CACHE_DIRECTIVE_WITH_FIELD_NAME", 4);
        $VALUES = (new RequestProtocolError[] {
            UNKNOWN, BODY_BUT_NO_LENGTH_ERROR, WEAK_ETAG_ON_PUTDELETE_METHOD_ERROR, WEAK_ETAG_AND_RANGE_ERROR, NO_CACHE_DIRECTIVE_WITH_FIELD_NAME
        });
    }
}
