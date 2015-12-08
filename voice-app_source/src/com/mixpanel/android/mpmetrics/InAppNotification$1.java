// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Parcel;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            InAppNotification

class 
    implements android.os.InAppNotification._cls1
{

    public InAppNotification createFromParcel(Parcel parcel)
    {
        return new InAppNotification(parcel);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public InAppNotification[] newArray(int i)
    {
        return new InAppNotification[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
