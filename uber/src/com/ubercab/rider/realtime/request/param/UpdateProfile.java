// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.param;

import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.model.ProfileTheme;
import hmj;

// Referenced classes of package com.ubercab.rider.realtime.request.param:
//            Shape_UpdateProfile

public abstract class UpdateProfile
    implements hmj
{

    public UpdateProfile()
    {
    }

    public static UpdateProfile create(Profile profile)
    {
        Shape_UpdateProfile shape_updateprofile = new Shape_UpdateProfile();
        shape_updateprofile.setName(profile.getName());
        shape_updateprofile.setBillingMode(profile.getBillingMode());
        shape_updateprofile.setTheme(profile.getTheme());
        shape_updateprofile.setDefaultPaymentProfileUuid(profile.getDefaultPaymentProfileUuid());
        shape_updateprofile.setEmail(profile.getEmail());
        shape_updateprofile.setIsExpensingEnabled(profile.getIsExpensingEnabled());
        shape_updateprofile.setIsVerified(profile.getIsVerified());
        shape_updateprofile.setManagedBusinessProfileAttributes(profile.getManagedBusinessProfileAttributes());
        shape_updateprofile.setMobile(profile.getMobile());
        shape_updateprofile.setSelectedSummaryPeriods(profile.getSelectedSummaryPeriods());
        shape_updateprofile.setType(profile.getType());
        shape_updateprofile.setUuid(profile.getUuid());
        return shape_updateprofile;
    }

    public String getBillingModeFromChildAttributes()
    {
        return null;
    }

    public String getNameFromChildAttributes()
    {
        return null;
    }

    public ProfileTheme getThemeFromChildAttributes()
    {
        return null;
    }
}
