// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
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
//            zzdg, zzhu, zzht, zzip

public class zzdh
    implements zzdg
{
    static class zza
    {

        private final String mValue;
        private final String zztP;

        public String getKey()
        {
            return zztP;
        }

        public String getValue()
        {
            return mValue;
        }

        public zza(String s, String s1)
        {
            zztP = s;
            mValue = s1;
        }
    }

    static class zzb
    {

        private final String zzwY;
        private final URL zzwZ;
        private final ArrayList zzxa;
        private final String zzxb;

        public String zzdA()
        {
            return zzwY;
        }

        public URL zzdB()
        {
            return zzwZ;
        }

        public ArrayList zzdC()
        {
            return zzxa;
        }

        public String zzdD()
        {
            return zzxb;
        }

        public zzb(String s, URL url, ArrayList arraylist, String s1)
        {
            zzwY = s;
            zzwZ = url;
            if (arraylist == null)
            {
                zzxa = new ArrayList();
            } else
            {
                zzxa = arraylist;
            }
            zzxb = s1;
        }
    }

    class zzc
    {

        final zzdh zzwV;
        private final zzd zzxc;
        private final boolean zzxd;
        private final String zzxe;

        public String getReason()
        {
            return zzxe;
        }

        public boolean isSuccess()
        {
            return zzxd;
        }

        public zzd zzdE()
        {
            return zzxc;
        }

        public zzc(boolean flag, zzd zzd1, String s)
        {
            zzwV = zzdh.this;
            super();
            zzxd = flag;
            zzxc = zzd1;
            zzxe = s;
        }
    }

    static class zzd
    {

        private final String zzvM;
        private final String zzwY;
        private final int zzxf;
        private final List zzxg;

        public String getBody()
        {
            return zzvM;
        }

        public int getResponseCode()
        {
            return zzxf;
        }

        public String zzdA()
        {
            return zzwY;
        }

        public Iterable zzdF()
        {
            return zzxg;
        }

        public zzd(String s, int i, List list, String s1)
        {
            zzwY = s;
            zzxf = i;
            if (list == null)
            {
                zzxg = new ArrayList();
            } else
            {
                zzxg = list;
            }
            zzvM = s1;
        }
    }


    private final Context mContext;
    private final VersionInfoParcel zzpa;

    public zzdh(Context context, VersionInfoParcel versioninfoparcel)
    {
        mContext = context;
        zzpa = versioninfoparcel;
    }

    public JSONObject zzV(String s)
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
            com.google.android.gms.ads.internal.util.client.zzb.e("The request is not a valid JSON.");
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
        jsonobject.put("response", zza(((zzc) (obj)).zzdE()));
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
            httpurlconnection = (HttpURLConnection)zzb1.zzdB().openConnection();
            zzp.zzbx().zza(mContext, zzpa.zzIz, false, httpurlconnection);
            zza zza1;
            for (Iterator iterator = zzb1.zzdC().iterator(); iterator.hasNext(); httpurlconnection.addRequestProperty(zza1.getKey(), zza1.getValue()))
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
        if (!TextUtils.isEmpty(zzb1.zzdD()))
        {
            httpurlconnection.setDoOutput(true);
            byte abyte0[] = zzb1.zzdD().getBytes();
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
        zzb1 = new zzc(true, new zzd(zzb1.zzdA(), httpurlconnection.getResponseCode(), arraylist, zzp.zzbx().zza(new InputStreamReader(httpurlconnection.getInputStream()))), null);
        return zzb1;
    }

    protected JSONObject zza(zzd zzd1)
    {
        JSONObject jsonobject;
        JSONArray jsonarray;
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("http_request_id", zzd1.zzdA());
            if (zzd1.getBody() != null)
            {
                jsonobject.put("body", zzd1.getBody());
            }
            jsonarray = new JSONArray();
            zza zza1;
            for (Iterator iterator = zzd1.zzdF().iterator(); iterator.hasNext(); jsonarray.put((new JSONObject()).put("key", zza1.getKey()).put("value", zza1.getValue())))
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

    public void zza(zzip zzip, Map map)
    {
        zzht.zza(new Runnable(map, zzip) {

            final zzip zzwU;
            final zzdh zzwV;
            final Map zzwl;

            public void run()
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Received Http request.");
                Object obj = (String)zzwl.get("http_request");
                obj = zzwV.zzV(((String) (obj)));
                if (obj == null)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.e("Response should not be null.");
                    return;
                } else
                {
                    zzhu.zzHK.post(new Runnable(this, ((JSONObject) (obj))) {

                        final JSONObject zzwW;
                        final _cls1 zzwX;

                        public void run()
                        {
                            zzwX.zzwU.zzb("fetchHttpRequestCompleted", zzwW);
                            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Dispatched http response.");
                        }

            
            {
                zzwX = _pcls1;
                zzwW = jsonobject;
                super();
            }
                    });
                    return;
                }
            }

            
            {
                zzwV = zzdh.this;
                zzwl = map;
                zzwU = zzip;
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
