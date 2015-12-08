// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.net.Uri;
import android.text.TextUtils;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.GetServiceDataRunnable;
import com.walmart.android.service.HttpRequestExecutor;
import com.walmart.android.service.JsonMapper;
import com.walmart.android.service.MockComponentResolver;
import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceException;
import com.walmart.android.utils.HttpUtils;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.cookie.BestMatchSpec;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverService, StatusResponse, CompetitorsResponse, SaverReceiptResponse, 
//            ReceiptsSummaryResponse, RecommendationRequest, AddRequest, FeedbackRequest, 
//            RedeemRequest, RegisterRequest, RecommendationResponse

public class SaverServiceImpl
    implements SaverService
{

    private static final String TAG = com/walmart/android/service/saver/SaverServiceImpl.getSimpleName();
    private String mBaseUrlSecure;
    private final ExecutorService mExecutor;
    private final HttpRequestExecutor mHttpRequestExecutor;
    private final JsonMapper mJsonMapper = new JsonMapper();

    public SaverServiceImpl(String s, ExecutorService executorservice, HttpRequestExecutor httprequestexecutor)
    {
        WLog.i(TAG, (new StringBuilder()).append("Created new SaverServiceImpl instance: mBaseUrlSecure:").append(mBaseUrlSecure).toString());
        mExecutor = executorservice;
        mBaseUrlSecure = s;
        mHttpRequestExecutor = httprequestexecutor;
        s = new MockComponentResolver() {

            final SaverServiceImpl this$0;

            public String getMethodFromUri(String s1)
            {
                int k = s1.lastIndexOf("/");
                if (k != -1)
                {
                    int j = s1.indexOf("?", k);
                    int i = j;
                    if (j == -1)
                    {
                        i = s1.length();
                    }
                    return s1.substring(k + 1, i);
                } else
                {
                    return null;
                }
            }

            public String getServiceFromUri(String s1)
            {
                return "saver";
            }

            
            {
                this$0 = SaverServiceImpl.this;
                super();
            }
        };
        mHttpRequestExecutor.addMockComponentResolver(s);
    }

    private void doPostJsonRequest(String s, Object obj, Class class1, AsyncCallback asynccallback)
    {
        String s1 = "";
        try
        {
            obj = mJsonMapper.writeValueAsString(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            WLog.e(TAG, "Failed to write json body", ((Throwable) (obj)));
            obj = s1;
        }
        s = HttpUtils.createPostRequest((new StringBuilder()).append(mBaseUrlSecure).append("/sc/v3").append(s).toString(), ((String) (obj)));
        s.setHeader(new BasicHeader("Content-Type", "application/json"));
        execute(s, class1, asynccallback);
    }

    private void execute(HttpUriRequest httpurirequest, Class class1, AsyncCallback asynccallback)
    {
        mExecutor.execute(new GetServiceDataRunnable(asynccallback, class1, httpurirequest) {

            final SaverServiceImpl this$0;
            final HttpUriRequest val$request;
            final Class val$responseType;

            public StatusResponse onServiceDataReceived(ServiceData servicedata)
                throws IOException
            {
                StatusResponse statusresponse = (StatusResponse)mJsonMapper.readValue(servicedata.getContent(), responseType);
                if (statusresponse != null && !TextUtils.isEmpty(statusresponse.error) && statusresponse.statusCode > 0)
                {
                    setErrorCode(statusresponse.statusCode);
                }
                if (statusresponse != null && statusresponse.statusCode == 401 || servicedata.getHttpStatusCode() == 401)
                {
                    servicedata = Services.get().getAuthentication();
                    String s = (new StringBuilder()).append("We are unauthorized when calling ").append(request.getURI()).toString();
                    s = (new StringBuilder()).append(s).append(", ").append((System.currentTimeMillis() - servicedata.getLastSessionRenewal()) / 1000L).append("s since last session renewal").toString();
                    WLog.e(SaverServiceImpl.TAG, s, new Exception());
                    servicedata.clearLastLoginTime();
                }
                return statusresponse;
            }

            public volatile Object onServiceDataReceived(ServiceData servicedata)
                throws ServiceException, IOException
            {
                return onServiceDataReceived(servicedata);
            }

            
            {
                this$0 = SaverServiceImpl.this;
                responseType = class1;
                request = httpurirequest1;
                super(final_httprequestexecutor, final_httpurirequest, asynccallback);
            }
        });
    }

    private HashMap getCookieMap(String s)
    {
        BestMatchSpec bestmatchspec = new BestMatchSpec();
        s = Uri.parse(s);
        s = new CookieOrigin(s.getHost(), 0, s.getPath(), "https".equalsIgnoreCase(s.getScheme()));
        HashMap hashmap = new HashMap();
        Iterator iterator = getCookies().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Cookie cookie = (Cookie)iterator.next();
            if (bestmatchspec.match(cookie, s))
            {
                hashmap.put(cookie.getName(), cookie.getValue());
            }
        } while (true);
        return hashmap;
    }

    private List getCookies()
    {
        CookieStore cookiestore;
        cookiestore = ((AbstractHttpClient)mHttpRequestExecutor.getHttpClient()).getCookieStore();
        if (cookiestore == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        cookiestore;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList(cookiestore.getCookies());
        cookiestore;
        JVM INSTR monitorexit ;
        return Collections.unmodifiableList(arraylist);
        Exception exception;
        exception;
        cookiestore;
        JVM INSTR monitorexit ;
        throw exception;
        return Collections.emptyList();
    }

    private void postRecommendationRequest(String s, RecommendationRequest recommendationrequest, AsyncCallback asynccallback)
    {
        String s1 = "";
        try
        {
            recommendationrequest = mJsonMapper.writeValueAsString(recommendationrequest);
        }
        // Misplaced declaration of an exception variable
        catch (RecommendationRequest recommendationrequest)
        {
            WLog.e(TAG, "Failed to write json body", recommendationrequest);
            recommendationrequest = s1;
        }
        s = HttpUtils.createPostRequest(s, recommendationrequest);
        s.setHeader(new BasicHeader("Content-Type", "application/json"));
        mExecutor.execute(new GetServiceDataRunnable(mHttpRequestExecutor, s, asynccallback) {

            final SaverServiceImpl this$0;

            public RecommendationResponse onServiceDataReceived(ServiceData servicedata)
                throws IOException
            {
                servicedata = (RecommendationResponse)mJsonMapper.readValue(servicedata.getContent(), com/walmart/android/service/saver/RecommendationResponse);
                if (servicedata != null && !"OK".equals(((RecommendationResponse) (servicedata)).status))
                {
                    setErrorCode(0x15f91);
                }
                return servicedata;
            }

            public volatile Object onServiceDataReceived(ServiceData servicedata)
                throws ServiceException, IOException
            {
                return onServiceDataReceived(servicedata);
            }

            
            {
                this$0 = SaverServiceImpl.this;
                super(httprequestexecutor, httpurirequest, asynccallback);
            }
        });
    }

    public void addReceipt(AddRequest addrequest, AsyncCallback asynccallback)
    {
        doPostJsonRequest("/addReceipt.json", addrequest, com/walmart/android/service/saver/StatusResponse, asynccallback);
    }

    public void findNearbyCompetitors(String s, AsyncCallback asynccallback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("storeNumber", s);
        execute(HttpUtils.createGetRequest((new StringBuilder()).append(mBaseUrlSecure).append("/sc/v3").append("/findNearByCompetitors.json").toString(), hashmap), com/walmart/android/service/saver/CompetitorsResponse, asynccallback);
    }

    public void getReceipt(String s, String s1, AsyncCallback asynccallback)
    {
        s = String.format("/dashboard/receipt/%1$s.json", new Object[] {
            s
        });
        execute(HttpUtils.createGetRequest((new StringBuilder()).append(mBaseUrlSecure).append("/sc/v3").append(s).toString(), new String[] {
            "cacheId"
        }, new String[] {
            s1
        }), com/walmart/android/service/saver/SaverReceiptResponse, asynccallback);
    }

    public void getReceiptsSummary(AsyncCallback asynccallback)
    {
        execute(HttpUtils.createGetRequest((new StringBuilder()).append(mBaseUrlSecure).append("/sc/v3").append("/dashboard.json").toString(), null), com/walmart/android/service/saver/ReceiptsSummaryResponse, asynccallback);
    }

    public void getRecommendations(String s, AsyncCallback asynccallback)
    {
        s = new RecommendationRequest(s);
        ((RecommendationRequest) (s)).userClientInfo.userAgent = (String)mHttpRequestExecutor.getHttpClient().getParams().getParameter("http.useragent");
        ((RecommendationRequest) (s)).userReqInfo.cookieMap = getCookieMap(mBaseUrlSecure);
        postRecommendationRequest((new StringBuilder()).append(mBaseUrlSecure).append("/athena/irs-ws/hop/1.0/mobileContent").toString(), s, asynccallback);
    }

    public void postFeedback(FeedbackRequest feedbackrequest, AsyncCallback asynccallback)
    {
        doPostJsonRequest("/feedback.json", feedbackrequest, com/walmart/android/service/saver/StatusResponse, asynccallback);
    }

    public void redeem(RedeemRequest redeemrequest, AsyncCallback asynccallback)
    {
        WLog.i(TAG, "SaverService.redeem()");
        doPostJsonRequest("/user/redeemCredit.json", redeemrequest, com/walmart/android/service/saver/StatusResponse, asynccallback);
    }

    public void register(RegisterRequest registerrequest, AsyncCallback asynccallback)
    {
        WLog.i(TAG, "SaverService.register()");
        doPostJsonRequest("/user/register.json", registerrequest, com/walmart/android/service/saver/StatusResponse, asynccallback);
    }



}
