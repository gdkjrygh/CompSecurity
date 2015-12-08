// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat, RemoteInput

public static class <init> extends ion
{
    public static final class Builder
    {

        private final Bundle mExtras;
        private final int mIcon;
        private final PendingIntent mIntent;
        private ArrayList mRemoteInputs;
        private final CharSequence mTitle;

        public Builder addExtras(Bundle bundle)
        {
            if (bundle != null)
            {
                mExtras.putAll(bundle);
            }
            return this;
        }

        public Builder addRemoteInput(RemoteInput remoteinput)
        {
            if (mRemoteInputs == null)
            {
                mRemoteInputs = new ArrayList();
            }
            mRemoteInputs.add(remoteinput);
            return this;
        }

        public NotificationCompat.Action build()
        {
            RemoteInput aremoteinput[];
            if (mRemoteInputs != null)
            {
                aremoteinput = (RemoteInput[])mRemoteInputs.toArray(new RemoteInput[mRemoteInputs.size()]);
            } else
            {
                aremoteinput = null;
            }
            return new NotificationCompat.Action(mIcon, mTitle, mIntent, mExtras, aremoteinput, null);
        }

        public Builder extend(Extender extender)
        {
            extender.extend(this);
            return this;
        }

        public Bundle getExtras()
        {
            return mExtras;
        }

        public Builder(int i, CharSequence charsequence, PendingIntent pendingintent)
        {
            this(i, charsequence, pendingintent, new Bundle());
        }

        private Builder(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
        {
            mIcon = i;
            mTitle = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
            mIntent = pendingintent;
            mExtras = bundle;
        }

        public Builder(NotificationCompat.Action action)
        {
            this(action.icon, action.title, action.actionIntent, new Bundle(action.mExtras));
        }
    }

    public static interface Extender
    {

        public abstract Builder extend(Builder builder);
    }

    public static final class WearableExtender
        implements Extender
    {

        private static final int DEFAULT_FLAGS = 1;
        private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_AVAILABLE_OFFLINE = 1;
        private static final String KEY_CANCEL_LABEL = "cancelLabel";
        private static final String KEY_CONFIRM_LABEL = "confirmLabel";
        private static final String KEY_FLAGS = "flags";
        private static final String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
        private CharSequence mCancelLabel;
        private CharSequence mConfirmLabel;
        private int mFlags;
        private CharSequence mInProgressLabel;

        private void setFlag(int i, boolean flag)
        {
            if (flag)
            {
                mFlags = mFlags | i;
                return;
            } else
            {
                mFlags = mFlags & ~i;
                return;
            }
        }

        public WearableExtender clone()
        {
            WearableExtender wearableextender = new WearableExtender();
            wearableextender.mFlags = mFlags;
            wearableextender.mInProgressLabel = mInProgressLabel;
            wearableextender.mConfirmLabel = mConfirmLabel;
            wearableextender.mCancelLabel = mCancelLabel;
            return wearableextender;
        }

        public volatile Object clone()
            throws CloneNotSupportedException
        {
            return clone();
        }

        public Builder extend(Builder builder)
        {
            Bundle bundle = new Bundle();
            if (mFlags != 1)
            {
                bundle.putInt("flags", mFlags);
            }
            if (mInProgressLabel != null)
            {
                bundle.putCharSequence("inProgressLabel", mInProgressLabel);
            }
            if (mConfirmLabel != null)
            {
                bundle.putCharSequence("confirmLabel", mConfirmLabel);
            }
            if (mCancelLabel != null)
            {
                bundle.putCharSequence("cancelLabel", mCancelLabel);
            }
            builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
            return builder;
        }

        public CharSequence getCancelLabel()
        {
            return mCancelLabel;
        }

        public CharSequence getConfirmLabel()
        {
            return mConfirmLabel;
        }

        public CharSequence getInProgressLabel()
        {
            return mInProgressLabel;
        }

        public boolean isAvailableOffline()
        {
            return (mFlags & 1) != 0;
        }

        public WearableExtender setAvailableOffline(boolean flag)
        {
            setFlag(1, flag);
            return this;
        }

        public WearableExtender setCancelLabel(CharSequence charsequence)
        {
            mCancelLabel = charsequence;
            return this;
        }

        public WearableExtender setConfirmLabel(CharSequence charsequence)
        {
            mConfirmLabel = charsequence;
            return this;
        }

        public WearableExtender setInProgressLabel(CharSequence charsequence)
        {
            mInProgressLabel = charsequence;
            return this;
        }

        public WearableExtender()
        {
            mFlags = 1;
        }

        public WearableExtender(NotificationCompat.Action action)
        {
            mFlags = 1;
            action = action.getExtras().getBundle("android.wearable.EXTENSIONS");
            if (action != null)
            {
                mFlags = action.getInt("flags", 1);
                mInProgressLabel = action.getCharSequence("inProgressLabel");
                mConfirmLabel = action.getCharSequence("confirmLabel");
                mCancelLabel = action.getCharSequence("cancelLabel");
            }
        }
    }


    public static final ion.Factory FACTORY = new NotificationCompatBase.Action.Factory() {

        public NotificationCompat.Action build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInputCompatBase.RemoteInput aremoteinput[])
        {
            return new NotificationCompat.Action(i, charsequence, pendingintent, bundle, (RemoteInput[])aremoteinput, null);
        }

        public volatile NotificationCompatBase.Action build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInputCompatBase.RemoteInput aremoteinput[])
        {
            return build(i, charsequence, pendingintent, bundle, aremoteinput);
        }

        public NotificationCompat.Action[] newArray(int i)
        {
            return new NotificationCompat.Action[i];
        }

        public volatile NotificationCompatBase.Action[] newArray(int i)
        {
            return newArray(i);
        }

    };
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

    public volatile teInput[] getRemoteInputs()
    {
        return getRemoteInputs();
    }

    protected CharSequence getTitle()
    {
        return title;
    }



    public _cls1(int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        this(i, charsequence, pendingintent, new Bundle(), null);
    }

    private <init>(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[])
    {
        icon = i;
        title = .limitCharSequenceLength(charsequence);
        actionIntent = pendingintent;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        mExtras = bundle;
        mRemoteInputs = aremoteinput;
    }

    mRemoteInputs(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], mRemoteInputs mremoteinputs)
    {
        this(i, charsequence, pendingintent, bundle, aremoteinput);
    }
}
