// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.graphics.SurfaceTexture;
import android.os.RemoteException;
import android.view.Surface;
import com.google.android.apps.youtube.api.b.a.bd;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ey

final class ex
    implements android.view.TextureView.SurfaceTextureListener
{

    private bd a;
    private ey b;

    public ex(bd bd1, ey ey1)
    {
        a = (bd)c.a(bd1);
        b = (ey)c.a(ey1);
    }

    public final void a()
    {
        a = null;
        b = null;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        if (a != null)
        {
            surfacetexture = new Surface(surfacetexture);
            try
            {
                a.a(surfacetexture);
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceTexture surfacetexture)
            {
                throw new IllegalStateException(surfacetexture);
            }
            b.a(surfacetexture);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        if (a != null)
        {
            try
            {
                a.b();
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceTexture surfacetexture)
            {
                throw new IllegalStateException(surfacetexture);
            }
            b.f();
        }
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        a.a(i, j);
        return;
        surfacetexture;
        throw new IllegalStateException(surfacetexture);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        a.a();
        return;
        surfacetexture;
        throw new IllegalStateException(surfacetexture);
    }
}
