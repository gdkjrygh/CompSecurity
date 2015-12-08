// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.os.Bundle;

// Referenced classes of package com.wf.wellsfargomobile:
//            BaseWebViewActivity, WFApp

public class WebViewActivity extends BaseWebViewActivity
{

    public static boolean b;

    public WebViewActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        j = 0x7f04005c;
        super.onCreate(bundle);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (isFinishing())
        {
            WFApp.A();
        }
        b = false;
    }

    protected void onStart()
    {
        super.onStart();
        b = true;
    }
}
