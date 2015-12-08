// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.text.TextUtils;
import android.util.Base64;
import com.google.a.a.a.a.ne;
import com.google.android.apps.youtube.a.a.e;
import com.google.android.apps.youtube.a.a.f;
import com.google.android.apps.youtube.datalib.innertube.model.InfoCardCollection;
import com.google.android.apps.youtube.datalib.innertube.model.PlaybackTracking;
import com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig;
import com.google.android.apps.youtube.datalib.legacy.a.a;
import com.google.android.apps.youtube.datalib.legacy.a.b;
import com.google.protobuf.micro.InvalidProtocolBufferMicroException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.c;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            VastAd, Survey

public final class bb extends b
{

    private VastAd a;

    public bb()
    {
    }

    public bb(VastAd vastad)
    {
        a = vastad;
    }

    private static PlaybackTracking e(JSONObject jsonobject, String s)
    {
        jsonobject = a(jsonobject, s);
        if (TextUtils.isEmpty(jsonobject))
        {
            return new PlaybackTracking();
        }
        jsonobject = Base64.decode(jsonobject, 2);
        try
        {
            jsonobject = (e)(new e()).b(jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return new PlaybackTracking();
        }
        return new PlaybackTracking(jsonobject);
    }

    private static PlayerConfig f(JSONObject jsonobject, String s)
    {
        jsonobject = a(jsonobject, s);
        if (TextUtils.isEmpty(jsonobject))
        {
            return new PlayerConfig();
        }
        jsonobject = Base64.decode(jsonobject, 2);
        try
        {
            jsonobject = (f)(new f()).b(jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return new PlayerConfig();
        }
        return new PlayerConfig(jsonobject);
    }

    private static ne g(JSONObject jsonobject, String s)
    {
        jsonobject = a(jsonobject, s);
        if (TextUtils.isEmpty(jsonobject))
        {
            return null;
        }
        jsonobject = Base64.decode(jsonobject, 2);
        try
        {
            jsonobject = (ne)c.a(new ne(), jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new JSONException("Invalid protobuf");
        }
        return jsonobject;
    }

    public final int a()
    {
        return 1;
    }

    protected final a a(JSONObject jsonobject, int i)
    {
        if (i != 1)
        {
            throw new JSONException("Unsupported version");
        }
        java.util.List list = d(jsonobject, "impressionUris");
        String s = a(jsonobject, "adVideoId");
        String s1 = a(jsonobject, "originalVideoId");
        String s2 = a(jsonobject, "adBreakId");
        String s3 = a(jsonobject, "title");
        String s4 = a(jsonobject, "adOwnerName");
        android.net.Uri uri = c(jsonobject, "adOwnerUri");
        String s5 = a(jsonobject, "vastAdId");
        String s6 = a(jsonobject, "vastAdSystem");
        VastAd.BillingPartner billingpartner = (VastAd.BillingPartner)a(jsonobject, "billingPartner", com/google/android/apps/youtube/datalib/legacy/model/VastAd$BillingPartner);
        String s7 = a(jsonobject, "adFormat");
        i = jsonobject.getInt("duration");
        PlaybackTracking playbacktracking = e(jsonobject, "playbackTracking");
        PlayerConfig playerconfig = f(jsonobject, "playerConfig");
        android.net.Uri uri1 = c(jsonobject, "clickthroughUri");
        java.util.List list1 = d(jsonobject, "startPingUris");
        java.util.List list2 = d(jsonobject, "firstQuartilePingUris");
        java.util.List list3 = d(jsonobject, "midpointPingUris");
        java.util.List list4 = d(jsonobject, "thirdQuartilePingUris");
        java.util.List list5 = b(jsonobject, "progressPings", com/google/android/apps/youtube/datalib/legacy/model/VastAd$ProgressPing);
        java.util.List list6 = d(jsonobject, "skipPingUris");
        java.util.List list7 = d(jsonobject, "skipShownPingUris");
        java.util.List list8 = d(jsonobject, "engagedViewPingUris");
        java.util.List list9 = d(jsonobject, "completePingUris");
        java.util.List list10 = d(jsonobject, "closePingUris");
        java.util.List list11 = d(jsonobject, "pausePingUris");
        java.util.List list12 = d(jsonobject, "resumePingUris");
        java.util.List list13 = d(jsonobject, "mutePingUris");
        java.util.List list14 = d(jsonobject, "fullscreenPingUris");
        java.util.List list15 = d(jsonobject, "clickthroughPingUris");
        java.util.List list16 = d(jsonobject, "videoTitleClickedPingUris");
        java.util.List list17 = d(jsonobject, "errorPingUris");
        java.util.List list18 = d(jsonobject, "exclusionReasonPingUris");
        android.net.Uri uri2 = c(jsonobject, "videoAdTrackingTemplateUri");
        android.net.Uri uri3 = c(jsonobject, "adSenseBaseConversionUri");
        boolean flag = jsonobject.getBoolean("shouldPingVssOnEngaged");
        boolean flag1 = jsonobject.getBoolean("fallbackHint");
        long l = jsonobject.getLong("expirationTimeMillis");
        int j = jsonobject.getInt("assetFrequencyCap");
        boolean flag2 = jsonobject.getBoolean("isPublicVideo");
        boolean flag3 = jsonobject.getBoolean("showCtaAnnotations");
        ne ne1 = g(jsonobject, "adAnnotations");
        Object obj = a(jsonobject, "adInfoCards");
        Object obj1;
        android.net.Uri uri4;
        VastAd vastad;
        VastAd vastad1;
        long l1;
        boolean flag4;
        boolean flag5;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = null;
        } else
        {
            obj1 = InfoCardCollection.fromByteArray(Base64.decode(((String) (obj)), 2));
            obj = obj1;
            if (obj1 == null)
            {
                throw new JSONException("Invalid info card byte array");
            }
        }
        l1 = jsonobject.getLong("requestTimeMilliseconds");
        flag4 = jsonobject.getBoolean("offlineShouldCountPlayback");
        flag5 = jsonobject.getBoolean("shouldAllowQueuedOfflinePings");
        uri4 = c(jsonobject, "adWrapperUri");
        vastad = (VastAd)b(jsonobject, "prefetchedAd");
        vastad1 = (VastAd)b(jsonobject, "parentWrapper");
        if (jsonobject.isNull("infoCards"))
        {
            obj1 = null;
        } else
        {
            obj1 = a(jsonobject.getJSONArray("infoCards"));
        }
        return new VastAd(list, s, s1, s2, s3, s4, uri, s5, s6, billingpartner, s7, i, null, playbacktracking, playerconfig, uri1, list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, list16, list17, list18, uri2, uri3, flag, flag1, l, j, flag2, flag3, ne1, ((InfoCardCollection) (obj)), l1, flag4, flag5, uri4, vastad, vastad1, null, ((java.util.List) (obj1)), (Survey)b(jsonobject, "survey"));
    }

    protected final void a(JSONObject jsonobject)
    {
        b(jsonobject, "impressionUris", a.getImpressionUris());
        a(jsonobject, "adVideoId", a.getAdVideoId());
        a(jsonobject, "originalVideoId", a.getOriginalVideoId());
        a(jsonobject, "adBreakId", a.getAdBreakId());
        a(jsonobject, "title", a.getTitle());
        a(jsonobject, "adOwnerName", VastAd.access$000(a));
        a(jsonobject, "adOwnerUri", VastAd.access$100(a));
        a(jsonobject, "vastAdId", a.getVastAdId());
        a(jsonobject, "vastAdSystem", a.getVastAdSystem());
        a(jsonobject, "billingPartner", ((Enum) (a.getBillingPartner())));
        a(jsonobject, "adFormat", a.getAdFormat());
        jsonobject.put("duration", a.getDuration());
        a(jsonobject, "playbackTracking", Base64.encodeToString(VastAd.access$200(a).toPlaybackTrackingProto().s(), 2));
        a(jsonobject, "playerConfig", Base64.encodeToString(VastAd.access$300(a).toPlayerConfigProto().s(), 2));
        a(jsonobject, "clickthroughUri", a.getClickthroughUri());
        b(jsonobject, "startPingUris", a.getStartPingUris());
        b(jsonobject, "firstQuartilePingUris", a.getFirstQuartilePingUris());
        b(jsonobject, "midpointPingUris", a.getMidpointPingUris());
        b(jsonobject, "thirdQuartilePingUris", a.getThirdQuartilePingUris());
        a(jsonobject, "progressPings", a.getProgressPings());
        b(jsonobject, "skipPingUris", a.getSkipPingUris());
        b(jsonobject, "skipShownPingUris", a.getSkipShownPingUris());
        b(jsonobject, "engagedViewPingUris", a.getEngagedViewPingUris());
        b(jsonobject, "completePingUris", a.getCompletePingUris());
        b(jsonobject, "closePingUris", a.getClosePingUris());
        b(jsonobject, "pausePingUris", a.getPausePingUris());
        b(jsonobject, "resumePingUris", a.getResumePingUris());
        b(jsonobject, "mutePingUris", a.getMutePingUris());
        b(jsonobject, "fullscreenPingUris", a.getFullscreenPingUris());
        b(jsonobject, "clickthroughPingUris", a.getClickTrackingPingUris());
        b(jsonobject, "videoTitleClickedPingUris", a.getVideoTitleClickedPingUris());
        b(jsonobject, "errorPingUris", a.getErrorPingUris());
        b(jsonobject, "exclusionReasonPingUris", a.getExclusionReasonPingUris());
        a(jsonobject, "videoAdTrackingTemplateUri", a.getVideoAdTrackingTemplateUri());
        a(jsonobject, "adSenseBaseConversionUri", a.getAdSenseBaseConversionUri());
        jsonobject.put("shouldPingVssOnEngaged", a.shouldPingVssOnEngaged());
        jsonobject.put("fallbackHint", a.shouldAllowAdsFallback());
        jsonobject.put("expirationTimeMillis", a.getExpirationTimeMillis());
        jsonobject.put("assetFrequencyCap", a.getAssetFrequencyCap());
        jsonobject.put("isPublicVideo", a.isPublicVideo());
        jsonobject.put("showCtaAnnotations", a.shouldShowCtaAnnotations());
        if (a.adAnnotations != null)
        {
            a(jsonobject, "adAnnotations", Base64.encodeToString(c.a(a.adAnnotations), 2));
        }
        if (a.adInfoCards != null)
        {
            a(jsonobject, "adInfoCards", Base64.encodeToString(a.adInfoCards.toByteArray(), 2));
        }
        jsonobject.put("requestTimeMilliseconds", a.getRequestTimeMills());
        jsonobject.put("offlineShouldCountPlayback", a.isOfflineShouldCountPlayback());
        jsonobject.put("shouldAllowQueuedOfflinePings", VastAd.access$400(a));
        a(jsonobject, "adWrapperUri", a.getAdWrapperUri());
        a(jsonobject, "prefetchedAd", ((a) (a.getPrefetchedAd())));
        a(jsonobject, "parentWrapper", ((a) (a.getParentWrapper())));
        a(jsonobject, "infoCards", a.getInfoCards());
        a(jsonobject, "survey", ((a) (a.getSurvey())));
    }
}
