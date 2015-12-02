// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            FragmentActivity, NotificationBuilderWithActions, NotificationCompatJellybean, NotificationBuilderWithBuilderAccessor

public class NotificationCompat
{

    private static final NotificationCompatImpl IMPL;

    private static void addActionsToBuilder(NotificationBuilderWithActions notificationbuilderwithactions, ArrayList arraylist)
    {
        int i = FragmentActivity.a;
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            notificationbuilderwithactions.addAction((Action)arraylist.next());
        } while (i == 0);
    }

    private static void addStyleToBuilderJellybean(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, Style style)
    {
label0:
        {
            int i = FragmentActivity.a;
            if (style == null)
            {
                break label0;
            }
            if (style instanceof BigTextStyle)
            {
                BigTextStyle bigtextstyle = (BigTextStyle)style;
                NotificationCompatJellybean.addBigTextStyle(notificationbuilderwithbuilderaccessor, bigtextstyle.mBigContentTitle, bigtextstyle.mSummaryTextSet, bigtextstyle.mSummaryText, bigtextstyle.mBigText);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (style instanceof InboxStyle)
            {
                InboxStyle inboxstyle = (InboxStyle)style;
                NotificationCompatJellybean.addInboxStyle(notificationbuilderwithbuilderaccessor, inboxstyle.mBigContentTitle, inboxstyle.mSummaryTextSet, inboxstyle.mSummaryText, inboxstyle.mTexts);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (style instanceof BigPictureStyle)
            {
                style = (BigPictureStyle)style;
                NotificationCompatJellybean.addBigPictureStyle(notificationbuilderwithbuilderaccessor, ((BigPictureStyle) (style)).mBigContentTitle, ((BigPictureStyle) (style)).mSummaryTextSet, ((BigPictureStyle) (style)).mSummaryText, ((BigPictureStyle) (style)).mPicture, ((BigPictureStyle) (style)).mBigLargeIcon, ((BigPictureStyle) (style)).mBigLargeIconSet);
            }
        }
    }

    public static Bundle getExtras(Notification notification)
    {
        return IMPL.getExtras(notification);
    }

    static 
    {
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




    private class Action extends NotificationCompatBase.Action
    {
        private class Builder
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
            Style mStyle;
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

            public Builder addAction(int i, CharSequence charsequence, PendingIntent pendingintent)
            {
                mActions.add(new Action(i, charsequence, pendingintent));
                return this;
            }

            public Builder addPerson(String s)
            {
                mPeople.add(s);
                return this;
            }

            public Notification build()
            {
                return NotificationCompat.IMPL.build(this);
            }

            public Builder extend(Extender extender)
            {
                extender.extend(this);
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
                return NotificationCompat.IMPL.build(this);
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
                notification.flags = j & -2 | i;
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

            public Builder setSmallIcon(int i)
            {
                mNotification.icon = i;
                return this;
            }

            public Builder setSound(Uri uri)
            {
                mNotification.sound = uri;
                mNotification.audioStreamType = -1;
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

            public Builder setTicker(CharSequence charsequence)
            {
                mNotification.tickerText = limitCharSequenceLength(charsequence);
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

            private class Extender
            {

                public abstract Builder extend(Builder builder);
            }

        }


        public static final NotificationCompatBase.Action.Factory FACTORY = new _cls1();
        public PendingIntent actionIntent;
        public int icon;
        private final Bundle mExtras;
        private final RemoteInput mRemoteInputs[];
        public CharSequence title;

        protected PendingIntent getActionIntent()
        {
            return actionIntent;
        }

        public Bundle getExtras()
        {
            return mExtras;
        }

        protected int getIcon()
        {
            return icon;
        }

        public RemoteInput[] getRemoteInputs()
        {
            return mRemoteInputs;
        }

        public RemoteInputCompatBase.RemoteInput[] getRemoteInputs()
        {
            return getRemoteInputs();
        }

        protected CharSequence getTitle()
        {
            return title;
        }


        public Action(int i, CharSequence charsequence, PendingIntent pendingintent)
        {
            this(i, charsequence, pendingintent, new Bundle(), null);
        }

        private Action(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[])
        {
            icon = i;
            title = Builder.limitCharSequenceLength(charsequence);
            actionIntent = pendingintent;
            if (bundle == null)
            {
                bundle = new Bundle();
            }
            mExtras = bundle;
            mRemoteInputs = aremoteinput;
        }

        Action(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], _cls1 _pcls1)
        {
            this(i, charsequence, pendingintent, bundle, aremoteinput);
        }

        class _cls1
            implements NotificationCompatBase.Action.Factory
        {

                _cls1()
                {
                }
        }

    }


    private class BigTextStyle extends Style
    {
        private class Style
        {

            CharSequence mBigContentTitle;
            Builder mBuilder;
            CharSequence mSummaryText;
            boolean mSummaryTextSet;

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


        CharSequence mBigText;

        public BigTextStyle bigText(CharSequence charsequence)
        {
            mBigText = Builder.limitCharSequenceLength(charsequence);
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
    }


    private class InboxStyle extends Style
    {

        ArrayList mTexts;

        public InboxStyle addLine(CharSequence charsequence)
        {
            mTexts.add(Builder.limitCharSequenceLength(charsequence));
            return this;
        }

        public InboxStyle setSummaryText(CharSequence charsequence)
        {
            mSummaryText = Builder.limitCharSequenceLength(charsequence);
            mSummaryTextSet = true;
            return this;
        }

        public InboxStyle()
        {
            mTexts = new ArrayList();
        }
    }


    private class BigPictureStyle extends Style
    {

        Bitmap mBigLargeIcon;
        boolean mBigLargeIconSet;
        Bitmap mPicture;

        public BigPictureStyle bigPicture(Bitmap bitmap)
        {
            mPicture = bitmap;
            return this;
        }

        public BigPictureStyle setSummaryText(CharSequence charsequence)
        {
            mSummaryText = Builder.limitCharSequenceLength(charsequence);
            mSummaryTextSet = true;
            return this;
        }

        public BigPictureStyle()
        {
        }
    }


    private class NotificationCompatImpl
    {

        public abstract Notification build(Builder builder);

        public abstract Bundle getExtras(Notification notification);

        public abstract ArrayList getParcelableArrayListForActions(Action aaction[]);
    }


    private class NotificationCompatImplApi21 extends NotificationCompatImplApi20
    {
        private class NotificationCompatImplApi20 extends NotificationCompatImplKitKat
        {
            private class NotificationCompatImplKitKat extends NotificationCompatImplJellybean
            {
                private class NotificationCompatImplJellybean extends NotificationCompatImplBase
                {
                    private class NotificationCompatImplBase
                        implements NotificationCompatImpl
                    {

                        public Notification build(Builder builder)
                        {
                            Notification notification = builder.mNotification;
                            notification.setLatestEventInfo(builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentIntent);
                            if (builder.mPriority > 0)
                            {
                                notification.flags = notification.flags | 0x80;
                            }
                            return notification;
                        }

                        public Bundle getExtras(Notification notification)
                        {
                            return null;
                        }

                        public ArrayList getParcelableArrayListForActions(Action aaction[])
                        {
                            return null;
                        }

                        NotificationCompatImplBase()
                        {
                        }
                    }


                    public Notification build(Builder builder)
                    {
                        NotificationCompatJellybean.Builder builder1 = new NotificationCompatJellybean.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
                        NotificationCompat.addActionsToBuilder(builder1, builder.mActions);
                        NotificationCompat.addStyleToBuilderJellybean(builder1, builder.mStyle);
                        return builder1.build();
                    }

                    public Bundle getExtras(Notification notification)
                    {
                        return NotificationCompatJellybean.getExtras(notification);
                    }

                    public ArrayList getParcelableArrayListForActions(Action aaction[])
                    {
                        return NotificationCompatJellybean.getParcelableArrayListForActions(aaction);
                    }

                    NotificationCompatImplJellybean()
                    {
                    }
                }


                public Notification build(Builder builder)
                {
                    NotificationCompatKitKat.Builder builder1 = new NotificationCompatKitKat.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mPeople, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
                    NotificationCompat.addActionsToBuilder(builder1, builder.mActions);
                    NotificationCompat.addStyleToBuilderJellybean(builder1, builder.mStyle);
                    return builder1.build();
                }

                public Bundle getExtras(Notification notification)
                {
                    return NotificationCompatKitKat.getExtras(notification);
                }

                NotificationCompatImplKitKat()
                {
                }
            }


            public Notification build(Builder builder)
            {
                NotificationCompatApi20.Builder builder1 = new NotificationCompatApi20.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mPeople, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
                NotificationCompat.addActionsToBuilder(builder1, builder.mActions);
                NotificationCompat.addStyleToBuilderJellybean(builder1, builder.mStyle);
                return builder1.build();
            }

            public ArrayList getParcelableArrayListForActions(Action aaction[])
            {
                return NotificationCompatApi20.getParcelableArrayListForActions(aaction);
            }

            NotificationCompatImplApi20()
            {
            }
        }


        public Notification build(Builder builder)
        {
            NotificationCompatApi21.Builder builder1 = new NotificationCompatApi21.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mCategory, builder.mPeople, builder.mExtras, builder.mColor, builder.mVisibility, builder.mPublicVersion, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
            NotificationCompat.addActionsToBuilder(builder1, builder.mActions);
            NotificationCompat.addStyleToBuilderJellybean(builder1, builder.mStyle);
            return builder1.build();
        }

        NotificationCompatImplApi21()
        {
        }
    }


    private class NotificationCompatImplIceCreamSandwich extends NotificationCompatImplBase
    {

        public Notification build(Builder builder)
        {
            return NotificationCompatIceCreamSandwich.add(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        }

        NotificationCompatImplIceCreamSandwich()
        {
        }
    }


    private class NotificationCompatImplHoneycomb extends NotificationCompatImplBase
    {

        public Notification build(Builder builder)
        {
            return NotificationCompatHoneycomb.add(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon);
        }

        NotificationCompatImplHoneycomb()
        {
        }
    }


    private class NotificationCompatImplGingerbread extends NotificationCompatImplBase
    {

        public Notification build(Builder builder)
        {
            Notification notification = builder.mNotification;
            notification.setLatestEventInfo(builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentIntent);
            notification = NotificationCompatGingerbread.add(notification, builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentIntent, builder.mFullScreenIntent);
            if (builder.mPriority > 0)
            {
                notification.flags = notification.flags | 0x80;
            }
            return notification;
        }

        NotificationCompatImplGingerbread()
        {
        }
    }

}
