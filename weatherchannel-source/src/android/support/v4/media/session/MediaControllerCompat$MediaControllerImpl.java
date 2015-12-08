// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            MediaControllerCompat, PlaybackStateCompat

static interface 
{

    public abstract void adjustVolume(int i, int j);

    public abstract boolean dispatchMediaButtonEvent(KeyEvent keyevent);

    public abstract Bundle getExtras();

    public abstract long getFlags();

    public abstract Object getMediaController();

    public abstract MediaMetadataCompat getMetadata();

    public abstract String getPackageName();

    public abstract  getPlaybackInfo();

    public abstract PlaybackStateCompat getPlaybackState();

    public abstract List getQueue();

    public abstract CharSequence getQueueTitle();

    public abstract int getRatingType();

    public abstract PendingIntent getSessionActivity();

    public abstract  getTransportControls();

    public abstract void registerCallback( , Handler handler);

    public abstract void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver);

    public abstract void setVolumeTo(int i, int j);

    public abstract void unregisterCallback( );
}
