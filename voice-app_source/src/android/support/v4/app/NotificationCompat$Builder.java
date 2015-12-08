// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat

public static class mPeople
{

    private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
    public ArrayList mActions;
    String mCategory;
    int mColor;
    public CharSequence mContentInfo;
    PendingIntent mContentIntent;
    public CharSequence mContentText;
    public CharSequence mContentTitle;
    public Context mContext;
    Bundle mExtras;
    PendingIntent mFullScreenIntent;
    String mGroupKey;
    boolean mGroupSummary;
    public Bitmap mLargeIcon;
    boolean mLocalOnly;
    public Notification mNotification;
    public int mNumber;
    public ArrayList mPeople;
    int mPriority;
    int mProgress;
    boolean mProgressIndeterminate;
    int mProgressMax;
    Notification mPublicVersion;
    boolean mShowWhen;
    String mSortKey;
    public mNotification mStyle;
    public CharSequence mSubText;
    RemoteViews mTickerView;
    public boolean mUseChronometer;
    int mVisibility;

    protected static CharSequence limitCharSequenceLength(CharSequence charsequence)
    {
        while (charsequence == null || charsequence.length() <= 5120) 
        {
            return charsequence;
        }
        return charsequence.subSequence(0, 5120);
    }

    private void setFlag(int i, boolean flag)
    {
        if (flag)
        {
            Notification notification = mNotification;
            notification.flags = notification.flags | i;
            return;
        } else
        {
            Notification notification1 = mNotification;
            notification1.flags = notification1.flags & ~i;
            return;
        }
    }

    public mNotification addAction(int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        mActions.add(new init>(i, charsequence, pendingintent));
        return this;
    }

    public init> addAction(init> init>)
    {
        mActions.add(init>);
        return this;
    }

    public mActions addExtras(Bundle bundle)
    {
label0:
        {
            if (bundle != null)
            {
                if (mExtras != null)
                {
                    break label0;
                }
                mExtras = new Bundle(bundle);
            }
            return this;
        }
        mExtras.putAll(bundle);
        return this;
    }

    public mExtras addPerson(String s)
    {
        mPeople.add(s);
        return this;
    }

    public Notification build()
    {
        return NotificationCompat.access$200().build(this, getExtender());
    }

    public  extend( )
    {
        .extend(this);
        return this;
    }

    protected xtender getExtender()
    {
        return new xtender();
    }

    public Bundle getExtras()
    {
        if (mExtras == null)
        {
            mExtras = new Bundle();
        }
        return mExtras;
    }

    public Notification getNotification()
    {
        return build();
    }

    public build setAutoCancel(boolean flag)
    {
        setFlag(16, flag);
        return this;
    }

    public setFlag setCategory(String s)
    {
        mCategory = s;
        return this;
    }

    public mCategory setColor(int i)
    {
        mColor = i;
        return this;
    }

    public mColor setContent(RemoteViews remoteviews)
    {
        mNotification.contentView = remoteviews;
        return this;
    }

    public mNotification setContentInfo(CharSequence charsequence)
    {
        mContentInfo = limitCharSequenceLength(charsequence);
        return this;
    }

    public limitCharSequenceLength setContentIntent(PendingIntent pendingintent)
    {
        mContentIntent = pendingintent;
        return this;
    }

    public mContentIntent setContentText(CharSequence charsequence)
    {
        mContentText = limitCharSequenceLength(charsequence);
        return this;
    }

    public limitCharSequenceLength setContentTitle(CharSequence charsequence)
    {
        mContentTitle = limitCharSequenceLength(charsequence);
        return this;
    }

    public limitCharSequenceLength setDefaults(int i)
    {
        mNotification.defaults = i;
        if ((i & 4) != 0)
        {
            Notification notification = mNotification;
            notification.flags = notification.flags | 1;
        }
        return this;
    }

    public mNotification setDeleteIntent(PendingIntent pendingintent)
    {
        mNotification.deleteIntent = pendingintent;
        return this;
    }

    public mNotification setExtras(Bundle bundle)
    {
        mExtras = bundle;
        return this;
    }

