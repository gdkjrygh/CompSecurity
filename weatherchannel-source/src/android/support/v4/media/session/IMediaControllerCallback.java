// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            PlaybackStateCompat, ParcelableVolumeInfo

public interface IMediaControllerCallback
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IMediaControllerCallback
    {

        private static final String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";
        static final int TRANSACTION_onEvent = 1;
        static final int TRANSACTION_onExtrasChanged = 7;
        static final int TRANSACTION_onMetadataChanged = 4;
        static final int TRANSACTION_onPlaybackStateChanged = 3;
        static final int TRANSACTION_onQueueChanged = 5;
        static final int TRANSACTION_onQueueTitleChanged = 6;
        static final int TRANSACTION_onSessionDestroyed = 2;
        static final int TRANSACTION_onVolumeInfoChanged = 8;

        public static IMediaControllerCallback asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (iinterface != null && (iinterface instanceof IMediaControllerCallback))
            {
                return (IMediaControllerCallback)iinterface;
            } else
            {
                return new Proxy(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel1 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onEvent(parcel1, parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onSessionDestroyed();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0)
                {
                    parcel = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onPlaybackStateChanged(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0)
                {
                    parcel = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onMetadataChanged(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onQueueChanged(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                return true;

            case 6: // '\006'
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0)
                {
                    parcel = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onQueueTitleChanged(parcel);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onExtrasChanged(parcel);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onVolumeInfoChanged(parcel);
            return true;
        }

        public Stub()
        {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }
    }

    private static class Stub.Proxy
        implements IMediaControllerCallback
    {

        private IBinder mRemote;

        public IBinder asBinder()
        {
            return mRemote;
        }

        public String getInterfaceDescriptor()
        {
            return "android.support.v4.media.session.IMediaControllerCallback";
        }

        public void onEvent(String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcel.writeString(s);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            s;
            parcel.recycle();
            throw s;
        }

        public void onExtrasChanged(Bundle bundle)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(7, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel.recycle();
            throw bundle;
        }

        public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (mediametadatacompat == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            mediametadatacompat.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            mediametadatacompat;
            parcel.recycle();
            throw mediametadatacompat;
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (playbackstatecompat == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            playbackstatecompat.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            playbackstatecompat;
            parcel.recycle();
            throw playbackstatecompat;
        }

        public void onQueueChanged(List list)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcel.writeTypedList(list);
            mRemote.transact(5, parcel, null, 1);
            parcel.recycle();
            return;
            list;
            parcel.recycle();
            throw list;
        }

        public void onQueueTitleChanged(CharSequence charsequence)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (charsequence == null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            parcel.writeInt(1);
            TextUtils.writeToParcel(charsequence, parcel, 0);
_L1:
            mRemote.transact(6, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            charsequence;
            parcel.recycle();
            throw charsequence;
        }

        public void onSessionDestroyed()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            mRemote.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (parcelablevolumeinfo == null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            parcel.writeInt(1);
            parcelablevolumeinfo.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(8, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            parcelablevolumeinfo;
            parcel.recycle();
            throw parcelablevolumeinfo;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void onEvent(String s, Bundle bundle)
        throws RemoteException;

    public abstract void onExtrasChanged(Bundle bundle)
        throws RemoteException;

    public abstract void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
        throws RemoteException;

    public abstract void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
        throws RemoteException;

    public abstract void onQueueChanged(List list)
        throws RemoteException;

    public abstract void onQueueTitleChanged(CharSequence charsequence)
        throws RemoteException;

    public abstract void onSessionDestroyed()
        throws RemoteException;

    public abstract void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
        throws RemoteException;
}
