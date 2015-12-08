// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;


// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ViewCrawler

class this._cls0
    implements com.mixpanel.android.mpmetrics.DeclaredListener
{

    final ViewCrawler this$0;

    public void onTweakDeclared()
    {
        android.os.Message message = ViewCrawler.access$0(ViewCrawler.this).obtainMessage(4);
        ViewCrawler.access$0(ViewCrawler.this).sendMessage(message);
    }

    ewCrawlerHandler()
    {
        this$0 = ViewCrawler.this;
        super();
    }
}
