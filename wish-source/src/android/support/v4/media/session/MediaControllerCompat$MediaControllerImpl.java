// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.view.KeyEvent;

// Referenced classes of package android.support.v4.media.session:
//            MediaControllerCompat, PlaybackStateCompat

static interface 
{

    public abstract boolean dispatchMediaButtonEvent(KeyEvent keyevent);

    public abstract Object getMediaController();

    public abstract MediaMetadataCompat getMetadata();

    public abstract  getPlaybackInfo();

    public abstract PlaybackStateCompat getPlaybackState();

    public abstract int getRatingType();

    public abstract  getTransportControls();

    public abstract void registerCallback( , Handler handler);

    public abstract void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver);

    public abstract void unregisterCallback( );
}
