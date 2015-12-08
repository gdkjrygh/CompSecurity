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
            re