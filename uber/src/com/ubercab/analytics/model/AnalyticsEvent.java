// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.analytics.model;

import android.support.v4.util.ArrayMap;
import bjw;
import cia;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.ubercab.analytics.model:
//            Shape_AnalyticsEvent, AnalyticsLocation

public abstract class AnalyticsEvent
{

    private static final bjw GSON = new bjw();

    public AnalyticsEvent()
    {
    }

    public static AnalyticsEvent create(String s)
    {
        return (new Shape_AnalyticsEvent()).setType(s).setCustomValues(new ArrayMap());
    }

    public abstract Map getCustomValues();

    public abstract Long getEpoch();

    public String getFormattedName()
    {
        if (getName() != null)
        {
            return getName().name().toLowerCase(Locale.US);
        } else
        {
            return null;
        }
    }

    public abstract AnalyticsLocation getLocation();

    public abstract cia getName();

    public abstract String getReferrer();

    public abstract String getTreatmentGroupId();

    public abstract String getType();

    public abstract String getUrl();

    public abstract String getValue();

    public abstract Long getValuePosition();

    public abstract AnalyticsEvent setCustomValues(Map map);

    public abstract AnalyticsEvent setEpoch(Long long1);

    public abstract AnalyticsEvent setLocation(AnalyticsLocation analyticslocation);

    public abstract AnalyticsEvent setName(cia cia1);

    public abstract AnalyticsEvent setReferrer(String s);

    public abstract AnalyticsEvent setTreatmentGroupId(String s);

    public abstract AnalyticsEvent setType(String s);

    public abstract AnalyticsEvent setUrl(String s);

    public AnalyticsEvent setValue(Object obj)
    {
        setValue(GSON.a(obj));
        return this;
    }

    public abstract AnalyticsEvent setValue(String s);

    public abstract AnalyticsEvent setValuePosition(Long long1);

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("[AnalyticsEvent: (");
        stringbuilder.append(getType()).append(" - ").append(getName()).append(")");
        if (getValue() != null)
        {
            stringbuilder.append(" val: ").append(getValue());
        }
        if (getValuePosition() != null)
        {
            stringbuilder.append(" valPos: ").append(getValuePosition());
        }
        if (getTreatmentGroupId() != null)
        {
            stringbuilder.append(" treatmentGroupId: ").append(getTreatmentGroupId());
        }
        if (getReferrer() != null)
        {
            stringbuilder.append(" ref: ").append(getReferrer());
        }
        stringbuilder.append(" epoch: ").append(getEpoch());
        AnalyticsLocation analyticslocation = getLocation();
        if (analyticslocation != null)
        {
            stringbuilder.append((new StringBuilder(" lat: ")).append(analyticslocation.getLat()).append(" lng: ").append(analyticslocation.getLng()).toString());
        }
        return stringbuilder.append("]").toString();
    }

}
