// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.content.Context;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.webview.b;
import java.util.regex.Pattern;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ac

public interface ab
{

    public abstract int a();

    public abstract ac a(BaseWebViewActivity basewebviewactivity, WebView webview, b b1);

    public abstract ac a(BaseWebViewActivity basewebviewactivity, WebView webview, String s);

    public abstract Pattern a(Context context);

    public abstract ac a_(BaseWebViewActivity basewebviewactivity, WebView webview, String s);

    public abstract ac b(BaseWebViewActivity basewebviewactivity, WebView webview, String s);
}
