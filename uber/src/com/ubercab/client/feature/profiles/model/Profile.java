// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles.model;

import com.ubercab.rider.realtime.model.ManagedBusinessProfileAttributes;
import com.ubercab.rider.realtime.model.ProfileTheme;
import dum;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.profiles.model:
//            Shape_Profile

public abstract class Profile
    implements com.ubercab.rider.realtime.model.Profile
{

    public Profile()
    {
    }

    public static Profile create(String s, String s1, String s2, String s3, String s4, boolean flag, boolean flag1, String s5, 
            String s6, ProfileTheme profiletheme, List list, ManagedBusinessProfileAttributes managedbusinessprofileattributes)
    {
        return (new Shape_Profile()).setDefaultPaymentProfileUuid(s3).setEmail(s1).setName(s).setUuid(s2).setMobile(s4).setIsExpensingEnabled(flag).setIsVerified(flag1).setSelectedSummaryPeriods(list).setType(s5).setBillingMode(s6).setTheme(profiletheme).setManagedBusinessProfileAttributes(managedbusinessprofileattributes);
    }

    private static boolean isEmptyString(String s)
    {
        return s == null || s.isEmpty();
    }

    private static boolean isEmptyTheme(ProfileTheme profiletheme)
    {
        return profiletheme == null || isEmptyString(profiletheme.getColor()) && isEmptyString(profiletheme.getIcon()) && isEmptyString(profiletheme.getInitials());
    }

    public String getBillingModeFromChildAttributes()
    {
        if (dum.q(this))
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
        if (dum.q(this))
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
        if (!dum.q(this) || getManagedBusinessProfileAttributes() == null || isEmptyTheme(getManagedBusinessProfileAttributes().getTheme()))
        {
            return profiletheme;
        } else
        {
            return getManagedBusinessProfileAttributes().getTheme();
        }
    }

    abstract Profile setBillingMode(String s);

    public abstract Profile setDefaultPaymentProfileUuid(String s);

    public abstract Profile setEmail(String s);

    public abstract Profile setIsExpensingEnabled(boolean flag);

    abstract Profile setIsVerified(boolean flag);

    public abstract Profile setManagedBusinessProfileAttributes(ManagedBusinessProfileAttributes managedbusinessprofileattributes);

    abstract Profile setMobile(String s);

    public abstract Profile setName(String s);

    public abstract Profile setSelectedSummaryPeriods(List list);

    public abstract Profile setTheme(ProfileTheme profiletheme);

    abstract Profile setType(String s);

    abstract Profile setUuid(String s);
}
