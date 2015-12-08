// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            MediaControllerCompat, MediaControllerCompatApi21, MediaSessionCompat, PlaybackStateCompat

static class mControllerObj
    implements mControllerObj
{

    private final Object mControllerObj;

    public void adjustVolume(int i, int j)
    {
        MediaControllerCompatApi21.adjustVolume(mControllerObj, i, j);
    }

    public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
    {
        return MediaControllerCompatApi21.dispatchMediaButtonEvent(mControllerObj, keyevent);
    }

    public Bundle getExtras()
    {
        return MediaControllerCompatApi21.getExtras(mControllerObj);
    }

    public long getFlags()
    {
        return MediaControllerCompatApi21.getFlags(mControllerObj);
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

    public String getPackageName()
    {
        return MediaControllerCompatApi21.getPackageName(mControllerObj);
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

    public List getQueue()
    {
        Object obj = MediaControllerCompatApi21.getQueue(mControllerObj);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList();
        Iterator iterator = ((List) (obj)).iterator();
        do
        {
            obj = arraylist;
            if (!iterator.hasNext())
            {
                continue;
            }
            arraylist.add(mControllerObj(iterator.next()));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public CharSequence getQueueTitle()
    {
        return MediaControllerCompatApi21.getQueueTitle(mControllerObj);
    }

    public int getRatingType()
    {
        return MediaControllerCompatApi21.getRatingType(mControllerObj);
    }

    public PendingIntent getSessionActivity()
    {
        return MediaControllerCompatApi21.getSessionActivity(mControllerObj);
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
        MediaControllerCompatApi21.registerCallback(mControllerObj, mControllerObj(nit>), handler);
    }

    public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
    {
        MediaControllerCompatApi21.sendCommand(mControllerObj, s, bundle, resultreceiver);
    }

    public void setVolumeTo(int i, int j)
    {
        MediaControllerCompatApi21.setVolumeTo(mControllerObj, i, j);
    }

    public void unregisterCallback(mControllerObj mcontrollerobj)
    {
        MediaControllerCompatApi21.unregisterCallback(mControllerObj, mControllerObj(mcontrollerobj));
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
