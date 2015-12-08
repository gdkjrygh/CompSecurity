// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzdo, zzds, zzdg, zzip, 
//            zzan, zzaj, zzby, zzbu, 
//            zzao, zzhu, zzia

public final class zzdf
{

    public static final zzdg zzwI = new zzdg() {

        public void zza(zzip zzip, Map map)
        {
        }

    };
    public static final zzdg zzwJ = new zzdg() {

        public void zza(zzip zzip1, Map map)
        {
            map = (String)map.get("urls");
            if (TextUtils.isEmpty(map))
            {
                zzb.zzaE("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String as[] = map.split(",");
            HashMap hashmap = new HashMap();
            PackageManager packagemanager = zzip1.getContext().getPackageManager();
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                String s = as[i];
                map = s.split(";", 2);
                String s1 = map[0].trim();
                boolean flag;
                if (map.length > 1)
                {
                    map = map[1].trim();
                } else
                {
                    map = "android.intent.action.VIEW";
                }
                if (packagemanager.resolveActivity(new Intent(map, Uri.parse(s1)), 0x10000) != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                hashmap.put(s, Boolean.valueOf(flag));
                i++;
            }
            zzip1.zzc("openableURLs", hashmap);
        }

    };
    public static final zzdg zzwK = new zzdg() {

        public void zza(zzip zzip1, Map map)
        {
            PackageManager packagemanager = zzip1.getContext().getPackageManager();
            map = (String)map.get("data");
            JSONObject jsonobject;
            int i;
            try
            {
                map = new JSONObject(map);
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                zzip1.zzb("openableIntents", new JSONObject());
                return;
            }
            try
            {
                map = map.getJSONArray("intents");
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                zzip1.zzb("openableIntents", new JSONObject());
                return;
            }
            jsonobject = new JSONObject();
            i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= map.length())
                    {
                        break label0;
                    }
                    String s;
                    String s1;
                    String s2;
                    String s3;
                    String s4;
                    String s5;
                    Object obj;
                    boolean flag;
                    try
                    {
                        obj = map.getJSONObject(i);
                    }
                    catch (JSONException jsonexception)
                    {
                        zzb.zzb("Error parsing the intent data.", jsonexception);
                        break label1;
                    }
                    s = ((JSONObject) (obj)).optString("id");
                    s1 = ((JSONObject) (obj)).optString("u");
                    s2 = ((JSONObject) (obj)).optString("i");
                    s3 = ((JSONObject) (obj)).optString("m");
                    s4 = ((JSONObject) (obj)).optString("p");
                    s5 = ((JSONObject) (obj)).optString("c");
                    ((JSONObject) (obj)).optString("f");
                    ((JSONObject) (obj)).optString("e");
                    obj = new Intent();
                    if (!TextUtils.isEmpty(s1))
                    {
                        ((Intent) (obj)).setData(Uri.parse(s1));
                    }
                    if (!TextUtils.isEmpty(s2))
                    {
                        ((Intent) (obj)).setAction(s2);
                    }
                    if (!TextUtils.isEmpty(s3))
                    {
                        ((Intent) (obj)).setType(s3);
                    }
                    if (!TextUtils.isEmpty(s4))
                    {
                        ((Intent) (obj)).setPackage(s4);
                    }
                    if (!TextUtils.isEmpty(s5))
                    {
                        String as[] = s5.split("/", 2);
                        if (as.length == 2)
                        {
                            ((Intent) (obj)).setComponent(new ComponentName(as[0], as[1]));
                        }
                    }
                    if (packagemanager.resolveActivity(((Intent) (obj)), 0x10000) != null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    try
                    {
                        jsonobject.put(s, flag);
                    }
                    catch (JSONException jsonexception1)
                    {
                        zzb.zzb("Error constructing openable urls response.", jsonexception1);
                    }
                }
                i++;
            } while (true);
            zzip1.zzb("openableIntents", jsonobject);
        }

    };
    public static final zzdg zzwL = new zzdg() {

        public void zza(zzip zzip1, Map map)
        {
            Uri uri;
            String s;
            map = (String)map.get("u");
            if (map == null)
            {
                zzb.zzaE("URL missing from click GMSG.");
                return;
            }
            s = zzp.zzbx().zzd(zzip1.getContext(), map, zzip1.zzha());
            uri = Uri.parse(s);
            zzan zzan1 = zzip1.zzgU();
            map = uri;
            if (zzan1 != null)
            {
                map = uri;
                try
                {
                    if (zzan1.zzb(uri))
                    {
                        map = zzan1.zza(uri, zzip1.getContext());
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    zzb.zzaE((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
                    map = uri;
                }
            }
            map = map.toString();
            (new zzia(zzip1.getContext(), zzip1.zzgV().zzIz, map)).zzgn();
            return;
        }

    };
    public static final zzdg zzwM = new zzdg() {

        public void zza(zzip zzip1, Map map)
        {
            map = zzip1.zzgQ();
            if (map != null)
            {
                map.close();
                return;
            }
            zzip1 = zzip1.zzgR();
            if (zzip1 != null)
            {
                zzip1.close();
                return;
            } else
            {
                zzb.zzaE("A GMSG tried to close something that wasn't an overlay.");
                return;
            }
        }

    };
    public static final zzdg zzwN = new zzdg() {

        public void zza(zzip zzip1, Map map)
        {
            zzip1.zzD("1".equals(map.get("custom_close")));
        }

    };
    public static final zzdg zzwO = new zzdg() {

        public void zza(zzip zzip1, Map map)
        {
            map = (String)map.get("u");
            if (map == null)
            {
                zzb.zzaE("URL missing from httpTrack GMSG.");
                return;
            } else
            {
                (new zzia(zzip1.getContext(), zzip1.zzgV().zzIz, map)).zzgn();
                return;
            }
        }

    };
    public static final zzdg zzwP = new zzdg() {

        public void zza(zzip zzip, Map map)
        {
            zzb.zzaD((new StringBuilder()).append("Received log message: ").append((String)map.get("string")).toString());
        }

    };
    public static final zzdg zzwQ = new zzdg() {

        public void zza(zzip zzip1, Map map)
        {
            String s = (String)map.get("tx");
            String s1 = (String)map.get("ty");
            map = (String)map.get("td");
            int i;
            int j;
            int k;
            try
            {
                i = Integer.parseInt(s);
                j = Integer.parseInt(s1);
                k = Integer.parseInt(map);
                zzip1 = zzip1.zzgU();
            }
            // Misplaced declaration of an exception variable
            catch (zzip zzip1)
            {
                zzb.zzaE("Could not parse touch parameters from gmsg.");
                return;
            }
            if (zzip1 == null)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            zzip1.zzab().zza(i, j, k);
        }

    };
    public static final zzdg zzwR = new zzdg() {

        public void zza(zzip zzip1, Map map)
        {
            if (!((Boolean)zzby.zzvd.get()).booleanValue())
            {
                return;
            }
            boolean flag;
            if (!Boolean.parseBoolean((String)map.get("disabled")))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzip1.zzE(flag);
        }

    };
    public static final zzdg zzwS = new zzdo();
    public static final zzdg zzwT = new zzds();

}
