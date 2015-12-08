// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.mobile.sdk.uicontrols.creditcard;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

// Referenced classes of package com.kofax.mobile.sdk.uicontrols.creditcard:
//            ImgProperties

public class ExtractionResultsActivity extends Activity
{

    public static Handler h = new _cls1();
    ImgProperties a;

    public ExtractionResultsActivity()
    {
        a = null;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }


    private class _cls1 extends Handler
    {

        public void handleMessage(Message message)
        {
            if (message.arg1 == 0)
            {
                for (int i = 0; i < DataExtractionTask.data.length; i++) { }
            }
        }

        _cls1()
        {
        }
    }

}
