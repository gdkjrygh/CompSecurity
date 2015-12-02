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
//            FragmentActivity, NotificationCompat

public class mPeople
{

    ArrayList mActions;
    String mCategory;
    int mColor;
    CharSequence mContentInfo;
    PendingIntent mContentIntent;
    CharSequence mContentText;
    CharSequence mContentTitle;
    Context mContext;
    Bundle mExtras;
    PendingIntent mFullScreenIntent;
    String mGroupKey;
    boolean mGroupSummary;
    Bitmap mLargeIcon;
    boolean mLocalOnly;
    Notification mNotification;
    int mNumber;
    public ArrayList mPeople;
    int mPriority;
    int mProgress;
    boolean mProgressIndeterminate;
    int mProgressMax;
    Notification mPublicVersion;
    boolean mShowWhen;
    String mSortKey;
    mNotification mStyle;
    CharSequence mSubText;
    RemoteViews mTickerView;
    boolean mUseChronometer;
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
label0:
        {
            if (flag)
            {
                Notification notification = mNotification;
                notification.flags = notification.flags | i;
                if (FragmentActivity.a == 0)
                {
                    break label0;
                }
            }
            Notification notification1 = mNotification;
            notification1.flags = notification1.flags & ~i;
        }
    }

    public mNotification addAction(int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        mActions.add(new init>(i, charsequence, pendingintent));
        return this;
    }

    public init> addPerson(String s)
    {
        mPeople.add(s);
        return this;
    }

    public Notification build()
    {
        return NotificationCompat.access$200().build(this);
    }

    public  extend( )
    {
        .extend(this);
        return this;
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
        return NotificationCompat.access$200().build(this);
    }

    public tionCompatImpl.build setCategory(String s)
    {
        mCategory = s;
        return this;
    }

    public mCategory setColor(int i)
    {
        mColor = i;
        return this;
    }

    public mColor setContentIntent(PendingIntent pendingintent)
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

    public mNotification setGroup(String s)
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
        notification.flags = j & -2 | i;
        return this;
    }

    public mNotification setOngoing(boolean flag)
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

    public mProgressIndeterminate setSmallIcon(int i)
    {
        mNotification.icon = i;
        return this;
    }

    public mNotification setSound(Uri uri)
    {
        mNotification.sound = uri;
        mNotification.audioStreamType = -1;
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

    public tBuilder setTicker(CharSequence charsequence)
    {
        mNotification.tickerText = limitCharSequenceLength(charsequence);
        return this;
    }

    public limitCharSequenceLength setUsesChronometer(boolean flag)
    {
        mUseChronometer = flag;
        return this;
    }

    public mUseChronometer setVibrate(long al[])
    {
        mNotification.vibrate = al;
        return this;
    }

    public mNotification setWhen(long l)
    {
        mNotification.when = l;
        return this;
    }

    public (Context context)
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
