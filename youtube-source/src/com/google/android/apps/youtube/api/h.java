// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import android.net.Uri;
import android.util.Pair;
import com.google.android.apps.youtube.core.converter.c;
import com.google.android.apps.youtube.core.converter.http.HttpMethod;
import com.google.android.apps.youtube.core.converter.http.ay;
import com.google.android.apps.youtube.datalib.legacy.model.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.google.android.apps.youtube.api:
//            ApiDeviceRegistrationClientForV2Apis

final class h extends ay
    implements c
{

    final ApiDeviceRegistrationClientForV2Apis a;

    private h(ApiDeviceRegistrationClientForV2Apis apideviceregistrationclientforv2apis)
    {
        a = apideviceregistrationclientforv2apis;
        super();
    }

    h(ApiDeviceRegistrationClientForV2Apis apideviceregistrationclientforv2apis, byte byte0)
    {
        this(apideviceregistrationclientforv2apis);
    }

    protected final Object a(InputStream inputstream)
    {
        Properties properties = new Properties();
        properties.load(inputstream);
        return new b(properties.getProperty("DeviceId"), ApiDeviceRegistrationClientForV2Apis.e(a));
    }

    public final Object a(Object obj)
    {
        Object obj1 = (Pair)obj;
        obj = (Uri)((Pair) (obj1)).first;
        obj1 = (b)((Pair) (obj1)).second;
        HttpUriRequest httpurirequest = HttpMethod.POST.createHttpRequest(((Uri) (obj)));
        httpurirequest.setHeader("X-GData-Device", ((b) (obj1)).a(((Uri) (obj))));
        return httpurirequest;
    }

    protected final HttpResponseException a(HttpResponse httpresponse)
    {
        Object obj;
        int i;
        i = httpresponse.getStatusLine().getStatusCode();
        obj = new Properties();
        ((Properties) (obj)).load(httpresponse.getEntity().getContent());
        obj = ((Properties) (obj)).getProperty("Error");
        if (i != 400 || obj == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        if (!((String) (obj)).contains("InvalidDeveloper"))
        {
            break MISSING_BLOCK_LABEL_76;
        }
        obj = new ApiDeviceRegistrationClientForV2Apis.InvalidDeveloperException(i, "Invalid Developer Key");
        return ((HttpResponseException) (obj));
        IOException ioexception;
        ioexception;
        return super.a(httpresponse);
    }
}
