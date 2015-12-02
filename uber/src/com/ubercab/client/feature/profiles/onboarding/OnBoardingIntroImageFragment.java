// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles.onboarding;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import cgh;
import cgt;
import cha;
import cic;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dfp;
import djb;
import ezx;
import ezy;
import fae;

// Referenced classes of package com.ubercab.client.feature.profiles.onboarding:
//            OnBoardingIntroCard

public class OnBoardingIntroImageFragment extends czb
    implements cha
{

    public cgh c;
    FrameLayout mContentFrameLayout;
    TextView mErrorTextView;
    ImageView mImageView;
    ProgressBar mProgressBar;

    public OnBoardingIntroImageFragment()
    {
    }

    public static OnBoardingIntroImageFragment a(OnBoardingIntroCard onboardingintrocard)
    {
        OnBoardingIntroImageFragment onboardingintroimagefragment = new OnBoardingIntroImageFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_ON_BOARDING_CARD", onboardingintrocard);
        onboardingintroimagefragment.setArguments(bundle);
        return onboardingintroimagefragment;
    }

    private void a(fae fae1)
    {
        fae1.a(this);
    }

    private void a(boolean flag)
    {
        boolean flag1 = false;
        Object obj = mContentFrameLayout;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        ((FrameLayout) (obj)).setVisibility(i);
        obj = mProgressBar;
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 8;
        }
        ((ProgressBar) (obj)).setVisibility(i);
    }

    private fae b(dfp dfp)
    {
        return ezx.a().a(new djb(this)).a(dfp).a();
    }

    private void b(OnBoardingIntroCard onboardingintrocard)
    {
        if (getView() == null)
        {
            return;
        } else
        {
            c.a(onboardingintrocard.b()).a(this);
            ((TextView)getView().findViewById(0x7f0e03ca)).setText(onboardingintrocard.c());
            ((TextView)getView().findViewById(0x7f0e03cb)).setText(onboardingintrocard.a());
            return;
        }
    }

    private void b(boolean flag)
    {
        byte byte0 = 8;
        Object obj = mErrorTextView;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((TextView) (obj)).setVisibility(i);
        obj = mImageView;
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        ((ImageView) (obj)).setVisibility(i);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a()
    {
        b(true);
        a(true);
    }

    public final void a(Bitmap bitmap)
    {
        if (getView() != null)
        {
            mImageView.setImageBitmap(bitmap);
            mImageView.setOnClickListener(null);
            b(false);
            a(true);
        }
    }

    public final volatile void a(czj czj)
    {
        a((fae)czj);
    }

    public final void b()
    {
    }

    public final cic f()
    {
        return czb.a;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030148, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    void onImageClick()
    {
        a(false);
        OnBoardingIntroCard onboardingintrocard = (OnBoardingIntroCard)getArguments().getParcelable("EXTRA_ON_BOARDING_CARD");
        if (onboardingintrocard != null)
        {
            c.a(onboardingintrocard.b()).a(this);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = (OnBoardingIntroCard)getArguments().getParcelable("EXTRA_ON_BOARDING_CARD");
        if (view != null)
        {
            b(view);
        }
    }
}
