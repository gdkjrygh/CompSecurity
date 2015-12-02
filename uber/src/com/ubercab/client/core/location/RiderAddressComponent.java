// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.location;

import android.os.Parcelable;
import com.ubercab.rider.realtime.model.AddressComponent;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.location:
//            Shape_RiderAddressComponent

public abstract class RiderAddressComponent
    implements Parcelable, AddressComponent
{

    public RiderAddressComponent()
    {
    }

    public static RiderAddressComponent a()
    {
        return new Shape_RiderAddressComponent();
    }

    public static RiderAddressComponent a(AddressComponent addresscomponent)
    {
        return a().b(addresscomponent.getShortName()).a(addresscomponent.getLongName()).a(addresscomponent.getTypes());
    }

    public abstract RiderAddressComponent a(String s);

    public abstract RiderAddressComponent a(List list);

    public abstract RiderAddressComponent b(String s);

    public abstract String getLongName();

    public abstract String getShortName();

    public abstract List getTypes();
}
