// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.api;

import com.visa.cbp.sdk.facade.request.DeviceRegistrationRequest;
import retrofit.Callback;

public interface DeviceRegRestAdapter
{

    public static final String REGISTER_DEVICE_ENDPOINT = "/ics/device/register";

    public abstract void register(DeviceRegistrationRequest deviceregistrationrequest, Callback callback);
}
