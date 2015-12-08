// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.pharmacylegacy;

import com.walmartlabs.kangaroo.service.Transformer;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.nio.charset.Charset;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.service.pharmacylegacy:
//            PharmacyLegacyService, HtmlContent

class this._cls0
    implements Transformer
{

    final PharmacyLegacyService this$0;

    public HtmlContent transform(byte abyte0[])
    {
        Object obj = null;
        HtmlContent ahtmlcontent[];
        abyte0 = new String(abyte0, Charset.forName("ISO-8859-1"));
        ahtmlcontent = (HtmlContent[])PharmacyLegacyService.access$000(PharmacyLegacyService.this).readValue(abyte0, [Lcom/walmart/android/service/pharmacylegacy/HtmlContent;);
        abyte0 = obj;
        if (ahtmlcontent.length > 0)
        {
            abyte0 = ahtmlcontent[0];
        }
        return abyte0;
        abyte0;
_L2:
        WLog.e(PharmacyLegacyService.access$100(), "could not transform response", abyte0);
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

    ()
    {
        this$0 = PharmacyLegacyService.this;
        super();
    }
}
