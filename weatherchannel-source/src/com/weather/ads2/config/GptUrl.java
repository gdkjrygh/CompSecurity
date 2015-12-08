// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.config;

import org.json.JSONException;
import org.json.JSONObject;

public class GptUrl
{

    private static final String KEY_AD_URL = "adurl";
    private static final String KEY_IMAVIDEOAD_URI = "IMAVideoAdUrl";
    private static final String KEY_UM_URI = "umuri";
    public final String adUrl;
    public final String imaVideoAdUrl;
    public final String umUri;

    public GptUrl(JSONObject jsonobject)
        throws JSONException
    {
        adUrl = jsonobject.getString("adurl");
        umUri = jsonobject.getString("umuri");
        imaVideoAdUrl = jsonobject.optString("IMAVideoAdUrl", null);
    }
}
