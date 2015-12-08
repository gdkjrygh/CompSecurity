// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            PlaybackStateCompatApi21, PlaybackStateCompatApi22

public final class PlaybackStateCompat
    implements Parcelable
{
    public static final class Builder
    {

        private long mActions;
        private long mActiveItemId;
        private long mBufferedPosition;
        private final List mCustomActions;
        private CharSequence mErrorMessage;
        private Bundle mExtras;
        private long mPosition;
        private float mRate;
        private int mState;
        private long mUpdateTime;

        public Builder addCustomAction(CustomAction customaction)
        {
            if (customaction == null)
            {
                throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat.");
            } else
            {
                mCustomActions.add(customaction);
                return this;
            }
        }

        public Builder addCustomAction(String s, String s1, int i)
        {
            return addCustomAction(new CustomAction(s, s1, i, null));
        }

        public PlaybackStateCompat build()
        {
            return new PlaybackStateCompat(mState, mPosition, mBufferedPosition, mRate, mActions, mErrorMessage, mUpdateTime, mCustomActions, mActiveItemId, mExtras);
        }

        public Builder setActions(long l)
        {
            mActions = l;
            return this;
        }

        public Builder setActiveQueueItemId(long l)
        {
            mActiveItemId = l;
            return this;
        }

        public Builder setBufferedPosition(long l)
        {
            mBufferedPosition = l;
            return this;
        }

        public Builder setErrorMessage(CharSequence charsequence)
        {
            mErrorMessage = charsequence;
            return this;
        }

        public Builder setExtras(Bundle bundle)
        {
            mExtras = bundle;
            return this;
        }

        public Builder setState(int i, long l, float f)
        {
            return setState(i, l, f, SystemClock.elapsedRealtime());
        }

        public Builder setState(int i, long l, float f, long l1)
        {
            mState = i;
            mPosition = l;
            mUpdateTime = l1;
            mRate = f;
            return this;
        }

        public Builder()
        {
            mCustomActions = new ArrayList();
            mActiveItemId = -1L;
        }

        public Builder(PlaybackStateCompat playbackstatecompat)
        {
            mCustomActions = new ArrayList();
            mActiveItemId = -1L;
            mState = playbackstatecompat.mState;
            mPosition = playbackstatecompat.mPosition;
            mRate = playbackstatecompat.mSpeed;
            mUpdateTime = playbackstatecompat.mUpdateTime;
            mBufferedPosition = playbackstatecompat.mBufferedPosition;
            mActions = playbackstatecompat.mActions;
            mErrorMessage = playbackstatecompat.mErrorMessage;
            if (playbackstatecompat.mCustomActions != null)
            {
                mCustomActions.addAll(playbackstatecompat.mCustomActions);
            }
            mActiveItemId = playbackstatecompat.mActiveItemId;
            mExtras = playbackstatecompat.mExtras;
        }
    }

    public static final class CustomAction
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public CustomAction createFromParcel(Parcel parcel)
            {
                return new CustomAction(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public CustomAction[] newArray(int i)
            {
                return new CustomAction[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private final String mAction;
        private Object mCustomActionObj;
        private final Bundle mExtras;
        private final int mIcon;
        private final CharSequence mName;

        public static CustomAction fromCustomAction(Object obj)
        {
            if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
            {
                return null;
            } else
            {
                CustomAction customaction = new CustomAction(PlaybackStateCompatApi21.CustomAction.getAction(obj), PlaybackStateCompatApi21.CustomAction.getName(obj), PlaybackStateCompatApi21.CustomAction.getIcon(obj), PlaybackStateCompatApi21.CustomAction.getExtras(obj));
                customaction.mCustomActionObj = obj;
                return customaction;
            }
        }

        public int describeContents()
        {
            return 0;
        }

        public String getAction()
        {
            return mAction;
        }

        public Object getCustomAction()
        {
            if (mCustomActionObj != null || android.os.Build.VERSION.SDK_INT < 21)
            {
                return mCustomActionObj;
            } else
            {
                mCustomActionObj = PlaybackStateCompatApi21.CustomAction.newInstance(mAction, mName, mIcon, mExtras);
                return mCustomActionObj;
            }
        }

        public Bundle getExtras()
        {
            return mExtras;
        }

        public int getIcon()
        {
            return mIcon;
        }

        public CharSequence getName()
        {
            return mName;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Action:mName='").append(mName).append(", mIcon=").append(mIcon).append(", mExtras=").append(mExtras).toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(mAction);
            TextUtils.writeToParcel(mName, parcel, i);
            parcel.writeInt(mIcon);
            parcel.writeBundle(mExtras);
        }


        private CustomAction(Parcel parcel)
        {
            mAction = parcel.readString();
            mName = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            mIcon = parcel.readInt();
            mExtras = parcel.readBundle();
        }


        private CustomAction(String s, CharSequence charsequence, int i, Bundle bundle)
        {
            mAction = s;
            mName = charsequence;
            mIcon = i;
            mExtras = bundle;
        }

    }

    public static final class CustomAction.Builder
    {

        private final String mAction;
        private Bundle mExtras;
        private final int mIcon;
        private final CharSequence mName;

        public CustomAction build()
        {
            return new CustomAction(mAction, mName, mIcon, mExtras);
        }

        public CustomAction.Builder setExtras(Bundle bundle)
        {
            mExtras = bundle;
            return this;
        }

        public CustomAction.Builder(String s, CharSequence charsequence, int i)
        {
            if (TextUtils.isEmpty(s))
            {
                throw new IllegalArgumentException("You must specify an action to build a CustomAction.");
            }
            if (TextUtils.isEmpty(charsequence))
            {
                throw new IllegalArgumentException("You must specify a name to build a CustomAction.");
            }
            if (i == 0)
            {
                throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction.");
            } else
            {
                mAction = s;
                mName = charsequence;
                mIcon = i;
                return;
            }
        }
    }


    public static final long ACTION_FAST_FORWARD = 64L;
    public static final long ACTION_PAUSE = 2L;
    public static final long ACTION_PLAY = 4L;
    public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024L;
    public static final long ACTION_PLAY_FROM_SEARCH = 2048L;
    public static final long ACTION_PLAY_PAUSE = 512L;
    public static final long ACTION_REWIND = 8L;
    public static final long ACTION_SEEK_TO = 256L;
    public static final long ACTION_SET_RATING = 128L;
    public static final long ACTION_SKIP_TO_NEXT = 32L;
    public static final long ACTION_SKIP_TO_PREVIOUS = 16L;
    public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096L;
    public static final long ACTION_STOP = 1L;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public PlaybackStateCompat createFromParcel(Parcel parcel)
        {
            return new PlaybackStateCompat(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public PlaybackStateCompat[] newArray(int i)
        {
            return new PlaybackStateCompat[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public static final long PLAYBACK_POSITION_UNKNOWN = -1L;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_CONNECTING = 8;
    public static final int STATE_ERROR = 7;
    public static final int STATE_FAST_FORWARDING = 4;
    public static final int STATE_NONE = 0;
    public static final int STATE_PAUSED = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_REWINDING = 5;
    public static final int STATE_SKIPPING_TO_NEXT = 10;
    public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
    public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
    public static final int STATE_STOPPED = 1;
    private final long mActions;
    private final long mActiveItemId;
    private final long mBufferedPosition;
    private List mCustomActions;
    private final CharSequence mErrorMessage;
    private final Bundle mExtras;
    private final long mPosition;
    private final float mSpeed;
    private final int mState;
    private Object mStateObj;
    private final long mUpdateTime;

    private PlaybackStateCompat(int i, long l, long l1, float f, long l2, CharSequence charsequence, long l3, List list, long l4, 
            Bundle bundle)
    {
        mState = i;
        mPosition = l;
        mBufferedPosition = l1;
        mSpeed = f;
        mActions = l2;
        mErrorMessage = charsequence;
        mUpdateTime = l3;
        mCustomActions = new ArrayList(list);
        mActiveItemId = l4;
        mExtras = bundle;
    }

    PlaybackStateCompat(int i, long l, long l1, float f, long l2, CharSequence charsequence, long l3, List list, long l4, 
            Bundle bundle, _cls1 _pcls1)
    {
        this(i, l, l1, f, l2, charsequence, l3, list, l4, bundle);
    }

    private PlaybackStateCompat(Parcel parcel)
    {
        mState = parcel.readInt();
        mPosition = parcel.readLong();
        mSpeed = parcel.readFloat();
        mUpdateTime = parcel.readLong();
        mBufferedPosition = parcel.readLong();
        mActions = parcel.readLong();
        mErrorMessage = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        mCustomActions = parcel.createTypedArrayList(CustomAction.CREATOR);
        mActiveItemId = parcel.readLong();
        mExtras = parcel.readBundle();
    }


    public static PlaybackStateCompat fromPlaybackState(Object obj)
    {
        if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return null;
        }
        Object obj2 = PlaybackStateCompatApi21.getCustomActions(obj);
        Object obj1 = null;
        if (obj2 != null)
        {
            ArrayList arraylist = new ArrayList(((List) (obj2)).size());
            obj2 = ((List) (obj2)).iterator();
            do
            {
                obj1 = arraylist;
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                arraylist.add(CustomAction.fromCustomAction(((Iterator) (obj2)).next()));
            } while (true);
        }
        Bundle bundle;
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            bundle = PlaybackStateCompatApi22.getExtras(obj);
        } else
        {
            bundle = null;
        }
        obj1 = new PlaybackStateCompat(PlaybackStateCompatApi21.getState(obj), PlaybackStateCompatApi21.getPosition(obj), PlaybackStateCompatApi21.getBufferedPosition(obj), PlaybackStateCompatApi21.getPlaybackSpeed(obj), PlaybackStateCompatApi21.getActions(obj), PlaybackStateCompatApi21.getErrorMessage(obj), PlaybackStateCompatApi21.getLastPositionUpdateTime(obj), ((List) (obj1)), PlaybackStateCompatApi21.getActiveQueueItemId(obj), bundle);
        obj1.mStateObj = obj;
        return ((PlaybackStateCompat) (obj1));
    }

    public int describeContents()
    {
        return 0;
    }

    public long getActions()
    {
        return mActions;
    }

    public long getActiveQueueItemId()
    {
        return mActiveItemId;
    }

    public long getBufferedPosition()
    {
        return mBufferedPosition;
    }

    public List getCustomActions()
    {
        return mCustomActions;
    }

    public CharSequence getErrorMessage()
    {
        return mErrorMessage;
    }

    public Bundle getExtras()
    {
        return mExtras;
    }

    public long getLastPositionUpdateTime()
    {
        return mUpdateTime;
    }

    public float getPlaybackSpeed()
    {
        return mSpeed;
    }

    public Object getPlaybackState()
    {
        if (mStateObj != null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return mStateObj;
        }
        ArrayList arraylist = null;
        if (mCustomActions != null)
        {
            ArrayList arraylist1 = new ArrayList(mCustomActions.size());
            Iterator iterator = mCustomActions.iterator();
            do
            {
                arraylist = arraylist1;
                if (!iterator.hasNext())
                {
                    break;
                }
                arraylist1.add(((CustomAction)iterator.next()).getCustomAction());
            } while (true);
        }
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            mStateObj = PlaybackStateCompatApi22.newInstance(mState, mPosition, mBufferedPosition, mSpeed, mActions, mErrorMessage, mUpdateTime, arraylist, mActiveItemId, mExtras);
        } else
        {
            mStateObj = PlaybackStateCompatApi21.newInstance(mState, mPosition, mBufferedPosition, mSpeed, mActions, mErrorMessage, mUpdateTime, arraylist, mActiveItemId);
        }
        return mStateObj;
    }

    public long getPosition()
    {
        return mPosition;
    }

    public int getState()
    {
        return mState;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("PlaybackState {");
        stringbuilder.append("state=").append(mState);
        stringbuilder.append(", position=").append(mPosition);
        stringbuilder.append(", buffered position=").append(mBufferedPosition);
        stringbuilder.append(", speed=").append(mSpeed);
        stringbuilder.append(", updated=").append(mUpdateTime);
        stringbuilder.append(", actions=").append(mActions);
        stringbuilder.append(", error=").append(mErrorMessage);
        stringbuilder.append(", custom actions=").append(mCustomActions);
        stringbuilder.append(", active item id=").append(mActiveItemId);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mState);
        parcel.writeLong(mPosition);
        parcel.writeFloat(mSpeed);
        parcel.writeLong(mUpdateTime);
        parcel.writeLong(mBufferedPosition);
        parcel.writeLong(mActions);
        TextUtils.writeToParcel(mErrorMessage, parcel, i);
        parcel.writeTypedList(mCustomActions);
        parcel.writeLong(mActiveItemId);
        parcel.writeBundle(mExtras);
    }











}
