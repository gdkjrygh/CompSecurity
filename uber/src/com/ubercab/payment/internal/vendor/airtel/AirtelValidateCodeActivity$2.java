// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import android.content.Intent;
import chp;
import com.ubercab.payment.internal.ui.ContentLoadingView;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelValidateCodeResponse;
import cwm;
import e;
import gsg;
import gtc;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelValidateCodeActivity

final class a extends gtc
{

    final AirtelValidateCodeActivity a;

    private void a()
    {
        cwm.a(a, gsg.ub__payment_unexpected_error);
    }

    private void a(AirtelValidateCodeResponse airtelvalidatecoderesponse)
    {
        Intent intent = new Intent();
        intent.putExtra("otp_response", airtelvalidatecoderesponse);
        a.setResult(-1, intent);
        a.finish();
    }

    public final volatile void a(Object obj)
    {
        a((AirtelValidateCodeResponse)obj);
    }

    public final void a(boolean flag)
    {
        if (!flag)
        {
            a.a.a(e.G);
            AirtelValidateCodeActivity.a(a).a(true);
            return;
        } else
        {
            a.a.a(e.H);
            return;
        }
    }

    public final void b(Object obj)
    {
        a();
    }

    CodeResponse(AirtelValidateCodeActivity airtelvalidatecodeactivity, Activity activity, Class class1)
    {
        a = airtelvalidatecodeactivity;
        super(activity, class1);
    }
}
