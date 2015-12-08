// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.wire;


public class WireStoreStatus
{

    public static final String STATUS_ONLINE = "SERVICE_ONLINE";
    private String status;
    private String storeNumber;

    public WireStoreStatus()
    {
    }

    public String getStatus()
    {
        return status;
    }

    public String getStoreNumber()
    {
        return storeNumber;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setStoreNumber(String s)
    {
        storeNumber = s;
    }
}
