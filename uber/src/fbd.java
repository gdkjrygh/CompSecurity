// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.text.TextUtils;
import com.ubercab.client.core.model.ApiResponse;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.promo.v2.BasePromoFragment;

public class fbd extends BasePromoFragment
{

    private fbe h;
    private icl i;

    public fbd()
    {
    }

    public static final fbd a()
    {
        return new fbd();
    }

    private void a(com.ubercab.client.feature.signup.SignupData.PromoCode promocode)
    {
        String s = i();
        h();
        g();
        j().a(l.ey);
        h.a(promocode, s);
    }

    static void a(fbd fbd1)
    {
        fbd1.k();
    }

    static void a(fbd fbd1, com.ubercab.client.feature.signup.SignupData.PromoCode promocode)
    {
        fbd1.a(promocode);
    }

    static void a(fbd fbd1, String s)
    {
        fbd1.d(s);
    }

    private void d(String s)
    {
        j().a(l.ex);
        if (!TextUtils.isEmpty(s))
        {
            a(s);
        }
    }

    private void k()
    {
        a(getString(0x7f070436));
    }

    protected final void a(String s, boolean flag)
    {
        if (e.w())
        {
            i = g.c(s).a(ico.a()).a(new fbf(this, (byte)0));
            return;
        } else
        {
            f.e(s);
            return;
        }
    }

    protected final String b()
    {
        return "verify_promo";
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        h = (fbe)activity;
    }

    public void onClickApply()
    {
        super.onClickApply();
        a(true);
    }

    public void onDetach()
    {
        super.onDetach();
        h = null;
    }

    public void onPause()
    {
        super.onPause();
        if (i != null)
        {
            i.b();
        }
    }

    public void onValidatePromoResponseEvent(dnw dnw1)
    {
        a(false);
        if (dnw1.i())
        {
            a(getString(0x7f070436));
            return;
        }
        if (!dnw1.e())
        {
            d(dnw1.f());
            return;
        } else
        {
            a(com.ubercab.client.feature.signup.SignupData.PromoCode.a(i(), ((Ping)dnw1.g()).getApiResponse().getData()));
            return;
        }
    }
}
