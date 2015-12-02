// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.android.partner.funnel.onboarding.model:
//            Shape_RequiredField

public abstract class RequiredField
    implements Parcelable
{

    public RequiredField()
    {
    }

    public static RequiredField create()
    {
        return new Shape_RequiredField();
    }

    public abstract String getLocalizedName();

    public abstract String getName();

    public abstract String getType();

    public abstract RequiredField setLocalizedName(String s);

    public abstract RequiredField setName(String s);

    public abstract RequiredField setType(String s);
}
