// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player.v14;

import android.content.Context;
import android.view.TextureView;

// Referenced classes of package com.google.android.apps.youtube.medialib.player.v14:
//            TexturePlayerSurface

final class d extends TextureView
{

    final TexturePlayerSurface a;

    public d(TexturePlayerSurface textureplayersurface, Context context)
    {
        a = textureplayersurface;
        super(context);
    }

    protected final void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        int j1;
        i1 = getDefaultSize(TexturePlayerSurface.c(a), i);
        j1 = getDefaultSize(TexturePlayerSurface.d(a), j);
        k = j1;
        l = i1;
        if (TexturePlayerSurface.c(a) <= 0) goto _L2; else goto _L1
_L1:
        k = j1;
        l = i1;
        if (TexturePlayerSurface.d(a) <= 0) goto _L2; else goto _L3
_L3:
        float f = (float)(TexturePlayerSurface.c(a) * j1) / (float)(TexturePlayerSurface.d(a) * i1) - 1.0F;
        if (f <= 0.01F) goto _L5; else goto _L4
_L4:
        k = (TexturePlayerSurface.d(a) * i1) / TexturePlayerSurface.c(a);
        l = i1;
_L2:
        setMeasuredDimension(resolveSize(l, i), resolveSize(k, j));
        return;
_L5:
        k = j1;
        l = i1;
        if (f < -0.01F)
        {
            l = (TexturePlayerSurface.c(a) * j1) / TexturePlayerSurface.d(a);
            k = j1;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }
}
