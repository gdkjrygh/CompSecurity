// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.ubercab.client.feature.profiles.model:
//            ProfileThemeOption

public final class Shape_ProfileThemeOption extends ProfileThemeOption
{

    private static final Set SHAPE_PROPERTIES;
    private List colors;
    private List icons;
    private String initials;
    private List intColors;
    private Map logos;
    private String profileUuid;

    Shape_ProfileThemeOption()
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
            obj = (ProfileThemeOption)obj;
            if (((ProfileThemeOption) (obj)).getColors() == null ? getColors() != null : !((ProfileThemeOption) (obj)).getColors().equals(getColors()))
            {
                return false;
            }
            if (((ProfileThemeOption) (obj)).getIcons() == null ? getIcons() != null : !((ProfileThemeOption) (obj)).getIcons().equals(getIcons()))
            {
                return false;
            }
            if (((ProfileThemeOption) (obj)).getInitials() == null ? getInitials() != null : !((ProfileThemeOption) (obj)).getInitials().equals(getInitials()))
            {
                return false;
            }
            if (((ProfileThemeOption) (obj)).getIntColors() == null ? getIntColors() != null : !((ProfileThemeOption) (obj)).getIntColors().equals(getIntColors()))
            {
                return false;
            }
            if (((ProfileThemeOption) (obj)).getLogos() == null ? getLogos() != null : !((ProfileThemeOption) (obj)).getLogos().equals(getLogos()))
            {
                return false;
            }
            if (((ProfileThemeOption) (obj)).getProfileUuid() == null ? getProfileUuid() != null : !((ProfileThemeOption) (obj)).getProfileUuid().equals(getProfileUuid()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getColors()
    {
        return (List)onGet(Property.COLORS, colors);
    }

    public final List getIcons()
    {
        return (List)onGet(Property.ICONS, icons);
    }

    public final String getInitials()
    {
        return (String)onGet(Property.INITIALS, initials);
    }

    public final List getIntColors()
    {
        return (List)onGet(Property.INT_COLORS, intColors);
    }

    public final Map getLogos()
    {
        return (Map)onGet(Property.LOGOS, logos);
    }

    public final String getProfileUuid()
    {
        return (String)onGet(Property.PROFILE_UUID, profileUuid);
    }

    public final int hashCode()
    {
        int j1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (colors == null)
        {
            i = 0;
        } else
        {
            i = colors.hashCode();
        }
        if (icons == null)
        {
            j = 0;
        } else
        {
            j = icons.hashCode();
        }
        if (initials == null)
        {
            k = 0;
        } else
        {
            k = initials.hashCode();
        }
        if (intColors == null)
        {
            l = 0;
        } else
        {
            l = intColors.hashCode();
        }
        if (logos == null)
        {
            i1 = 0;
        } else
        {
            i1 = logos.hashCode();
        }
        if (profileUuid != null)
        {
            j1 = profileUuid.hashCode();
        }
        return (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ j1;
    }

    final ProfileThemeOption setColors(List list)
    {
        List list1 = colors;
        colors = (List)beforeSet(Property.COLORS, list1, list);
        afterSet(Property.COLORS, list1, list);
        return this;
    }

    final ProfileThemeOption setIcons(List list)
    {
        List list1 = icons;
        icons = (List)beforeSet(Property.ICONS, list1, list);
        afterSet(Property.ICONS, list1, list);
        return this;
    }

    final ProfileThemeOption setInitials(String s)
    {
        String s1 = initials;
        initials = (String)beforeSet(Property.INITIALS, s1, s);
        afterSet(Property.INITIALS, s1, s);
        return this;
    }

    final ProfileThemeOption setIntColors(List list)
    {
        List list1 = intColors;
        intColors = (List)beforeSet(Property.INT_COLORS, list1, list);
        afterSet(Property.INT_COLORS, list1, list);
        return this;
    }

    final ProfileThemeOption setLogos(Map map)
    {
        Map map1 = logos;
        logos = (Map)beforeSet(Property.LOGOS, map1, map);
        afterSet(Property.LOGOS, map1, map);
        return this;
    }

    final ProfileThemeOption setProfileUuid(String s)
    {
        String s1 = profileUuid;
        profileUuid = (String)beforeSet(Property.PROFILE_UUID, s1, s);
        afterSet(Property.PROFILE_UUID, s1, s);
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.feature.profiles.model.ProfileThemeOption{colors=")).append(colors).append(", icons=").append(icons).append(", initials=").append(initials).append(", intColors=").append(intColors).append(", logos=").append(logos).append(", profileUuid=").append(profileUuid).append("}").toString();
    }

    static 
    {
        SHAPE_PROPERTIES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Property[] {
            Property.COLORS, Property.ICONS, Property.INITIALS, Property.INT_COLORS, Property.LOGOS, Property.PROFILE_UUID
        })));
    }

    private class Property extends Enum
        implements hny
    {

        private static final Property $VALUES[];
        public static final Property COLORS;
        public static final Property ICONS;
        public static final Property INITIALS;
        public static final Property INT_COLORS;
        public static final Property LOGOS;
        public static final Property PROFILE_UUID;

        public static Property valueOf(String s)
        {
            return (Property)Enum.valueOf(com/ubercab/client/feature/profiles/model/Shape_ProfileThemeOption$Property, s);
        }

        public static Property[] values()
        {
            return (Property[])$VALUES.clone();
        }

        static 
        {
            COLORS = new Property("COLORS", 0) {

                public final String toString()
                {
                    return "colors";
                }

            };
            ICONS = new Property("ICONS", 1) {

                public final String toString()
                {
                    return "icons";
                }

            };
            INITIALS = new Property("INITIALS", 2) {

                public final String toString()
                {
                    return "initials";
                }

            };
            INT_COLORS = new Property("INT_COLORS", 3) {

                public final String toString()
                {
                    return "intColors";
                }

            };
            LOGOS = new Property("LOGOS", 4) {

                public final String toString()
                {
                    return "logos";
                }

            };
            PROFILE_UUID = new Property("PROFILE_UUID", 5) {

                public final String toString()
                {
                    return "profileUuid";
                }

            };
            $VALUES = (new Property[] {
                COLORS, ICONS, INITIALS, INT_COLORS, LOGOS, PROFILE_UUID
            });
        }

        private Property(String s, int i)
        {
            super(s, i);
        }

    }

}
