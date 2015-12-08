// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.braintreepayments.api.exceptions.ConfigurationException;
import com.braintreepayments.api.models.ClientToken;
import com.braintreepayments.api.models.Configuration;
import com.braintreepayments.api.models.PayPalAccountBuilder;
import com.braintreepayments.api.models.PayPalConfiguration;
import com.braintreepayments.api.models.PayPalPaymentResource;
import com.paypal.android.sdk.onetouch.core.AuthorizationRequest;
import com.paypal.android.sdk.onetouch.core.BrowserSwitchAdapter;
import com.paypal.android.sdk.onetouch.core.CheckoutRequest;
import com.paypal.android.sdk.onetouch.core.PayPalOneTouchCore;
import com.paypal.android.sdk.onetouch.core.PerformRequestStatus;
import com.paypal.android.sdk.onetouch.core.Request;
import com.paypal.android.sdk.onetouch.core.Result;
import com.paypal.android.sdk.onetouch.core.ResultType;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class PayPal
{

    private static final String PAYLOAD_KEY_CLIENT_TOKEN = "client_token";
    public static final String SCOPE_ADDRESS = "address";
    public static final String SCOPE_EMAIL = "email";
    public static final String SCOPE_FUTURE_PAYMENTS = "https://uri.paypal.com/services/payments/futurepayments";
    protected static boolean sEnableSignatureVerification = true;
    private static Request sPendingRequest;
    private static PerformRequestStatus sPendingRequestStatus;

    private PayPal()
    {
        throw new IllegalStateException("Non-instantiable class.");
    }

    protected static AuthorizationRequest buildPayPalAuthorizationConfiguration(Context context, Configuration configuration, ClientToken clienttoken)
        throws ConfigurationException
    {
        PayPalConfiguration paypalconfiguration = configuration.getPayPal();
        validatePayPalConfiguration(configuration);
        return ((AuthorizationRequest)populateCommonData(new AuthorizationRequest(context), context, configuration)).privacyUrl(paypalconfiguration.getPrivacyUrl()).userAgreementUrl(paypalconfiguration.getUserAgreementUrl()).withScopeValue("https://uri.paypal.com/services/payments/futurepayments").withScopeValue("email").withAdditionalPayloadAttribute("client_token", clienttoken.getClientTokenString());
    }

    protected static CheckoutRequest buildPayPalCheckoutConfiguration(String s, Context context, Configuration configuration)
        throws ConfigurationException
    {
        validatePayPalConfiguration(configuration);
        String s1 = null;
        if (s != null)
        {
            s1 = Uri.parse(s).getQueryParameter("token");
        }
        return ((CheckoutRequest)populateCommonData(new CheckoutRequest(), context, configuration)).pairingId(s1).approvalURL(s);
    }

    protected static PerformRequestStatus checkoutWithPayPal(PayPalPaymentResource paypalpaymentresource, Activity activity, int i, Configuration configuration)
        throws ConfigurationException
    {
        sPendingRequest = buildPayPalCheckoutConfiguration(paypalpaymentresource.getRedirectUrl(), activity, configuration);
        sPendingRequestStatus = PayPalOneTouchCore.performRequest(activity, sPendingRequest, i, sEnableSignatureVerification, new BrowserSwitchAdapter(activity) {

            final Activity val$activity;

            public void handleBrowserSwitchIntent(Intent intent)
            {
                activity.startActivity(intent);
            }

            
            {
                activity = activity1;
                super();
            }
        });
        return sPendingRequestStatus;
    }

    protected static PayPalAccountBuilder getBuilderFromResponse(Context context, int i, Intent intent)
        throws ConfigurationException
    {
        if (i != -1 || context == null)
        {
            throw new ConfigurationException("Cannot return PayPalAccountBuilder with invalid context or resultCode");
        }
        PayPalAccountBuilder paypalaccountbuilder = (new PayPalAccountBuilder()).clientMetadataId(sPendingRequestStatus.getClientMetadataId());
        context = getResultFromActivity(context, i, intent);
        static class _cls3
        {

            static final int $SwitchMap$com$paypal$android$sdk$onetouch$core$ResultType[];

            static 
            {
                $SwitchMap$com$paypal$android$sdk$onetouch$core$ResultType = new int[ResultType.values().length];
                try
                {
                    $SwitchMap$com$paypal$android$sdk$onetouch$core$ResultType[ResultType.Error.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$paypal$android$sdk$onetouch$core$ResultType[ResultType.Cancel.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$paypal$android$sdk$onetouch$core$ResultType[ResultType.Success.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (intent.hasExtra("com.paypal.android.sdk.onetouch.core.EXTRA_ONE_TOUCH_RESULT"))
        {
            paypalaccountbuilder.source("paypal-app");
        } else
        {
            paypalaccountbuilder.source("paypal-browser");
        }
        intent = context.getResultType();
        switch (_cls3..SwitchMap.com.paypal.android.sdk.onetouch.core.ResultType[intent.ordinal()])
        {
        default:
            return paypalaccountbuilder;

        case 1: // '\001'
            return null;

        case 2: // '\002'
            return null;

        case 3: // '\003'
            context = context.getResponse();
            break;
        }
        intent = context.optJSONObject("user");
        if (intent != null)
        {
            paypalaccountbuilder.email(intent.optString("display_string"));
        }
        try
        {
            if (context.optJSONObject("client").optString("environment").equalsIgnoreCase("mock") && context.optJSONObject("response").optString("code") != null && !isCheckoutRequest().booleanValue())
            {
                context.put("response", (new JSONObject()).put("code", (new StringBuilder()).append("fake-code:").append(((AuthorizationRequest)sPendingRequest).getScopeString()).toString()));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        paypalaccountbuilder.otcResponse(context);
        return paypalaccountbuilder;
    }

    protected static Result getResultFromActivity(Context context, int i, Intent intent)
        throws ConfigurationException
    {
        if (i != -1 || context == null)
        {
            throw new ConfigurationException("Cannot return PayPalAccountBuilder with invalid context or resultCode");
        }
        if (intent.hasExtra("com.paypal.android.sdk.onetouch.core.EXTRA_ONE_TOUCH_RESULT"))
        {
            return (Result)intent.getParcelableExtra("com.paypal.android.sdk.onetouch.core.EXTRA_ONE_TOUCH_RESULT");
        } else
        {
            return PayPalOneTouchCore.handleBrowserResponse(context, intent.getData(), sPendingRequest);
        }
    }

    public static Boolean isCheckoutRequest()
    {
        boolean flag;
        if (sPendingRequest != null && (sPendingRequest instanceof CheckoutRequest))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public static boolean isPayPalIntent(Intent intent)
    {
        return intent.hasExtra("com.paypal.android.sdk.onetouch.core.EXTRA_ONE_TOUCH_RESULT");
    }

    protected static PerformRequestStatus launchPayPal(Activity activity, int i, Configuration configuration, ClientToken clienttoken, List list)
        throws ConfigurationException
    {
        sPendingRequest = buildPayPalAuthorizationConfiguration(activity, configuration, clienttoken);
        if (list != null)
        {
            for (configuration = list.iterator(); configuration.hasNext(); ((AuthorizationRequest)sPendingRequest).withScopeValue(clienttoken))
            {
                clienttoken = (String)configuration.next();
            }

        }
        sPendingRequestStatus = PayPalOneTouchCore.performRequest(activity, sPendingRequest, i, sEnableSignatureVerification, new BrowserSwitchAdapter(activity) {

            final Activity val$activity;

            public void handleBrowserSwitchIntent(Intent intent)
            {
                activity.startActivity(intent);
            }

            
            {
                activity = activity1;
                super();
            }
        });
        return sPendingRequestStatus;
    }

    protected static Request populateCommonData(Request request, Context context, Configuration configuration)
    {
        Object obj = configuration.getPayPal();
        String s;
        if (((PayPalConfiguration) (obj)).getEnvironment().equals("live"))
        {
            configuration = "live";
        } else
        if (((PayPalConfiguration) (obj)).getEnvironment().equals("offline"))
        {
            configuration = "mock";
        } else
        {
            configuration = ((PayPalConfiguration) (obj)).getEnvironment();
        }
        s = ((PayPalConfiguration) (obj)).getClientId();
        obj = s;
        if (s == null)
        {
            obj = s;
            if (configuration == "mock")
            {
                obj = "FAKE-PAYPAL-CLIENT-ID";
            }
        }
        request.environment(configuration);
        request.clientId(((String) (obj)));
        request.cancelUrl((new StringBuilder()).append(context.getPackageName()).append(".braintree").toString(), "cancel");
        request.successUrl((new StringBuilder()).append(context.getPackageName()).append(".braintree").toString(), "success");
        return request;
    }

    public static void validatePayPalConfiguration(Configuration configuration)
        throws ConfigurationException
    {
        PayPalConfiguration paypalconfiguration = configuration.getPayPal();
        if (!configuration.isPayPalEnabled() || paypalconfiguration.getEnvironment() == null || paypalconfiguration.getPrivacyUrl() == null || paypalconfiguration.getUserAgreementUrl() == null)
        {
            throw new ConfigurationException("PayPal is disabled or configuration is invalid");
        } else
        {
            return;
        }
    }

}
