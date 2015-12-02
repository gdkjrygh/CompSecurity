// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_DisableEmergencyRequest

public abstract class DisableEmergencyRequest
    implements Parcelable
{

    public DisableEmergencyRequest()
    {
    }

    public static DisableEmergencyRequest create(Long long1)
    {
        return (new Shape_DisableEmergencyRequest()).setCreatedAt(long1);
    }

    public abstract Long getCreatedAt();

    abstract DisableEmergencyRequest setCreatedAt(Long long1);
}
