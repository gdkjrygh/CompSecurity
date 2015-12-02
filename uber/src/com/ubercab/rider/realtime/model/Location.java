// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.model:
//            ValidatedAddress

public interface Location
{

    public abstract String getAddress();

    public abstract List getAddressComponents();

    public abstract String getFormattedAddress();

    public abstract String getId();

    public abstract String getLanguage();

    public abstract double getLatitude();

    public abstract double getLongitude();

    public abstract String getNickname();

    public abstract String getReference();

    public abstract String getReferenceType();

    public abstract String getSubtitle();

    public abstract String getTitle();

    public abstract String getType();

    public abstract String getUuid();

    public abstract ValidatedAddress getValidatedAddress();
}
