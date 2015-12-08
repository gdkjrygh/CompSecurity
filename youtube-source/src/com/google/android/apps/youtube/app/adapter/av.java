// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.legacy.model.Event;
import com.google.android.youtube.h;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            a

public final class av extends a
{

    private final Bitmap a;

    public av(Context context, bc bc, bj bj)
    {
        super(context, bc, bj);
        a = BitmapFactory.decodeResource(context.getResources(), h.aI);
    }

    protected final volatile Uri a(Object obj)
    {
        return ((Event)obj).subjectUri;
    }

    protected final volatile void a(Object obj, View view, b b1)
    {
        obj = (Event)obj;
        if (((Event) (obj)).action == com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_RECOMMENDED)
        {
            b1.a(null, a);
            return;
        } else
        {
            super.a(obj, view, b1);
            return;
        }
    }
}
