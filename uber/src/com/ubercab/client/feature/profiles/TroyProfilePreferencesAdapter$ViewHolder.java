// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife;
import cev;
import com.ubercab.ui.TextView;
import ezh;
import ezi;
import ezq;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            TroyProfilePreferencesAdapter

class b
{

    final TroyProfilePreferencesAdapter a;
    private final View b;
    private ezi c;
    private boolean d;
    private boolean e;
    ImageView mEditImageView;
    SwitchCompat mSwitch;
    TextView mTextViewSubtitle;
    TextView mTextViewTitle;

    private void a(boolean flag)
    {
        d = flag;
    }

    private void b(boolean flag)
    {
        e = flag;
        b.setEnabled(flag);
    }

    final void a(ezh ezh1)
    {
        c = ezh1.a();
        mTextViewTitle.setText(ezh1.c());
        if (ezh1.e())
        {
            mSwitch.setVisibility(0);
            a(false);
            mSwitch.setChecked(ezh1.f());
            a(true);
        } else
        {
            mSwitch.setVisibility(8);
        }
        if (ezh1.d())
        {
            mEditImageView.setVisibility(0);
        } else
        {
            mEditImageView.setVisibility(8);
        }
        if (TextUtils.isEmpty(ezh1.b()))
        {
            mTextViewSubtitle.setVisibility(8);
        } else
        {
            mTextViewSubtitle.setVisibility(0);
            mTextViewSubtitle.setText(ezh1.b());
        }
        b(ezh1.d());
    }

    void onSwitchChecked(boolean flag)
    {
        if (d)
        {
            ezq ezq1 = new ezq(c);
            ezq1.a(flag);
            TroyProfilePreferencesAdapter.a(a).c(ezq1);
        }
    }

    void onViewGroupClick()
    {
        if (e)
        {
            TroyProfilePreferencesAdapter.a(a).c(new ezq(c));
        }
    }

    (TroyProfilePreferencesAdapter troyprofilepreferencesadapter, View view)
    {
        a = troyprofilepreferencesadapter;
        super();
        ButterKnife.inject(this, view);
        b = view;
    }
}
