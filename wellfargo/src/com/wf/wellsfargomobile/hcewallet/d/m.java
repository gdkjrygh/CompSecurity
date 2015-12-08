// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.d;

import com.visa.cbp.external.aam.ReplenishAckRequest;
import com.visa.cbp.external.aam.ReplenishRequest;
import com.visa.cbp.external.common.DynParams;
import com.visa.cbp.external.common.HCEData;
import com.visa.cbp.external.common.TokenInfo;
import com.visa.cbp.sdk.facade.VisaPaymentSDK;
import com.visa.cbp.sdk.facade.data.TokenKey;
import com.visa.cbp.sdk.facade.data.TvlEntry;
import com.visa.cbp.sdk.facade.provider.ReplenishmentProvider;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.hcewallet.a.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class m
    implements ReplenishmentProvider
{

    final c a;
    final TokenKey b;

    m(c c1, TokenKey tokenkey)
    {
        a = c1;
        b = tokenkey;
        super();
    }

    public void a(ReplenishRequest replenishrequest, ResponseCallback responsecallback)
    {
        a.a(replenishrequest.getTokenInfo().getTokenReferenceID());
        a.b(replenishrequest.getTokenInfo().getHceData().getDynParams().getApi());
        responsecallback = WFApp.a().getTvlLog(b);
        replenishrequest = new ArrayList();
        responsecallback = responsecallback.iterator();
        int i;
        int j;
        for (i = 0; responsecallback.hasNext(); i = j)
        {
            TvlEntry tvlentry = (TvlEntry)responsecallback.next();
            j = i;
            if (tvlentry.getAtc() > i)
            {
                j = tvlentry.getAtc();
            }
            replenishrequest.add(tvlentry.getTvlLogString());
        }

        a.a(replenishrequest);
        a.a(i);
    }

    public void doAcknowledge(ReplenishAckRequest replenishackrequest, ResponseCallback responsecallback)
    {
    }

    public void doRequest(Object obj, ResponseCallback responsecallback)
    {
        a((ReplenishRequest)obj, responsecallback);
    }
}
