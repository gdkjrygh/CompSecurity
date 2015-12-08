// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net.mocked;

import com.walmartlabs.android.photo.net.PhotoResponse;

public class MockedStoreStatusResponse extends PhotoResponse
{

    private static final String MOCKED_DATA = "{\"storeNumber\":\"5434\",\"status\":\"SERVICE_ONLINE\",\"pickupTime\":{\"gmtTimeReturn\":\"2014-06-11T15:08:00-07:00\",\"localDate\":\"11/06/2014\",\"localTime\":\"15:08:00\",\"localTimeZone\":\"PDT\",\"timestampReasonCode\":\"7\"}}";

    public MockedStoreStatusResponse(String s)
    {
        setHttpStatus(200);
        setValid(true);
        setEntity("{\"storeNumber\":\"5434\",\"status\":\"SERVICE_ONLINE\",\"pickupTime\":{\"gmtTimeReturn\":\"2014-06-11T15:08:00-07:00\",\"localDate\":\"11/06/2014\",\"localTime\":\"15:08:00\",\"localTimeZone\":\"PDT\",\"timestampReasonCode\":\"7\"}}");
    }

    public static MockedStoreStatusResponse createWithDelay(long l, String s)
    {
        try
        {
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedexception) { }
        return new MockedStoreStatusResponse(s);
    }
}
