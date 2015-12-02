// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles.model;

import com.ubercab.rider.realtime.model.ProfileTheme;

// Referenced classes of package com.ubercab.client.feature.profiles.model:
//            ManagedBusinessProfileAttributes

public final class Shape_ManagedBusinessProfileAttributes extends ManagedBusinessProfileAttributes
{

    private String billingMode;
    private String name;
    private ProfileTheme theme;

    Shape_ManagedBusinessProfileAttributes()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ManagedBusinessProfileAttributes)obj;
            if (((ManagedBusinessProfileAttributes) (obj)).getBillingMode() == null ? getBillingMode() != null : !((ManagedBusinessProfileAttributes) (obj)).getBillingMode().equals(getBillingMode()))
            {
                return false;
            }
            if (((ManagedBusinessProfileAttributes) (obj)).getName() == null ? getName() != null : !((ManagedBusinessProfileAttributes) (obj)).getName().equals(getName()))
            {
                return false;
            }
            if (((ManagedBusinessProfileAttributes) (obj)).getTheme() == null ? getTheme() != null : !((ManagedBusinessProfileAttributes) (obj)).getTheme().equals(getTheme()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getBillingMode()
    {
        return billingMode;
    }

    public final String getName()
    {
        return name;
    }

    public final ProfileTheme getTheme()
    {
        return theme;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (billingMode == null)
        {
            i = 0;
        } else
        {
            i = billingMode.hashCode();
        }
        if (name == null)
        {
            j = 0;
        } else
        {
            j = name.hashCode();
        }
        if (theme != null)
        {
            k = theme.hashCode();
        }
        return (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    public final ManagedBusinessProfileAttributes setBillingMode(String s)
    {
        billingMode = s;
        return this;
    }

    public final ManagedBusinessProfileAttributes setName(String s)
    {
        name = s;
        return this;
    }

    public final ManagedBusinessProfileAttributes setTheme(ProfileTheme profiletheme)
    {
        theme = profiletheme;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.feature.profiles.model.ManagedBusinessProfileAttributes{billingMode=")).append(billingMode).append(", name=").append(name).append(", theme=").append(theme).append("}").toString();
    }
}
