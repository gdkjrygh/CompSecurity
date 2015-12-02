// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import com.ubercab.payment.internal.model.ApiError;
import com.ubercab.payment.internal.ui.ContentLoadingView;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelSendCodeResponse;
import cwm;
import gtc;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelValidateCodeActivity

final class a extends gtc
{

    final AirtelValidateCodeActivity a;

    private void a(ApiError apierror)
    {
        cwm.a(a, apierror.getErrorMessage());
    }

    private void a(AirtelSendCodeResponse airtelsendcoderesponse)
    {
        AirtelValidateCodeActivity.a(a, airtelsendcoderesponse.getOtpRequestToken());
    }

    public final volatile void a(Object obj)
    {
        a((AirtelSendCodeResponse)obj);
    }

    public final void a(boolean flag)
    {
        AirtelValidateCodeActivity.a(a).a(true);
    }

    public final void b(Object obj)
    {
        a((ApiError)obj);
    }

    Response(AirtelValidateCodeActivity airtelvalidatecodeactivity, Activity activity, Class class1)
    {
        a = airtelvalidatecodeactivity;
        super(activity, class1);
    }
}
