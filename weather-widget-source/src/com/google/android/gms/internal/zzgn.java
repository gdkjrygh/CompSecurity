// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appindexing.AndroidAppUri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzd;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzhv, zzgm, zzgr, zzbr, 
//            zzby, zzbu, zzhu, zzhp

public final class zzgn
{

    private static final SimpleDateFormat zzEY;

    private static String zzH(int i)
    {
        return String.format(Locale.US, "#%06x", new Object[] {
            Integer.valueOf(0xffffff & i)
        });
    }

    public static AdResponseParcel zza(Context context, AdRequestInfoParcel adrequestinfoparcel, String s)
    {
        String s1;
        String s2;
        Object obj;
        Object obj1;
        JSONObject jsonobject;
        String s3;
        String s4;
        int i;
        int j;
        long l;
        long l1;
        boolean flag;
        try
        {
            jsonobject = new JSONObject(s);
            s1 = jsonobject.optString("ad_base_url", null);
            s2 = jsonobject.optString("ad_url", null);
            s3 = jsonobject.optString("ad_size", null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzaE((new StringBuilder()).append("Could not parse the mediation config: ").append(context.getMessage()).toString());
            return new AdResponseParcel(0);
        }
        if (adrequestinfoparcel == null) goto _L2; else goto _L1
_L1:
        if (adrequestinfoparcel.zzDE == 0) goto _L2; else goto _L3
_L3:
        flag = true;
_L50:
        if (!flag) goto _L5; else goto _L4
_L4:
        s = jsonobject.optString("ad_json", null);
_L13:
        l1 = -1L;
        s4 = jsonobject.optString("debug_dialog", null);
        if (!jsonobject.has("interstitial_timeout")) goto _L7; else goto _L6
_L6:
        l = (long)(jsonobject.getDouble("interstitial_timeout") * 1000D);
_L51:
        obj = jsonobject.optString("orientation", null);
        i = -1;
        if (!"portrait".equals(obj)) goto _L9; else goto _L8
_L8:
        i = zzp.zzbz().zzgw();
_L15:
        if (TextUtils.isEmpty(s)) goto _L11; else goto _L10
_L10:
        if (TextUtils.isEmpty(s1))
        {
            zzb.zzaE("Could not parse the mediation config: Missing required ad_base_url field");
            return new AdResponseParcel(0);
        }
          goto _L12
_L5:
        s = jsonobject.optString("ad_html", null);
          goto _L13
_L9:
        if (!"landscape".equals(obj)) goto _L15; else goto _L14
_L14:
        i = zzp.zzbz().zzgv();
          goto _L15
_L11:
        if (TextUtils.isEmpty(s2)) goto _L17; else goto _L16
_L16:
        obj = com.google.android.gms.internal.zzgm.zza(adrequestinfoparcel, context, adrequestinfoparcel.zzqb.zzIz, s2, null, null, null, null);
        s1 = ((AdResponseParcel) (obj)).zzAT;
        s2 = ((AdResponseParcel) (obj)).body;
        l1 = ((AdResponseParcel) (obj)).zzEb;
_L49:
        obj1 = jsonobject.optJSONArray("click_urls");
        if (obj != null) goto _L19; else goto _L18
_L18:
        context = null;
_L27:
        if (obj1 == null) goto _L21; else goto _L20
_L20:
        s = context;
        if (context != null) goto _L23; else goto _L22
_L22:
        s = new LinkedList();
          goto _L23
_L26:
        if (j >= ((JSONArray) (obj1)).length()) goto _L25; else goto _L24
_L24:
        s.add(((JSONArray) (obj1)).getString(j));
        j++;
          goto _L26
_L17:
        adrequestinfoparcel = (new StringBuilder()).append("Could not parse the mediation config: Missing required ");
        if (flag)
        {
            context = "ad_json";
        } else
        {
            context = "ad_html";
        }
        zzb.zzaE(adrequestinfoparcel.append(context).append(" or ").append("ad_url").append(" field.").toString());
        context = new AdResponseParcel(0);
        return context;
_L19:
        context = ((AdResponseParcel) (obj)).zzyw;
          goto _L27
_L48:
        Object obj2 = jsonobject.optJSONArray("impression_urls");
        if (obj != null) goto _L29; else goto _L28
_L28:
        context = null;
_L37:
        if (obj2 == null) goto _L31; else goto _L30
_L30:
        s = context;
        if (context != null) goto _L33; else goto _L32
_L32:
        s = new LinkedList();
          goto _L33
_L36:
        if (j >= ((JSONArray) (obj2)).length()) goto _L35; else goto _L34
_L34:
        s.add(((JSONArray) (obj2)).getString(j));
        j++;
          goto _L36
_L29:
        context = ((AdResponseParcel) (obj)).zzyx;
          goto _L37
_L47:
        JSONArray jsonarray = jsonobject.optJSONArray("manual_impression_urls");
        if (obj != null) goto _L39; else goto _L38
_L38:
        context = null;
_L45:
        if (jsonarray == null) goto _L41; else goto _L40
_L40:
        s = context;
        if (context != null) goto _L43; else goto _L42
_L42:
        s = new LinkedList();
          goto _L43
_L44:
        if (j >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_865;
        }
        s.add(jsonarray.getString(j));
        j++;
          goto _L44
_L39:
        context = ((AdResponseParcel) (obj)).zzDZ;
          goto _L45
_L41:
        j = i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_790;
        }
        if (((AdResponseParcel) (obj)).orientation != -1)
        {
            i = ((AdResponseParcel) (obj)).orientation;
        }
        j = i;
        if (((AdResponseParcel) (obj)).zzDW <= 0L)
        {
            break MISSING_BLOCK_LABEL_790;
        }
        l = ((AdResponseParcel) (obj)).zzDW;
_L46:
        obj = jsonobject.optString("active_view");
        s = null;
        boolean flag1 = jsonobject.optBoolean("ad_is_javascript", false);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_666;
        }
        s = jsonobject.optString("ad_passback_url", null);
        boolean flag2 = jsonobject.optBoolean("mediation", false);
        boolean flag3 = jsonobject.optBoolean("custom_render_allowed", false);
        boolean flag4 = jsonobject.optBoolean("content_url_opted_out", true);
        boolean flag5 = jsonobject.optBoolean("prefetch", false);
        j = jsonobject.optInt("oauth2_token_status", 0);
        long l2 = jsonobject.optLong("refresh_interval_milliseconds", -1L);
        context = new AdResponseParcel(adrequestinfoparcel, s1, s2, ((List) (obj1)), ((List) (obj2)), l, flag2, jsonobject.optLong("mediation_config_cache_time_milliseconds", -1L), context, l2, i, s3, l1, s4, flag1, s, ((String) (obj)), flag3, flag, adrequestinfoparcel.zzDG, flag4, flag5, j);
        return context;
        i = j;
          goto _L46
_L31:
        obj2 = context;
          goto _L47
_L21:
        obj1 = context;
          goto _L48
_L12:
        obj = null;
        s2 = s;
          goto _L49
_L2:
        flag = false;
          goto _L50
_L7:
        l = -1L;
          goto _L51
_L23:
        j = 0;
          goto _L26
_L25:
        obj1 = s;
          goto _L48
_L33:
        j = 0;
          goto _L36
_L35:
        obj2 = s;
          goto _L47
_L43:
        j = 0;
          goto _L44
        context = s;
          goto _L41
    }

    public static JSONObject zza(Context context, AdRequestInfoParcel adrequestinfoparcel, zzgr zzgr1, zzgt.zza zza1, Location location, zzbr zzbr1, String s, String s1, 
            List list)
    {
        AdSizeParcel aadsizeparcel[];
        int k;
        location = new HashMap();
        if (list.size() > 0)
        {
            location.put("eid", TextUtils.join(",", list));
        }
        if (adrequestinfoparcel.zzDx != null)
        {
            location.put("ad_pos", adrequestinfoparcel.zzDx);
        }
        zza(((HashMap) (location)), adrequestinfoparcel.zzDy);
        location.put("format", adrequestinfoparcel.zzqf.zzsG);
        if (adrequestinfoparcel.zzqf.width == -1)
        {
            location.put("smart_w", "full");
        }
        if (adrequestinfoparcel.zzqf.height == -2)
        {
            location.put("smart_h", "auto");
        }
        if (adrequestinfoparcel.zzqf.zzsI == null)
        {
            break MISSING_BLOCK_LABEL_307;
        }
        list = new StringBuilder();
        aadsizeparcel = adrequestinfoparcel.zzqf.zzsI;
        k = aadsizeparcel.length;
        int i = 0;
_L3:
        AdSizeParcel adsizeparcel;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        adsizeparcel = aadsizeparcel[i];
        if (list.length() != 0)
        {
            list.append("|");
        }
        if (adsizeparcel.width != -1) goto _L2; else goto _L1
_L1:
        int j = (int)((float)adsizeparcel.widthPixels / zzgr1.zzDK);
_L4:
        list.append(j);
        list.append("x");
        if (adsizeparcel.height != -2)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        j = (int)((float)adsizeparcel.heightPixels / zzgr1.zzDK);
_L5:
        list.append(j);
        i++;
          goto _L3
_L2:
        boolean flag;
        try
        {
            j = adsizeparcel.width;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzaE((new StringBuilder()).append("Problem serializing ad request to JSON: ").append(context.getMessage()).toString());
            return null;
        }
          goto _L4
        j = adsizeparcel.height;
          goto _L5
        location.put("sz", list);
        if (adrequestinfoparcel.zzDE != 0)
        {
            location.put("native_version", Integer.valueOf(adrequestinfoparcel.zzDE));
            location.put("native_templates", adrequestinfoparcel.zzqv);
            location.put("native_image_orientation", zzc(adrequestinfoparcel.zzqt));
            if (!adrequestinfoparcel.zzDS.isEmpty())
            {
                location.put("native_custom_templates", adrequestinfoparcel.zzDS);
            }
        }
        location.put("slotname", adrequestinfoparcel.zzpZ);
        location.put("pn", adrequestinfoparcel.applicationInfo.packageName);
        if (adrequestinfoparcel.zzDz != null)
        {
            location.put("vc", Integer.valueOf(adrequestinfoparcel.zzDz.versionCode));
        }
        location.put("ms", s1);
        location.put("seq_num", adrequestinfoparcel.zzDB);
        location.put("session_id", adrequestinfoparcel.zzDC);
        location.put("js", adrequestinfoparcel.zzqb.zzIz);
        zza(((HashMap) (location)), zzgr1, zza1);
        location.put("fdz", Integer.valueOf(zzbr1.zzdc()));
        location.put("platform", Build.MANUFACTURER);
        location.put("submodel", Build.MODEL);
        if (adrequestinfoparcel.zzDy.versionCode >= 2 && adrequestinfoparcel.zzDy.zzsy != null)
        {
            zza(((HashMap) (location)), adrequestinfoparcel.zzDy.zzsy);
        }
        if (adrequestinfoparcel.versionCode >= 2)
        {
            location.put("quality_signals", adrequestinfoparcel.zzDD);
        }
        if (adrequestinfoparcel.versionCode >= 4 && adrequestinfoparcel.zzDG)
        {
            location.put("forceHttps", Boolean.valueOf(adrequestinfoparcel.zzDG));
        }
        if (adrequestinfoparcel.versionCode >= 4 && adrequestinfoparcel.zzDF != null)
        {
            zza1 = adrequestinfoparcel.zzDF;
            zza(context, adrequestinfoparcel, ((Bundle) (zza1)));
            location.put("content_info", zza1);
        }
        if (adrequestinfoparcel.versionCode < 5) goto _L7; else goto _L6
_L6:
        location.put("u_sd", Float.valueOf(adrequestinfoparcel.zzDK));
        location.put("sh", Integer.valueOf(adrequestinfoparcel.zzDJ));
        location.put("sw", Integer.valueOf(adrequestinfoparcel.zzDI));
_L10:
        if (adrequestinfoparcel.versionCode < 6) goto _L9; else goto _L8
_L8:
        flag = TextUtils.isEmpty(adrequestinfoparcel.zzDL);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_760;
        }
        location.put("view_hierarchy", new JSONObject(adrequestinfoparcel.zzDL));
