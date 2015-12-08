// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.frontia.richmedia;

import android.view.View;
import android.webkit.WebView;

// Referenced classes of package io.wecloud.message.frontia.richmedia:
//            b, MediaViewActivity

class h
    implements b
{

    final MediaViewActivity a;

    h(MediaViewActivity mediaviewactivity)
    {
        a = mediaviewactivity;
        super();
    }

    public void a(View view, int i)
    {
        i;
        JVM INSTR tableswitch 8 12: default 36
    //                   8 113
    //                   9 37
    //                   10 79
    //                   11 45
    //                   12 141;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L3:
        a.finish();
        return;
_L5:
        if (MediaViewActivity.c(a) != null && MediaViewActivity.c(a).canGoBack())
        {
            MediaViewActivity.c(a).goBack();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (MediaViewActivity.c(a) != null && MediaViewActivity.c(a).canGoForward())
        {
            MediaViewActivity.c(a).goForward();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (MediaViewActivity.c(a) != null)
        {
            MediaViewActivity.c(a).loadUrl(MediaViewActivity.g(a));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (MediaViewActivity.c(a) != null)
        {
            MediaViewActivity.c(a).reload();
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }
}
