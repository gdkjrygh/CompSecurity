// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.interactivemedia.v3.impl.data;

import java.util.List;
import java.util.Map;

public abstract class TestingConfiguration
{

    public static final String PARAMETER_KEY = "tcnfp";
    public static final String SSAI_CONTENT_URL_BUILDER_KEY = "ssaiContentUrlBuilder";

    TestingConfiguration()
    {
    }

    public static Builder builder()
    {
    /* block-local class not found */
    class Builder {}

        return (new h.a()).disableExperiments(false).useVideoElementMock(false).videoElementMockDuration(30F).useTestSsaiStreamManager(false).enableMonitorAppLifecycle(true);
    }

    public abstract boolean disableExperiments();

    public abstract boolean enableMonitorAppLifecycle();

    public abstract Map extraParams();

    public abstract List forceExperimentIds();

    public abstract boolean useTestSsaiStreamManager();

    public abstract boolean useVideoElementMock();

    public abstract float videoElementMockDuration();
}
