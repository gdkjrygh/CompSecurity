// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.ButterKnife;
import cev;
import cgh;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.ui.TextView;
import com.ubercab.ui.card.view.CardView;
import czb;
import czj;
import dfp;
import djb;
import dui;
import dum;
import esj;
import exr;
import exs;
import eyl;
import eyy;
import ezc;
import ezp;
import gjz;
import hkr;
import n;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            BadgeView

public class OnBoardingFinishedFragment extends czb
{

    public chp c;
    public cev d;
    public hkr e;
    public cgh f;
    public eyy g;
    private Profile h;
    private Profile i;
    CardView mBusinessProfileCardView;
    CardView mPersonalProfileCardView;

    public OnBoardingFinishedFragment()
    {
    }

    public static OnBoardingFinishedFragment a(Profile profile, Profile profile1)
    {
        gjz.a(profile.getType().equals("Business"));
        gjz.a(profile1.getType().equals("Personal"));
        OnBoardingFinishedFragment onboardingfinishedfragment = new OnBoardingFinishedFragment();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_BUSINESS_PROFILE_UUID", profile.getUuid());
        bundle.putString("EXTRA_PERSONAL_PROFILE_UUID", profile1.getUuid());
        onboardingfinishedfragment.setArguments(bundle);
        return onboardingfinishedfragment;
    }

    private void a(View view, Profile profile)
    {
        ezc.a((BadgeView)view.findViewById(0x7f0e03cc), profile, f);
        ((TextView)view.findViewById(0x7f0e03cd)).setText(dum.a(profile, getActivity()));
        TextView textview = (TextView)view.findViewById(0x7f0e03ce);
        boolean flag = TextUtils.isEmpty(profile.getEmail());
        if (!flag)
        {
            textview.setText(profile.getEmail());
        }
        if (b(view, profile) || flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view.findViewById(0x7f0e03d1).setVisibility(0);
            textview.setText(0x7f07037b);
            textview.setSingleLine(false);
        }
        view.setTag(Boolean.valueOf(flag));
    }

    private void a(Profile profile, Boolean boolean1)
    {
        if (profile == null)
        {
            return;
        }
        cev cev1 = d;
        boolean flag;
        if (boolean1 != null && boolean1.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cev1.c(new ezp(profile, flag));
    }

    private void a(eyl eyl1)
    {
        eyl1.a(this);
    }

    private void a(Boolean boolean1)
    {
        chp chp1 = c;
        if (boolean1 != null && boolean1.booleanValue())
        {
            boolean1 = n.iP;
        } else
        {
            boolean1 = n.iO;
        }
        chp1.a(boolean1);
    }

    private static transient void a(View aview[])
    {
        for (int j = 0; j < 2; j++)
        {
            aview[j].setVisibility(8);
        }

    }

    private eyl b(dfp dfp)
    {
        return exr.a().a(new djb(this)).a(dfp).a();
    }

    private boolean b(View view, Profile profile)
    {
        ImageView imageview = (ImageView)view.findViewById(0x7f0e03cf);
        view = (TextView)view.findViewById(0x7f0e03d0);
        Client client = e.c();
        if (TextUtils.isEmpty(profile.getDefaultPaymentProfileUuid()) || client == null || client.getPaymentProfiles() == null)
        {
            a(new View[] {
                imageview, view
            });
            return true;
        }
        profile = client.findPaymentProfileByUuid(profile.getDefaultPaymentProfileUuid());
        if (profile == null)
        {
            a(new View[] {
                imageview, view
            });
            return true;
        }
        Object obj = profile.getCardType();
        obj = esj.a(getContext(), ((String) (obj)));
        if (obj == null)
        {
            a(new View[] {
                imageview, view
            });
            return true;
        }
        imageview.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
        profile = dui.a(getContext(), profile, client.getPaymentProfiles(), false);
        if (TextUtils.isEmpty(profile))
        {
            a(new View[] {
                imageview, view
            });
            return true;
        } else
        {
            view.setText(profile);
            return false;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eyl)czj);
    }

    public final cic f()
    {
        return RiderActivity.a;
    }

    void onBusinessProfileClick()
    {
        c.a(n.iN);
        a(h, (Boolean)mBusinessProfileCardView.getTag());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getArguments() != null)
        {
            h = g.a(getArguments().getString("EXTRA_BUSINESS_PROFILE_UUID"));
            i = g.a(getArguments().getString("EXTRA_PERSONAL_PROFILE_UUID"));
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030146, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    void onPersonalProfileClick()
    {
        Boolean boolean1 = (Boolean)mPersonalProfileCardView.getTag();
        a(i, boolean1);
        a(boolean1);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (h == null || i == null)
        {
            return;
        } else
        {
            a(mBusinessProfileCardView, h);
            a(mPersonalProfileCardView, i);
            return;
        }
    }
}
