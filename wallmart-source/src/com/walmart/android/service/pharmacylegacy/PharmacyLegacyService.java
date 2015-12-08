// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.pharmacylegacy;

import com.walmart.android.service.JacksonConverter;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.RequestBuilder;
import com.walmartlabs.kangaroo.service.Service;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import com.walmartlabs.kangaroo.service.Transformer;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.nio.charset.Charset;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.service.pharmacylegacy:
//            FourDollarPrescriptions, HtmlContent

public class PharmacyLegacyService
{

    private static final String TAG = com/walmart/android/service/pharmacylegacy/PharmacyLegacyService.getSimpleName();
    private ObjectMapper mObjectMapper;
    private Service mService;

    public PharmacyLegacyService(String s, ObjectMapper objectmapper, Log log)
    {
        mObjectMapper = objectmapper;
        mService = (new com.walmartlabs.kangaroo.service.Service.Builder()).host(s).path("m/j").query("e", "1").query("service", "RxContent").okHttpClient(SharedHttpClient.get()).converter(new JacksonConverter(objectmapper)).log(log).build();
    }

    public Request getFourDollarPrescriptions()
    {
        return mService.newRequest().query("method", "getFourDollarContent").get(com/walmart/android/service/pharmacylegacy/FourDollarPrescriptions);
    }

    public Request getPharmacyPrivacyNotice()
    {
        return mService.newRequest().query("method", "getPrivacyPolicy").get([B, new Transformer() {

            final PharmacyLegacyService this$0;

            public HtmlContent transform(byte abyte0[])
            {
                Object obj = null;
                HtmlContent ahtmlcontent[];
                abyte0 = new String(abyte0, Charset.forName("ISO-8859-1"));
                ahtmlcontent = (HtmlContent[])mObjectMapper.readValue(abyte0, [Lcom/walmart/android/service/pharmacylegacy/HtmlContent;);
                abyte0 = obj;
                if (ahtmlcontent.length > 0)
                {
                    abyte0 = ahtmlcontent[0];
                }
                return abyte0;
                abyte0;
_L2:
                WLog.e(PharmacyLegacyService.TAG, "could not transform response", abyte0);
                return null;
                abyte0;
                continue; /* Loop/switch isn't completed */
                abyte0;
                if (true) goto _L2; else goto _L1
_L1:
            }

            public volatile Object transform(Object obj)
            {
                return transform((byte[])obj);
            }

            
            {
                this$0 = PharmacyLegacyService.this;
                super();
            }
        });
    }



}
