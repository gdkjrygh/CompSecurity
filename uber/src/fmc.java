// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import android.widget.ImageButton;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.feature.signup.SignupFragment;

public final class fmc
    implements gmk
{

    final SignupFragment a;

    private fmc(SignupFragment signupfragment)
    {
        a = signupfragment;
        super();
    }

    public fmc(SignupFragment signupfragment, byte byte0)
    {
        this(signupfragment);
    }

    private void a()
    {
        a.mViewGroupThirdPartySignInChina.setVisibility(8);
        if (a.f.b(dbf.X))
        {
            a.mViewGroupThirdPartySignIn.setVisibility(0);
            a.mViewGroupThirdPartySignInGeneral.setVisibility(0);
        } else
        {
            if (a.f.a(dbf.X, dbw.b))
            {
                a.mViewGroupThirdPartySignInGeneral.setVisibility(0);
                a.mSignupButtonFacebook.setVisibility(8);
                return;
            }
            if (a.f.a(dbf.X, dbw.c))
            {
                a.mViewGroupThirdPartySignInGeneral.setVisibility(0);
                a.mSignupButtonGooglePlus.setVisibility(8);
                return;
            }
            if (a.f.a(dbf.X, dbw.a))
            {
                a.mViewGroupThirdPartySignIn.setVisibility(8);
                a.mViewGroupThirdPartySignInGeneral.setVisibility(8);
                return;
            }
        }
    }

    public final void a(gmj gmj1)
    {
        if (!"CHINA".equals(a.h.a()))
        {
            a();
        } else
        if (gmj1.b() != null)
        {
            a.f.b(this);
            boolean flag;
            if (a.f.a(dbf.a) && SignupFragment.f(a))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                a.mViewGroupThirdPartySignIn.setVisibility(8);
                return;
            } else
            {
                a.mViewGroupThirdPartySignIn.setVisibility(0);
                a.mViewGroupThirdPartySignInGeneral.setVisibility(8);
                a.mViewGroupThirdPartySignInChina.setVisibility(0);
                a.mSignupButtonAlipay.setVisibility(0);
                gmj1 = AnalyticsEvent.create("impression").setName(l.hC).setValue("alipay");
                a.c.a(gmj1);
                return;
            }
        }
    }
}
