// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.profile;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.weather.commons.analytics.profile:
//            LocalyticsProfileHandler

static class followMeCountryCode
{

    String ageGroup;
    boolean breakingNewsAlertsEnabled;
    int dailyRainAlertCount;
    boolean dailyRainAlertsEnabled;
    String followMeCity;
    String followMeCountryCode;
    boolean followMeEnabled;
    String followMeLocation;
    String followMeState;
    String gender;
    boolean lighteningAlertsEnabled;
    boolean loggedIn;
    boolean mPointsEnabled;
    int pollenAlertCount;
    boolean pollenAlertsEnabled;
    boolean realTimeRainAlertsEnabled;
    List savedLocationCities;
    int severeAlertCount;
    boolean severeAlertsEnabled;

    ()
    {
        savedLocationCities = new ArrayList();
        followMeLocation = "";
        followMeCity = "";
        followMeState = "";
        followMeCountryCode = "";
    }
}
