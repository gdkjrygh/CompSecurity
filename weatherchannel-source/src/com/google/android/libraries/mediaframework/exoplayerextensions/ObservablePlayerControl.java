// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.exoplayerextensions;

import com.google.android.exoplayer.ExoPlayer;
import com.google.android.exoplayer.util.PlayerControl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.mediaframework.exoplayerextensions:
//            PlayerControlCallback

public class ObservablePlayerControl extends PlayerControl
{

    List callbacks;

    public ObservablePlayerControl(ExoPlayer exoplayer)
    {
        super(exoplayer);
        callbacks = new ArrayList();
    }

    public void addCallback(PlayerControlCallback playercontrolcallback)
    {
        callbacks.add(playercontrolcallback);
    }

    public void pause()
    {
        super.pause();
        for (Iterator iterator = callbacks.iterator(); iterator.hasNext(); ((PlayerControlCallback)iterator.next()).onPause()) { }
    }

    public void removeCallback(PlayerControlCallback playercontrolcallback)
    {
        callbacks.remove(playercontrolcallback);
    }

    public void start()
    {
        super.start();
        for (Iterator iterator = callbacks.iterator(); iterator.hasNext(); ((PlayerControlCallback)iterator.next()).onPlay()) { }
    }
}
