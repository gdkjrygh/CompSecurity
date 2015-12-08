// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.settings.helpers;

import com.wsi.android.weather.utils.settings.MapSettingsAccessor;

public abstract class MeasurementUnits extends Enum
{

    private static final MeasurementUnits $VALUES[];
    public static final MeasurementUnits ENGLISH;
    public static final MeasurementUnits METRIC;

    private MeasurementUnits(String s, int i)
    {
        super(s, i);
    }

    MeasurementUnits(String s, int i, _cls1 _pcls1)
    {
        this(s, i);
    }

    public static MeasurementUnits getMeasurementUnitsFromString(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        s = valueOf(s);
        return s;
        s;
        return ENGLISH;
    }

    public static MeasurementUnits valueOf(String s)
    {
        return (MeasurementUnits)Enum.valueOf(com/wsi/android/framework/settings/helpers/MeasurementUnits, s);
    }

    public static MeasurementUnits[] values()
    {
        return (MeasurementUnits[])$VALUES.clone();
    }

    public abstract boolean isCurrentMeasurementUnits(MapSettingsAccessor mapsettingsaccessor);

    public abstract void setMeasurementUnits(MapSettingsAccessor mapsettingsaccessor);

    static 
    {
        ENGLISH = new _cls1("ENGLISH", 0);
        METRIC = new _cls2("METRIC", 1);
        $VALUES = (new MeasurementUnits[] {
            ENGLISH, METRIC
        });
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
