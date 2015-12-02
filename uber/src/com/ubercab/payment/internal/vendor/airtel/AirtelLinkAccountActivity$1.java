// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import chp;
import com.ubercab.payment.internal.model.ApiError;
import com.ubercab.payment.internal.ui.ContentLoadingView;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelAccountResponse;
import cwm;
import e;
import gtc;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelLinkAccountActivity

final class a extends gtc
{

    final AirtelLinkAccountActivity a;

    private void a(ApiError apierror)
    {
        cwm.a(a, apierror.getErrorMessage());
        AirtelLinkAccountActivity.a(a).a(true);
    }

    private void a(AirtelAccountResponse airtelaccountresponse)
    {
        AirtelLinkAccountActivity.a(a, airtelaccountresponse.getPaymentReferenceNumber());
    }

    public final volatile void a(Object obj)
    {
        a((AirtelAccountResponse)obj);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            a.b.a(e.D);
            return;
        } else
        {
            a.b.a(e.C);
            AirtelLinkAccountActivity.a(a).a(true);
            return;
        }
    }

    public final void b(Object obj)
    {
        a((ApiError)obj);
    }

    Response(AirtelLinkAccountActivity airtellinkaccountactivity, Activity activity, Class class1)
    {
        a = airtellinkaccountactivity;
        super(activity, class1);
    }
}
