// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.view.View;

// Referenced classes of package com.weather.commons.news.ui:
//            NewsDetailFragment, NewsActivity

class this._cls0
    implements android.view.tailFragment._cls1
{

    final NewsDetailFragment this$0;

    public void onClick(View view)
    {
        ((NewsActivity)getActivity()).goToNextArticle();
    }

    ()
    {
        this$0 = NewsDetailFragment.this;
        super();
    }
}
