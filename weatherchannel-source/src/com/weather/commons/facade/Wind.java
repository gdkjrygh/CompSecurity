// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import android.content.Context;
import com.weather.util.UnitType;
import com.weather.util.app.AbstractTwcApplication;
import java.util.Locale;

// Referenced classes of package com.weather.commons.facade:
//            FormattedValue, Speed

public class Wind
    implements FormattedValue
{

    static final int MIN_SPEED = 0;
    private String calm;
    public final String dirAcs;
    public final boolean isCalm;
    public final Speed speed;
    public final UnitType unitType;

    public Wind(String s, Integer integer, Integer integer1, UnitType unittype)
    {
        boolean flag1 = true;
        super();
        dirAcs = s;
        unitType = unittype;
        boolean flag;
        if (UnitType.METRIC == unitType)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            integer = integer1;
        }
        speed = new Speed(integer, unittype);
        if (speed.value == null || ((Integer)speed.value).intValue() > 0)
        {
            flag1 = false;
        }
        isCalm = flag1;
    }

    private String getCalmString(Context context)
    {
        if (calm == null)
        {
            calm = context.getString(com.weather.commons.R.string.calm);
        }
        return calm;
    }

    public String format()
    {
        if (dirAcs == null)
        {
            return "--";
        }
        if (isCalm)
        {
            return getCalmString(AbstractTwcApplication.getRootContext());
        } else
        {
            return (new StringBuilder()).append(dirAcs).append(' ').append(speed.format()).toString().trim().toUpperCase(Locale.US);
        }
    }
}
