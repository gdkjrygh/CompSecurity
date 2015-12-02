// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import com.ubercab.rider.realtime.model.ManagedBusinessProfileAttributes;
import com.ubercab.rider.realtime.model.ProfileTheme;
import hmj;

abstract class ObjectProfile
    implements hmj
{

    ObjectProfile()
    {
    }

    private static boolean isEmptyString(String s)
    {
        return s == null || s.isEmpty();
    }

    private static boolean isEmptyTheme(ProfileTheme profiletheme)
    {
        return profiletheme == null || isEmptyString(profiletheme.getColor()) && isEmptyString(profiletheme.getIcon()) && isEmptyString(profiletheme.getInitials());
    }

    private boolean isManagedBusinessProfile()
    {
        return "ManagedBusiness".equals(getType());
    }

    public String getBillingModeFromChildAttributes()
    {
        if (isManagedBusinessProfile())
        {
            if (getManagedBusinessProfileAttributes() != null)
            {
                return getManagedBusinessProfileAttributes().getBillingMode();
            } else
            {
                return null;
            }
        } else
        {
            return getBillingMode();
        }
    }

    public String getNameFromChildAttributes()
    {
        if (isManagedBusinessProfile())
        {
            if (getManagedBusinessProfileAttributes() != null)
            {
                return getManagedBusinessProfileAttributes().getName();
            } else
            {
                return null;
            }
        } else
        {
            return getName();
        }
    }

    public ProfileTheme getThemeFromChildAttributes()
    {
        ProfileTheme profiletheme = getTheme();
        if (!isManagedBusinessProfile() || getManagedBusinessProfileAttributes() == null || isEmptyTheme(getManagedBusinessProfileAttributes().getTheme()))
        {
            return profiletheme;
        } else
        {
            return getManagedBusinessProfileAttributes().getTheme();
        }
    }
}
