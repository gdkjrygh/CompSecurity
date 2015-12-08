// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;

import com.google.common.base.Preconditions;
import com.weather.util.parsing.Validation;
import com.weather.util.parsing.ValidationException;
import org.json.JSONException;
import org.json.JSONObject;

public class AdsMetrics
{

    private static final String FIELD_NAME_ADCONFIGID = "adconfigid";
    private static final String FIELD_NAME_ADZONE = "adzone";
    private final String adConfigId;
    private final String adZone;

    private AdsMetrics(String s, String s1)
        throws ValidationException
    {
        adConfigId = Validation.validateNotEmpty("adconfigid", (String)Preconditions.checkNotNull(s));
        adZone = Validation.validateNotEmpty("adzone", (String)Preconditions.checkNotNull(s1));
    }

    public static AdsMetrics fromJson(JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        Validation.validateClass(java/lang/String, "adconfigid", jsonobject.get("adconfigid"));
        Validation.validateClass(java/lang/String, "adzone", jsonobject.get("adzone"));
        return new AdsMetrics(jsonobject.getString("adconfigid"), jsonobject.getString("adzone"));
    }

    public String getAdConfigId()
    {
        return adConfigId;
    }

    public String getAdZone()
    {
        return adZone;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AdsMetrics{adConfigId='").append(adConfigId).append('\'').append(", adZone='").append(adZone).append('\'').append('}').toString();
    }
}
