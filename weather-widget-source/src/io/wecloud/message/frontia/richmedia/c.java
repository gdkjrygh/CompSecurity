// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.frontia.richmedia;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import io.wecloud.message.h;

// Referenced classes of package io.wecloud.message.frontia.richmedia:
//            k, d

public class c extends k
{

    private android.view.View.OnClickListener b;
    private ImageView c;

    public c(View view)
    {
        b = null;
        c = null;
        a(view);
    }

    private void a()
    {
        if (b == null)
        {
            b = new d(this);
            if (c != null)
            {
                c.setOnClickListener(b);
                return;
            }
        }
    }

    private void a(View view)
    {
        if (view == null)
        {
            return;
        } else
        {
            c = (ImageView)view.findViewById(h.a);
            a();
            return;
        }
    }

    public void a(WebView webview, int i, String s, String s1)
    {
    }

    public void a(WebView webview, String s, Bitmap bitmap)
    {
    }

    public boolean a(WebView webview, String s)
    {
        return false;
    }

    public void b(WebView webview, String s)
    {
    }
}
