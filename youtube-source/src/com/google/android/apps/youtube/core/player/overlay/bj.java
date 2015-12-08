// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.res.AssetManager;
import android.graphics.Typeface;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            bl

final class bj
    implements bl
{

    final String a;

    bj(String s)
    {
        a = s;
        super();
    }

    public final Typeface a(AssetManager assetmanager)
    {
        return Typeface.createFromAsset(assetmanager, a);
    }
}
