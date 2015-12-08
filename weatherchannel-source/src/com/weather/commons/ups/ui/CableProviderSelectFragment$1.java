// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import com.weather.dal2.ups.BasicDemographicsStorage;
import com.weather.dal2.ups.Demographics;

// Referenced classes of package com.weather.commons.ups.ui:
//            CableProviderSelectFragment

class this._cls0
    implements android.view.ectFragment._cls1
{

    final CableProviderSelectFragment this$0;

    public void onClick(View view)
    {
        view = CableProviderSelectFragment.access$000(CableProviderSelectFragment.this).getSelectedItem().toString();
        if (!CableProviderSelectFragment.access$100(CableProviderSelectFragment.this, view))
        {
            Demographics demographics = BasicDemographicsStorage.getInstance().getDemographics();
            demographics.setCableProvider(view);
            CableProviderSelectFragment.access$200(CableProviderSelectFragment.this, demographics);
        }
        getActivity().finish();
    }

    ()
    {
        this$0 = CableProviderSelectFragment.this;
        super();
    }
}
