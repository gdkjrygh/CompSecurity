// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            YouTubeActivity

final class an
    implements android.content.DialogInterface.OnDismissListener
{

    final YouTubeActivity a;

    an(YouTubeActivity youtubeactivity)
    {
        a = youtubeactivity;
        super();
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        a.finish();
    }
}
