// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;

import android.content.ContentResolver;
import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.google.android.gsf:
//            f, h

final class g extends Thread
{

    final ContentResolver a;

    g(String s, ContentResolver contentresolver)
    {
        a = contentresolver;
        super(s);
    }

    public final void run()
    {
        Looper.prepare();
        a.registerContentObserver(f.a, true, new h(this, new Handler(Looper.myLooper())));
        Looper.loop();
    }
}
