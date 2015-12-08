// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map.interactive;

import com.google.android.maps.MyLocationOverlay;
import com.wsi.android.framework.ui.map.WSIMapView;

// Referenced classes of package com.weather.Weather.map.interactive:
//            InteractiveMapActivity

class this._cls0
    implements Runnable
{

    final InteractiveMapActivity this$0;

    public void run()
    {
        InteractiveMapActivity.access$300(InteractiveMapActivity.this).animateTo(InteractiveMapActivity.access$200(InteractiveMapActivity.this).getMyLocation());
    }

    ()
    {
        this$0 = InteractiveMapActivity.this;
        super();
    }
}
