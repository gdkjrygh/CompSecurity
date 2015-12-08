// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.d;

import com.google.gson.Gson;
import com.visa.cbp.external.enp.EnrollAndProvisionResponse;
import com.visa.cbp.sdk.facade.data.EnrollProvisionRequestWrapper;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import com.visa.cbp.sdk.facade.provider.TokenProvider;

final class o
    implements TokenProvider
{

    final String a;

    o(String s)
    {
        a = s;
        super();
    }

    public void a(EnrollProvisionRequestWrapper enrollprovisionrequestwrapper, ResponseCallback responsecallback)
    {
        responsecallback.success((EnrollAndProvisionResponse)(new Gson()).fromJson(a, com/visa/cbp/external/enp/EnrollAndProvisionResponse), new GenericResponse(200, "Provisioning success", null));
    }

    public void doRequest(Object obj, ResponseCallback responsecallback)
    {
        a((EnrollProvisionRequestWrapper)obj, responsecallback);
    }
}
