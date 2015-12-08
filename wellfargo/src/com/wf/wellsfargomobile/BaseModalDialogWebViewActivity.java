// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.res.Configuration;
import android.view.Menu;
import android.widget.RelativeLayout;

// Referenced classes of package com.wf.wellsfargomobile:
//            BaseWebViewActivity, WFApp

public class BaseModalDialogWebViewActivity extends BaseWebViewActivity
{

    protected int b;
    protected int c;
    protected int d;
    protected int e;

    public BaseModalDialogWebViewActivity()
    {
    }

    public void onBackPressed()
    {
        closeWebViewAsDialog(null);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        RelativeLayout relativelayout = (RelativeLayout)findViewById(0x7f0f0111);
        if (configuration.orientation == 2)
        {
            c = WFApp.a(10);
            e = 0;
        }
        relativelayout.setPadding(b, c, d, e);
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        menu.clear();
        return true;
    }
}
