// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.net.Uri;
import android.util.Patterns;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.walmart.android.util:
//            TextUtils

public class WalmartUri
{
    private static class TypePattern
    {

        public Pattern pattern;
        public int type;

        public TypePattern(int i, Pattern pattern1)
        {
            pattern = pattern1;
            type = i;
        }
    }


    public static final int PARAM_BROWSE_TOKEN = 0;
    public static final int PARAM_FAST_PICKUP_STORE_NUMBER = 0;
    public static final int PARAM_LOCAL_AD_PROMOTION = 0;
    public static final int PARAM_LOCATE_MAP_ID = 0;
    public static final int PARAM_LOCATE_STORE_ID = 0;
    public static final int PARAM_PRODUCT_DETAILS_DEST = 0;
    public static final int PARAM_PRODUCT_DETAILS_ID = 1;
    public static final int PARAM_PRODUCT_DETAILS_SRC = 2;
    public static final int PARAM_SAVER_BLUEBIRD_LINK_RESULT = 0;
    public static final int PARAM_SAVER_BLUEBIRD_LINK_RESULT_TEXT = 1;
    public static final int PARAM_SAVER_TC_NBR = 0;
    public static final int PARAM_SEARCH_DEPARTMENT_DEPARTMENT = 0;
    public static final int PARAM_SEARCH_DEPARTMENT_QUERY = 1;
    public static final int PARAM_SEARCH_QUERY = 0;
    public static final int PARAM_SHELF_ID = 0;
    public static final int PARAM_WEBVIEW_URL = 0;
    public static final int PARAM_WEEKLY_ADS_FLYER_ID = 1;
    public static final int PARAM_WEEKLY_ADS_FLYER_TYPE = 0;
    public static final int PARAM_WEEKLY_ADS_PREVIEW_CODE = 0;
    public static final String ROLLBACKS = "walmart://rollbacks";
    public static final int TYPE_BROWSE = 2;
    public static final int TYPE_CLEARANCE = 4;
    public static final int TYPE_ERECEIPT = 16;
    public static final int TYPE_FAST_PICKUP = 21;
    public static final int TYPE_HOME = 20;
    public static final int TYPE_LOCAL_AD = 3;
    public static final int TYPE_LOCATE_MAP = 10;
    public static final int TYPE_LOCATE_STORE = 8;
    public static final int TYPE_LOCATE_STORE_ID = 9;
    public static final int TYPE_PRODUCT_DETAILS = 7;
    public static final int TYPE_ROLLBACKS = 5;
    public static final int TYPE_SAVER = 17;
    public static final int TYPE_SAVER_BLUEBIRD = 18;
    public static final int TYPE_SEARCH = 0;
    public static final int TYPE_SEARCH_DEPARTMENT = 1;
    public static final int TYPE_SHELF = 6;
    public static final int TYPE_SHOP = 22;
    public static final int TYPE_SHOWCASE = 28;
    public static final int TYPE_STORE_MAP = 11;
    public static final int TYPE_STORIES = 12;
    public static final int TYPE_URL = 14;
    public static final int TYPE_WALMART_PAY = 25;
    public static final int TYPE_WALMART_PAY_ENABLE = 26;
    public static final int TYPE_WEBVIEW = 19;
    public static final int TYPE_WEEKLY_ADS = 23;
    public static final int TYPE_WEEKLY_ADS_PREVIEW = 24;
    public static final int TYPE_WISHLIST = 27;
    private static final String URL_START_REG = "(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))";
    private static final TypePattern sTypePatterns[];
    private String mOriginalUri;
    private String mParams[];
    private int mType;

    private WalmartUri(int i, String as[], String s)
    {
        mType = i;
        mParams = as;
        mOriginalUri = s;
    }

    private static WalmartUri createFromMatcher(Matcher matcher, int i, String s)
    {
        String as[] = new String[matcher.groupCount()];
        for (int j = 0; j < as.length; j++)
        {
            as[j] = TextUtils.urlDecode(matcher.group(j + 1));
        }

        return new WalmartUri(i, as, s);
    }

