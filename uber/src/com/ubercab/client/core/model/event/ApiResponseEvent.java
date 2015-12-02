// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.event;

import com.ubercab.client.core.model.ApiResponse;

public final class ApiResponseEvent
{

    private final ApiResponse mApiRespone;

    public ApiResponseEvent(ApiResponse apiresponse)
    {
        mApiRespone = apiresponse;
    }

    public final ApiResponse getIsForceUpgrade()
    {
        return mApiRespone;
    }
}
