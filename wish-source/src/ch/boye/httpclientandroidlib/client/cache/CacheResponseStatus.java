// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.cache;


public final class CacheResponseStatus extends Enum
{

    private static final CacheResponseStatus $VALUES[];
    public static final CacheResponseStatus CACHE_HIT;
    public static final CacheResponseStatus CACHE_MISS;
    public static final CacheResponseStatus CACHE_MODULE_RESPONSE;
    public static final CacheResponseStatus VALIDATED;

    private CacheResponseStatus(String s, int i)
    {
        super(s, i);
    }

    public static CacheResponseStatus valueOf(String s)
    {
        return (CacheResponseStatus)Enum.valueOf(ch/boye/httpclientandroidlib/client/cache/CacheResponseStatus, s);
    }

    public static CacheResponseStatus[] values()
    {
        return (CacheResponseStatus[])$VALUES.clone();
    }

    static 
    {
        CACHE_MODULE_RESPONSE = new CacheResponseStatus("CACHE_MODULE_RESPONSE", 0);
        CACHE_HIT = new CacheResponseStatus("CACHE_HIT", 1);
        CACHE_MISS = new CacheResponseStatus("CACHE_MISS", 2);
        VALIDATED = new CacheResponseStatus("VALIDATED", 3);
        $VALUES = (new CacheResponseStatus[] {
            CACHE_MODULE_RESPONSE, CACHE_HIT, CACHE_MISS, VALIDATED
        });
    }
}
