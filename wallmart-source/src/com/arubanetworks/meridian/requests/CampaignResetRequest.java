// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.requests;

import android.net.Uri;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.arubanetworks.meridian.internal.util.Strings;
import com.arubanetworks.meridian.log.MeridianLogger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.arubanetworks.meridian.requests:
//            MeridianJSONRequest

public final class CampaignResetRequest extends MeridianJSONRequest
{
    public static class Builder
    {

        private String a;
        private String b;
        private MeridianRequest.Listener c;
        private MeridianRequest.ErrorListener d;

        private String a(String s)
        {
            return (new android.net.Uri.Builder()).path("/api/campaigns/reset").appendQueryParameter("id", s).build().toString();
        }

        private Map a()
        {
            HashMap hashmap = new HashMap();
            hashmap.put("deviceid", b);
            return hashmap;
        }

        public CampaignResetRequest build()
        {
            if (Strings.isNullOrEmpty(a))
            {
                throw new IllegalStateException("You need to provide an appId to create this request");
            }
            if (Strings.isNullOrEmpty(b))
            {
                throw new IllegalStateException("You need to provide a device id to create this request");
            } else
            {
                return new CampaignResetRequest(a(a), a(), c, d, null);
            }
        }

        public Builder setAppId(String s)
        {
            a = s;
            return this;
        }

        public Builder setDeviceId(String s)
        {
            b = s;
            return this;
        }

        public Builder setErrorListener(MeridianRequest.ErrorListener errorlistener)
        {
            d = errorlistener;
            return this;
        }

        public Builder setListener(MeridianRequest.Listener listener)
        {
            c = listener;
            return this;
        }

        public Builder()
        {
        }
    }


    private static final MeridianLogger a;
    private final MeridianRequest.Listener b;
    private final MeridianRequest.ErrorListener c;

    private CampaignResetRequest(String s, Map map, MeridianRequest.Listener listener, MeridianRequest.ErrorListener errorlistener)
    {
        super(s, map);
        b = listener;
        c = errorlistener;
    }

    CampaignResetRequest(String s, Map map, MeridianRequest.Listener listener, MeridianRequest.ErrorListener errorlistener, _cls1 _pcls1)
    {
        this(s, map, listener, errorlistener);
    }

    protected String getRequestTag()
    {
        return "CampaignTriggerRequest";
    }

    protected void onJSONError(Throwable throwable)
    {
        if (((VolleyError)throwable).networkResponse != null)
        {
            a.d("Error resetting Campaigns: %s", new Object[] {
                new String(((VolleyError)throwable).networkResponse.data)
            });
        } else
        {
            a.d("Error resetting Campaigns");
        }
        if (c != null)
        {
            c.onError(throwable);
        }
    }

    protected void onJSONResponse(JSONObject jsonobject)
    {
        if (jsonobject != null)
        {
            a.d("Response for Campaign Reset: %s", new Object[] {
                jsonobject
            });
        } else
        {
            a.d("Campaign Reset Succeeded");
        }
        if (b != null)
        {
            b.onResponse(null);
        }
    }

    protected boolean overrideCacheHeaders()
    {
        return false;
    }

    static 
    {
        a = MeridianLogger.forTag("CampaignResetRequest").andFeatures(new com.arubanetworks.meridian.log.MeridianLogger.Feature[] {
            com.arubanetworks.meridian.log.MeridianLogger.Feature.REQUESTS, com.arubanetworks.meridian.log.MeridianLogger.Feature.CAMPAIGNS
        });
    }
}
