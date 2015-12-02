// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import chp;
import com.ubercab.payment.internal.inject.PaymentActivityWithInjection;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelValidateCodeResponse;
import com.ubercab.payment.model.PaymentUserInfo;
import gjz;
import gss;
import gvu;
import gww;
import gwx;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelCreateAccountActivity, AirtelLinkAccountActivity, AirtelValidateCodeActivity

public class AirtelSetupActivity extends PaymentActivityWithInjection
{

    public chp a;
    private String b;
    private PaymentUserInfo c;

    public AirtelSetupActivity()
    {
    }

    public static Intent a(Context context, PaymentUserInfo paymentuserinfo)
    {
        context = new Intent(context, com/ubercab/payment/internal/vendor/airtel/AirtelSetupActivity);
        context.putExtra("user_info", paymentuserinfo);
        return context;
    }

    private void a(AirtelValidateCodeResponse airtelvalidatecoderesponse)
    {
        if (airtelvalidatecoderesponse.getExistingAccount())
        {
            c(airtelvalidatecoderesponse);
            return;
        } else
        {
            b(airtelvalidatecoderesponse);
            return;
        }
    }

    private void a(gvu gvu1)
    {
        gvu1.a(this);
    }

    private void a(String s)
    {
        Intent intent = new Intent();
        intent.putExtra("payment_reference_number", s);
        intent.putExtra("airtel_money_token", b);
        setResult(-1, intent);
        finish();
    }

    private void b(AirtelValidateCodeResponse airtelvalidatecoderesponse)
    {
        startActivityForResult(AirtelCreateAccountActivity.a(this, c, airtelvalidatecoderesponse), 100);
    }

    private void c(AirtelValidateCodeResponse airtelvalidatecoderesponse)
    {
        startActivityForResult(AirtelLinkAccountActivity.a(this, airtelvalidatecoderesponse), 200);
    }

    private gvu d()
    {
        return gww.a().a(gss.a(getApplication())).a();
    }

    private void e()
    {
        startActivityForResult(AirtelValidateCodeActivity.a(this, c), 300);
    }

    protected final volatile void a(Object obj)
    {
        a((gvu)obj);
    }

    protected final Object c()
    {
        return d();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (j != -1)
        {
            finish();
            return;
        }
        switch (i)
        {
        default:
            return;

        case 100: // 'd'
        case 200: 
            a(intent.getStringExtra("payment_reference_number"));
            return;

        case 300: 
            intent = (AirtelValidateCodeResponse)intent.getParcelableExtra("otp_response");
            break;
        }
        b = intent.getAirtelMoneyToken();
        a(intent);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        c = (PaymentUserInfo)gjz.a(getIntent().getParcelableExtra("user_info"));
        if (bundle == null)
        {
            e();
            return;
        } else
        {
            b = bundle.getString("airtel_money_token");
            return;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (b != null)
        {
            bundle.putString("airtel_money_token", b);
        }
    }
}
