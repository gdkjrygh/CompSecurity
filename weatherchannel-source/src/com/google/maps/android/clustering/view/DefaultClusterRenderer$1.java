// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering.view;

import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.clustering.ClusterItem;

// Referenced classes of package com.google.maps.android.clustering.view:
//            DefaultClusterRenderer

class this._cls0
    implements com.google.android.gms.maps.stener
{

    final DefaultClusterRenderer this$0;

    public boolean onMarkerClick(Marker marker)
    {
        return DefaultClusterRenderer.access$200(DefaultClusterRenderer.this) != null && DefaultClusterRenderer.access$200(DefaultClusterRenderer.this).onClusterItemClick((ClusterItem)DefaultClusterRenderer.access$300(DefaultClusterRenderer.this).get(marker));
    }

    ickListener()
    {
        this$0 = DefaultClusterRenderer.this;
        super();
    }
}
