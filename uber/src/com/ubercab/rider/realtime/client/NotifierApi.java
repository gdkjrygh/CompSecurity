// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.client;

import com.ubercab.rider.realtime.request.body.DeviceTokensBody;
import ica;

public interface NotifierApi
{

    public abstract ica deleteDeviceToken(String s);

    public abstract ica deleteDeviceToken(String s, String s1, String s2);

    public abstract ica postDeviceToken(DeviceTokensBody devicetokensbody);
}
