// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.service;

import android.content.Context;
import android.net.Uri;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.GetServiceDataRunnable;
import com.walmart.android.service.HTTPService;
import com.walmart.android.service.HttpRequestExecutor;
import com.walmart.android.service.JsonMapper;
import com.walmart.android.service.MockComponentResolver;
import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceException;
import com.walmartlabs.android.pharmacy.data.CartCheckoutData;
import com.walmartlabs.android.pharmacy.data.CartValidateRefillData;
import com.walmartlabs.android.pharmacy.data.CommunicationData;
import com.walmartlabs.android.pharmacy.data.LinkAccountData;
import com.walmartlabs.android.pharmacy.data.PrescriptionInfo;
import com.walmartlabs.android.pharmacy.data.TransferRxData;
import com.walmartlabs.android.pharmacy.data.ValidateAccountData;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.codehaus.jackson.type.TypeReference;

// Referenced classes of package com.walmartlabs.android.pharmacy.service:
//            PharmacyService, PharmacyServiceSettings, HttpDeleteWithEntity, GuestPickupDetails, 
//            PickupDetails

public class PharmacyServiceImpl
    implements PharmacyService
{
    public static class GetRxJsonRunnable extends GetServiceDataRunnable
    {

        private final JsonMapper mJsonMapper;
        private final TypeReference mTypeReference;

        public Object onServiceDataReceived(ServiceData servicedata)
            throws ServiceException, IOException
        {
            return mJsonMapper.readValue(servicedata.getContent(), mTypeReference);
        }

        public GetRxJsonRunnable(HttpRequestExecutor httprequestexecutor, HttpUriRequest httpurirequest, AsyncCallback asynccallback, TypeReference typereference, JsonMapper jsonmapper)
        {
            super(httprequestexecutor, httpurirequest, asynccallback);
            mTypeReference = typereference;
            mJsonMapper = jsonmapper;
        }
    }


    private final String mBaseUrl;
    private final Context mContext;
    private final ExecutorService mExecutor;
    private final HTTPService mHTTPService;
    private final HttpRequestExecutor mHttpRequestExecutor;
    private final JsonMapper mJsonMapper = new JsonMapper();

    public PharmacyServiceImpl(Context context, ExecutorService executorservice, HttpRequestExecutor httprequestexecutor, PharmacyServiceSettings pharmacyservicesettings)
    {
        mContext = context;
        mBaseUrl = pharmacyservicesettings.getSecureBaseUrl();
        mExecutor = executorservice;
        mHttpRequestExecutor = httprequestexecutor;
        mHTTPService = new HTTPService(pharmacyservicesettings.getBaseUrl(), pharmacyservicesettings.getSecureBaseUrl(), mContext);
        context = new MockComponentResolver() {

            private final Pattern mPattern;
            final PharmacyServiceImpl this$0;

            public String getMethodFromUri(String s)
            {
                s = mPattern.matcher(s);
                if (s.matches() && s.groupCount() > 1)
                {
                    return s.group(2);
                } else
                {
                    return null;
                }
            }

            public String getServiceFromUri(String s)
            {
                s = mPattern.matcher(s);
                if (s.matches() && s.groupCount() > 0)
                {
                    return s.group(1).replaceAll(Uri.encode("/"), "-").replaceAll("/", "-");
                } else
                {
                    return null;
                }
            }

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
                mPattern = Pattern.compile((new StringBuilder()).append("^").append(mBaseUrl).append("(.*)/([^/\\?]*).*$").toString());
            }
        };
        mHttpRequestExecutor.setMockComponentResolver(context);
    }

    private GetServiceDataRunnable createGenericGetJsonRunnable(TypeReference typereference, HttpUriRequest httpurirequest, AsyncCallback asynccallback)
    {
        return new GetRxJsonRunnable(mHttpRequestExecutor, httpurirequest, asynccallback, typereference, mJsonMapper);
    }

    private HttpUriRequest createJsonRequest(String s, String s1, String s2, Object obj)
    {
        Object obj1 = null;
        s2 = Uri.parse(mBaseUrl).buildUpon().path(s1).appendPath(s2);
        if ("PUT".equals(s))
        {
            s1 = new HttpPut(s2.build().toString());
            s1.addHeader("content-type", "application/json");
            if (obj != null)
            {
                try
                {
                    s1.setEntity(new StringEntity(mJsonMapper.writeValueAsString(obj)));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                }
            }
        } else
        {
            if ("POST".equals(s))
            {
                s = new HttpPost(s2.build().toString());
                s.addHeader("content-type", "application/json");
                try
                {
                    s.setEntity(new StringEntity(mJsonMapper.writeValueAsString(obj)));
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1.printStackTrace();
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1.printStackTrace();
                }
                return s;
            }
            s1 = obj1;
            if ("DELETE".equals(s))
            {
                if (obj != null)
                {
                    s = new HttpDeleteWithEntity(s2.build().toString());
                    s.addHeader("content-type", "application/json");
                    if (obj != null)
                    {
                        try
                        {
                            s.setEntity(new StringEntity(mJsonMapper.writeValueAsString(obj)));
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s1)
                        {
                            s1.printStackTrace();
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s1)
                        {
                            s1.printStackTrace();
                        }
                    }
                    return s;
                } else
                {
                    return new HttpDelete(s2.build().toString());
                }
            }
        }
        return s1;
    }

    public void addRefillToCart(int i, int j, AsyncCallback asynccallback)
    {
        Object obj = new PrescriptionInfo();
        obj.rxNumber = i;
        obj.storeNumber = j;
        obj = createJsonRequest("POST", "pharmacy/cart", "refill", obj);
        asynccallback = createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, ((HttpUriRequest) (obj)), asynccallback);
        mExecutor.execute(asynccallback);
    }

    public void deleteCart(AsyncCallback asynccallback)
    {
        HttpUriRequest httpurirequest = createJsonRequest("DELETE", "pharmacy/", "cart", null);
        mExecutor.execute(createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, httpurirequest, asynccallback));
    }

    public void deleteRefillFromCart(int i, int j, AsyncCallback asynccallback)
    {
        Object obj = new PrescriptionInfo();
        obj.rxNumber = i;
        obj.storeNumber = j;
        obj = createJsonRequest("DELETE", "pharmacy/cart", "refill", obj);
        asynccallback = createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, ((HttpUriRequest) (obj)), asynccallback);
        mExecutor.execute(asynccallback);
    }

    public void getAccountProfile(AsyncCallback asynccallback)
    {
        HttpUriRequest httpurirequest = mHTTPService.createSecureHttpGetRequest("pharmacy/account/", "profile", null);
        asynccallback = createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, httpurirequest, asynccallback);
        mExecutor.execute(asynccallback);
    }

    public void getCart(AsyncCallback asynccallback)
    {
        HttpUriRequest httpurirequest = mHTTPService.createSecureHttpGetRequest("pharmacy/", "cart", null);
        asynccallback = createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, httpurirequest, asynccallback);
        mExecutor.execute(asynccallback);
    }

    public void getKillSwitchStatus(AsyncCallback asynccallback)
    {
        HttpUriRequest httpurirequest = mHTTPService.createSecureHttpGetRequest("pharmacy/", "kill-switch", null);
        asynccallback = createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, httpurirequest, asynccallback);
        mExecutor.execute(asynccallback);
    }

    public void getPickupTimes(int i, AsyncCallback asynccallback)
    {
        Object obj = new HashMap();
        ((Map) (obj)).put("store-number", String.valueOf(i));
        obj = mHTTPService.createSecureHttpGetRequest("pharmacy/store/", "pick-up-date-time", ((Map) (obj)));
        asynccallback = createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, ((HttpUriRequest) (obj)), asynccallback);
        mExecutor.execute(asynccallback);
    }

    public void getPrescriptions(String s, String s1, AsyncCallback asynccallback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("sort", s);
        hashmap.put("filter", s1);
        s = mHTTPService.createSecureHttpGetRequest("pharmacy/", "prescriptions", hashmap);
        s = createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, s, asynccallback);
        mExecutor.execute(s);
    }

    public void getRefillDetails(int i, int j, AsyncCallback asynccallback)
    {
        Object obj = new HashMap();
        ((Map) (obj)).put("refill-id", String.valueOf(i));
        ((Map) (obj)).put("store-number", String.valueOf(j));
        obj = mHTTPService.createSecureHttpGetRequest("pharmacy/refill-history/", "refill", ((Map) (obj)));
        asynccallback = createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, ((HttpUriRequest) (obj)), asynccallback);
        mExecutor.execute(asynccallback);
    }

    public void getRefillHistory(String s, String s1, AsyncCallback asynccallback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("sort", String.valueOf(s));
        hashmap.put("filter", s1);
        s = mHTTPService.createSecureHttpGetRequest("pharmacy/", "refill-history", hashmap);
        s = createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, s, asynccallback);
        mExecutor.execute(s);
    }

    public void hasRxEnabledAccount(AsyncCallback asynccallback)
    {
        HttpUriRequest httpurirequest = mHTTPService.createSecureHttpGetRequest("pharmacy/account/", "rx-enabled", null);
        asynccallback = createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, httpurirequest, asynccallback);
        mExecutor.execute(asynccallback);
    }

    public void linkAccount(LinkAccountData linkaccountdata, AsyncCallback asynccallback)
    {
        linkaccountdata = createJsonRequest("POST", "pharmacy/account", "link", linkaccountdata);
        linkaccountdata = createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, linkaccountdata, asynccallback);
        mExecutor.execute(linkaccountdata);
    }

    public void logout(AsyncCallback asynccallback)
    {
        HttpUriRequest httpurirequest = createJsonRequest("PUT", "pharmacy/session", "logout", null);
        mExecutor.execute(createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, httpurirequest, asynccallback));
    }

    public void setGuestPickupDetails(int i, int j, String s, String s1, AsyncCallback asynccallback)
    {
        GuestPickupDetails guestpickupdetails = new GuestPickupDetails();
        guestpickupdetails.rxNumber = i;
        guestpickupdetails.storeNumber = j;
        guestpickupdetails.pickupDetails.pickupDate = s;
        guestpickupdetails.pickupDetails.pickupTime = s1;
        s = createJsonRequest("POST", "pharmacy/cart", "pickup-details", guestpickupdetails);
        s = createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, s, asynccallback);
        mExecutor.execute(s);
    }

    public void setPickupDetails(int i, String s, String s1, AsyncCallback asynccallback)
    {
        PickupDetails pickupdetails = new PickupDetails();
        pickupdetails.pickupDate = s;
        pickupdetails.pickupTime = s1;
        pickupdetails.pickupStore = i;
        s = createJsonRequest("PUT", "pharmacy/cart", "pickup-details", pickupdetails);
        s = createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, s, asynccallback);
        mExecutor.execute(s);
    }

    public void submitCart(CartCheckoutData cartcheckoutdata, AsyncCallback asynccallback)
    {
        cartcheckoutdata = createJsonRequest("PUT", "pharmacy/cart", "checkout", cartcheckoutdata);
        mExecutor.execute(createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, cartcheckoutdata, asynccallback));
    }

    public void transferRxExternal(TransferRxData transferrxdata, AsyncCallback asynccallback)
    {
        transferrxdata = createJsonRequest("POST", "pharmacy/prescriptions", "external-transfer", transferrxdata);
        transferrxdata = createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, transferrxdata, asynccallback);
        mExecutor.execute(transferrxdata);
    }

    public void updateAccountProfile(com.walmartlabs.android.pharmacy.data.ProfileData.Communication communication, AsyncCallback asynccallback)
    {
        communication = createJsonRequest("PUT", "pharmacy/account", "profile", new CommunicationData(communication));
        mExecutor.execute(createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, communication, asynccallback));
    }

    public void validateAccount(ValidateAccountData validateaccountdata, AsyncCallback asynccallback)
    {
        validateaccountdata = createJsonRequest("PUT", "pharmacy/account", "validate", validateaccountdata);
        mExecutor.execute(createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, validateaccountdata, asynccallback));
    }

    public void validateRefillInCart(int i, int j, String s, AsyncCallback asynccallback)
    {
        CartValidateRefillData cartvalidaterefilldata = new CartValidateRefillData();
        cartvalidaterefilldata.rxNumber = i;
        cartvalidaterefilldata.storeNumber = j;
        cartvalidaterefilldata.dob = s;
        s = createJsonRequest("PUT", "pharmacy/cart/refill/", "validate", cartvalidaterefilldata);
        s = createGenericGetJsonRunnable(new TypeReference() {

            final PharmacyServiceImpl this$0;

            
            {
                this$0 = PharmacyServiceImpl.this;
                super();
            }
        }, s, asynccallback);
        mExecutor.execute(s);
    }

}
