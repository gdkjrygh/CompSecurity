// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.signup.form.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.android.partner.funnel.signup.form.model:
//            Shape_CityOption

public abstract class CityOption
    implements Parcelable
{

    public CityOption()
    {
    }

    public static CityOption create()
    {
        return new Shape_CityOption();
    }

    public abstract String getDisplayName();

    public abstract int getFlowTypeCityId();

    abstract CityOption setDisplayName(String s);

    abstract CityOption setFlowTypeCityId(int i);
}
