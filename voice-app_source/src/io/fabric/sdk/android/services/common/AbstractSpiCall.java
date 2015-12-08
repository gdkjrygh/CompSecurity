// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            CommonUtils

public abstract class AbstractSpiCall
{

    public static final String ACCEPT_JSON_VALUE = "application/json";
    public static final String ANDROID_CLIENT_TYPE = "android";
    public static final String CLS_ANDROID_SDK_DEVELOPER_TOKEN = "470fa2b4ae81cd56ecbcda9735803434cec591fa";
    public static final String CRASHLYTICS_USER_AGENT = "Crashlytics Android SDK/";
    public static final int DEFAULT_TIMEOUT = 10000;
    public static final String HEADER_ACCEPT = "Accept";
    public static final String HEADER_API_KEY = "X-CRASHLYTICS-API-KEY";
    public static final String HEADER_CLIENT_TYPE = "X-CRASHLYTICS-API-CLIENT-TYPE";
    public static final String HEADER_CLIENT_VERSION = "X-CRASHLYTICS-API-CLIENT-VERSION";
    public static final String HEADER_D = "X-CRASHLYTICS-D";
    public static final String HEADER_DEVELOPER_TOKEN = "X-CRASHLYTICS-DEVELOPER-TOKEN";
    public static final String HEADER_DEVICE_STATE = "X-CRASHLYTICS-DEVICE-STATE";
    public static final String HEADER_REQUEST_ID = "X-REQUEST-ID";
    public static final String HEADER_USER_AGENT = "User-Agent";
    private static final Pattern PROTOCOL_AND_HOST_PATTERN = Pattern.compile("http(s?)://[^\\/]+", 2);
    protected final Kit kit;
    private final HttpMethod method;
    private final String protocolAndHostOverride;
    private final HttpRequestFactory requestFactory;
    private final String url;

    public AbstractSpiCall(Kit kit1, String s, String s1, HttpRequestFactory httprequestfactory, HttpMethod httpmethod)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("url must not be null.");
        }
        if (httprequestfactory == null)
        {
            throw new IllegalArgumentException("requestFactory must not be null.");
        } else
        {
            kit = kit1;
            protocolAndHostOverride = s;
            url = overrideProtocolAndHost(s1);
            requestFactory = httprequestfactory;
            method = httpmethod;
            return;
        }
    }

    private String overrideProtocolAndHost(String s)
    {
        String s1 = s;
        if (!CommonUtils.isNullOrEmpty(protocolAndHostOverride))
        {
            s1 = PROTOCOL_AND_HOST_PATTERN.matcher(s).replaceFirst(protocolAndHostOverride);
        }
        return s1;
    }

    protected HttpRequest getHttpRequest()
    {
        return getHttpRequest(Collections.emptyMap());
    }

    protected HttpRequest getHttpRequest(Map map)
    {
        return requestFactory.buildHttpRequest(method, getUrl(), map).useCaches(false).connectTimeout(10000).header("User-Agent", (new StringBuilder()).append("Crashlytics Android SDK/").append(kit.getVersion()).toString()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    protected String getUrl()
    {
        return url;
    }

}
