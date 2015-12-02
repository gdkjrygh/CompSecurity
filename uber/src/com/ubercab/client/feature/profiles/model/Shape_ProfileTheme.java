// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles.model;

import java.util.Map;

// Referenced classes of package com.ubercab.client.feature.profiles.model:
//            ProfileTheme

public final class Shape_ProfileTheme extends ProfileTheme
{

    private String color;
    private String icon;
    private String initials;
    private Map logos;

    Shape_ProfileTheme()
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
            obj = (ProfileTheme)obj;
            if (((ProfileTheme) (obj)).getInitials() == null ? getInitials() != null : !((ProfileTheme) (obj)).getInitials().equals(getInitials()))
            {
                return false;
            }
            if (((ProfileTheme) (obj)).getIcon() == null ? getIcon() != null : !((ProfileTheme) (obj)).getIcon().equals(getIcon()))
            {
                return false;
            }
            if (((ProfileTheme) (obj)).getLogos() == null ? getLogos() != null : !((ProfileTheme) (obj)).getLogos().equals(getLogos()))
            {
                return false;
            }
            if (((ProfileTheme) (obj)).getColor() == null ? getColor() != null : !((ProfileTheme) (obj)).getColor().equals(getColor()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getColor()
    {
        return color;
    }

    public final String getIcon()
    {
        return icon;
    }

    public final String getInitials()
    {
        return initials;
    }

    public final Map getLogos()
    {
        return logos;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (initials == null)
        {
            i = 0;
        } else
        {
            i = initials.hashCode();
        }
        if (icon == null)
        {
            j = 0;
        } else
        {
            j = icon.hashCode();
        }
        if (logos == null)
        {
            k = 0;
        } else
        {
            k = logos.hashCode();
        }
        if (color != null)
        {
            l = color.hashCode();
        }
        return (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l;
    }

    public final ProfileTheme setColor(String s)
    {
        color = s;
        return this;
    }

    public final ProfileTheme setIcon(String s)
    {
        icon = s;
        return this;
    }

    public final ProfileTheme setInitials(String s)
    {
        initials = s;
        return this;
    }

    public final ProfileTheme setLogos(Map map)
    {
        logos = map;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.feature.profiles.model.ProfileTheme{initials=")).append(initials).append(", icon=").append(icon).append(", logos=").append(logos).append(", color=").append(color).append("}").toString();
    }
}
