// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.view.KeyEvent;

// Referenced classes of package android.support.v4.media.session:
//            MediaControllerCompat, MediaControllerCompatApi21, MediaSessionCompat, PlaybackStateCompat

static class mControllerObj
    implements mControllerObj
{

    private final Object mControllerObj;

    public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
    {
        return MediaControllerCompatApi21.dispatchMediaButtonEvent(mControllerObj, keyevent);
    }

    public Object getMediaController()
    {
        return mControllerObj;
    }

    public MediaMetadataCompat getMetadata()
    {
        Object obj = MediaControllerCompatApi21.getMetadata(mControllerObj);
        if (obj != null)
        {
            return MediaMetadataCompat.fromMediaMetadata(obj);
        } else
        {
            return null;
        }
    }

    public mControllerObj getPlaybackInfo()
    {
        Object obj = MediaControllerCompatApi21.getPlaybackInfo(mControllerObj);
        if (obj != null)
        {
            return new mControllerObj(backType(obj), cyAudioStream(obj), meControl(obj), olume(obj), entVolume(obj));
        } else
        {
            return null;
        }
    }

    public PlaybackStateCompat getPlaybackState()
    {
        Object obj = MediaControllerCompatApi21.getPlaybackState(mControllerObj);
        if (obj != null)
        {
            return PlaybackStateCompat.fromPlaybackState(obj);
        } else
        {
            return null;
        }
    }

    public int getRatingType()
    {
        return MediaControllerCompatApi21.getRatingType(mControllerObj);
    }

    public mControllerObj getTransportControls()
    {
        Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
        if (obj != null)
        {
            return new nit>(obj);
        } else
        {
            return null;
        }
    }

    public void registerCallback(nit> nit>, Handler handler)
    {
        MediaControllerCompatApi21.registerCallback(mControllerObj, nit>.mControllerObj, handler);
    }

    public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
    {
        MediaControllerCompatApi21.sendCommand(mControllerObj, s, bundle, resultreceiver);
    }

    public void unregisterCallback(mControllerObj mcontrollerobj)
    {
        MediaControllerCompatApi21.unregisterCallback(mControllerObj, mcontrollerobj.mControllerObj);
    }

    public (Context context,  )
        throws RemoteException
    {
        mControllerObj = MediaControllerCompatApi21.fromToken(context, .mControllerObj());
        if (mControllerObj == null)
        {
            throw new RemoteException();
        } else
        {
            return;
        }
    }

    public mControllerObj(Context context, MediaSessionCompat mediasessioncompat)
    {
        mControllerObj = MediaControllerCompatApi21.fromToken(context, mediasessioncompat.getSessionToken().mControllerObj());
    }
}
