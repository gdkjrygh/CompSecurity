// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.adapter.h;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            PostPairingActivity, n

final class m
    implements b
{

    final PostPairingActivity a;
    private final PostPairingActivity.FeedItem b;

    public m(PostPairingActivity postpairingactivity, PostPairingActivity.FeedItem feeditem)
    {
        a = postpairingactivity;
        super();
        b = feeditem;
    }

    static PostPairingActivity.FeedItem a(m m1)
    {
        return m1.b;
    }

    public final volatile void a(Object obj, Exception exception)
    {
        PostPairingActivity.a(a, b);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Page)obj1;
        if (((Page) (obj)).entries.size() > 0)
        {
            obj1 = (Video)((Page) (obj)).entries.get(0);
            com.google.android.apps.youtube.app.honeycomb.phone.PostPairingActivity.b(a).a(0, obj1);
            if (PostPairingActivity.c(a) != null)
            {
                PostPairingActivity.c(a).setText(b.labelStringId);
            }
            obj = new n(this, ((Page) (obj)), (byte)0);
            PostPairingActivity.d(a).setOnClickListener(((android.view.View.OnClickListener) (obj)));
            PostPairingActivity.e(a).setOnClickListener(((android.view.View.OnClickListener) (obj)));
            return;
        } else
        {
            PostPairingActivity.a(a, b);
            return;
        }
    }
}
