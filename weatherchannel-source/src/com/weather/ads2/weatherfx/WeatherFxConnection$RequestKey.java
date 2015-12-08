// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.weatherfx;

import com.google.common.base.Joiner;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.weather.ads2.weatherfx:
//            WeatherFxConnection

private static final class <init>
{

    private final followMe followMe;
    private final Set locations;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (<init>)obj;
            if (followMe == null ? ((followMe) (obj)).followMe != null : !followMe.uals(((uals) (obj)).followMe))
            {
                return false;
            }
            if (!locations.equals(((locations) (obj)).locations))
            {
                return false;
            }
        }
        return true;
    }

    String getHzcsQueryValue()
    {
        if (followMe == null)
        {
            return "IP";
        } else
        {
            return followMe.tZip();
        }
    }

    String getLocQueryValue()
    {
        if (followMe == null)
        {
            return "";
        } else
        {
            return followMe.tLocationId();
        }
    }

    String getNzcsQueryValue()
    {
        return "zcs";
    }

    String getZcsQueryValue()
    {
        if (locations.isEmpty())
        {
            return "nl";
        } else
        {
            Collection collection = Collections2.transform(locations, WeatherFxConnection.access$100());
            return Joiner.on(',').join(collection);
        }
    }

    String getZip()
    {
        if (followMe == null)
        {
            return "";
        } else
        {
            return followMe.tZip();
        }
    }

    boolean hasFollowMe()
    {
        return followMe != null;
    }

    public int hashCode()
    {
        int j = locations.hashCode();
        int i;
        if (followMe != null)
        {
            i = followMe.shCode();
        } else
        {
            i = 0;
        }
        return j * 31 + i;
    }

    public String toString()
    {
        return (new StringBuilder()).append("RequestKey{locations=").append(locations).append(", followMe=").append(followMe).append('}').toString();
    }

    private (Collection collection,  )
    {
        locations = ImmutableSet.copyOf(collection);
        followMe = ;
    }

    followMe(Collection collection, followMe followme, followMe followme1)
    {
        this(collection, followme);
    }
}
