// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            ax, p

public interface ControlsOverlay
    extends ax
{

    public abstract void a(List list);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract boolean onKeyDown(int i, KeyEvent keyevent);

    public abstract boolean onKeyUp(int i, KeyEvent keyevent);

    public abstract void setAndShowEnded();

    public abstract void setAndShowPaused();

    public abstract void setAudioOnlyEnabled(boolean flag);

    public abstract void setCcEnabled(boolean flag);

    public abstract void setErrorAndShowMessage(String s, boolean flag);

    public abstract void setFullscreen(boolean flag);

    public abstract void setHQ(boolean flag);

    public abstract void setHQisHD(boolean flag);

    public abstract void setHasCc(boolean flag);

    public abstract void setHasInfoCard(boolean flag);

    public abstract void setHasNext(boolean flag);

    public abstract void setHasPrevious(boolean flag);

    public abstract void setInitial();

    public abstract void setLearnMoreEnabled(boolean flag);

    public abstract void setListener(p p);

    public abstract void setLoading();

    public abstract void setPlaying();

    public abstract void setScrubbingEnabled(boolean flag);

    public abstract void setShowFullscreen(boolean flag);

    public abstract void setStyle(Style style);

    public abstract void setSupportsQualityToggle(boolean flag);

    public abstract void setTimes(int i, int j, int k);
}
