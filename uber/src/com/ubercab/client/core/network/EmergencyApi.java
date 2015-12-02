// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.network;

import com.ubercab.client.core.model.DisableEmergencyRequest;
import com.ubercab.client.core.model.EmergencyEventDetails;
import retrofit.Callback;

public interface EmergencyApi
{

    public abstract void disableEmergency(String s, DisableEmergencyRequest disableemergencyrequest, Callback callback);

    public abstract void enableEmergency(String s, EmergencyEventDetails emergencyeventdetails, Callback callback);
}
