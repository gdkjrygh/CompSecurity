// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.ui.TextView;
import dum;
import eyv;
import eyy;
import ezc;
import ezg;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            BadgeView, ProfilesAdapter

class d
{

    boolean b;
    Profile c;
    final ProfilesAdapter d;
    ImageView mAlertImageView;
    BadgeView mBadgeView;
    TextView mSubtitleTextView;
    TextView mTextView;

    private void a(boolean flag)
    {
        ImageView imageview = mAlertImageView;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
    }

    protected final void a(Profile profile)
    {
        mBadgeView.setVisibility(0);
        ezc.a(mBadgeView, profile, ProfilesAdapter.f(d));
    }

    void a(Profile profile, boolean flag)
    {
        b(profile, flag);
        if (flag)
        {
            mBadgeView.b();
            return;
        } else
        {
            a(c);
            return;
        }
    }

    protected final void b(Profile profile, boolean flag)
    {
        int i = 0;
        c = profile;
        b = flag;
        mTextView.setText(dum.a(profile, ProfilesAdapter.e(d)));
        if (ProfilesAdapter.a(d, profile) && !b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        profile = mSubtitleTextView;
        if (!flag)
        {
            i = 8;
        }
        profile.setVisibility(i);
        a(flag);
    }

    public void onClickProvider()
    {
        boolean flag1 = c.equals(ProfilesAdapter.a(d).b());
        boolean flag;
        if (!ProfilesAdapter.a(d, c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag1 || ProfilesAdapter.b(d) == ezg.b)
        {
            ProfilesAdapter.a(d, flag);
        } else
        {
            ProfilesAdapter.c(d);
        }
        ProfilesAdapter.d(d).a(c, b);
    }

    (ProfilesAdapter profilesadapter, View view)
    {
        d = profilesadapter;
        super();
        ButterKnife.inject(this, view);
    }
}
