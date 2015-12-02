// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding.model;

import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.ubercab.android.partner.funnel.onboarding.model:
//            Shape_OfficeHours

public abstract class OfficeHours
    implements Parcelable
{

    public OfficeHours()
    {
    }

    public static OfficeHours create()
    {
        return new Shape_OfficeHours();
    }

    public abstract List getPois();

    public abstract OfficeHours setPois(List list);

    public boolean shouldDisplayOfficeHours()
    {
        return getPois() != null && getPois().size() > 0;
    }
}
