// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import chp;
import com.ubercab.client.feature.profiles.onboarding.OnBoardingIntroActivity;
import n;

// Referenced classes of package com.ubercab.client.feature.trip:
//            TripActivity

final class a
    implements android.view.tener
{

    final TripActivity a;

    public final void onClick(View view)
    {
        a.i.a(n.iE);
        TripActivity.d(a).postDelayed(new Runnable() {

            final TripActivity._cls5 a;

            public final void run()
            {
                a.a.startActivity(new Intent(a.a, com/ubercab/client/feature/profiles/onboarding/OnBoardingIntroActivity));
            }

            
            {
                a = TripActivity._cls5.this;
                super();
            }
        }, 250L);
        a.mDrawerLayout.closeDrawers();
    }

    _cls1.a(TripActivity tripactivity)
    {
        a = tripactivity;
        super();
    }
}
