// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import com.google.android.apps.youtube.core.player.overlay.ControlsOverlay;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            c

public interface b
    extends ControlsOverlay
{

    public abstract int a();

    public abstract void setControlsPermanentlyHidden(boolean flag);

    public abstract void setMinimal(boolean flag);

    public abstract void setOnPlayInYouTubeListener(c c);

    public abstract void setVideoTitle(String s);
}
