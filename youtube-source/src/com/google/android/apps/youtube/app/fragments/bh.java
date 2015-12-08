// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.graphics.Bitmap;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            RemoteWatchDialogFragment

final class bh
    implements b
{

    final RemoteWatchDialogFragment a;

    bh(RemoteWatchDialogFragment remotewatchdialogfragment)
    {
        a = remotewatchdialogfragment;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        RemoteWatchDialogFragment.a(a, ((Bitmap) (obj)));
    }
}
