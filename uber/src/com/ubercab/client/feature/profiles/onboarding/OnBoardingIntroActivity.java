// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles.onboarding;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.profiles.OnBoardingActivity;
import com.ubercab.ui.PagerIndicator;
import czj;
import dfe;
import dfp;
import ezv;
import ezw;
import ezz;
import faa;
import fab;
import l;
import n;

public class OnBoardingIntroActivity extends RiderActivity
{

    public chp h;
    public ezz i;
    PagerIndicator mPagerIndicator;
    ViewPager mViewPager;

    public OnBoardingIntroActivity()
    {
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/ubercab/client/feature/profiles/onboarding/OnBoardingIntroActivity);
    }

    private void a(fab fab1)
    {
        fab1.a(this);
    }

    private void a(boolean flag)
    {
        Object obj = null;
        mViewPager.getCurrentItem();
        JVM INSTR tableswitch 0 2: default 36
    //                   0 49
    //                   1 67
    //                   2 85;
           goto _L1 _L2 _L3 _L4
_L1:
        if (obj != null)
        {
            h.a(((cif) (obj)));
        }
        return;
_L2:
        if (flag)
        {
            obj = n.iC;
        } else
        {
            obj = n.iz;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (flag)
        {
            obj = n.iB;
        } else
        {
            obj = n.iy;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (flag)
        {
            obj = n.iD;
        } else
        {
            obj = n.iA;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private fab b(dfp dfp)
    {
        return ezv.a().a(new dfe(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fab)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030147);
        ButterKnife.inject(this);
        bundle = new faa(getSupportFragmentManager(), i.a());
        mViewPager.setAdapter(bundle);
        int j = getResources().getDimensionPixelSize(0x7f0802dc);
        mPagerIndicator.a(mViewPager);
        mViewPager.setPageMargin(j / 2);
        mViewPager.setOffscreenPageLimit(bundle.getCount() - 1);
        mViewPager.addOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final OnBoardingIntroActivity a;

            public final void onPageScrollStateChanged(int k)
            {
                a.mPagerIndicator.onPageScrollStateChanged(k);
            }

            public final void onPageScrolled(int k, float f, int i1)
            {
                a.mPagerIndicator.onPageScrolled(k, f, i1);
            }

            public final void onPageSelected(int k)
            {
                a.mPagerIndicator.onPageSelected(k);
            }

            
            {
                a = OnBoardingIntroActivity.this;
                super();
            }
        });
    }

    protected void onActivityResult(int j, int k, Intent intent)
    {
        if (k == -1 && j == 2001)
        {
            setResult(-1);
            finish();
        }
        super.onActivityResult(j, k, intent);
    }

    public void onBackPressed()
    {
        a(false);
        setResult(0);
        super.onBackPressed();
    }

    void onGetStartedButtonClick()
    {
        a(true);
        startActivityForResult(OnBoardingActivity.a(this), 2001);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuitem);
    }

    public final cic s()
    {
        return l.iQ;
    }
}
