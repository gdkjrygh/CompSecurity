// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles.model;

import com.ubercab.rider.realtime.model.ProfileTheme;

// Referenced classes of package com.ubercab.client.feature.profiles.model:
//            Shape_ManagedBusinessProfileAttributes, ProfileTheme

public abstract class ManagedBusinessProfileAttributes
    implements com.ubercab.rider.realtime.model.ManagedBusinessProfileAttributes
{

    public ManagedBusinessProfileAttributes()
    {
    }

    public static ManagedBusinessProfileAttributes create(String s, com.ubercab.client.feature.profiles.model.ProfileTheme profiletheme, String s1)
    {
        return (new Shape_ManagedBusinessProfileAttributes()).setName(s).setTheme(profiletheme).setBillingMode(s1);
    }

    public abstract ManagedBusinessProfileAttributes setBillingMode(String s);

    public abstract ManagedBusinessProfileAttributes setName(String s);

    public abstract ManagedBusinessProfileAttributes setTheme(ProfileTheme profiletheme);
}
