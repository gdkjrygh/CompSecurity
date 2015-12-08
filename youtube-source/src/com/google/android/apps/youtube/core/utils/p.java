// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.content.Context;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import com.google.android.apps.youtube.datalib.model.transfer.a;
import com.google.android.gsf.f;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            PackageUtil

public final class p
{

    public static String a(String s, int i, long l)
    {
        return a(s, Integer.toString(i), Long.toString(l));
    }

    public static String a(String s, String s1, String s2)
    {
        return (new StringBuilder()).append(s).append(".").append(s1).append(".").append(s2).toString();
    }

    public static final boolean a(Context context)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        if (com.google.android.apps.youtube.core.utils.PackageUtil.a(context))
        {
            android.content.ContentResolver contentresolver = context.getContentResolver();
            boolean flag;
            if (PackageUtil.g(context) >= 5700)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (f.a(contentresolver, "youtube:is_pudl_enabled_5_5", flag))
            {
                return true;
            }
        }
        return false;
    }

    public static final boolean a(Transfer transfer)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(transfer);
        return transfer.g.b("ad", false);
    }

    public static final String b(Transfer transfer)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(transfer);
        return transfer.g.b("playlist_id");
    }

    public static final String c(Transfer transfer)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(transfer);
        return transfer.g.b("video_id");
    }
}
