// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.frontia.richmedia;

import android.graphics.Bitmap;
import android.webkit.WebView;

// Referenced classes of package io.wecloud.message.frontia.richmedia:
//            b

public abstract class k
{

    protected b a;

    public k()
    {
        a = null;
    }

    public abstract void a(WebView webview, int i, String s, String s1);

    public abstract void a(WebView webview, String s, Bitmap bitmap);

    public void a(b b1)
    {
        a = b1;
    }

    public abstract boolean a(WebView webview, String s);

    public abstract void b(WebView webview, String s);
}
