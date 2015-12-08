// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzhl, zzhk, zzid

public class zzdh
    implements zzdg
{
    static class zza
    {

        private final String mValue;
        private final String zztw;

        public String getKey()
        {
            return zztw;
        }

        public String getValue()
        {
            return mValue;
        }

        public zza(String s, String s1)
        {
            zztw = s;
            mValue = s1;
        }
    }

    static class zzb
    {

        private final String zzwl;
        private final URL zzwm;
        private final ArrayList zzwn;
        private final String zzwo;

        public String zzdJ()
        {
            return zzwl;
        }

        public URL zzdK()
        {
            return zzwm;
        }

        public ArrayList zzdL()
        {
            return zzwn;
        }

        public String zzdM()
        {
            return zzwo;
        }

        public zzb(String s, URL url, ArrayList arraylist, String s1)
        {
            zzwl = s;
            zzwm = url;
            if (arraylist == null)
            {
                zzwn = new ArrayList();
            } else
            {
                zzwn = arraylist;
            }
            zzwo = s1;
        }
    }

    class zzc
    {

        final zzdh zzwi;
        private final zzd zzwp;
        private final boolean zzwq;
        private final String zzwr;

        public String getReason()
        {
            return zzwr;
        }

        public boolean isSuccess()
        {
            return zzwq;
        }

        public zzd zzdN()
        {
            return zzwp;
        }

        public zzc(boolean flag, zzd zzd1, String s)
        {
            zzwi = zzdh.this;
            super();
            zzwq = flag;
            zzwp = zzd1;
            zzwr = s;
        }
    }

    static class zzd
    {

        private final String zzvj;
        private final String zzwl;
        private final int zzws;
        private final List zzwt;

        public String getBody()
        {
            return zzvj;
        }

        public int getResponseCode()
        {
            return zzws;
        }

        public String zzdJ()
        {
            return zzwl;
        }

        public Iterable zzdO()
        {
            return zzwt;
        }

        public zzd(String s, int i, List list, String s1)
        {
            zzwl = s;
            zzws = i;
            if (list == null)
            {
                zzwt = new ArrayList();
            } else
            {
                zzwt = list;
            }
            zzvj = s1;
        }
    }


    private final Context mContext;
    private final VersionInfoParcel zzoM;

    public zzdh(Context context, VersionInfoParcel versioninfoparcel)
    {
        mContext = context;
        zzoM = versioninfoparcel;
    }

    public JSONObject zzT(String s)
    {
        String s1;
        JSONObject jsonobject;
        Object obj;
        try
        {
            obj = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaz("The request is not a valid JSON.");
            try
            {
                s = (new JSONObject()).put("success", false);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return new JSONObject();
            }
            return s;
        }
        jsonobject = new JSONObject();
        s = "";
        try
        {
            s1 = ((JSONObject) (obj)).optString("http_request_id");
        }
        catch (Exception exception)
        {
            try
            {
                jsonobject.put("response", (new JSONObject()).put("http_request_id", s));
                jsonobject.put("success", false);
                jsonobject.put("reason", exception.toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return jsonobject;
            }
            return jsonobject;
        }
        s = s1;
        obj = zza(zzb(((JSONObject) (obj))));
        s = s1;
        if (!((zzc) (obj)).isSuccess())
        {
            break MISSING_BLOCK_LABEL_114;
        }
        s = s1;
        jsonobject.put("response", zza(((zzc) (obj)).zzdN()));
        s = s1;
        jsonobject.put("success", true);
        return jsonobject;
        s = s1;
        jsonobject.put("response", (new JSONObject()).put("http_request_id", s1));
        s = s1;
        jsonobject.put("success", false);
        s = s1;
        jsonobject.put("reason", ((zzc) (obj)).getReason());
        return jsonobject;
    }

    protected zzc zza(zzb zzb1)
    {
        HttpURLConnection httpurlconnection;
        try
        {
            httpurlconnection = (HttpURLConnection)zzb1.zzdK().openConnection();
            zzo.zzbv().zza(mContext, zzoM.zzGG, false, httpurlconnection);
            zza zza1;
            for (Iterator iterator = zzb1.zzdL().iterator(); iterator.hasNext(); httpurlconnection.addRequestProperty(zza1.getKey(), zza1.getValue()))
            {
                zza1 = (zza)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (zzb zzb1)
        {
            return new zzc(false, null, zzb1.toString());
        }
        ArrayList arraylist;
        if (!TextUtils.isEmpty(zzb1.zzdM()))
        {
            httpurlconnection.setDoOutput(true);
            byte abyte0[] = zzb1.zzdM().getBytes();
            httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
            BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(httpurlconnection.getOutputStream());
            bufferedoutputstream.write(abyte0);
            bufferedoutputstream.close();
        }
        arraylist = new ArrayList();
        if (httpurlconnection.getHeaderFields() != null)
        {
            for (Iterator iterator1 = httpurlconnection.getHeaderFields().entrySet().iterator(); iterator1.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                Iterator iterator2 = ((List)entry.getValue()).iterator();
                while (iterator2.hasNext()) 
                {
                    String s = (String)iterator2.next();
                    arraylist.add(new zza((String)entry.getKey(), s));
                }
            }

        }
        zzb1 = new zzc(true, new zzd(zzb1.zzdJ(), httpurlconnection.getResponseCode(), arraylist, zzo.zzbv().zza(new InputStreamReader(httpurlconnection.getInputStream()))), null);
        return zzb1;
    }

    protected JSONObject zza(zzd zzd1)
    {
        JSONObject jsonobject;
        JSONArray jsonarray;
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("http_request_id", zzd1.zzdJ());
            if (zzd1.getBody() != null)
            {
                jsonobject.put("body", zzd1.getBody());
            }
            jsonarray = new JSONArray();
            zza zza1;
            for (Iterator iterator = zzd1.zzdO().iterator(); iterator.hasNext(); jsonarray.put((new JSONObject()).put("key", zza1.getKey()).put("value", zza1.getValue())))
            {
                zza1 = (zza)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (zzd zzd1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error constructing JSON for http response.", zzd1);
            return jsonobject;
        }
        jsonobject.put("headers", jsonarray);
        jsonobject.put("response_code", zzd1.getResponseCode());
        return jsonobject;
    }

    public void zza(zzid zzid, Map map)
    {
        zzhk.zza(new Runnable(map, zzid) {

            final Map zzwg;
            final zzid zzwh;
            final zzdh zzwi;

            public void run()
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzay("Received Http request.");
                Object obj = (String)zzwg.get("http_request");
                obj = zzwi.zzT(((String) (obj)));
                if (obj == null)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaz("Response should not be null.");
                    return;
                } else
                {
                    zzhl.zzGk.post(new Runnable(this, ((JSONObject) (obj))) {

                        final JSONObject zzwj;
                        final _cls1 zzwk;

                        public void run()
                        {
                            zzwk.zzwh.zzb("fetchHttpRequestCompleted", zzwj);
                            com.google.android.gms.ads.internal.util.client.zzb.zzay("Dispatched http response.");
                        }

            
            {
                zzwk = _pcls1;
                zzwj = jsonobject;
                super();
            }
                    });
                    return;
                }
            }

            
            {
                zzwi = zzdh.this;
                zzwg = map;
                zzwh = zzid;
                super();
            }
        });
    }

    protected zzb zzb(JSONObject jsonobject)
    {
        String s = jsonobject.optString("http_request_id");
        Object obj = jsonobject.optString("url");
        String s1 = jsonobject.optString("post_body", null);
        JSONArray jsonarray;
        ArrayList arraylist;
        int i;
        try
        {
            obj = new URL(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error constructing http request.", ((Throwable) (obj)));
            obj = null;
        }
        arraylist = new ArrayList();
        jsonarray = jsonobject.optJSONArray("headers");
        jsonobject = jsonarray;
        if (jsonarray == null)
        {
            jsonobject = new JSONArray();
        }
        i = 0;
        while (i < jsonobject.length()) 
        {
            JSONObject jsonobject1 = jsonobject.optJSONObject(i);
            if (jsonobject1 != null)
            {
                arraylist.add(new zza(jsonobject1.optString("key"), jsonobject1.optString("value")));
            }
            i++;
        }
        return new zzb(s, ((URL) (obj)), arraylist, s1);
    }
}
