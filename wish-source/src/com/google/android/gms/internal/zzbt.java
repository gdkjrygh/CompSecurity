// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
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
//            zzbs, zzfl, zzfk, zzgd

public class zzbt
    implements zzbs
{
    static class zza
    {

        private final String mValue;
        private final String zzra;

        public String getKey()
        {
            return zzra;
        }

        public String getValue()
        {
            return mValue;
        }

        public zza(String s, String s1)
        {
            zzra = s;
            mValue = s1;
        }
    }

    static class zzb
    {

        private final String zztw;
        private final URL zztx;
        private final ArrayList zzty;
        private final String zztz;

        public String zzcR()
        {
            return zztw;
        }

        public URL zzcS()
        {
            return zztx;
        }

        public ArrayList zzcT()
        {
            return zzty;
        }

        public String zzcU()
        {
            return zztz;
        }

        public zzb(String s, URL url, ArrayList arraylist, String s1)
        {
            zztw = s;
            zztx = url;
            if (arraylist == null)
            {
                zzty = new ArrayList();
            } else
            {
                zzty = arraylist;
            }
            zztz = s1;
        }
    }

    class zzc
    {

        private final zzd zztA;
        private final boolean zztB;
        private final String zztC;
        final zzbt zztt;

        public String getReason()
        {
            return zztC;
        }

        public boolean isSuccess()
        {
            return zztB;
        }

        public zzd zzcV()
        {
            return zztA;
        }

        public zzc(boolean flag, zzd zzd1, String s)
        {
            zztt = zzbt.this;
            super();
            zztB = flag;
            zztA = zzd1;
            zztC = s;
        }
    }

    static class zzd
    {

        private final String zzsI;
        private final int zztD;
        private final List zztE;
        private final String zztw;

        public String getBody()
        {
            return zzsI;
        }

        public int getResponseCode()
        {
            return zztD;
        }

        public String zzcR()
        {
            return zztw;
        }

        public Iterable zzcW()
        {
            return zztE;
        }

        public zzd(String s, int i, List list, String s1)
        {
            zztw = s;
            zztD = i;
            if (list == null)
            {
                zztE = new ArrayList();
            } else
            {
                zztE = list;
            }
            zzsI = s1;
        }
    }


    private final Context mContext;
    private final VersionInfoParcel zzoi;

    public zzbt(Context context, VersionInfoParcel versioninfoparcel)
    {
        mContext = context;
        zzoi = versioninfoparcel;
    }

    public JSONObject zzF(String s)
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
            com.google.android.gms.ads.internal.util.client.zzb.zzak("The request is not a valid JSON.");
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
        jsonobject.put("response", zza(((zzc) (obj)).zzcV()));
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
            httpurlconnection = (HttpURLConnection)zzb1.zzcS().openConnection();
            zzh.zzaQ().zza(mContext, zzoi.zzCI, false, httpurlconnection);
            zza zza1;
            for (Iterator iterator = zzb1.zzcT().iterator(); iterator.hasNext(); httpurlconnection.addRequestProperty(zza1.getKey(), zza1.getValue()))
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
        if (!TextUtils.isEmpty(zzb1.zzcU()))
        {
            httpurlconnection.setDoOutput(true);
            byte abyte0[] = zzb1.zzcU().getBytes();
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
        zzb1 = new zzc(true, new zzd(zzb1.zzcR(), httpurlconnection.getResponseCode(), arraylist, zzh.zzaQ().zza(new InputStreamReader(httpurlconnection.getInputStream()))), null);
        return zzb1;
    }

    protected JSONObject zza(zzd zzd1)
    {
        JSONObject jsonobject;
        JSONArray jsonarray;
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("http_request_id", zzd1.zzcR());
            if (zzd1.getBody() != null)
            {
                jsonobject.put("body", zzd1.getBody());
            }
            jsonarray = new JSONArray();
            zza zza1;
            for (Iterator iterator = zzd1.zzcW().iterator(); iterator.hasNext(); jsonarray.put((new JSONObject()).put("key", zza1.getKey()).put("value", zza1.getValue())))
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

    public void zza(zzgd zzgd, Map map)
    {
        zzfk.zza(new Runnable(map, zzgd) {

            final zzgd zzte;
            final Map zztf;
            final zzbt zztt;

            public void run()
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaj("Received Http request.");
                Object obj = (String)zztf.get("http_request");
                obj = zztt.zzF(((String) (obj)));
                if (obj == null)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzak("Response should not be null.");
                    return;
                } else
                {
                    zzfl.zzCr.post(new Runnable(this, ((JSONObject) (obj))) {

                        final JSONObject zztu;
                        final _cls1 zztv;

                        public void run()
                        {
                            zztv.zzte.zzb("fetchHttpRequestCompleted", zztu);
                            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Dispatched http response.");
                        }

            
            {
                zztv = _pcls1;
                zztu = jsonobject;
                super();
            }
                    });
                    return;
                }
            }

            
            {
                zztt = zzbt.this;
                zztf = map;
                zzte = zzgd;
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
