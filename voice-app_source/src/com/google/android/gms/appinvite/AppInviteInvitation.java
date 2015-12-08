// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appinvite;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.zzu;

public final class AppInviteInvitation
{
    public static final class IntentBuilder
    {

        public static final int MAX_MESSAGE_LENGTH = 100;
        public static final int PROJECT_PLATFORM_IOS = 1;
        private final Intent mIntent = new Intent("com.google.android.gms.appinvite.ACTION_APP_INVITE");

        public Intent build()
        {
            return mIntent;
        }

        public IntentBuilder setAccount(Account account)
        {
            if (account != null && "com.google".equals(account.type))
            {
                mIntent.putExtra("com.google.android.gms.appinvite.ACCOUNT_NAME", account);
                return this;
            } else
            {
                mIntent.removeExtra("com.google.android.gms.appinvite.ACCOUNT_NAME");
                return this;
            }
        }

        public IntentBuilder setDeepLink(Uri uri)
        {
            if (uri != null)
            {
                mIntent.putExtra("com.google.android.gms.appinvite.DEEP_LINK_URL", uri);
                return this;
            } else
            {
                mIntent.removeExtra("com.google.android.gms.appinvite.DEEP_LINK_URL");
                return this;
            }
        }

        public IntentBuilder setGoogleAnalyticsTrackingId(String s)
        {
            mIntent.putExtra("com.google.android.gms.appinvite.GOOGLE_ANALYTICS_TRACKING_ID", s);
            return this;
        }

        public IntentBuilder setMessage(CharSequence charsequence)
        {
            if (charsequence != null && charsequence.length() > 100)
            {
                throw new IllegalArgumentException(String.format("Message must be %d chars or less.", new Object[] {
                    Integer.valueOf(100)
                }));
            } else
            {
                mIntent.putExtra("com.google.android.gms.appinvite.MESSAGE", charsequence);
                return this;
            }
        }

        public IntentBuilder setOtherPlatformsTargetApplication(int i, String s)
        {
            if (i == 1)
            {
                mIntent.putExtra("com.google.android.gms.appinvite.iosTargetApplication", s);
            }
            return this;
        }

        public IntentBuilder(CharSequence charsequence)
        {
            zzu.zzu(charsequence);
            mIntent.putExtra("com.google.android.gms.appinvite.TITLE", charsequence);
            mIntent.setPackage("com.google.android.gms");
        }
    }


    private AppInviteInvitation()
    {
    }

    public static String[] getInvitationIds(int i, Intent intent)
    {
        if (i == -1)
        {
            return intent.getStringArrayExtra("com.google.android.gms.appinvite.RESULT_INVITATION_IDS");
        } else
        {
            return null;
        }
    }
}
