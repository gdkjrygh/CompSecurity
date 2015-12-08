// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.branded.background;

import android.net.Uri;
import android.webkit.URLUtil;
import com.google.common.base.Preconditions;
import com.weather.dal2.TwcDataServer;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.ui.Dimension;
import java.util.Locale;

public final class BrandedBackground
{

    private static final String DID = "%%DID%%";
    public static final BrandedBackground EMPTY = new BrandedBackground("", null, "", "");
    public static final String EMPTY_RESPONSE[] = new String[0];
    private static final String SHA = "%%SHA%%";
    private static final String TAG = "BrandedBackgroundEvent";
    private static final String TAG_BEACON = "thirdPartyBeacon:";
    private static final String TAG_CLICK_THRU = "clickthru:";
    private static final String TAG_CREATIVE_ID = "creativeId:";
    private static final String TAG_IMAGE_URL_LG = "imageUrlLg:";
    private static final String TAG_IMAGE_URL_ME = "imageUrlMe:";
    private static final String TAG_IMAGE_URL_SM = "imageUrlSm:";
    private static final String TAG_SURVEY = "thirdPartySurvey:";
    private final String beaconUrl;
    private final String brandedBackgroundUrl = TwcDataServer.getBrandedBackgroundUrl();
    private final String clickThroughUrl;
    private final String creativeId;
    private final String delayedImpressionUrl;
    private final boolean isEmpty;
    private final String largeImageUrl;
    private final String mediumImageUrl;
    private final String smallImageUrl;
    private final String surveyUrl;

    public BrandedBackground(String s, String s1, String s2, String s3)
    {
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(s2);
        isEmpty = s.isEmpty();
        s = parseResponse(s);
        creativeId = getConfig("creativeId:", s, s2, s3);
        clickThroughUrl = getConfig("clickthru:", s, s2, s3);
        smallImageUrl = getConfig("imageUrlSm:", s, s2, s3);
        mediumImageUrl = getConfig("imageUrlMe:", s, s2, s3);
        largeImageUrl = getConfig("imageUrlLg:", s, s2, s3);
        beaconUrl = getConfig("thirdPartyBeacon:", s, s2, s3);
        surveyUrl = getConfig("thirdPartySurvey:", s, s2, s3);
        delayedImpressionUrl = s1;
    }

    private static String getConfig(String s, String as[], String s1, String s2)
    {
        int j = as.length;
        int i = 0;
label0:
        do
        {
label1:
            {
label2:
                {
                    if (i >= j)
                    {
                        break label0;
                    }
                    String s3 = as[i];
                    if (!s3.contains(s))
                    {
                        break label1;
                    }
                    s3 = s3.substring(s3.lastIndexOf(s) + s.length()).trim();
                    if (!s.equals("clickthru:") && !s.equals("thirdPartyBeacon:"))
                    {
                        as = s3;
                        if (!s.equals("thirdPartySurvey:"))
                        {
                            break label2;
                        }
                    }
                    as = s3.replace("%%SHA%%", s1).replace("%%DID%%", s2);
                }
                return as;
            }
            i++;
        } while (true);
        return "";
    }

    private String getImageCutUrlForVariant(String s, Dimension dimension)
    {
        Object obj = null;
        String s1 = obj;
        if (URLUtil.isValidUrl(getLargeImageUrl()))
        {
            String s2 = Uri.parse(getLargeImageUrl()).getQueryParameter("id");
            s1 = obj;
            if (s2 != null)
            {
                s1 = String.format(Locale.US, brandedBackgroundUrl, new Object[] {
                    (new StringBuilder()).append(s2).append(".jpg").toString(), s, Integer.valueOf(dimension.getWidth()), Integer.valueOf(dimension.getHeight()), creativeId
                });
            }
        }
        return s1;
    }

    private static String[] parseResponse(String s)
    {
        LogUtil.d("BrandedBackgroundEvent", LoggingMetaTags.TWC_AD, "http response in string: %s", new Object[] {
            s
        });
        if (s.isEmpty())
        {
            return EMPTY_RESPONSE;
        } else
        {
            return s.split("\n");
        }
    }

    public String getBeaconUrl()
    {
        return beaconUrl;
    }

    public String getClickThroughUrl()
    {
        return clickThroughUrl;
    }

    public String getCreativeId()
    {
        return creativeId;
    }

    public String getDelayedImpression()
    {
        return delayedImpressionUrl;
    }

    public String getImageCutUrl(int i, Dimension dimension)
    {
        String s;
        if (i == 1)
        {
            s = "at";
        } else
        {
            s = "ap";
        }
        return getImageCutUrlForVariant(s, dimension);
    }

    public String getImageCutUrl(Dimension dimension)
    {
        return getImageCutUrlForVariant("ap", dimension);
    }

    public String getLargeImageUrl()
    {
        return largeImageUrl;
    }

    public String getMediumImageUrl()
    {
        return mediumImageUrl;
    }

    public String getSmallImageUrl()
    {
        return smallImageUrl;
    }

    public String getSurveyUrl()
    {
        return surveyUrl;
    }

    public boolean isEmpty()
    {
        return isEmpty;
    }

    public String toString()
    {
        return (new StringBuilder()).append("BrandedBackgroundEvent{brandedBackgroundUrl='").append(brandedBackgroundUrl).append('\'').append(", creativeId='").append(creativeId).append('\'').append(", clickThroughUrl='").append(clickThroughUrl).append('\'').append(", smallImageUrl='").append(smallImageUrl).append('\'').append(", mediumImageUrl='").append(mediumImageUrl).append('\'').append(", largeImageUrl='").append(largeImageUrl).append('\'').append(", beaconUrl='").append(beaconUrl).append('\'').append(", surveyUrl='").append(surveyUrl).append('\'').append(", delayedImpressionUrl='").append(delayedImpressionUrl).append('\'').append(", isEmpty=").append(isEmpty).append('}').toString();
    }

}
