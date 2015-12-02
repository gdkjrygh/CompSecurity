// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.event;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.feature.trip.event:
//            PanelSlideEvent

final class 
    implements android.os.
{

    private static PanelSlideEvent a(Parcel parcel)
    {
        return new PanelSlideEvent(parcel);
    }

    private static PanelSlideEvent[] a(int i)
    {
        return new PanelSlideEvent[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
