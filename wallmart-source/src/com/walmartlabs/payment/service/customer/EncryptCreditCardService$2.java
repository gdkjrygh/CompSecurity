// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;

import android.webkit.ValueCallback;
import com.walmartlabs.utils.WLog;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.walmartlabs.payment.service.customer:
//            EncryptCreditCardService

class this._cls0
    implements ValueCallback
{

    final EncryptCreditCardService this$0;

    public volatile void onReceiveValue(Object obj)
    {
        onReceiveValue((String)obj);
    }

    public void onReceiveValue(String s)
    {
        s = new JSONArray(s);
        if (s.length() == 6)
        {
            EncryptCreditCardService.access$1300(EncryptCreditCardService.this, s.getString(0), s.getString(1), s.getString(2), s.getString(3), s.getString(4), s.getString(5));
            return;
        }
        try
        {
            WLog.e(EncryptCreditCardService.access$000(), "Encryption algorithm did not return the expected result format");
            EncryptCreditCardService.access$200(EncryptCreditCardService.this, com.walmartlabs.kangaroo.ED_RESPONSE);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(EncryptCreditCardService.access$000(), "Encryption algorithm did not return the expected result format");
        }
        EncryptCreditCardService.access$200(EncryptCreditCardService.this, com.walmartlabs.kangaroo.ED_RESPONSE);
        return;
    }

    I()
    {
        this$0 = EncryptCreditCardService.this;
        super();
    }
}
