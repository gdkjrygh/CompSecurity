// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.url;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.reflect.Constructor;

// Referenced classes of package com.jiubang.commerce.ad.url:
//            d

final class e
    implements Runnable
{

    final Context a;

    e(Context context)
    {
        a = context;
        super();
    }

    public void run()
    {
        Constructor constructor;
        constructor = android/webkit/WebSettings.getDeclaredConstructor(new Class[] {
            android/content/Context, android/webkit/WebView
        });
        constructor.setAccessible(true);
        d.b(((WebSettings)constructor.newInstance(new Object[] {
            a, null
        })).getUserAgentString());
        Exception exception;
        try
        {
            constructor.setAccessible(false);
            return;
        }
        catch (Throwable throwable) { }
        break MISSING_BLOCK_LABEL_69;
        exception;
        constructor.setAccessible(false);
        throw exception;
        try
        {
            d.b((new WebView(a)).getSettings().getUserAgentString());
            return;
        }
        catch (Throwable throwable1) { }
        try
        {
            d.b(WebSettings.getDefaultUserAgent(a));
            return;
        }
        catch (Throwable throwable2)
        {
            return;
        }
    }
}
