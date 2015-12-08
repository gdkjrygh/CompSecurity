// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.graphics.Bitmap;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            ax, b

public interface a
    extends ax
{

    public abstract void a(int i, int j);

    public abstract void a(String s, boolean flag, boolean flag1, String s1);

    public abstract void d();

    public abstract void setAdTitle(String s);

    public abstract void setChannel(Bitmap bitmap);

    public abstract void setFullscreen(boolean flag);

    public abstract void setListener(b b);
}
