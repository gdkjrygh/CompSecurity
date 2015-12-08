// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import com.google.android.gms.maps.MapView;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverNearbyCompetitorsPresenter

class this._cls0
    implements android.view.itorsPresenter._cls1
{

    final SaverNearbyCompetitorsPresenter this$0;

    public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        if (SaverNearbyCompetitorsPresenter.access$000(SaverNearbyCompetitorsPresenter.this) != null && view != null)
        {
            android.view.itorsPresenter itorspresenter = SaverNearbyCompetitorsPresenter.access$000(SaverNearbyCompetitorsPresenter.this).getLayoutParams();
            itorspresenter.rams = view.getHeight();
            SaverNearbyCompetitorsPresenter.access$000(SaverNearbyCompetitorsPresenter.this).setLayoutParams(itorspresenter);
        }
        if (view != null)
        {
            view.removeOnLayoutChangeListener(this);
        }
    }

    ()
    {
        this$0 = SaverNearbyCompetitorsPresenter.this;
        super();
    }
}
