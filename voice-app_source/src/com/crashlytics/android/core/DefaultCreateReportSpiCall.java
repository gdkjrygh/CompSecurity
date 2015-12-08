// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.crashlytics.android.core:
//            CreateReportSpiCall, CreateReportRequest, CrashlyticsCore, Report

class DefaultCreateReportSpiCall extends AbstractSpiCall
    implements CreateReportSpiCall
{

    static final String FILE_CONTENT_TYPE = "application/octet-stream";
    static final String FILE_PARAM = "report[file]";
    static final String IDENTIFIER_PARAM = "report[identifier]";

    public DefaultCreateReportSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory)
    {
        super(kit, s, s1, httprequestfactory, HttpMethod.POST);
    }

    DefaultCreateReportSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, HttpMethod httpmethod)
    {
        super(kit, s, s1, httprequestfactory, httpmethod);
    }

    private HttpRequest applyHeadersTo(HttpRequest httprequest, CreateReportRequest createreportrequest)
    {
        httprequest = httprequest.header("X-CRASHLYTICS-API-KEY", createreportrequest.apiKey).header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", CrashlyticsCore.getInstance().getVersion());
        for (createreportrequest = createreportrequest.report.getCustomHeaders().entrySet().iterator(); createreportrequest.hasNext();)
        {
            httprequest = httprequest.header((java.util.Map.Entry)createreportrequest.next());
        }

        return httprequest;
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httprequest, CreateReportRequest createreportrequest)
    {
        createreportrequest = createreportrequest.report;
        return httprequest.part("report[file]", createreportrequest.getFileName(), "application/octet-stream", createreportrequest.getFile()).part("report[identifier]", createreportrequest.getIdentifier());
    }

    public boolean invoke(CreateReportRequest createreportrequest)
    {
        createreportrequest = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createreportrequest), createreportrequest);
        Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Sending report to: ").append(getUrl()).toString());
        int i = createreportrequest.code();
        Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Create report request ID: ").append(createreportrequest.header("X-REQUEST-ID")).toString());
        Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Result was: ").append(i).toString());
        return ResponseParser.parse(i) == 0;
    }
}
