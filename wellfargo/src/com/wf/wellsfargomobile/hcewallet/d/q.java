// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.d;

import com.google.gson.Gson;
import com.visa.cbp.external.aam.ReplenishAckRequest;
import com.visa.cbp.external.aam.ReplenishRequest;
import com.visa.cbp.external.aam.ReplenishResponse;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.provider.ReplenishmentProvider;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;

final class q
    implements ReplenishmentProvider
{

    final String a;

    q(String s)
    {
        a = s;
        super();
    }

    public void a(ReplenishRequest replenishrequest, ResponseCallback responsecallback)
    {
        responsecallback.success((ReplenishResponse)(new Gson()).fromJson(a, com/visa/cbp/external/aam/ReplenishResponse), new GenericResponse(200, "Replenishment successful", null));
    }

    public void doAcknowledge(ReplenishAckRequest replenishackrequest, ResponseCallback responsecallback)
    {
    }

    public void doRequest(Object obj, ResponseCallback responsecallback)
    {
        a((ReplenishRequest)obj, responsecallback);
    }
}