    public mExtras setFullScreenIntent(PendingIntent pendingintent, boolean flag)
    {
        mFullScreenIntent = pendingintent;
        setFlag(128, flag);
        return this;
    }

    public setFlag setGroup(String s)
    {
        mGroupKey = s;
        return this;
    }

    public mGroupKey setGroupSummary(boolean flag)
    {
        mGroupSummary = flag;
        return this;
    }

    public mGroupSummary setLargeIcon(Bitmap bitmap)
    {
        mLargeIcon = bitmap;
        return this;
    }

    public mLargeIcon setLights(int i, int j, int k)
    {
        boolean flag = true;
        mNotification.ledARGB = i;
        mNotification.ledOnMS = j;
        mNotification.ledOffMS = k;
        Notification notification;
        if (mNotification.ledOnMS != 0 && mNotification.ledOffMS != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        notification = mNotification;
        j = mNotification.flags;
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        notification.flags = i | j & -2;
        return this;
    }

    public mNotification setLocalOnly(boolean flag)
    {
        mLocalOnly = flag;
        return this;
    }

    public mLocalOnly setNumber(int i)
    {
        mNumber = i;
        return this;
    }

    public mNumber setOngoing(boolean flag)
    {
        setFlag(2, flag);
        return this;
    }

    public setFlag setOnlyAlertOnce(boolean flag)
    {
        setFlag(8, flag);
        return this;
    }

    public setFlag setPriority(int i)
    {
        mPriority = i;
        return this;
    }

    public mPriority setProgress(int i, int j, boolean flag)
    {
        mProgressMax = i;
        mProgress = j;
        mProgressIndeterminate = flag;
        return this;
    }

    public mProgressIndeterminate setPublicVersion(Notification notification)
    {
        mPublicVersion = notification;
        return this;
    }

    public mPublicVersion setShowWhen(boolean flag)
    {
        mShowWhen = flag;
        return this;
    }

    public mShowWhen setSmallIcon(int i)
    {
        mNotification.icon = i;
        return this;
    }

    public mNotification setSmallIcon(int i, int j)
    {
        mNotification.icon = i;
        mNotification.iconLevel = j;
        return this;
    }

    public mNotification setSortKey(String s)
    {
        mSortKey = s;
        return this;
    }

    public mSortKey setSound(Uri uri)
    {
        mNotification.sound = uri;
        mNotification.audioStreamType = -1;
        return this;
    }

    public mNotification setSound(Uri uri, int i)
    {
        mNotification.sound = uri;
        mNotification.audioStreamType = i;
        return this;
    }

    public mNotification setStyle(mNotification mnotification)
    {
        if (mStyle != mnotification)
        {
            mStyle = mnotification;
            if (mStyle != null)
            {
                mStyle.tBuilder(this);
            }
        }
        return this;
    }

    public tBuilder setSubText(CharSequence charsequence)
    {
        mSubText = limitCharSequenceLength(charsequence);
        return this;
    }

    public limitCharSequenceLength setTicker(CharSequence charsequence)
    {
        mNotification.tickerText = limitCharSequenceLength(charsequence);
        return this;
    }

    public limitCharSequenceLength setTicker(CharSequence charsequence, RemoteViews remoteviews)
    {
        mNotification.tickerText = limitCharSequenceLength(charsequence);
        mTickerView = remoteviews;
        return this;
    }

    public mTickerView setUsesChronometer(boolean flag)
    {
        mUseChronometer = flag;
        return this;
    }

    public mUseChronometer setVibrate(long al[])
    {
        mNotification.vibrate = al;
        return this;
    }

    public mNotification setVisibility(int i)
    {
        mVisibility = i;
        return this;
    }

    public mVisibility setWhen(long l)
    {
        mNotification.when = l;
        return this;
    }

    public xtender(Context context)
    {
        mShowWhen = true;
        mActions = new ArrayList();
        mLocalOnly = false;
        mColor = 0;
        mVisibility = 0;
        mNotification = new Notification();
        mContext = context;
        mNotification.when = System.currentTimeMillis();
        mNotification.audioStreamType = -1;
        mPriority = 0;
        mPeople = new ArrayList();
    }
}
