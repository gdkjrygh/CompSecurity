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
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            NotificationBuilderWithActions, NotificationCompatJellybean, NotificationBuilderWithBuilderAccessor

public class NotificationCompat
{
    public static class BigTextStyle extends Style
    {

        CharSequence mBigText;

        public BigTextStyle bigText(CharSequence charsequence)
        {
            mBigText = Builder.limitCharSequenceLength(charsequence);
            return this;
        }

        public BigTextStyle setBigContentTitle(CharSequence charsequence)
        {
            mBigContentTitle = Builder.limitCharSequenceLength(charsequence);
            return this;
        }

        public BigTextStyle setSummaryText(CharSequence charsequence)
        {
            mSummaryText = Builder.limitCharSequenceLength(charsequence);
            mSummaryTextSet = true;
            return this;
        }

        public BigTextStyle()
        {
        }

        public BigTextStyle(Builder builder)
        {
            setBuilder(builder);
        }
    }

    public static class Builder
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
        public Style mStyle;
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

        public Builder addAction(int i, CharSequence charsequence, PendingIntent pendingintent)
        {
        /* block-local class not found */
        class Action {}

            mActions.add(new Action(i, charsequence, pendingintent));
            return this;
        }

        public Builder addAction(Action action)
        {
            mActions.add(action);
            return this;
        }

        public Builder addExtras(Bundle bundle)
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

        public Builder addPerson(String s)
        {
            mPeople.add(s);
            return this;
        }

        public Notification build()
        {
        /* block-local class not found */
        class NotificationCompatImpl {}

            return NotificationCompat.IMPL.build(this, getExtender());
        }

        public Builder extend(Extender extender)
        {
        /* block-local class not found */
        class Extender {}

            extender.extend(this);
            return this;
        }

