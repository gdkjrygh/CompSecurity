// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.beta:
//            BuildProperties, CheckForUpdatesResponseTransform, CheckForUpdatesResponse

class CheckForUpdatesRequest extends AbstractSpiCall
{

    static final String BETA_SOURCE = "3";
    static final String BUILD_VERSION = "build_version";
    static final String DISPLAY_VERSION = "display_version";
    static final String INSTANCE = "instance";
    static final String SOURCE = "source";
    private final CheckForUpdatesResponseTransform responseTransform;

    public CheckForUpdatesRequest(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, CheckForUpdatesResponseTransform checkforupdatesresponsetransform)
    {
        super(kit, s, s1, httprequestfactory, HttpMethod.GET);
        responseTransform = checkforupdatesresponsetransform;
    }

    private HttpRequest applyHeadersTo(HttpRequest httprequest, String s, String s1)
    {
        return httprequest.header("Accept", "application/json").header("User-Agent", (new StringBuilder()).append("Crashlytics Android SDK/").append(kit.getVersion()).toString()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa").header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", kit.getVersion()).header("X-CRASHLYTICS-API-KEY", s).header("X-CRASHLYTICS-D", s1);
    }

    private Map getQueryParamsFor(BuildProperties buildproperties)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("build_version", buildproperties.versionCode);
        hashmap.put("display_version", buildproperties.versionName);
        hashmap.put("instance", buildproperties.buildId);
        hashmap.put("source", "3");
        return hashmap;
    }

    public CheckForUpdatesResponse invoke(String s, String s1, BuildProperties buildproperties)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        obj3 = null;
        obj2 = null;
        obj1 = obj2;
        obj = obj3;
        Map map = getQueryParamsFor(buildproperties);
        obj1 = obj2;
        obj = obj3;
        buildproperties = getHttpRequest(map);
        obj1 = buildproperties;
        obj = buildproperties;
        s = applyHeadersTo(buildproperties, s, s1);
        obj1 = s;
        obj = s;
        Fabric.getLogger().d("Beta", (new StringBuilder()).append("Checking for updates from ").append(getUrl()).toString());
        obj1 = s;
        obj = s;
        Fabric.getLogger().d("Beta", (new StringBuilder()).append("Checking for updates query params are: ").append(map).toString());
        obj1 = s;
        obj = s;
        if (!s.ok())
        {
            break MISSING_BLOCK_LABEL_230;
        }
        obj1 = s;
        obj = s;
        Fabric.getLogger().d("Beta", "Checking for updates was successful");
        obj1 = s;
        obj = s;
        s1 = new JSONObject(s.body());
        obj1 = s;
        obj = s;
        s1 = responseTransform.fromJson(s1);
        if (s != null)
        {
            s = s.header("X-REQUEST-ID");
            Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Checking for updates request ID: ").append(s).toString());
        }
        return s1;
        obj1 = s;
        obj = s;
        Fabric.getLogger().e("Beta", (new StringBuilder()).append("Checking for updates failed. Response code: ").append(s.code()).toString());
        if (s != null)
        {
            s = s.header("X-REQUEST-ID");
            Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Checking for updates request ID: ").append(s).toString());
        }
_L2:
        return null;
        s;
        obj = obj1;
        Fabric.getLogger().e("Beta", (new StringBuilder()).append("Error while checking for updates from ").append(getUrl()).toString(), s);
        if (obj1 != null)
        {
            s = ((HttpRequest) (obj1)).header("X-REQUEST-ID");
            Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Checking for updates request ID: ").append(s).toString());
        }
        if (true) goto _L2; else goto _L1
_L1:
        s;
        if (obj != null)
        {
            s1 = ((HttpRequest) (obj)).header("X-REQUEST-ID");
            Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Checking for updates request ID: ").append(s1).toString());
        }
        throw s;
    }
}
