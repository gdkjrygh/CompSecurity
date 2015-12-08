// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.review;

import com.walmartlabs.mockaroo.base.Mockaroo;
import com.walmartlabs.mockaroo.base.RequestMatch;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.walmart.android.service.review:
//            ReviewSort, FeedbackHelpfulness

public class Mock
{

    private static final HashMap ALL_REVIEWS_FIRST_PAGE_QUERY_PARAMETERS = new HashMap() {

            
            {
                put("sort", ReviewSort.HELPFULNESS_HIGHEST_FIRST.value());
                put("limit", "50");
                put("offset", "0");
            }
    };
    private static final HashMap ALL_REVIEWS_LAST_PAGE_QUERY_PARAMETERS = new HashMap() {

            
            {
                put("sort", ReviewSort.HELPFULNESS_HIGHEST_FIRST.value());
                put("limit", "50");
                put("offset", "50");
            }
    };
    private static final HashMap ITEM_PAGE_QUERY_PARAMETERS = new HashMap() {

            
            {
                put("sort", ReviewSort.SUBMISSIONTIME_NEWEST_FIRST.value());
                put("limit", "1");
                put("offset", "0");
            }
    };
    private static final HashMap SUBMIT_HELPFULNESS_NEGATIVE_PARAMETERS = new HashMap() {

            
            {
                put("FeedbackType", "helpfulness");
                put("Vote", FeedbackHelpfulness.NEGATIVE.value());
            }
    };
    private static final HashMap SUBMIT_HELPFULNESS_POSITIVE_PARAMETERS = new HashMap() {

            
            {
                put("FeedbackType", "helpfulness");
                put("Vote", FeedbackHelpfulness.POSITIVE.value());
            }
    };
    private static final HashMap SUBMIT_INAPPROPRIATE_PARAMETERS = new HashMap() {

            
            {
                put("FeedbackType", "inappropriate");
            }
    };

    public Mock()
    {
    }

    public static void registerMocks(String s)
    {
        registerReviewsMock("valid (item details)", ITEM_PAGE_QUERY_PARAMETERS, s, "mock/item_reviews/item_details_25059351");
        registerReviewsMock("no reviews (item details)", ITEM_PAGE_QUERY_PARAMETERS, s, "mock/item_reviews/item_details_no_reviews");
        registerReviewsMock("valid (reviews, first page, default sort)", ALL_REVIEWS_FIRST_PAGE_QUERY_PARAMETERS, s, "mock/item_reviews/default_25059351_page1");
        registerReviewsMock("valid (reviews, last page, default sort)", ALL_REVIEWS_LAST_PAGE_QUERY_PARAMETERS, s, "mock/item_reviews/default_25059351_page2");
        registerSubmitFeedbackMock("positive (success)", SUBMIT_HELPFULNESS_POSITIVE_PARAMETERS, s, "mock/item_reviews/submit_positive_anonymous");
        registerSubmitFeedbackMock("positive (error dupe)", SUBMIT_HELPFULNESS_POSITIVE_PARAMETERS, s, "mock/item_reviews/submit_positive_anonymous_duplicate");
        registerSubmitFeedbackMock("negative (success)", SUBMIT_HELPFULNESS_NEGATIVE_PARAMETERS, s, "mock/item_reviews/submit_negative_anonymous");
        registerSubmitFeedbackMock("inappropriate (success)", SUBMIT_INAPPROPRIATE_PARAMETERS, s, "mock/item_reviews/submit_inappropriate");
        registerSubmitFeedbackMock("inappropriate (error dupe)", SUBMIT_INAPPROPRIATE_PARAMETERS, s, "mock/item_reviews/submit_inappropriate_duplicate");
    }

    private static void registerReviewsMock(String s, Map map, String s1, String s2)
    {
        Mockaroo.registerMockFromCompleteResponseFile(s, new RequestMatch(s1, String.format(Locale.US, "%s/%s", new Object[] {
            "/data", "reviews.json"
        }), "GET", map), s2);
    }

    private static void registerSubmitFeedbackMock(String s, Map map, String s1, String s2)
    {
        Mockaroo.registerMockFromCompleteResponseFile(s, new RequestMatch(s1, String.format(Locale.US, "%s/%s", new Object[] {
            "/data", "submitfeedback.json"
        }), "POST", map), s2);
    }

}