_L11:
        if (((Boolean)zzby.zzuQ.get()).booleanValue() && adrequestinfoparcel.zzDM)
        {
            location.put("ga_hid", Integer.valueOf(adrequestinfoparcel.zzDN));
            location.put("ga_cid", adrequestinfoparcel.zzDO);
        }
        location.put("correlation_id", Long.valueOf(adrequestinfoparcel.zzDP));
_L9:
        if (adrequestinfoparcel.versionCode >= 7)
        {
            location.put("request_id", adrequestinfoparcel.zzDQ);
        }
        if (adrequestinfoparcel.versionCode >= 11 && adrequestinfoparcel.zzDU != null)
        {
            location.put("capability", adrequestinfoparcel.zzDU.toBundle());
        }
        zza(((HashMap) (location)), s);
        if (zzb.zzM(2))
        {
            context = zzp.zzbx().zzx(location).toString(2);
            zzb.v((new StringBuilder()).append("Ad Request JSON: ").append(context).toString());
        }
        return zzp.zzbx().zzx(location);
_L7:
        location.put("u_sd", Float.valueOf(zzgr1.zzDK));
        location.put("sh", Integer.valueOf(zzgr1.zzDJ));
        location.put("sw", Integer.valueOf(zzgr1.zzDI));
          goto _L10
        context;
        zzb.zzd("Problem serializing view hierarchy to JSON", context);
          goto _L11
    }

    static void zza(Context context, AdRequestInfoParcel adrequestinfoparcel, Bundle bundle)
    {
        if (!((Boolean)zzby.zzuK.get()).booleanValue())
        {
            zzb.zzaD("App index is not enabled");
            return;
        }
        if (!zzd.zzacF)
        {
            zzb.zzaD("Not on package side, return");
            return;
        }
        if (zzk.zzcE().zzgI())
        {
            zzb.zzaD("Cannot invoked on UI thread");
            return;
        }
        if (adrequestinfoparcel == null || adrequestinfoparcel.zzDz == null)
        {
            zzb.zzaE("Invalid ad request info");
            return;
        }
        adrequestinfoparcel = adrequestinfoparcel.zzDz.packageName;
        if (TextUtils.isEmpty(adrequestinfoparcel))
        {
            zzb.zzaE("Fail to get package name");
            return;
        }
        try
        {
            zza(zzd(context, adrequestinfoparcel), ((String) (adrequestinfoparcel)), bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzaD("Fail to add app index to content info");
        }
    }

    static void zza(UsageInfo usageinfo, String s, Bundle bundle)
    {
        if (usageinfo != null && usageinfo.zzle() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        usageinfo = usageinfo.zzle();
        String s1 = usageinfo.zzkX();
        if (!TextUtils.isEmpty(s1))
        {
            bundle.putString("web_url", s1);
        }
        try
        {
            usageinfo = usageinfo.zzbu("intent_data");
        }
        // Misplaced declaration of an exception variable
        catch (UsageInfo usageinfo)
        {
            zzb.zzaE("Failed to parse the third-party Android App URI");
            return;
        }
        if (usageinfo == null) goto _L1; else goto _L3
_L3:
        if (TextUtils.isEmpty(((DocumentSection) (usageinfo)).zzPe)) goto _L1; else goto _L4
_L4:
        bundle.putString("app_uri", AndroidAppUri.newAndroidAppUri(s, Uri.parse(((DocumentSection) (usageinfo)).zzPe)).toString());
        return;
    }

    private static void zza(HashMap hashmap, Location location)
    {
        HashMap hashmap1 = new HashMap();
        float f = location.getAccuracy();
        long l = location.getTime();
        long l1 = (long)(location.getLatitude() * 10000000D);
        long l2 = (long)(location.getLongitude() * 10000000D);
        hashmap1.put("radius", Float.valueOf(f * 1000F));
        hashmap1.put("lat", Long.valueOf(l1));
        hashmap1.put("long", Long.valueOf(l2));
        hashmap1.put("time", Long.valueOf(l * 1000L));
        hashmap.put("uule", hashmap1);
    }

    private static void zza(HashMap hashmap, AdRequestParcel adrequestparcel)
    {
        String s = zzhp.zzgm();
        if (s != null)
        {
            hashmap.put("abf", s);
        }
        if (adrequestparcel.zzsq != -1L)
        {
            hashmap.put("cust_age", zzEY.format(new Date(adrequestparcel.zzsq)));
        }
        if (adrequestparcel.extras != null)
        {
            hashmap.put("extras", adrequestparcel.extras);
        }
        if (adrequestparcel.zzsr != -1)
        {
            hashmap.put("cust_gender", Integer.valueOf(adrequestparcel.zzsr));
        }
        if (adrequestparcel.zzss != null)
        {
            hashmap.put("kw", adrequestparcel.zzss);
        }
        if (adrequestparcel.zzsu != -1)
        {
            hashmap.put("tag_for_child_directed_treatment", Integer.valueOf(adrequestparcel.zzsu));
        }
        if (adrequestparcel.zzst)
        {
            hashmap.put("adtest", "on");
        }
        if (adrequestparcel.versionCode >= 2)
        {
            if (adrequestparcel.zzsv)
            {
                hashmap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(adrequestparcel.zzsw))
            {
                hashmap.put("ppid", adrequestparcel.zzsw);
            }
            if (adrequestparcel.zzsx != null)
            {
                zza(hashmap, adrequestparcel.zzsx);
            }
        }
        if (adrequestparcel.versionCode >= 3 && adrequestparcel.zzsz != null)
        {
            hashmap.put("url", adrequestparcel.zzsz);
        }
        if (adrequestparcel.versionCode >= 5)
        {
            if (adrequestparcel.zzsB != null)
            {
                hashmap.put("custom_targeting", adrequestparcel.zzsB);
            }
            if (adrequestparcel.zzsC != null)
            {
                hashmap.put("category_exclusions", adrequestparcel.zzsC);
            }
            if (adrequestparcel.zzsD != null)
            {
                hashmap.put("request_agent", adrequestparcel.zzsD);
            }
        }
        if (adrequestparcel.versionCode >= 6 && adrequestparcel.zzsE != null)
        {
            hashmap.put("request_pkg", adrequestparcel.zzsE);
        }
    }

    private static void zza(HashMap hashmap, SearchAdRequestParcel searchadrequestparcel)
    {
        Object obj;
        obj = null;
        if (Color.alpha(searchadrequestparcel.zztA) != 0)
        {
            hashmap.put("acolor", zzH(searchadrequestparcel.zztA));
        }
        if (Color.alpha(searchadrequestparcel.backgroundColor) != 0)
        {
            hashmap.put("bgcolor", zzH(searchadrequestparcel.backgroundColor));
        }
        if (Color.alpha(searchadrequestparcel.zztB) != 0 && Color.alpha(searchadrequestparcel.zztC) != 0)
        {
            hashmap.put("gradientto", zzH(searchadrequestparcel.zztB));
            hashmap.put("gradientfrom", zzH(searchadrequestparcel.zztC));
        }
        if (Color.alpha(searchadrequestparcel.zztD) != 0)
        {
            hashmap.put("bcolor", zzH(searchadrequestparcel.zztD));
        }
        hashmap.put("bthick", Integer.toString(searchadrequestparcel.zztE));
        searchadrequestparcel.zztF;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 358
    //                   1 365
    //                   2 372
    //                   3 379;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        String s = null;
_L10:
        if (s != null)
        {
            hashmap.put("btype", s);
        }
        searchadrequestparcel.zztG;
        JVM INSTR tableswitch 0 2: default 220
    //                   0 393
    //                   1 400
    //                   2 386;
           goto _L6 _L7 _L8 _L9
_L8:
        break MISSING_BLOCK_LABEL_400;
_L6:
        s = obj;
_L11:
        if (s != null)
        {
            hashmap.put("callbuttoncolor", s);
        }
        if (searchadrequestparcel.zztH != null)
        {
            hashmap.put("channel", searchadrequestparcel.zztH);
        }
        if (Color.alpha(searchadrequestparcel.zztI) != 0)
        {
            hashmap.put("dcolor", zzH(searchadrequestparcel.zztI));
        }
        if (searchadrequestparcel.zztJ != null)
        {
            hashmap.put("font", searchadrequestparcel.zztJ);
        }
        if (Color.alpha(searchadrequestparcel.zztK) != 0)
        {
            hashmap.put("hcolor", zzH(searchadrequestparcel.zztK));
        }
        hashmap.put("headersize", Integer.toString(searchadrequestparcel.zztL));
        if (searchadrequestparcel.zztM != null)
        {
            hashmap.put("q", searchadrequestparcel.zztM);
        }
        return;
_L2:
        s = "none";
          goto _L10
_L3:
        s = "dashed";
          goto _L10
_L4:
        s = "dotted";
          goto _L10
_L5:
        s = "solid";
          goto _L10
_L9:
        s = "dark";
          goto _L11
_L7:
        s = "light";
          goto _L11
        s = "medium";
          goto _L11
    }

    private static void zza(HashMap hashmap, zzgr zzgr1, zzgt.zza zza1)
    {
        hashmap.put("am", Integer.valueOf(zzgr1.zzFB));
        hashmap.put("cog", zzx(zzgr1.zzFC));
        hashmap.put("coh", zzx(zzgr1.zzFD));
        if (!TextUtils.isEmpty(zzgr1.zzFE))
        {
            hashmap.put("carrier", zzgr1.zzFE);
        }
        hashmap.put("gl", zzgr1.zzFF);
        if (zzgr1.zzFG)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        if (zzgr1.zzFH)
        {
            hashmap.put("is_sidewinder", Integer.valueOf(1));
        }
        hashmap.put("ma", zzx(zzgr1.zzFI));
        hashmap.put("sp", zzx(zzgr1.zzFJ));
        hashmap.put("hl", zzgr1.zzFK);
        if (!TextUtils.isEmpty(zzgr1.zzFL))
        {
            hashmap.put("mv", zzgr1.zzFL);
        }
        hashmap.put("muv", Integer.valueOf(zzgr1.zzFM));
        if (zzgr1.zzFN != -2)
        {
            hashmap.put("cnt", Integer.valueOf(zzgr1.zzFN));
        }
        hashmap.put("gnt", Integer.valueOf(zzgr1.zzFO));
        hashmap.put("pt", Integer.valueOf(zzgr1.zzFP));
        hashmap.put("rm", Integer.valueOf(zzgr1.zzFQ));
        hashmap.put("riv", Integer.valueOf(zzgr1.zzFR));
        Bundle bundle = new Bundle();
        bundle.putString("build", zzgr1.zzFW);
        Bundle bundle1 = new Bundle();
        bundle1.putBoolean("is_charging", zzgr1.zzFT);
        bundle1.putDouble("battery_level", zzgr1.zzFS);
        bundle.putBundle("battery", bundle1);
        bundle1 = new Bundle();
        bundle1.putInt("active_network_state", zzgr1.zzFV);
        bundle1.putBoolean("active_network_metered", zzgr1.zzFU);
        if (zza1 != null)
        {
            zzgr1 = new Bundle();
            zzgr1.putInt("predicted_latency_micros", zza1.zzGb);
            zzgr1.putLong("predicted_down_throughput_bps", zza1.zzGc);
            zzgr1.putLong("predicted_up_throughput_bps", zza1.zzGd);
            bundle1.putBundle("predictions", zzgr1);
        }
        bundle.putBundle("network", bundle1);
        hashmap.put("device", bundle);
    }

    private static void zza(HashMap hashmap, String s)
    {
        if (s != null)
        {
            HashMap hashmap1 = new HashMap();
            hashmap1.put("token", s);
            hashmap.put("pan", hashmap1);
        }
    }

    private static String zzc(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        int i;
        if (nativeadoptionsparcel != null)
        {
            i = nativeadoptionsparcel.zzwo;
        } else
        {
            i = 0;
        }
        switch (i)
        {
        default:
            return "any";

        case 1: // '\001'
            return "portrait";

        case 2: // '\002'
            return "landscape";
        }
    }

    private static UsageInfo zzd(Context context, String s)
    {
        context = (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).addApi(com.google.android.gms.appdatasearch.zza.zzOQ).build();
        context.connect();
        s = (new com.google.android.gms.appdatasearch.GetRecentContextCall.Request.zza()).zzL(true).zzbw(s).zzlb();
        s = (com.google.android.gms.appdatasearch.GetRecentContextCall.Response)com.google.android.gms.appdatasearch.zza.zzOR.zza(context, s).await(1L, TimeUnit.SECONDS);
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.getStatus().isSuccess()) goto _L3; else goto _L2
_L2:
        zzb.zzaD("Fail to obtain recent context call");
        if (context != null)
        {
            context.disconnect();
        }
_L5:
        return null;
_L3:
        if (((com.google.android.gms.appdatasearch.GetRecentContextCall.Response) (s)).zzPw != null && !((com.google.android.gms.appdatasearch.GetRecentContextCall.Response) (s)).zzPw.isEmpty())
        {
            break MISSING_BLOCK_LABEL_135;
        }
        zzb.zzaD("Fail to obtain recent context");
        if (context == null) goto _L5; else goto _L4
_L4:
        context.disconnect();
        return null;
        UsageInfo usageinfo = (UsageInfo)((com.google.android.gms.appdatasearch.GetRecentContextCall.Response) (s)).zzPw.get(0);
        s = usageinfo;
        if (context != null)
        {
            context.disconnect();
            s = usageinfo;
        }
_L6:
        return s;
        context;
        context = null;
_L9:
        zzb.zzaE("Fail to get recent context");
        if (context != null)
        {
            context.disconnect();
            s = null;
        } else
        {
            s = null;
        }
          goto _L6
        s;
        context = null;
_L8:
        if (context != null)
        {
            context.disconnect();
        }
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L8; else goto _L7
_L7:
        s;
          goto _L9
    }

    private static Integer zzx(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    static 
    {
        zzEY = new SimpleDateFormat("yyyyMMdd", Locale.US);
    }
}
