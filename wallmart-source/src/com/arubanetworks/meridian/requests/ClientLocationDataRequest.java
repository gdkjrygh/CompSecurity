// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.requests;

import android.net.Uri;
import com.arubanetworks.meridian.internal.util.Strings;
import com.arubanetworks.meridian.log.MeridianLogger;
import org.json.JSONObject;

// Referenced classes of package com.arubanetworks.meridian.requests:
//            MeridianJSONRequest

public final class ClientLocationDataRequest extends MeridianJSONRequest
{
    public static class Builder
    {

        private String a;
        private MeridianRequest.Listener b;
        private MeridianRequest.ErrorListener c;

        private String a()
        {
            return (new android.net.Uri.Builder()).path("/api/maps/client_location_data").appendQueryParameter("appid", a).build().toString();
        }

        public ClientLocationDataRequest build()
        {
            if (Strings.isNullOrEmpty(a))
            {
                throw new IllegalStateException("You need to provide an appId to create this request");
            } else
            {
                return new ClientLocationDataRequest(a(), b, c, null);
            }
        }

        public Builder setAppId(String s)
        {
            a = s;
            return this;
        }

        public Builder setErrorListener(MeridianRequest.ErrorListener errorlistener)
        {
            c = errorlistener;
            return this;
        }

        public Builder setListener(MeridianRequest.Listener listener)
        {
            b = listener;
            return this;
        }

        public Builder()
        {
        }
    }


    private static final MeridianLogger a;
    private MeridianRequest.Listener b;
    private MeridianRequest.ErrorListener c;

    private ClientLocationDataRequest(String s, MeridianRequest.Listener listener, MeridianRequest.ErrorListener errorlistener)
    {
        super(s);
        b = listener;
        c = errorlistener;
    }

    ClientLocationDataRequest(String s, MeridianRequest.Listener listener, MeridianRequest.ErrorListener errorlistener, _cls1 _pcls1)
    {
        this(s, listener, errorlistener);
    }

    protected String getRequestTag()
    {
        return "ClientLocationDataRequest";
    }

    protected void onJSONError(Throwable throwable)
    {
        if (c != null)
        {
            c.onError(throwable);
        }
    }

    protected void onJSONResponse(JSONObject jsonobject)
    {
        a.d("Response: %s", new Object[] {
            jsonobject
        });
        if (b != null)
        {
            b.onResponse(jsonobject);
        }
    }

    protected boolean overrideCacheHeaders()
    {
        return false;
    }

    static 
    {
        a = MeridianLogger.forTag("ClientLocationDataRequest").andFeature(com.arubanetworks.meridian.log.MeridianLogger.Feature.REQUESTS);
    }
}
