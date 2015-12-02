// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.alipay.model;

import android.os.Parcelable;
import android.text.TextUtils;
import gkh;
import java.util.Map;

// Referenced classes of package com.ubercab.client.core.vendor.alipay.model:
//            Shape_AlipayAuthResult

public abstract class AlipayAuthResult
    implements Parcelable
{

    private static final String PARAM_ALIPAY_OPEN_ID = "alipay_open_id";
    private static final String PARAM_AUTH_CODE = "auth_code";
    private static final String PARAM_MEMO = "memo";
    private static final String PARAM_RESULT = "result";
    private static final String PARAM_RESULT_CODE = "result_code";
    private static final String PARAM_RESULT_STATUS = "resultStatus";
    public static final String STATUS_SUCCESS = "9000";

    public AlipayAuthResult()
    {
    }

    public static AlipayAuthResult create()
    {
        return new Shape_AlipayAuthResult();
    }

    public static AlipayAuthResult create(String s, String s1, String s2, String s3, String s4, String s5)
    {
        return create().setAlipayOpenId(s).setAuthCode(s1).setMemo(s2).setResult(s3).setResultCode(s4).setResultStatus(s5);
    }

    public static AlipayAuthResult createFromRaw(String s)
    {
        s = parseRawResult(s);
        return create((String)s.get("alipay_open_id"), (String)s.get("auth_code"), (String)s.get("memo"), (String)s.get("result"), (String)s.get("result_code"), (String)s.get("resultStatus"));
    }

    private static String extractValue(String s)
    {
        s = s.split("[\\{\\}\"]+");
        if (s.length > 0 && !TextUtils.isEmpty(s[s.length - 1]))
        {
            return s[s.length - 1];
        } else
        {
            return null;
        }
    }

    private static Map parseRawResult(String s)
    {
        gkh gkh1 = new gkh();
        if (TextUtils.isEmpty(s))
        {
            return gkh1.a();
        }
        s = s.split(";");
        int k = s.length;
        int i = 0;
        while (i < k) 
        {
            String as[] = s[i].split("=", 2);
            if (as.length == 2 && !TextUtils.isEmpty(as[0]))
            {
                String s1 = as[0];
                String as2[] = as[1].split("=");
                if (as2.length == 1)
                {
                    gkh1.a(s1, extractValue(as2[0]));
                } else
                {
                    as = as[1].split("&");
                    int l = as.length;
                    int j = 0;
                    while (j < l) 
                    {
                        String as1[] = as[j].split("=");
                        if (as1.length == 2)
                        {
                            gkh1.a(extractValue(as1[0]), extractValue(as1[1]));
                        }
                        j++;
                    }
                }
            }
            i++;
        }
        return gkh1.a();
    }

    public abstract String getAlipayOpenId();

    public abstract String getAuthCode();

    public abstract String getMemo();

    public abstract String getResult();

    public abstract String getResultCode();

    public abstract String getResultStatus();

    public abstract AlipayAuthResult setAlipayOpenId(String s);

    public abstract AlipayAuthResult setAuthCode(String s);

    public abstract AlipayAuthResult setMemo(String s);

    public abstract AlipayAuthResult setResult(String s);

    public abstract AlipayAuthResult setResultCode(String s);

    public abstract AlipayAuthResult setResultStatus(String s);
}
