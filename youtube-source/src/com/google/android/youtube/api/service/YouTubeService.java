// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.api.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.internal.d;

// Referenced classes of package com.google.android.youtube.api.service:
//            b, c

public final class YouTubeService extends Service
{

    private c a;

    public YouTubeService()
    {
    }

    static c a(YouTubeService youtubeservice)
    {
        return youtubeservice.a;
    }

    static void a(d d1, YouTubeInitializationResult youtubeinitializationresult)
    {
        try
        {
            d1.a(youtubeinitializationresult.name(), null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            return;
        }
    }

    static boolean a(Context context, String s)
    {
        int i;
        boolean flag;
        boolean flag1;
        flag1 = false;
        i = Binder.getCallingUid();
        flag = flag1;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        context = context.getPackageManager().getPackagesForUid(i);
        flag = flag1;
        if (s == null) goto _L2; else goto _L3
_L3:
        flag = flag1;
        if (context == null) goto _L2; else goto _L4
_L4:
        i = 0;
_L9:
        flag = flag1;
        if (i >= context.length) goto _L2; else goto _L5
_L5:
        if (!s.equals(context[i])) goto _L7; else goto _L6
_L6:
        flag = true;
_L2:
        return flag;
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final IBinder onBind(Intent intent)
    {
        if ("com.google.android.youtube.api.service.START".equals(intent.getAction()))
        {
            return (new b(this, (byte)0)).asBinder();
        } else
        {
            return null;
        }
    }

    public final void onCreate()
    {
        super.onCreate();
        a = new c();
    }

    public final void onDestroy()
    {
        a.a();
        super.onDestroy();
    }
}
