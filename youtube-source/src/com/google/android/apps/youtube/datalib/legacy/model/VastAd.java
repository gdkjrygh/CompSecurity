// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.a.a.a.a.ne;
import com.google.android.apps.youtube.common.e.c;
import com.google.android.apps.youtube.common.e.j;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.datalib.innertube.model.InfoCardCollection;
import com.google.android.apps.youtube.datalib.innertube.model.PlaybackTracking;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig;
import com.google.android.apps.youtube.datalib.innertube.model.media.VideoStreamingData;
import com.google.android.apps.youtube.datalib.legacy.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            az, Survey, InfoCard, ba, 
//            bb

public class VastAd
    implements Parcelable, a
{

    private static final String ADSENSE_CONVERSION_LABEL = "label";
    public static final android.os.Parcelable.Creator CREATOR = new az();
    public static final VastAd EMPTY_AD = new VastAd();
    private static final int MSEC_IN_SECOND = 1000;
    public static final String SURVEY_AD_SYSTEM = "402";
    public static final int UNSPECIFIED_FREQUENCY_CAP = -1;
    public static final int VAST_VERSION_2 = 2;
    public static final int VAST_VERSION_3 = 3;
    private static final String YOUTUBE_ANNOTATION_FRAGMENT_FLAG = "modules";
    public final ne adAnnotations;
    private final String adBreakId;
    private final String adFormat;
    private final String adIds;
    public final InfoCardCollection adInfoCards;
    private final String adOwnerName;
    private final Uri adOwnerUri;
    private final Uri adSenseBaseConversionUri;
    private final String adSystems;
    private final String adVideoId;
    private final Uri adWrapperUri;
    private final int assetFrequencyCap;
    private final BillingPartner billingPartner;
    private final List clickTrackingPingUris;
    private final Uri clickthroughUri;
    private final List closePingUris;
    private final List completePingUris;
    private final int duration;
    private final List engagedViewPingUris;
    private final List errorPingUris;
    private final List exclusionReasonPingUris;
    private final long expirationTimeMillis;
    private final List firstQuartilePingUris;
    private final List fullscreenPingUris;
    private final List impressionUris;
    private final List infoCards;
    private final boolean isPublicVideo;
    private final boolean isVastWrapper;
    private final List midpointPingUris;
    private final List mutePingUris;
    private final List offlineAdFormatExclusionReasons;
    private final boolean offlineShouldCountPlayback;
    private final String originalVideoId;
    private final VastAd parentWrapper;
    private final List pausePingUris;
    private final PlaybackTracking playbackTracking;
    private final PlayerConfig playerConfig;
    private final VastAd prefetchedAd;
    private final List progressPings;
    private final long requestTimeMillis;
    private final String requestTimes;
    private final List resumePingUris;
    private final boolean shouldAllowAdsFallback;
    private final boolean shouldAllowQueuedOfflinePings;
    private final boolean shouldPingVssOnEngaged;
    private final boolean showCtaAnnotations;
    private final List skipPingUris;
    private final List skipShownPingUris;
    private final List startPingUris;
    private final Survey survey;
    private final List thirdQuartilePingUris;
    private final String title;
    private final String vastAdId;
    private final String vastAdSystem;
    private final Uri videoAdTrackingTemplateUri;
    private final VideoStreamingData videoStreamingData;
    private final List videoTitleClickedPingUris;

    private VastAd()
    {
        impressionUris = Collections.emptyList();
        adVideoId = null;
        originalVideoId = null;
        adBreakId = null;
        title = null;
        adOwnerName = null;
        adOwnerUri = null;
        vastAdId = null;
        vastAdSystem = null;
        billingPartner = BillingPartner.UNKNOWN;
        adFormat = null;
        duration = 0;
        videoStreamingData = null;
        playbackTracking = new PlaybackTracking();
        playerConfig = new PlayerConfig();
        clickthroughUri = null;
        startPingUris = Collections.emptyList();
        firstQuartilePingUris = Collections.emptyList();
        midpointPingUris = Collections.emptyList();
        thirdQuartilePingUris = Collections.emptyList();
        progressPings = Collections.emptyList();
        skipPingUris = Collections.emptyList();
        skipShownPingUris = Collections.emptyList();
        engagedViewPingUris = Collections.emptyList();
        completePingUris = Collections.emptyList();
        closePingUris = Collections.emptyList();
        pausePingUris = Collections.emptyList();
        resumePingUris = Collections.emptyList();
        mutePingUris = Collections.emptyList();
        fullscreenPingUris = Collections.emptyList();
        clickTrackingPingUris = Collections.emptyList();
        videoTitleClickedPingUris = Collections.emptyList();
        errorPingUris = Collections.emptyList();
        exclusionReasonPingUris = Collections.emptyList();
        videoAdTrackingTemplateUri = null;
        adSenseBaseConversionUri = null;
        shouldPingVssOnEngaged = false;
        shouldAllowAdsFallback = true;
        expirationTimeMillis = 0L;
        assetFrequencyCap = -1;
        isPublicVideo = false;
        showCtaAnnotations = false;
        adAnnotations = null;
        adInfoCards = null;
        requestTimeMillis = 0L;
        offlineShouldCountPlayback = false;
        shouldAllowQueuedOfflinePings = false;
        adWrapperUri = null;
        isVastWrapper = false;
        prefetchedAd = null;
        parentWrapper = null;
        requestTimes = computedRequestTimes();
        adSystems = computedAdSystems();
        adIds = computedAdIds();
        offlineAdFormatExclusionReasons = null;
        infoCards = null;
        survey = null;
    }

    public VastAd(Parcel parcel)
    {
        List list = readUriList(parcel);
        String s = parcel.readString();
        String s1 = parcel.readString();
        String s2 = parcel.readString();
        String s3 = parcel.readString();
        String s4 = parcel.readString();
        Uri uri = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        String s5 = parcel.readString();
        String s6 = parcel.readString();
        BillingPartner billingpartner = (BillingPartner)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/VastAd$BillingPartner, parcel.readString());
        String s7 = parcel.readString();
        int i = parcel.readInt();
        VideoStreamingData videostreamingdata = (VideoStreamingData)parcel.readParcelable(com/google/android/apps/youtube/datalib/innertube/model/media/VideoStreamingData.getClassLoader());
        PlaybackTracking playbacktracking = (PlaybackTracking)parcel.readParcelable(com/google/android/apps/youtube/datalib/innertube/model/PlaybackTracking.getClassLoader());
        PlayerConfig playerconfig = (PlayerConfig)parcel.readParcelable(com/google/android/apps/youtube/datalib/innertube/model/media/PlayerConfig.getClassLoader());
        Uri uri1 = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        List list1 = readUriList(parcel);
        List list2 = readUriList(parcel);
        List list3 = readUriList(parcel);
        List list4 = readUriList(parcel);
        List list5 = readProgressPingsList(parcel);
        List list6 = readUriList(parcel);
        List list7 = readUriList(parcel);
        List list8 = readUriList(parcel);
        List list9 = readUriList(parcel);
        List list10 = readUriList(parcel);
        List list11 = readUriList(parcel);
        List list12 = readUriList(parcel);
        List list13 = readUriList(parcel);
        List list14 = readUriList(parcel);
        List list15 = readUriList(parcel);
        List list16 = readUriList(parcel);
        List list17 = readUriList(parcel);
        List list18 = readUriList(parcel);
        Uri uri2 = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        Uri uri3 = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        ne ne1;
        InfoCardCollection infocardcollection;
        int k;
        long l1;
        long l2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (parcel.readInt() == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l1 = parcel.readLong();
        k = parcel.readInt();
        if (parcel.readInt() == 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (parcel.readInt() == 1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        ne1 = (ne)j.b(parcel, new ne());
        infocardcollection = (InfoCardCollection)parcel.readParcelable(com/google/android/apps/youtube/datalib/innertube/model/InfoCardCollection.getClassLoader());
        l2 = parcel.readLong();
        if (parcel.readInt() == 1)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (parcel.readInt() == 1)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        this(list, s, s1, s2, s3, s4, uri, s5, s6, billingpartner, s7, i, videostreamingdata, playbacktracking, playerconfig, uri1, list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, list16, list17, list18, uri2, uri3, flag, flag1, l1, k, flag2, flag3, ne1, infocardcollection, l2, flag4, flag5, (Uri)parcel.readParcelable(android/net/Uri.getClassLoader()), (VastAd)parcel.readParcelable(com/google/android/apps/youtube/datalib/legacy/model/VastAd.getClassLoader()), (VastAd)parcel.readParcelable(com/google/android/apps/youtube/datalib/legacy/model/VastAd.getClassLoader()), offlineReadAdFormatExclusionReasonList(parcel), readInfoCardList(parcel), (Survey)parcel.readParcelable(com/google/android/apps/youtube/datalib/legacy/model/Survey.getClassLoader()));
    }

    public VastAd(List list, String s, String s1, String s2, String s3, String s4, Uri uri, 
            String s5, String s6, BillingPartner billingpartner, String s7, int i, VideoStreamingData videostreamingdata, PlaybackTracking playbacktracking, 
            PlayerConfig playerconfig, Uri uri1, List list1, List list2, List list3, List list4, List list5, 
            List list6, List list7, List list8, List list9, List list10, List list11, List list12, 
            List list13, List list14, List list15, List list16, List list17, List list18, Uri uri2, 
            Uri uri3, boolean flag, boolean flag1, long l1, int k, boolean flag2, 
            boolean flag3, ne ne1, InfoCardCollection infocardcollection, long l2, boolean flag4, boolean flag5, 
            Uri uri4, VastAd vastad, VastAd vastad1, List list19, List list20, Survey survey1)
    {
        impressionUris = c.a(list);
        adVideoId = s;
        originalVideoId = s1;
        adBreakId = s2;
        title = s3;
        adOwnerName = s4;
        adOwnerUri = uri;
        vastAdId = s5;
        vastAdSystem = s6;
        billingPartner = billingpartner;
        adFormat = s7;
        duration = i;
        videoStreamingData = videostreamingdata;
        playbackTracking = (PlaybackTracking)com.google.android.apps.youtube.common.fromguava.c.a(playbacktracking);
        playerConfig = (PlayerConfig)com.google.android.apps.youtube.common.fromguava.c.a(playerconfig);
        clickthroughUri = uri1;
        startPingUris = c.a(list1);
        firstQuartilePingUris = c.a(list2);
        midpointPingUris = c.a(list3);
        thirdQuartilePingUris = c.a(list4);
        progressPings = c.a(list5);
        skipPingUris = c.a(list6);
        skipShownPingUris = c.a(list7);
        engagedViewPingUris = c.a(list8);
        completePingUris = c.a(list9);
        closePingUris = c.a(list10);
        pausePingUris = c.a(list11);
        resumePingUris = c.a(list12);
        mutePingUris = c.a(list13);
        fullscreenPingUris = c.a(list14);
        clickTrackingPingUris = c.a(list15);
        videoTitleClickedPingUris = c.a(list16);
        errorPingUris = c.a(list17);
        exclusionReasonPingUris = c.a(list18);
        videoAdTrackingTemplateUri = uri2;
        adSenseBaseConversionUri = uri3;
        shouldPingVssOnEngaged = flag;
        shouldAllowAdsFallback = flag1;
        expirationTimeMillis = l1;
        assetFrequencyCap = k;
        isPublicVideo = flag2;
        showCtaAnnotations = flag3;
        adAnnotations = ne1;
        adInfoCards = infocardcollection;
        requestTimeMillis = l2;
        offlineShouldCountPlayback = flag4;
        shouldAllowQueuedOfflinePings = flag5;
        adWrapperUri = uri4;
        if (uri4 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isVastWrapper = flag;
        prefetchedAd = vastad;
        parentWrapper = vastad1;
        requestTimes = computedRequestTimes();
        adSystems = computedAdSystems();
        adIds = computedAdIds();
        offlineAdFormatExclusionReasons = c.a(list19);
        infoCards = c.a(list20);
        survey = survey1;
    }

    public static boolean isYouTubeHostedUri(Uri uri)
    {
        return uri != null && (b.a(uri.getScheme(), "http") || b.a(uri.getScheme(), "https")) && uri.getHost().startsWith("www.youtube");
    }

    private static List offlineReadAdFormatExclusionReasonList(Parcel parcel)
    {
        Object obj = new ArrayList();
        parcel.readStringList(((List) (obj)));
        parcel = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); parcel.add(Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/VastAd$OfflineAdFormatExclusionReason, (String)((Iterator) (obj)).next()))) { }
        return Collections.unmodifiableList(parcel);
    }

    private static void offlineWriteAdFormatExclusionReasonList(Parcel parcel, List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(((OfflineAdFormatExclusionReason)list.next()).name())) { }
        parcel.writeStringList(arraylist);
    }

    private static List readInfoCardList(Parcel parcel)
    {
        ArrayList arraylist = new ArrayList();
        parcel.readTypedList(arraylist, InfoCard.CREATOR);
        return Collections.unmodifiableList(arraylist);
    }

    private static List readProgressPingsList(Parcel parcel)
    {
        ArrayList arraylist = new ArrayList();
        parcel.readTypedList(arraylist, ProgressPing.CREATOR);
        return Collections.unmodifiableList(arraylist);
    }

    private static List readUriList(Parcel parcel)
    {
        ArrayList arraylist = new ArrayList();
        parcel.readTypedList(arraylist, Uri.CREATOR);
        return Collections.unmodifiableList(arraylist);
    }

    private boolean shouldAllowQueuedOfflinePings()
    {
        return shouldAllowQueuedOfflinePings;
    }

    public ba buildUpon()
    {
        return (new ba()).a(new ArrayList(getImpressionUris())).a(getAdVideoId()).b(getOriginalVideoId()).c(getAdBreakId()).d(getTitle()).e(adOwnerName).s(adOwnerUri).f(getVastAdId()).g(getVastAdSystem()).a(getBillingPartner()).h(getAdFormat()).a(getDuration()).a(videoStreamingData).a(playbackTracking).a(playerConfig).t(getClickthroughUri()).b(getStartPingUris()).c(getFirstQuartilePingUris()).d(getMidpointPingUris()).e(getThirdQuartilePingUris()).f(getProgressPings()).g(getSkipPingUris()).h(getSkipShownPingUris()).i(getEngagedViewPingUris()).j(getCompletePingUris()).k(getClosePingUris()).l(getPausePingUris()).m(getResumePingUris()).n(getMutePingUris()).o(getFullscreenPingUris()).p(getClickTrackingPingUris()).q(getVideoTitleClickedPingUris()).r(getErrorPingUris()).s(getExclusionReasonPingUris()).u(getVideoAdTrackingTemplateUri()).v(getAdSenseBaseConversionUri()).a(shouldPingVssOnEngaged()).b(shouldAllowAdsFallback()).b(getExpirationTimeMillis()).b(getAssetFrequencyCap()).c(isPublicVideo()).d(shouldShowCtaAnnotations()).a(adAnnotations).a(adInfoCards).c(getRequestTimeMills()).e(isOfflineShouldCountPlayback()).f(shouldAllowQueuedOfflinePings()).w(getAdWrapperUri()).b(getPrefetchedAd()).a(getParentWrapper()).t(getOfflineAdFormatExclusionReasons()).u(getInfoCards()).a(getSurvey());
    }

    public String computedAdIds()
    {
        l l1 = new l();
        VastAd vastad = this;
        while (vastad != null) 
        {
            String s;
            if (vastad.getVastAdId() == null)
            {
                s = "";
            } else
            {
                s = vastad.getVastAdId();
            }
            l1.offer(s);
            vastad = vastad.getParentWrapper();
        }
        return TextUtils.join(",", l1);
    }

    public String computedAdSystems()
    {
        l l1 = new l();
        VastAd vastad = this;
        while (vastad != null) 
        {
            String s;
            if (vastad.getVastAdSystem() == null)
            {
                s = "";
            } else
            {
                s = vastad.getVastAdSystem();
            }
            l1.offer(s);
            vastad = vastad.getParentWrapper();
        }
        return TextUtils.join(",", l1);
    }

    public String computedRequestTimes()
    {
        l l1 = new l();
        for (VastAd vastad = this; vastad != null; vastad = vastad.getParentWrapper())
        {
            l1.offer(Long.valueOf(vastad.getRequestTimeMills()));
        }

        return TextUtils.join(",", l1);
    }

    public Uri createCustomAdSenseConversionUri(String s)
    {
        if (getAdSenseBaseConversionUri() == null)
        {
            return null;
        } else
        {
            return getAdSenseBaseConversionUri().buildUpon().appendQueryParameter("label", s).build();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && getClass().equals(obj.getClass()))
        {
            obj = (VastAd)obj;
            if (b.a(getAdVideoId(), ((VastAd) (obj)).getAdVideoId()) && b.a(getOriginalVideoId(), ((VastAd) (obj)).getOriginalVideoId()) && b.a(getAdBreakId(), ((VastAd) (obj)).getAdBreakId()) && b.a(getTitle(), ((VastAd) (obj)).getTitle()) && b.a(adOwnerName, ((VastAd) (obj)).adOwnerName) && b.a(adOwnerUri, ((VastAd) (obj)).adOwnerUri) && b.a(getVastAdId(), ((VastAd) (obj)).getVastAdId()) && b.a(getVastAdSystem(), ((VastAd) (obj)).getVastAdSystem()) && b.a(getBillingPartner(), ((VastAd) (obj)).getBillingPartner()) && b.a(getAdFormat(), ((VastAd) (obj)).getAdFormat()) && b.a(videoStreamingData, ((VastAd) (obj)).videoStreamingData) && b.a(playbackTracking, ((VastAd) (obj)).playbackTracking) && b.a(playerConfig, ((VastAd) (obj)).playerConfig) && b.a(getClickthroughUri(), ((VastAd) (obj)).getClickthroughUri()) && getDuration() == ((VastAd) (obj)).getDuration() && shouldPingVssOnEngaged() == ((VastAd) (obj)).shouldPingVssOnEngaged() && shouldAllowAdsFallback() == ((VastAd) (obj)).shouldAllowAdsFallback() && getExpirationTimeMillis() == ((VastAd) (obj)).getExpirationTimeMillis() && getAssetFrequencyCap() == ((VastAd) (obj)).getAssetFrequencyCap() && b.a(getImpressionUris(), ((VastAd) (obj)).getImpressionUris()) && b.a(getStartPingUris(), ((VastAd) (obj)).getStartPingUris()) && b.a(getFirstQuartilePingUris(), ((VastAd) (obj)).getFirstQuartilePingUris()) && b.a(getMidpointPingUris(), ((VastAd) (obj)).getMidpointPingUris()) && b.a(getThirdQuartilePingUris(), ((VastAd) (obj)).getThirdQuartilePingUris()) && b.a(getProgressPings(), ((VastAd) (obj)).getProgressPings()) && b.a(getSkipPingUris(), ((VastAd) (obj)).getSkipPingUris()) && b.a(getSkipShownPingUris(), ((VastAd) (obj)).getSkipShownPingUris()) && b.a(getEngagedViewPingUris(), ((VastAd) (obj)).getEngagedViewPingUris()) && b.a(getCompletePingUris(), ((VastAd) (obj)).getCompletePingUris()) && b.a(getClosePingUris(), ((VastAd) (obj)).getClosePingUris()) && b.a(getPausePingUris(), ((VastAd) (obj)).getPausePingUris()) && b.a(getResumePingUris(), ((VastAd) (obj)).getResumePingUris()) && b.a(getMutePingUris(), ((VastAd) (obj)).getMutePingUris()) && b.a(getFullscreenPingUris(), ((VastAd) (obj)).getFullscreenPingUris()) && b.a(getClickTrackingPingUris(), ((VastAd) (obj)).getClickTrackingPingUris()) && b.a(getVideoTitleClickedPingUris(), ((VastAd) (obj)).getVideoTitleClickedPingUris()) && b.a(getErrorPingUris(), ((VastAd) (obj)).getErrorPingUris()) && b.a(getExclusionReasonPingUris(), ((VastAd) (obj)).getExclusionReasonPingUris()) && b.a(getVideoAdTrackingTemplateUri(), ((VastAd) (obj)).getVideoAdTrackingTemplateUri()) && b.a(getAdSenseBaseConversionUri(), ((VastAd) (obj)).getAdSenseBaseConversionUri()) && b.a(getAdWrapperUri(), ((VastAd) (obj)).getAdWrapperUri()) && b.a(getPrefetchedAd(), ((VastAd) (obj)).getPrefetchedAd()) && b.a(getParentWrapper(), ((VastAd) (obj)).getParentWrapper()) && shouldShowCtaAnnotations() == ((VastAd) (obj)).shouldShowCtaAnnotations() && isOfflineShouldCountPlayback() == ((VastAd) (obj)).isOfflineShouldCountPlayback() && shouldAllowQueuedOfflinePings() == ((VastAd) (obj)).shouldAllowQueuedOfflinePings() && isOfflineShouldCountPlayback() == ((VastAd) (obj)).isOfflineShouldCountPlayback() && b.a(getOfflineAdFormatExclusionReasons(), ((VastAd) (obj)).getOfflineAdFormatExclusionReasons()) && b.a(getInfoCards(), ((VastAd) (obj)).getInfoCards()) && b.a(getSurvey(), ((VastAd) (obj)).getSurvey()))
            {
                return true;
            }
        }
        return false;
    }

    public Uri firstStreamUri()
    {
        List list;
        if (videoStreamingData != null)
        {
            if ((list = videoStreamingData.getAllFormatStreams()) != null)
            {
                return ((FormatStream)list.get(0)).getUri();
            }
        }
        return null;
    }

    public String getAdBreakId()
    {
        return adBreakId;
    }

    public String getAdFormat()
    {
        return adFormat;
    }

    public AdFormatSubType getAdFormatSubType()
    {
        if (getSurvey() != null)
        {
            return AdFormatSubType.SURVEY;
        }
        if (isSkippable())
        {
            return AdFormatSubType.SKIPPABLE;
        } else
        {
            return AdFormatSubType.NONE;
        }
    }

    public String getAdIds()
    {
        return adIds;
    }

    public String getAdOwnerName()
    {
        if (isPublicVideo)
        {
            return adOwnerName;
        } else
        {
            return null;
        }
    }

    public Uri getAdOwnerUri()
    {
        if (isPublicVideo)
        {
            return adOwnerUri;
        } else
        {
            return null;
        }
    }

    public Uri getAdSenseBaseConversionUri()
    {
        return adSenseBaseConversionUri;
    }

    public String getAdSystems()
    {
        return adSystems;
    }

    public String getAdVideoId()
    {
        return adVideoId;
    }

    public Uri getAdWrapperUri()
    {
        return adWrapperUri;
    }

    public int getAssetFrequencyCap()
    {
        return assetFrequencyCap;
    }

    public BillingPartner getBillingPartner()
    {
        return billingPartner;
    }

    public List getClickTrackingPingUris()
    {
        return clickTrackingPingUris;
    }

    public Uri getClickthroughUri()
    {
        return clickthroughUri;
    }

    public List getClosePingUris()
    {
        return closePingUris;
    }

    public List getCompletePingUris()
    {
        return completePingUris;
    }

    public volatile com.google.android.apps.youtube.datalib.legacy.a.b getConverter()
    {
        return getConverter();
    }

    public bb getConverter()
    {
        return new bb(this);
    }

    public int getDuration()
    {
        return duration;
    }

    public List getEngagedViewPingUris()
    {
        return engagedViewPingUris;
    }

    public List getErrorPingUris()
    {
        return errorPingUris;
    }

    public List getExclusionReasonPingUris()
    {
        return exclusionReasonPingUris;
    }

    public long getExpirationTimeMillis()
    {
        return expirationTimeMillis;
    }

    public List getFirstQuartilePingUris()
    {
        return firstQuartilePingUris;
    }

    public List getFullscreenPingUris()
    {
        return fullscreenPingUris;
    }

    public List getImpressionUris()
    {
        return impressionUris;
    }

    public List getInfoCards()
    {
        return infoCards;
    }

    public List getMidpointPingUris()
    {
        return midpointPingUris;
    }

    public List getMutePingUris()
    {
        return mutePingUris;
    }

    public List getOfflineAdFormatExclusionReasons()
    {
        return offlineAdFormatExclusionReasons;
    }

    public String getOriginalVideoId()
    {
        return originalVideoId;
    }

    public VastAd getParentWrapper()
    {
        return parentWrapper;
    }

    public int getParentWrapperCount()
    {
        int i = 0;
        for (VastAd vastad = getParentWrapper(); vastad != null; vastad = vastad.getParentWrapper())
        {
            i++;
        }

        return i;
    }

    public List getPausePingUris()
    {
        return pausePingUris;
    }

    public PlaybackTracking getPlaybackTracking()
    {
        return playbackTracking;
    }

    public PlayerConfig getPlayerConfig()
    {
        return playerConfig;
    }

    public VastAd getPrefetchedAd()
    {
        return prefetchedAd;
    }

    public List getProgressPings()
    {
        return progressPings;
    }

    public long getRequestTimeMills()
    {
        return requestTimeMillis;
    }

    public String getRequestTimes()
    {
        return requestTimes;
    }

    public List getResumePingUris()
    {
        return resumePingUris;
    }

    public boolean getShouldAllowQueuedOfflinePings()
    {
        return shouldAllowQueuedOfflinePings();
    }

    public List getSkipPingUris()
    {
        return skipPingUris;
    }

    public List getSkipShownPingUris()
    {
        return skipShownPingUris;
    }

    public List getStartPingUris()
    {
        return startPingUris;
    }

    public Survey getSurvey()
    {
        return survey;
    }

    public List getThirdQuartilePingUris()
    {
        return thirdQuartilePingUris;
    }

    public String getTitle()
    {
        return title;
    }

    public String getVastAdId()
    {
        return vastAdId;
    }

    public String getVastAdSystem()
    {
        return vastAdSystem;
    }

    public Uri getVideoAdTrackingTemplateUri()
    {
        return videoAdTrackingTemplateUri;
    }

    public VideoStreamingData getVideoStreamingData()
    {
        return videoStreamingData;
    }

    public List getVideoTitleClickedPingUris()
    {
        return videoTitleClickedPingUris;
    }

    public boolean hasExpired(com.google.android.apps.youtube.common.e.b b1)
    {
        return b1.a() >= getExpirationTimeMillis();
    }

    public int hashCode()
    {
        com.google.android.apps.youtube.common.fromguava.c.b(false);
        return 0;
    }

    public boolean isEmpty()
    {
        return getImpressionUris().isEmpty();
    }

    public boolean isForecastingAd()
    {
        return videoStreamingData == null && !isVastWrapper() && getSurvey() == null;
    }

    public boolean isOfflineShouldCountPlayback()
    {
        return offlineShouldCountPlayback;
    }

    public boolean isPublicVideo()
    {
        return isPublicVideo;
    }

    public boolean isSkippable()
    {
        return !getSkipPingUris().isEmpty();
    }

    public boolean isVastWrapper()
    {
        return isVastWrapper;
    }

    public boolean shouldAllowAdsFallback()
    {
        return shouldAllowAdsFallback;
    }

    public boolean shouldPingVssOnEngaged()
    {
        return shouldPingVssOnEngaged;
    }

    public boolean shouldPlayAd(com.google.android.apps.youtube.common.e.b b1)
    {
        return !isForecastingAd() && !hasExpired(b1);
    }

    public boolean shouldShowCtaAnnotations()
    {
        return showCtaAnnotations;
    }

    public String toString()
    {
        if (isVastWrapper())
        {
            return (new StringBuilder("VastAd Wrapper: [wrapperUri=")).append(getAdWrapperUri()).append("]").toString();
        } else
        {
            return (new StringBuilder("VastAd: [vastAdId=")).append(getVastAdId()).append(", adVideoId=").append(getAdVideoId()).append(",videoTitle= ").append(getTitle()).append(", vastAdSystem = ").append(getVastAdSystem()).append("]").toString();
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeTypedList(getImpressionUris());
        parcel.writeString(getAdVideoId());
        parcel.writeString(getOriginalVideoId());
        parcel.writeString(getAdBreakId());
        parcel.writeString(getTitle());
        parcel.writeString(adOwnerName);
        parcel.writeParcelable(adOwnerUri, 0);
        parcel.writeString(getVastAdId());
        parcel.writeString(getVastAdSystem());
        parcel.writeString(getBillingPartner().toString());
        parcel.writeString(getAdFormat());
        parcel.writeInt(getDuration());
        parcel.writeParcelable(videoStreamingData, 0);
        parcel.writeParcelable(playbackTracking, 0);
        parcel.writeParcelable(playerConfig, 0);
        parcel.writeParcelable(getClickthroughUri(), 0);
        parcel.writeTypedList(getStartPingUris());
        parcel.writeTypedList(getFirstQuartilePingUris());
        parcel.writeTypedList(getMidpointPingUris());
        parcel.writeTypedList(getThirdQuartilePingUris());
        parcel.writeTypedList(getProgressPings());
        parcel.writeTypedList(getSkipPingUris());
        parcel.writeTypedList(getSkipShownPingUris());
        parcel.writeTypedList(getEngagedViewPingUris());
        parcel.writeTypedList(getCompletePingUris());
        parcel.writeTypedList(getClosePingUris());
        parcel.writeTypedList(getPausePingUris());
        parcel.writeTypedList(getResumePingUris());
        parcel.writeTypedList(getMutePingUris());
        parcel.writeTypedList(getFullscreenPingUris());
        parcel.writeTypedList(getClickTrackingPingUris());
        parcel.writeTypedList(getVideoTitleClickedPingUris());
        parcel.writeTypedList(getErrorPingUris());
        parcel.writeTypedList(getExclusionReasonPingUris());
        parcel.writeParcelable(getVideoAdTrackingTemplateUri(), 0);
        parcel.writeParcelable(getAdSenseBaseConversionUri(), 0);
        if (shouldPingVssOnEngaged())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (shouldAllowAdsFallback())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeLong(getExpirationTimeMillis());
        parcel.writeInt(getAssetFrequencyCap());
        if (isPublicVideo())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (shouldShowCtaAnnotations())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        j.a(parcel, adAnnotations);
        parcel.writeParcelable(adInfoCards, 0);
        parcel.writeLong(getRequestTimeMills());
        if (isOfflineShouldCountPlayback())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (shouldAllowQueuedOfflinePings())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeParcelable(getAdWrapperUri(), 0);
        parcel.writeParcelable(getPrefetchedAd(), 0);
        parcel.writeParcelable(getParentWrapper(), 0);
        offlineWriteAdFormatExclusionReasonList(parcel, getOfflineAdFormatExclusionReasons());
        parcel.writeTypedList(getInfoCards());
        parcel.writeParcelable(getSurvey(), 0);
    }







    private class BillingPartner extends Enum
    {

        private static final BillingPartner $VALUES[];
        public static final BillingPartner ADSENSE;
        public static final BillingPartner DOUBLECLICK;
        public static final BillingPartner FREEWHEEL;
        public static final BillingPartner UNKNOWN;
        public final String partnerId;

        public static BillingPartner valueOf(String s)
        {
            return (BillingPartner)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/VastAd$BillingPartner, s);
        }

        public static BillingPartner[] values()
        {
            return (BillingPartner[])$VALUES.clone();
        }

        static 
        {
            ADSENSE = new BillingPartner("ADSENSE", 0, "2");
            DOUBLECLICK = new BillingPartner("DOUBLECLICK", 1, "1");
            FREEWHEEL = new BillingPartner("FREEWHEEL", 2, "4");
            UNKNOWN = new BillingPartner("UNKNOWN", 3, "0");
            $VALUES = (new BillingPartner[] {
                ADSENSE, DOUBLECLICK, FREEWHEEL, UNKNOWN
            });
        }

        private BillingPartner(String s, int i, String s1)
        {
            super(s, i);
            partnerId = s1;
        }
    }


    private class OfflineAdFormatExclusionReason extends Enum
    {

        private static final OfflineAdFormatExclusionReason $VALUES[];
        public static final OfflineAdFormatExclusionReason REASON_CLIENT_OFFLINE_AD_ASSET_EXPIRED;
        public static final OfflineAdFormatExclusionReason REASON_CLIENT_OFFLINE_AD_ASSET_FREQUENCY_CAP;
        public static final OfflineAdFormatExclusionReason REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY;
        public static final OfflineAdFormatExclusionReason REASON_CLIENT_OFFLINE_INACTIVE_USER;
        public static final OfflineAdFormatExclusionReason REASON_CLIENT_OFFLINE_INSTREAM_FREQUENCY_CAP;
        public final int reasonValue;

        public static OfflineAdFormatExclusionReason valueOf(String s)
        {
            return (OfflineAdFormatExclusionReason)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/VastAd$OfflineAdFormatExclusionReason, s);
        }

        public static OfflineAdFormatExclusionReason[] values()
        {
            return (OfflineAdFormatExclusionReason[])$VALUES.clone();
        }

        public final String toString()
        {
            return String.valueOf(reasonValue);
        }

        static 
        {
            REASON_CLIENT_OFFLINE_INSTREAM_FREQUENCY_CAP = new OfflineAdFormatExclusionReason("REASON_CLIENT_OFFLINE_INSTREAM_FREQUENCY_CAP", 0, 16);
            REASON_CLIENT_OFFLINE_AD_ASSET_FREQUENCY_CAP = new OfflineAdFormatExclusionReason("REASON_CLIENT_OFFLINE_AD_ASSET_FREQUENCY_CAP", 1, 17);
            REASON_CLIENT_OFFLINE_AD_ASSET_EXPIRED = new OfflineAdFormatExclusionReason("REASON_CLIENT_OFFLINE_AD_ASSET_EXPIRED", 2, 18);
            REASON_CLIENT_OFFLINE_INACTIVE_USER = new OfflineAdFormatExclusionReason("REASON_CLIENT_OFFLINE_INACTIVE_USER", 3, 19);
            REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY = new OfflineAdFormatExclusionReason("REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY", 4, 23);
            $VALUES = (new OfflineAdFormatExclusionReason[] {
                REASON_CLIENT_OFFLINE_INSTREAM_FREQUENCY_CAP, REASON_CLIENT_OFFLINE_AD_ASSET_FREQUENCY_CAP, REASON_CLIENT_OFFLINE_AD_ASSET_EXPIRED, REASON_CLIENT_OFFLINE_INACTIVE_USER, REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY
            });
        }

        private OfflineAdFormatExclusionReason(String s, int i, int k)
        {
            super(s, i);
            reasonValue = k;
        }
    }


    private class ProgressPing
        implements Parcelable, a
    {

        public static final android.os.Parcelable.Creator CREATOR = new bc();
        private final boolean isPercentageOffset;
        private final int offset;
        private final Uri pingUri;

        public int describeContents()
        {
            return 0;
        }

        public boolean equals(Object obj)
        {
            if (obj != null && getClass().equals(obj.getClass()))
            {
                obj = (ProgressPing)obj;
                if (getOffset() == ((ProgressPing) (obj)).getOffset() && b.a(Boolean.valueOf(isPercentageOffset()), Boolean.valueOf(((ProgressPing) (obj)).isPercentageOffset())) && b.a(getPingUri(), ((ProgressPing) (obj)).getPingUri()))
                {
                    return true;
                }
            }
            return false;
        }

        public volatile com.google.android.apps.youtube.datalib.legacy.a.b getConverter()
        {
            return getConverter();
        }

        public bd getConverter()
        {
            return new bd(this);
        }

        public int getOffset()
        {
            return offset;
        }

        public Uri getPingUri()
        {
            return pingUri;
        }

        public int getTimeOffsetMilliseconds(int i)
        {
            if (isPercentageOffset())
            {
                return (getOffset() * i * 1000) / 100;
            } else
            {
                return getOffset();
            }
        }

        public boolean isPercentageOffset()
        {
            return isPercentageOffset;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(getOffset());
            if (isPercentageOffset())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            parcel.writeParcelable(getPingUri(), 0);
        }


        public ProgressPing(int i, boolean flag, Uri uri)
        {
            offset = i;
            isPercentageOffset = flag;
            pingUri = uri;
        }
    }


    private class AdFormatSubType extends Enum
    {

        private static final AdFormatSubType $VALUES[];
        public static final AdFormatSubType NONE;
        public static final AdFormatSubType SKIPPABLE;
        public static final AdFormatSubType SURVEY;
        public final String subType;

        public static AdFormatSubType valueOf(String s)
        {
            return (AdFormatSubType)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/VastAd$AdFormatSubType, s);
        }

        public static AdFormatSubType[] values()
        {
            return (AdFormatSubType[])$VALUES.clone();
        }

        static 
        {
            NONE = new AdFormatSubType("NONE", 0, "0");
            SKIPPABLE = new AdFormatSubType("SKIPPABLE", 1, "1");
            SURVEY = new AdFormatSubType("SURVEY", 2, "3");
            $VALUES = (new AdFormatSubType[] {
                NONE, SKIPPABLE, SURVEY
            });
        }

        private AdFormatSubType(String s, int i, String s1)
        {
            super(s, i);
            subType = s1;
        }
    }

}
