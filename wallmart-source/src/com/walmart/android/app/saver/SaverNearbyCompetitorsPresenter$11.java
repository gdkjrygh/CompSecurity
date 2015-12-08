// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverNearbyCompetitorsPresenter

class this._cls0
    implements com.google.android.gms.maps._cls1
{

    final SaverNearbyCompetitorsPresenter this$0;

    public void onMapLoaded()
    {
        if (SaverNearbyCompetitorsPresenter.access$1100(SaverNearbyCompetitorsPresenter.this) != null)
        {
            SaverNearbyCompetitorsPresenter.access$1100(SaverNearbyCompetitorsPresenter.this).setBackgroundColor(SaverNearbyCompetitorsPresenter.access$400(SaverNearbyCompetitorsPresenter.this).getResources().getColor(0x7f0f00d2));
        }
    }

    ()
    {
        this$0 = SaverNearbyCompetitorsPresenter.this;
        super();
    }
}
