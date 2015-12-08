// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.html;

import com.weather.commons.facade.Html5ModuleData;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.Weather.html:
//            AbstractHtmlModule, UninterceptableWebView

private final class <init>
{

    private volatile String jsonString;
    final AbstractHtmlModule this$0;

    public String getData()
    {
        return jsonString;
    }

    public void logFromWebview(String s)
    {
    }

    public void refresh(UninterceptableWebView uninterceptablewebview)
    {
        uninterceptablewebview.loadUrl("javascript: bridgeData();");
        uninterceptablewebview.setLayerType(1, null);
    }

    public void setData(Html5ModuleData html5moduledata)
    {
        jsonString = html5moduledata.getData();
        LogUtil.d(AbstractHtmlModule.access$100(AbstractHtmlModule.this), LoggingMetaTags.TWC_UI, "Updated WebAppInterface data=%s", new Object[] {
            jsonString
        });
    }

    public void setData(String s)
    {
        jsonString = s;
    }

    private A()
    {
        this$0 = AbstractHtmlModule.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
