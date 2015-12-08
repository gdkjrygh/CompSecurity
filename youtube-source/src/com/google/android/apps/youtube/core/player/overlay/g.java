// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.graphics.Bitmap;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            ax, h

public interface g
    extends ax
{

    public abstract void a();

    public abstract void a(boolean flag);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void setAdStyle(boolean flag);

    public abstract void setCallToActionImage(Bitmap bitmap);

    public abstract void setCallToActionText(String s, String s1);

    public abstract void setFeaturedChannelImage(Bitmap bitmap);

    public abstract void setFeaturedVideoImage(Bitmap bitmap);

    public abstract void setFeaturedVideoTitle(String s);

    public abstract void setInfoCardTeaserImage(Bitmap bitmap);

    public abstract void setInfoCardTeaserMessage(CharSequence charsequence);

    public abstract void setListener(h h1);

    public abstract void setVisible(boolean flag);
}
