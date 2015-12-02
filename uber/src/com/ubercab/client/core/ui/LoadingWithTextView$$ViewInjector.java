// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.ubercab.client.core.ui:
//            LoadingWithTextView

public class 
    implements butterknife...ViewInjector
{

    public void inject(butterknife...ViewInjector viewinjector, LoadingWithTextView loadingwithtextview, Object obj)
    {
        loadingwithtextview.mLoadingIcon = (ImageView)viewinjector.mLoadingIcon((View)viewinjector.w(obj, 0x7f0e0187, "field 'mLoadingIcon'"), 0x7f0e0187, "field 'mLoadingIcon'");
        loadingwithtextview.mLoadingText = (TextView)viewinjector.mLoadingText((View)viewinjector.w(obj, 0x7f0e0188, "field 'mLoadingText'"), 0x7f0e0188, "field 'mLoadingText'");
    }

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (LoadingWithTextView)obj, obj1);
    }

    public void reset(LoadingWithTextView loadingwithtextview)
    {
        loadingwithtextview.mLoadingIcon = null;
        loadingwithtextview.mLoadingText = null;
    }

    public volatile void reset(Object obj)
    {
        reset((LoadingWithTextView)obj);
    }

    public ()
    {
    }
}
