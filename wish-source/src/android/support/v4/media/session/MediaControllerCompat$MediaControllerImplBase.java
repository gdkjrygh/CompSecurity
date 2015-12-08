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

static class 
    implements 
{

    public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
    {
        return false;
    }

    public Object getMediaController()
    {
        return null;
    }

    public MediaMetadataCompat getMetadata()
    {
        return null;
    }

    public  getPlaybackInfo()
    {
        return null;
    }

    public PlaybackStateCompat getPlaybackState()
    {
        return null;
    }

    public int getRatingType()
    {
        return 0;
    }

    public  getTransportControls()
    {
        return null;
    }

    public void registerCallback( , Handler handler)
    {
    }

    public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
    {
    }

    public void unregisterCallback( )
    {
    }

    ()
    {
    }
}
