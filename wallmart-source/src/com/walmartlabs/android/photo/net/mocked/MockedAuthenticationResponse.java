// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net.mocked;

import com.walmartlabs.android.photo.net.PhotoResponse;

public class MockedAuthenticationResponse extends PhotoResponse
{

    public MockedAuthenticationResponse()
    {
        setHttpStatus(200);
        setValid(true);
    }

    public static MockedAuthenticationResponse createWithDelay(long l)
    {
        try
        {
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedexception) { }
        return new MockedAuthenticationResponse();
    }
}
