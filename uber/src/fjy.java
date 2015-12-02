// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Space;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.feature.signin.SignInFragment;

public final class fjy
    implements gmk
{

    final SignInFragment a;

    private fjy(SignInFragment signinfragment)
    {
        a = signinfragment;
        super();
    }

    public fjy(SignInFragment signinfragment, byte byte0)
    {
        this(signinfragment);
    }

    public final void a(gmj gmj1)
    {
        if (gmj1.b() == null)
        {
            return;
        }
        a.i.b(this);
        boolean flag;
        if (a.i.a(dbf.a) && SignInFragment.g(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.mViewGroupThirdPartySignIn.setVisibility(0);
        a.mViewGroupThirdPartyGeneral.setVisibility(8);
        a.mViewGroupThirdPartyChina.setVisibility(0);
        if (flag)
        {
            a.mButtonAlipaySignIn.setVisibility(0);
            gmj1 = AnalyticsEvent.create("impression").setName(l.cB).setValue("alipay");
            a.c.a(gmj1);
        }
        a.mButtonBaiduSignIn.setVisibility(0);
        gmj1 = AnalyticsEvent.create("impression").setName(l.cB).setValue("baidu");
        a.c.a(gmj1);
        if (flag)
        {
            a.mPaddingViewThirdParty.setVisibility(0);
        } else
        {
            a.mPaddingViewThirdParty.setVisibility(8);
        }
        SignInFragment.h(a);
    }
}
