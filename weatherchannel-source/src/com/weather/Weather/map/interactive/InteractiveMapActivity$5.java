// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map.interactive;

import android.app.ActionBar;
import android.view.View;
import com.google.android.maps.MyLocationOverlay;
import com.wsi.android.framework.ui.map.WSIMapView;

// Referenced classes of package com.weather.Weather.map.interactive:
//            InteractiveMapActivity

class this._cls0
    implements android.view.teractiveMapActivity._cls5
{

    final InteractiveMapActivity this$0;

    public void onClick(View view)
    {
        view = getActionBar();
        if (InteractiveMapActivity.access$200(InteractiveMapActivity.this).isMyLocationEnabled())
        {
            if (InteractiveMapActivity.access$200(InteractiveMapActivity.this).getMyLocation() != null)
            {
                InteractiveMapActivity.access$300(InteractiveMapActivity.this).animateTo(InteractiveMapActivity.access$200(InteractiveMapActivity.this).getMyLocation());
            }
        } else
        {
            InteractiveMapActivity.access$200(InteractiveMapActivity.this).enableMyLocation();
        }
        if (InteractiveMapActivity.access$200(InteractiveMapActivity.this).isMyLocationEnabled() && view != null)
        {
            view.setSelectedNavigationItem(0);
        }
    }

    ()
    {
        this$0 = InteractiveMapActivity.this;
        super();
    }
}
