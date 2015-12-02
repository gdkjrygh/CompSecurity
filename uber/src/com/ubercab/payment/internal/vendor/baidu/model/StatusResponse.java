// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.baidu.model;


// Referenced classes of package com.ubercab.payment.internal.vendor.baidu.model:
//            Shape_StatusResponse

public abstract class StatusResponse
{

    public static final String STATUS_INVALID = "invalid";
    public static final String STATUS_VALID = "valid";

    public StatusResponse()
    {
    }

    public static StatusResponse create()
    {
        return new Shape_StatusResponse();
    }

    public abstract String getContractNo();

    public abstract String getStatus();

    public abstract StatusResponse setContractNo(String s);

    public abstract StatusResponse setStatus(String s);
}
