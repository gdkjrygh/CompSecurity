// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.about;

import android.view.View;
import butterknife.ButterKnife;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.ui.TextView;
import dak;
import dun;

// Referenced classes of package com.ubercab.client.feature.about:
//            AboutFragment

class mTextViewTitle
{

    final AboutFragment a;
    TextView mTextViewTitle;

    public void onClickUberUrl()
    {
        AboutFragment.a(a);
    }

    (AboutFragment aboutfragment, View view)
    {
        a = aboutfragment;
        super();
        ButterKnife.inject(this, view);
        if (aboutfragment.i.c() != null)
        {
            view = aboutfragment.i.c().getLocation();
        } else
        {
            view = null;
        }
        aboutfragment = dun.a(aboutfragment.c, view);
        mTextViewTitle.setText(aboutfragment);
    }
}
