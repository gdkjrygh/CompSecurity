// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.surge;


// Referenced classes of package com.ubercab.client.core.model.surge:
//            DropNotification

final class Shape_DropNotification extends DropNotification
{

    private long defaultExpirationTime;
    private boolean enabled;

    Shape_DropNotification()
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
            obj = (DropNotification)obj;
            if (((DropNotification) (obj)).getDefaultExpirationTime() != getDefaultExpirationTime())
            {
                return false;
            }
            if (((DropNotification) (obj)).isEnabled() != isEnabled())
            {
                return false;
            }
        }
        return true;
    }

    public final long getDefaultExpirationTime()
    {
        return defaultExpirationTime;
    }

    public final int hashCode()
    {
        int i = (int)(0xf4243L ^ (defaultExpirationTime >>> 32 ^ defaultExpirationTime));
        char c;
        if (enabled)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return c ^ 0xf4243 * i;
    }

    public final boolean isEnabled()
    {
        return enabled;
    }

    public final DropNotification setDefaultExpirationTime(long l)
    {
        defaultExpirationTime = l;
        return this;
    }

    public final DropNotification setEnabled(boolean flag)
    {
        enabled = flag;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.core.model.surge.DropNotification{defaultExpirationTime=")).append(defaultExpirationTime).append(", enabled=").append(enabled).append("}").toString();
    }
}
