// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.walmart.android.data.TosSection;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.JsonMapper;
import java.io.IOException;
import java.util.List;
import org.codehaus.jackson.type.TypeReference;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetServiceImpl

class this._cls1 extends TypeReference
{

    final this._cls1 this$1;

    l.asyncCallback()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/wmservice/WalmartNetServiceImpl$9

/* anonymous class */
    class WalmartNetServiceImpl._cls9
        implements Runnable
    {

        final WalmartNetServiceImpl this$0;
        final AsyncCallback val$asyncCallback;

        public void run()
        {
            List list;
            List list1;
            list1 = null;
            list = list1;
            Object obj = WalmartNetServiceImpl.access$400(WalmartNetServiceImpl.this).getAssets().open("tos.json");
            list = list1;
            list1 = (List)WalmartNetServiceImpl.access$600(WalmartNetServiceImpl.this).readValue(((java.io.InputStream) (obj)), new WalmartNetServiceImpl._cls9._cls1());
            obj = list1;
            if (list1 == null)
            {
                break MISSING_BLOCK_LABEL_115;
            }
            list = list1;
            String s = GooglePlayServicesUtil.getOpenSourceSoftwareLicenseInfo(WalmartNetServiceImpl.access$400(WalmartNetServiceImpl.this));
            obj = list1;
            list = list1;
            if (TextUtils.isEmpty(s))
            {
                break MISSING_BLOCK_LABEL_115;
            }
            list = list1;
            obj = new TosSection();
            list = list1;
            obj.name = "Google Play Services";
            list = list1;
            obj.content = s;
            list = list1;
            list1.add(obj);
            obj = list1;
_L2:
            if (obj != null && !((List) (obj)).isEmpty())
            {
                asyncCallback.onSuccess(obj);
                return;
            } else
            {
                asyncCallback.onFailure(Integer.valueOf(0x15f91), obj);
                return;
            }
            IOException ioexception;
            ioexception;
            obj = list;
            if (true) goto _L2; else goto _L1
_L1:
        }

            
            {
                this$0 = final_walmartnetserviceimpl;
                asyncCallback = AsyncCallback.this;
                super();
            }
    }

}
