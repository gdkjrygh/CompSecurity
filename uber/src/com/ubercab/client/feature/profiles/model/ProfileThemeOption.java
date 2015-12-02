// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles.model;

import android.graphics.Color;
import hnx;
import hny;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.ubercab.client.feature.profiles.model:
//            Shape_ProfileThemeOption

public abstract class ProfileThemeOption extends hnx
    implements com.ubercab.rider.realtime.model.ProfileThemeOption
{

    public static String LARGE_LOGO_KEY = "Large";
    public static String THUMBNAIL_LOGO_KEY = "Thumbnail";

    public ProfileThemeOption()
    {
    }

    public static ProfileThemeOption create(List list, List list1, Map map, String s, String s1)
    {
        return (new Shape_ProfileThemeOption()).setColors(list).setIcons(list1).setLogos(map).setInitials(s).setProfileUuid(s1);
    }

    protected Object onGet(hny hny, Object obj)
    {
        Object obj1 = obj;
        if (hny == Shape_ProfileThemeOption.Property.INT_COLORS)
        {
            obj1 = obj;
            if (obj == null)
            {
                List list = getColors();
                obj1 = obj;
                if (list != null)
                {
                    hny = new ArrayList(list.size());
                    int i = 0;
                    do
                    {
                        obj1 = hny;
                        if (i >= list.size())
                        {
                            break;
                        }
                        hny.add(Integer.valueOf(Color.parseColor((String)list.get(i))));
                        i++;
                    } while (true);
                }
            }
        }
        return obj1;
    }

    abstract ProfileThemeOption setColors(List list);

    abstract ProfileThemeOption setIcons(List list);

    abstract ProfileThemeOption setInitials(String s);

    abstract ProfileThemeOption setIntColors(List list);

    abstract ProfileThemeOption setLogos(Map map);

    abstract ProfileThemeOption setProfileUuid(String s);

}
