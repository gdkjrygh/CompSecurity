// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.mobilemessage;

import android.view.View;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import hw;

// Referenced classes of package com.ubercab.client.feature.mobilemessage:
//            MobileMessageNotificationsAdapter

class l extends hw
{

    final MobileMessageNotificationsAdapter l;
    TextView mMobileMessageTitle;

    a(MobileMessageNotificationsAdapter mobilemessagenotificationsadapter, View view)
    {
        l = mobilemessagenotificationsadapter;
        super(view);
        ButterKnife.inject(this, view);
    }
}
