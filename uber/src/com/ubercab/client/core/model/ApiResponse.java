// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.text.TextUtils;
import gjw;
import java.util.Map;

// Referenced classes of package com.ubercab.client.core.model:
//            ApiError

public class ApiResponse
{

    public static final String KEY_AUTHNET_PAYMENT_PROFILE_ID = "authnet_payment_profile";
    public static final String KEY_BILLING_COUNTRY_ISO2 = "billing_country_iso2";
    public static final String KEY_BILLING_ZIP = "billing_zip";
    public static final String KEY_BRAINTREE_TOKEN = "braintree_token";
    public static final String KEY_CARD_BIN = "card_bin";
    public static final String KEY_CARD_EXPIRATION = "card_expiration";
    public static final String KEY_CARD_NUMBER = "card_number";
    public static final String KEY_CARD_TYPE = "card_type";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_ERROR = "error";
    public static final String KEY_IS_CURRENT = "is_current";
    public static final String KEY_IS_GOOGLE_WALLET = "is_google_wallet";
    public static final String KEY_PAYMENT_GATEWAY_ID = "payment_gateway_id";
    public static final String KEY_PAYMENT_PROFILE_TOKEN = "payment_profile_token";
    public static final String KEY_SELECTED = "selected";
    public static final String KEY_SUBHEAD = "subhead";
    public static final String KEY_TITLE = "title";
    public static final String KEY_TOKEN_DISPLAY_NAME = "token_display_name";
    public static final String KEY_TOKEN_TYPE = "token_type";
    public static final String KEY_TOP_OF_FORM = "top_of_form";
    public static final String KEY_USE_CASE = "use_case";
    public static final String KEY_UUID = "uuid";
    public static final String KEY_VERIFIED_AT = "verified_at";
    Map data;
    ApiError error;

    public ApiResponse()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ApiResponse)obj;
            if (data == null ? ((ApiResponse) (obj)).data != null : !data.equals(((ApiResponse) (obj)).data))
            {
                return false;
            }
            if (error == null ? ((ApiResponse) (obj)).error != null : !error.equals(((ApiResponse) (obj)).error))
            {
                return false;
            }
        }
        return true;
    }

    public Map getData()
    {
        return data;
    }

    public ApiError getError()
    {
        return error;
    }

    public String getErrorMessage()
    {
        if (error == null || !"555".equals(error.getStatusCode())) goto _L2; else goto _L1
_L1:
        String s = error.getMessage();
_L4:
        return s;
_L2:
        if (error != null && data != null && "406".equals(error.getStatusCode()))
        {
            if (data.containsKey("top_of_form"))
            {
                return (String)data.get("top_of_form");
            }
            if (data.containsKey("title") && data.containsKey("subhead"))
            {
                String s1 = (String)data.get("title");
                String s3 = (String)data.get("subhead");
                if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s3))
                {
                    return gjw.a("\n\n").a(s1, s3, new Object[0]).trim();
                }
                s = s1;
                if (TextUtils.isEmpty(s1))
                {
                    return s3;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (data.containsKey("title"))
            {
                return (String)data.get("title");
            }
            if (data.containsKey("subhead"))
            {
                return (String)data.get("subhead");
            }
        }
        if (data != null && data.containsKey("error"))
        {
            return (String)data.get("error");
        }
        if (error != null)
        {
            String s2 = error.getMessage();
            s = s2;
            if (s2.startsWith("{"))
            {
                s = s2;
                if (s2.endsWith("}"))
                {
                    s = s2;
                    if (data != null)
                    {
                        s = s2;
                        if (!data.isEmpty())
                        {
                            return gjw.a("\n").a(data.values());
                        }
                    }
                }
            }
        } else
        {
            return null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (error != null)
        {
            i = error.hashCode();
        } else
        {
            i = 0;
        }
        if (data != null)
        {
            j = data.hashCode();
        }
        return i * 31 + j;
    }

    public boolean isSuccess()
    {
        return error == null || TextUtils.isEmpty(error.getStatusCode());
    }
}
