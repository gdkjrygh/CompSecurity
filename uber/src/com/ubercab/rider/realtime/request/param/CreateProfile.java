// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.param;

import com.ubercab.rider.realtime.model.ProfileTheme;
import hmj;

// Referenced classes of package com.ubercab.rider.realtime.request.param:
//            Shape_CreateProfile

public abstract class CreateProfile
    implements hmj
{

    public CreateProfile()
    {
    }

    public static CreateProfile create(String s)
    {
        Shape_CreateProfile shape_createprofile = new Shape_CreateProfile();
        shape_createprofile.setType(s);
        return shape_createprofile;
    }

    public static CreateProfile create(String s, String s1, String s2)
    {
        s = create(s);
        s.setEmail(s1);
        s.setName(s2);
        return s;
    }

    public String getBillingModeFromChildAttributes()
    {
        return getBillingMode();
    }

    public String getNameFromChildAttributes()
    {
        return getName();
    }

    public ProfileTheme getThemeFromChildAttributes()
    {
        return getTheme();
    }

    public abstract String getUserUuid();

    public abstract void setUserUuid(String s);
}
