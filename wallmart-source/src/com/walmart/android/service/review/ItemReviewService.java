// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.review;

import com.walmart.android.data.ReviewFeedbackResult;
import com.walmart.android.data.ReviewResult;
import com.walmart.android.service.JacksonConverter;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.RequestBuilder;
import com.walmartlabs.kangaroo.service.Service;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import java.util.Locale;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.service.review:
//            ReviewSort, FeedbackHelpfulness

public class ItemReviewService
{

    static final String BASE_PATH = "/data";
    static final String PARAM_NAME_CONTENT_ID = "ContentId";
    static final String PARAM_NAME_CONTENT_TYPE = "ContentType";
    static final String PARAM_NAME_FEEDBACK_TYPE = "FeedbackType";
    static final String PARAM_NAME_FILTER = "Filter";
    static final String PARAM_NAME_INCLUDE = "Include";
    static final String PARAM_NAME_LIMIT = "limit";
    static final String PARAM_NAME_OFFSET = "offset";
    static final String PARAM_NAME_SORT = "sort";
    static final String PARAM_NAME_STATS = "Stats";
    static final String PARAM_NAME_USER_ID = "UserId";
    static final String PARAM_NAME_VOTE = "Vote";
    static final String PARAM_VALUE_HELPFULNESS = "helpfulness";
    static final String PARAM_VALUE_INAPPROPRIATE = "inappropriate";
    static final String PARAM_VALUE_PRODUCTS = "Products";
    static final String PARAM_VALUE_REVIEW = "review";
    static final String PARAM_VALUE_REVIEWS = "Reviews";
    static final String PATH_REVIEWS = "reviews.json";
    static final String PATH_SUBMITFEEDBACK = "submitfeedback.json";
    private final Service mService;

    public ItemReviewService(String s, ObjectMapper objectmapper, Log log)
    {
        mService = (new com.walmartlabs.kangaroo.service.Service.Builder()).host(s).secure(true).path("/data").query("apiversion", "5.4").query("passkey", "7jk6laxlwtwkntx8zhygtxw4g").okHttpClient(SharedHttpClient.get()).converter(new JacksonConverter(objectmapper)).log(log).build();
    }

    private static String formatProductIdFilter(String s)
    {
        return String.format(Locale.US, "ProductId:%s", new Object[] {
            s
        });
    }

    private RequestBuilder newFeedbackRequest(String s, String s1, String s2)
    {
        return mService.newRequest().appendPath("submitfeedback.json").query("ContentType", "review").query("ContentId", s1).query("UserId", s).query("FeedbackType", s2);
    }

    public Request getReviewsForItem(String s, ReviewSort reviewsort, int i, int j)
    {
        return mService.newRequest().appendPath("reviews.json").query("Include", "Products").query("Stats", "Reviews").query("sort", reviewsort.value()).query("limit", Integer.toString(j)).query("offset", Integer.toString(i)).query("Filter", formatProductIdFilter(s)).get(com/walmart/android/data/ReviewResult);
    }

    public Request submitInappropriateReview(String s, String s1)
    {
        return newFeedbackRequest(s, s1, "inappropriate").post(com/walmart/android/data/ReviewFeedbackResult);
    }

    public Request submitReviewHelpfulnessVote(String s, String s1, FeedbackHelpfulness feedbackhelpfulness)
    {
        return newFeedbackRequest(s, s1, "helpfulness").query("Vote", feedbackhelpfulness.value()).post(com/walmart/android/data/ReviewFeedbackResult);
    }
}
