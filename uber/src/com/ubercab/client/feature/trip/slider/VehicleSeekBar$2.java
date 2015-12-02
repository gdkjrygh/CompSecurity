// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.graphics.Bitmap;
import android.net.Uri;
import cha;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.Set;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            VehicleSeekBar

final class b
    implements cha
{

    final VehicleView a;
    final Uri b;
    final VehicleSeekBar c;

    public final void a()
    {
        VehicleSeekBar.a(c, a);
        VehicleSeekBar.a(c).remove(this);
    }

    public final void a(Bitmap bitmap)
    {
        VehicleSeekBar.a(c, a, b, bitmap);
        VehicleSeekBar.a(c).remove(this);
    }

    public final void b()
    {
        VehicleSeekBar.a(c).add(this);
    }

    (VehicleSeekBar vehicleseekbar, VehicleView vehicleview, Uri uri)
    {
        c = vehicleseekbar;
        a = vehicleview;
        b = uri;
        super();
    }
}
