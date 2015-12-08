// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;

import com.google.common.base.Preconditions;
import java.io.Serializable;

// Referenced classes of package com.weather.dal.locations:
//            SevereNotification

public final class LocationItemOptions
    implements Serializable
{

    private static final long serialVersionUID = 0x8c143f6057b585ddL;
    private final boolean hasTemperatureNotification;
    private final String nickname;
    private final String pictureUrl;
    private final SevereNotification severeNotification;

    public LocationItemOptions(String s, String s1, boolean flag, SevereNotification severenotification)
    {
        Preconditions.checkNotNull(s);
        nickname = s;
        pictureUrl = s1;
        hasTemperatureNotification = flag;
        severeNotification = severenotification;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (LocationItemOptions)obj;
        if (hasTemperatureNotification != ((LocationItemOptions) (obj)).hasTemperatureNotification)
        {
            return false;
        }
        if (!nickname.equals(((LocationItemOptions) (obj)).nickname))
        {
            return false;
        }
        if (pictureUrl == null)
        {
            if (((LocationItemOptions) (obj)).pictureUrl != null)
            {
                return false;
            }
        } else
        if (!pictureUrl.equals(((LocationItemOptions) (obj)).pictureUrl))
        {
            return false;
        }
        if (severeNotification != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((LocationItemOptions) (obj)).severeNotification == null) goto _L1; else goto _L3
_L3:
        return false;
        if (severeNotification.equals(((LocationItemOptions) (obj)).severeNotification)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getNickname()
    {
        return nickname;
    }

    public String getPictureUrl()
    {
        return pictureUrl;
    }

    public SevereNotification getSevereNotification()
    {
        return severeNotification;
    }

    public boolean hasTemperatureNotification()
    {
        return hasTemperatureNotification;
    }

    public int hashCode()
    {
        int j = 0;
        char c;
        int i;
        int k;
        if (hasTemperatureNotification)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        k = nickname.hashCode();
        if (pictureUrl == null)
        {
            i = 0;
        } else
        {
            i = pictureUrl.hashCode();
        }
        if (severeNotification != null)
        {
            j = severeNotification.hashCode();
        }
        return (((c + 31) * 31 + k) * 31 + i) * 31 + j;
    }
}
