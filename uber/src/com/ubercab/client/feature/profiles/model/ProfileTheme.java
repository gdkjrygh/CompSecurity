// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles.model;

import dtu;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.ubercab.client.feature.profiles.model:
//            Shape_ProfileTheme

public abstract class ProfileTheme
    implements com.ubercab.rider.realtime.model.ProfileTheme
{

    public static final String LARGE_LOGO_KEY = "Large";
    public static final String THUMBNAIL_LOGO_KEY = "Thumbnail";

    public ProfileTheme()
    {
    }

    public static ProfileTheme create(String s, String s1, Map map, String s2)
    {
        return (new Shape_ProfileTheme()).setInitials(s).setIcon(s1).setLogos(map).setColor(s2);
    }

    public static ProfileTheme createEmpty()
    {
        return create(null, null, Collections.emptyMap(), dtu.a(0xff000000));
    }

    public abstract String getColor();

    public abstract String getIcon();

    public abstract String getInitials();

    public abstract Map getLogos();

    public abstract ProfileTheme setColor(String s);

    public abstract ProfileTheme setIcon(String s);

    public abstract ProfileTheme setInitials(String s);

    public abstract ProfileTheme setLogos(Map map);
}
