// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.moremenu;

import android.content.ContentResolver;
import android.content.Context;
import android.view.View;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.app.main.SearchContentProvider;

// Referenced classes of package com.walmart.android.app.moremenu:
//            SettingsPresenter

class this._cls0
    implements android.view.
{

    final SettingsPresenter this$0;

    public void onClick(View view)
    {
        view.getContext().getContentResolver().delete(SearchContentProvider.CONTENT_URI, null, null);
        GoogleAnalytics.trackEvent("Search", "Clear Search History", "");
    }

    ()
    {
        this$0 = SettingsPresenter.this;
        super();
    }
}
