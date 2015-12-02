// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.ubercab.client.feature.payment.BaseAddPaymentV2Fragment;
import com.ubercab.client.feature.promo.v2.PromoV2Activity;
import com.ubercab.client.feature.signup.SignupData;
import java.util.List;

public class fly extends BaseAddPaymentV2Fragment
    implements flz
{

    private SignupData i;

    public fly()
    {
    }

    public static fly a(SignupData signupdata)
    {
        fly fly1 = new fly();
        Bundle bundle = new Bundle();
        bundle.putParcelable("signup_data", signupdata);
        fly1.setArguments(bundle);
        return fly1;
    }

    public final void a()
    {
        k();
    }

    protected final void a(gsa gsa)
    {
        n().c(new fne(gsa, i));
    }

    protected final boolean a(gmg gmg1)
    {
        return gmg1.a(dbf.V, dbo.a);
    }

    protected final boolean g()
    {
        return true;
    }

    protected final boolean h()
    {
        return true;
    }

    protected final List i()
    {
        return o().a(getActivity(), p(), i.c());
    }

    protected final void j()
    {
        startActivityForResult(PromoV2Activity.a(getActivity()), 1001);
    }

    protected final n m()
    {
        return n.gr;
    }

    public void onActivityResult(int k, int l, Intent intent)
    {
        super.onActivityResult(k, l, intent);
        if (k == 1001 && l == -1)
        {
            l();
            com.ubercab.client.feature.signup.SignupData.PromoCode promocode = (com.ubercab.client.feature.signup.SignupData.PromoCode)intent.getParcelableExtra("promo_code");
            intent = intent.getStringExtra("promo_code_string");
            i.a(promocode);
            a(promocode.d(), intent, promocode.b());
        }
    }

    protected void onClickSkipButton()
    {
        super.onClickSkipButton();
        n().c(new fng(i));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            i = (SignupData)bundle.getParcelable("signup_data");
            return;
        } else
        {
            i = (SignupData)getArguments().getParcelable("signup_data");
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("signup_data", i);
    }
}
