// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.datalib.innertube.model.ab;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            bk, bt

final class bm
    implements android.view.View.OnClickListener
{

    final YouTubeActivity a;
    final bk b;

    bm(bk bk1, YouTubeActivity youtubeactivity)
    {
        b = bk1;
        a = youtubeactivity;
        super();
    }

    public final void onClick(View view)
    {
        view = new Bundle();
        view.putByteArray("playlist_header", bk.b(b).n());
        bt bt1 = new bt((byte)0);
        bt1.g(view);
        bt1.a(a.c(), null);
    }
}