        protected BuilderExtender getExtender()
        {
        /* block-local class not found */
        class BuilderExtender {}

            return new BuilderExtender();
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

        public Builder setAutoCancel(boolean flag)
        {
            setFlag(16, flag);
            return this;
        }

        public Builder setCategory(String s)
        {
            mCategory = s;
            return this;
        }

        public Builder setColor(int i)
        {
            mColor = i;
            return this;
        }

        public Builder setContent(RemoteViews remoteviews)
        {
            mNotification.contentView = remoteviews;
            return this;
        }

        public Builder setContentInfo(CharSequence charsequence)
        {
            mContentInfo = limitCharSequenceLength(charsequence);
            return this;
        }

        public Builder setContentIntent(PendingIntent pendingintent)
        {
            mContentIntent = pendingintent;
            return this;
        }

        public Builder setContentText(CharSequence charsequence)
        {
            mContentText = limitCharSequenceLength(charsequence);
            return this;
        }

        public Builder setContentTitle(CharSequence charsequence)
        {
            mContentTitle = limitCharSequenceLength(charsequence);
            return this;
        }

        public Builder setDefaults(int i)
        {
            mNotification.defaults = i;
            if ((i & 4) != 0)
            {
                Notification notification = mNotification;
                notification.flags = notification.flags | 1;
            }
            return this;
        }

        public Builder setDeleteIntent(PendingIntent pendingintent)
        {
            mNotification.deleteIntent = pendingintent;
            return this;
        }

        public Builder setExtras(Bundle bundle)
        {
            mExtras = bundle;
            return this;
        }

        public Builder setFullScreenIntent(PendingIntent pendingintent, boolean flag)
        {
            mFullScreenIntent = pendingintent;
            setFlag(128, flag);
            return this;
        }

        public Builder setGroup(String s)
        {
            mGroupKey = s;
            return this;
        }

        public Builder setGroupSummary(boolean flag)
        {
            mGroupSummary = flag;
            return this;
        }

        public Builder setLargeIcon(Bitmap bitmap)
        {
            mLargeIcon = bitmap;
            return this;
        }

        public Builder setLights(int i, int j, int k)
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

        public Builder setLocalOnly(boolean flag)
        {
            mLocalOnly = flag;
            return this;
        }

        public Builder setNumber(int i)
        {
            mNumber = i;
            return this;
        }

        public Builder setOngoing(boolean flag)
        {
            setFlag(2, flag);
            return this;
        }

        public Builder setOnlyAlertOnce(boolean flag)
        {
            setFlag(8, flag);
            return this;
        }

        public Builder setPriority(int i)
        {
            mPriority = i;
            return this;
        }

        public Builder setProgress(int i, int j, boolean flag)
        {
            mProgressMax = i;
            mProgress = j;
            mProgressIndeterminate = flag;
            return this;
        }

        public Builder setPublicVersion(Notification notification)
        {
            mPublicVersion = notification;
            return this;
        }

        public Builder setShowWhen(boolean flag)
        {
            mShowWhen = flag;
            return this;
        }

        public Builder setSmallIcon(int i)
        {
            mNotification.icon = i;
            return this;
        }

        public Builder setSmallIcon(int i, int j)
        {
            mNotification.icon = i;
            mNotification.iconLevel = j;
            return this;
        }

        public Builder setSortKey(String s)
        {
            mSortKey = s;
            return this;
        }

        public Builder setSound(Uri uri)
        {
            mNotification.sound = uri;
            mNotification.audioStreamType = -1;
            return this;
        }

        public Builder setSound(Uri uri, int i)
        {
            mNotification.sound = uri;
            mNotification.audioStreamType = i;
            return this;
        }

        public Builder setStyle(Style style)
        {
            if (mStyle != style)
            {
                mStyle = style;
                if (mStyle != null)
                {
                    mStyle.setBuilder(this);
                }
            }
            return this;
        }

        public Builder setSubText(CharSequence charsequence)
        {
            mSubText = limitCharSequenceLength(charsequence);
            return this;
        }

        public Builder setTicker(CharSequence charsequence)
        {
            mNotification.tickerText = limitCharSequenceLength(charsequence);
            return this;
        }

        public Builder setTicker(CharSequence charsequence, RemoteViews remoteviews)
        {
            mNotification.tickerText = limitCharSequenceLength(charsequence);
            mTickerView = remoteviews;
            return this;
        }

        public Builder setUsesChronometer(boolean flag)
        {
            mUseChronometer = flag;
            return this;
        }

        public Builder setVibrate(long al[])
        {
            mNotification.vibrate = al;
            return this;
        }

        public Builder setVisibility(int i)
        {
            mVisibility = i;
            return this;
        }

        public Builder setWhen(long l)
        {
            mNotification.when = l;
            return this;
        }

        public Builder(Context context)
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

    public static abstract class Style
    {

        CharSequence mBigContentTitle;
        Builder mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet;

        public Notification build()
        {
            Notification notification = null;
            if (mBuilder != null)
            {
                notification = mBuilder.build();
            }
            return notification;
        }

        public void setBuilder(Builder builder)
        {
            if (mBuilder != builder)
            {
                mBuilder = builder;
                if (mBuilder != null)
                {
                    mBuilder.setStyle(this);
                }
            }
        }

        public Style()
        {
            mSummaryTextSet = false;
        }
    }


    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    private static final NotificationCompatImpl IMPL;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    public NotificationCompat()
    {
    }

    private static void addActionsToBuilder(NotificationBuilderWithActions notificationbuilderwithactions, ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); notificationbuilderwithactions.addAction((Action)arraylist.next())) { }
    }

    private static void addStyleToBuilderJellybean(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, Style style)
    {
        if (style != null)
        {
            if (style instanceof BigTextStyle)
            {
                style = (BigTextStyle)style;
                NotificationCompatJellybean.addBigTextStyle(notificationbuilderwithbuilderaccessor, ((BigTextStyle) (style)).mBigContentTitle, ((BigTextStyle) (style)).mSummaryTextSet, ((BigTextStyle) (style)).mSummaryText, ((BigTextStyle) (style)).mBigText);
            } else
            {
    /* block-local class not found */
    class InboxStyle {}

                if (style instanceof InboxStyle)
                {
                    style = (InboxStyle)style;
                    NotificationCompatJellybean.addInboxStyle(notificationbuilderwithbuilderaccessor, ((InboxStyle) (style)).mBigContentTitle, ((InboxStyle) (style)).mSummaryTextSet, ((InboxStyle) (style)).mSummaryText, ((InboxStyle) (style)).mTexts);
                    return;
                }
    /* block-local class not found */
    class BigPictureStyle {}

                if (style instanceof BigPictureStyle)
                {
                    style = (BigPictureStyle)style;
                    NotificationCompatJellybean.addBigPictureStyle(notificationbuilderwithbuilderaccessor, ((BigPictureStyle) (style)).mBigContentTitle, ((BigPictureStyle) (style)).mSummaryTextSet, ((BigPictureStyle) (style)).mSummaryText, ((BigPictureStyle) (style)).mPicture, ((BigPictureStyle) (style)).mBigLargeIcon, ((BigPictureStyle) (style)).mBigLargeIconSet);
                    return;
                }
            }
        }
    }

    public static Action getAction(Notification notification, int i)
    {
        return IMPL.getAction(notification, i);
    }

    public static int getActionCount(Notification notification)
    {
        return IMPL.getActionCount(notification);
    }

    public static String getCategory(Notification notification)
    {
        return IMPL.getCategory(notification);
    }

    public static Bundle getExtras(Notification notification)
    {
        return IMPL.getExtras(notification);
    }

    public static String getGroup(Notification notification)
    {
        return IMPL.getGroup(notification);
    }

    public static boolean getLocalOnly(Notification notification)
    {
        return IMPL.getLocalOnly(notification);
    }

    private static Notification[] getNotificationArrayFromBundle(Bundle bundle, String s)
    {
        android.os.Parcelable aparcelable[] = bundle.getParcelableArray(s);
        if ((aparcelable instanceof Notification[]) || aparcelable == null)
        {
            return (Notification[])(Notification[])aparcelable;
        }
        Notification anotification[] = new Notification[aparcelable.length];
        for (int i = 0; i < aparcelable.length; i++)
        {
            anotification[i] = (Notification)aparcelable[i];
        }

        bundle.putParcelableArray(s, anotification);
        return anotification;
    }

    public static String getSortKey(Notification notification)
    {
        return IMPL.getSortKey(notification);
    }

    public static boolean isGroupSummary(Notification notification)
    {
        return IMPL.isGroupSummary(notification);
    }

    static 
    {
    /* block-local class not found */
    class NotificationCompatImplApi20 {}

    /* block-local class not found */
    class NotificationCompatImplApi21 {}

    /* block-local class not found */
    class NotificationCompatImplBase {}

    /* block-local class not found */
    class NotificationCompatImplGingerbread {}

    /* block-local class not found */
    class NotificationCompatImplHoneycomb {}

    /* block-local class not found */
    class NotificationCompatImplIceCreamSandwich {}

    /* block-local class not found */
    class NotificationCompatImplJellybean {}

    /* block-local class not found */
    class NotificationCompatImplKitKat {}

        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            IMPL = new NotificationCompatImplApi21();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            IMPL = new NotificationCompatImplApi20();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            IMPL = new NotificationCompatImplKitKat();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new NotificationCompatImplJellybean();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new NotificationCompatImplIceCreamSandwich();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMPL = new NotificationCompatImplHoneycomb();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            IMPL = new NotificationCompatImplGingerbread();
        } else
        {
            IMPL = new NotificationCompatImplBase();
        }
    }





    // Unreferenced inner class android/support/v4/app/NotificationCompat$CarExtender
    /* block-local class not found */
    class CarExtender {}


    // Unreferenced inner class android/support/v4/app/NotificationCompat$WearableExtender
    /* block-local class not found */
    class WearableExtender {}

}