    public static WalmartUri parse(Uri uri)
    {
        if (uri != null)
        {
            return parse(uri.toString());
        } else
        {
            return null;
        }
    }

    public static WalmartUri parse(String s)
    {
        TypePattern atypepattern[] = sTypePatterns;
        int j = atypepattern.length;
        for (int i = 0; i < j; i++)
        {
            TypePattern typepattern = atypepattern[i];
            Matcher matcher = typepattern.pattern.matcher(s);
            if (matcher.matches())
            {
                return createFromMatcher(matcher, typepattern.type, s);
            }
        }

        return null;
    }

    public String getOriginalUri()
    {
        return mOriginalUri;
    }

    public String getParam(int i)
    {
        if (i < mParams.length)
        {
            return mParams[i];
        } else
        {
            return null;
        }
    }

    public String[] getParams()
    {
        return mParams;
    }

    public int getType()
    {
        return mType;
    }

    static 
    {
        sTypePatterns = (new TypePattern[] {
            new TypePattern(0, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))search/([^?]+)(?:[?]{1}.*)?$")), new TypePattern(1, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))search-department/([^/?]+)/([^?]+)(?:[?]{1}.*)?$")), new TypePattern(2, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))browse/([^?]+)(?:[?]{1}.*)?$")), new TypePattern(3, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))local-ad/?$")), new TypePattern(3, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))local-ad/promotion/?$")), new TypePattern(3, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))local-ad/promotion/([^?]+)(?:[?]{1}.*)?$")), new TypePattern(23, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))weeklyads/?(?:[?]{1}.*)?$")), new TypePattern(23, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))weeklyads/([^/?]+)/([^/?]+)/?(?:[?]{1}.*)?$")), new TypePattern(24, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))weeklyads-preview/([^/?]+)/?(?:[?]{1}.*)?$")), new TypePattern(4, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))clearance(?:[?]{1}.*)?$")), 
            new TypePattern(5, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))rollbacks(?:[?]{1}.*)?$")), new TypePattern(28, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))showcase(?:[?]{1}.*)?$")), new TypePattern(6, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))shelf/([^?]+)(?:[?]{1}.*)?$")), new TypePattern(7, Pattern.compile("^((?:walmart://|(?:https?://(?:[^/]+).walmart.com/))ip/(?:.+/)?([^/?#]+))(?:[?]{1}(?:src=([^&#]+)&?|[^&#]+&?)+)?(?:[#]{1}.*)?$")), new TypePattern(8, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))location/locate(?:[?]{1}.*)?$")), new TypePattern(11, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))location/store-map(?:[?]{1}.*)?$")), new TypePattern(9, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))location/([^/?]+)(?:[?]{1}.*)?$")), new TypePattern(10, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))location/([^/?]+)/map(?:[?]{1}.*)?$")), new TypePattern(12, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))stories(?:[?]{1}.*)?$")), new TypePattern(19, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))webview/([^?]+)(?:[?]{1}.*)?$")), 
            new TypePattern(16, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))ereceipts(?:[?].*)?$")), new TypePattern(18, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))savingscatcher/bluebird/linking/([^?#]+)(?:[?](?:reasonText=([^&#]+)&?|[^&#]+&?)+)?(?:[#]{1}.*)?$")), new TypePattern(17, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))savingscatcher(?:/([^?]+))?(?:[?].*)?$")), new TypePattern(20, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))home(?:[?]{1}.*)?$")), new TypePattern(21, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))checkin/(?:([^?]+))?(?:[?].*)?$")), new TypePattern(22, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))shop/?$")), new TypePattern(27, Pattern.compile("^https?://(?:[^/])+.walmart.com/lists/view-wish-list-items[?](?:[^#&]+&)*(id=[^#&]+)(?:&.*)?$")), new TypePattern(25, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))walmartpay/transaction/(([^?]+))(?:[?].*)?$")), new TypePattern(26, Pattern.compile("^(?:walmart://|(?:https?://(?:[^/]+).walmart.com/))walmartpay/enable([/?]+.*)?$")), new TypePattern(14, Patterns.WEB_URL)
        });
    }
}
