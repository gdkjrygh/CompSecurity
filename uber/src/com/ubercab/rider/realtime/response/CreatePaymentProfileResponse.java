// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import com.ubercab.rider.realtime.model.Client;

// Referenced classes of package com.ubercab.rider.realtime.response:
//            Shape_CreatePaymentProfileResponse

public abstract class CreatePaymentProfileResponse
{

    public CreatePaymentProfileResponse()
    {
    }

    public static CreatePaymentProfileResponse create()
    {
        return new Shape_CreatePaymentProfileResponse();
    }

    public abstract Client getClient();

    public abstract String getNewPaymentProfileUuid();

    abstract CreatePaymentProfileResponse setClient(Client client);

    abstract CreatePaymentProfileResponse setNewPaymentProfileUuid(String s);
}
