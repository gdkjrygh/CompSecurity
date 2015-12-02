// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_RtUnpaidBillsResponse

public abstract class RtUnpaidBillsResponse
{

    public RtUnpaidBillsResponse()
    {
    }

    public static RtUnpaidBillsResponse create(List list)
    {
        return (new Shape_RtUnpaidBillsResponse()).setUnpaidBills(list);
    }

    public abstract List getUnpaidBills();

    abstract RtUnpaidBillsResponse setUnpaidBills(List list);
}
