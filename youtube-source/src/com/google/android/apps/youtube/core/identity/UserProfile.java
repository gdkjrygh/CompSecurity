// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.net.Uri;
import android.text.TextUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class UserProfile
    implements Serializable
{

    private static final int LEGAL_AGE = 18;
    public final Uri activityUri;
    public final int age;
    public final Uri alternateUri;
    public final String channelId;
    public final long channelViewsCount;
    public final String displayUsername;
    public final String email;
    public final int favoritesCount;
    public final Uri favoritesUri;
    public final Gender gender;
    public final boolean isEligibleForChannel;
    public final boolean isLightweight;
    public final Uri playlistsUri;
    public final String plusUserId;
    public final Uri selfUri;
    public final int subscribersCount;
    public final int subscriptionsCount;
    public final Uri subscriptionsUri;
    public final String summary;
    public final Uri thumbnailUri;
    public final long uploadViewsCount;
    public final int uploadedCount;
    public final Uri uploadsUri;
    public final Uri uri;
    public final String username;
    public final Uri watchHistoryUri;
    public final Uri watchLaterUri;

    public UserProfile(Uri uri1, Uri uri2, Uri uri3, String s, String s1, String s2, String s3, 
            String s4, int i, Gender gender1, String s5, Uri uri4, boolean flag, boolean flag1, 
            Uri uri5, int j, Uri uri6, int k, Uri uri7, int l, Uri uri8, 
            Uri uri9, Uri uri10, Uri uri11, long l1, long l2, 
            int i1)
    {
        uri = uri1;
        selfUri = uri2;
        alternateUri = uri3;
        if (s != null)
        {
            uri1 = s;
        } else
        {
            uri1 = s4;
        }
        username = uri1;
        if (!TextUtils.isEmpty(s1))
        {
            s = s1;
        }
        displayUsername = s;
        channelId = s2;
        plusUserId = s3;
        email = s4;
        age = i;
        gender = gender1;
        summary = s5;
        thumbnailUri = uri4;
        isLightweight = flag;
        isEligibleForChannel = flag1;
        uploadsUri = uri5;
        uploadedCount = j;
        favoritesUri = uri6;
        favoritesCount = k;
        subscriptionsUri = uri7;
        subscriptionsCount = l;
        watchHistoryUri = uri8;
        watchLaterUri = uri9;
        playlistsUri = uri10;
        activityUri = uri11;
        channelViewsCount = l1;
        uploadViewsCount = l2;
        subscribersCount = i1;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("builder required");
    }

    private Object writeReplace()
    {
        return buildUpon();
    }

    public final Builder buildUpon()
    {
        return (new Builder()).uri(uri).selfUri(selfUri).alternateUri(alternateUri).username(username).displayUsername(displayUsername).channelId(channelId).plusUserId(plusUserId).email(email).age(age).gender(gender).summary(summary).thumbnailUri(thumbnailUri).isLightweight(isLightweight).isEligibleForChannel(isEligibleForChannel).uploadsUri(uploadsUri).uploadedCount(uploadedCount).favoritesUri(favoritesUri).favoritesCount(favoritesCount).subscriptionsUri(subscriptionsUri).subscriptionsCount(subscriptionsCount).watchHistoryUri(watchHistoryUri).watchLaterUri(watchLaterUri).playlistsUri(playlistsUri).activityUri(activityUri).channelViewsCount(channelViewsCount).uploadViewsCount(uploadViewsCount).subscribersCount(subscribersCount);
    }

    public final boolean hasAge()
    {
        return age != -1;
    }

    public final boolean hasLegalAge()
    {
        return age >= 18;
    }

    public final String toString()
    {
        if (username != null)
        {
            return username;
        } else
        {
            return email;
        }
    }

    private class Builder
        implements r, Serializable
    {
        private class Gender extends Enum
        {

            private static final Gender $VALUES[];
            public static final Gender FEMALE;
            public static final Gender MALE;
            public static final Gender UNKNOWN;

            public static Gender valueOf(String s)
            {
                return (Gender)Enum.valueOf(com/google/android/apps/youtube/core/identity/UserProfile$Gender, s);
            }

            public static Gender[] values()
            {
                return (Gender[])$VALUES.clone();
            }

            static 
            {
                MALE = new Gender("MALE", 0);
                FEMALE = new Gender("FEMALE", 1);
                UNKNOWN = new Gender("UNKNOWN", 2);
                $VALUES = (new Gender[] {
                    MALE, FEMALE, UNKNOWN
                });
            }

            private Gender(String s, int i)
            {
                super(s, i);
            }
        }


        private Uri activityUri;
        private int age;
        private Uri alternateUri;
        private String channelId;
        private long channelViewsCount;
        private String displayUsername;
        private String email;
        private int favoritesCount;
        private Uri favoritesUri;
        private Gender gender;
        private boolean isEligibleForChannel;
        private boolean isLightweight;
        private Uri playlistsUri;
        private String plusUserId;
        private Uri selfUri;
        private int subscribersCount;
        private int subscriptionsCount;
        private Uri subscriptionsUri;
        private String summary;
        private Uri thumbnailUri;
        private long uploadViewsCount;
        private int uploadedCount;
        private Uri uploadsUri;
        private Uri uri;
        private String username;
        private Uri watchHistoryUri;
        private Uri watchLaterUri;

        private void readObject(ObjectInputStream objectinputstream)
        {
            uri = p.a((String)objectinputstream.readObject());
            selfUri = p.a((String)objectinputstream.readObject());
            alternateUri = p.a((String)objectinputstream.readObject());
            username = (String)objectinputstream.readObject();
            channelId = (String)objectinputstream.readObject();
            plusUserId = (String)objectinputstream.readObject();
            displayUsername = (String)objectinputstream.readObject();
            email = (String)objectinputstream.readObject();
            age = objectinputstream.readInt();
            gender = (Gender)objectinputstream.readObject();
            summary = (String)objectinputstream.readObject();
            thumbnailUri = p.a((String)objectinputstream.readObject());
            isLightweight = objectinputstream.readBoolean();
            isEligibleForChannel = objectinputstream.readBoolean();
            uploadsUri = p.a((String)objectinputstream.readObject());
            uploadedCount = objectinputstream.readInt();
            favoritesUri = p.a((String)objectinputstream.readObject());
            favoritesCount = objectinputstream.readInt();
            subscriptionsUri = p.a((String)objectinputstream.readObject());
            subscriptionsCount = objectinputstream.readInt();
            watchHistoryUri = p.a((String)objectinputstream.readObject());
            watchLaterUri = p.a((String)objectinputstream.readObject());
            playlistsUri = p.a((String)objectinputstream.readObject());
            activityUri = p.a((String)objectinputstream.readObject());
            channelViewsCount = objectinputstream.readLong();
            uploadViewsCount = objectinputstream.readLong();
            subscribersCount = objectinputstream.readInt();
        }

        private Object readResolve()
        {
            return build();
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
        {
            objectoutputstream.writeObject(p.a(uri));
            objectoutputstream.writeObject(p.a(selfUri));
            objectoutputstream.writeObject(p.a(alternateUri));
            objectoutputstream.writeObject(username);
            objectoutputstream.writeObject(channelId);
            objectoutputstream.writeObject(plusUserId);
            objectoutputstream.writeObject(displayUsername);
            objectoutputstream.writeObject(email);
            objectoutputstream.writeInt(age);
            objectoutputstream.writeObject(gender);
            objectoutputstream.writeObject(summary);
            objectoutputstream.writeObject(p.a(thumbnailUri));
            objectoutputstream.writeBoolean(isLightweight);
            objectoutputstream.writeBoolean(isEligibleForChannel);
            objectoutputstream.writeObject(p.a(uploadsUri));
            objectoutputstream.writeInt(uploadedCount);
            objectoutputstream.writeObject(p.a(favoritesUri));
            objectoutputstream.writeInt(favoritesCount);
            objectoutputstream.writeObject(p.a(subscriptionsUri));
            objectoutputstream.writeInt(subscriptionsCount);
            objectoutputstream.writeObject(p.a(watchHistoryUri));
            objectoutputstream.writeObject(p.a(watchLaterUri));
            objectoutputstream.writeObject(p.a(playlistsUri));
            objectoutputstream.writeObject(p.a(activityUri));
            objectoutputstream.writeLong(channelViewsCount);
            objectoutputstream.writeLong(uploadViewsCount);
            objectoutputstream.writeInt(subscribersCount);
        }

        public final Builder activityUri(Uri uri1)
        {
            activityUri = uri1;
            return this;
        }

        public final Builder age(int i)
        {
            age = i;
            return this;
        }

        public final Builder alternateUri(Uri uri1)
        {
            alternateUri = uri1;
            return this;
        }

        public final UserProfile build()
        {
            return new UserProfile(uri, selfUri, alternateUri, username, displayUsername, channelId, plusUserId, email, age, gender, summary, thumbnailUri, isLightweight, isEligibleForChannel, uploadsUri, uploadedCount, favoritesUri, favoritesCount, subscriptionsUri, subscriptionsCount, watchHistoryUri, watchLaterUri, playlistsUri, activityUri, channelViewsCount, uploadViewsCount, subscribersCount);
        }

        public final volatile Object build()
        {
            return build();
        }

        public final Builder channelId(String s)
        {
            channelId = (String)c.a(s);
            return this;
        }

        public final Builder channelViewsCount(long l)
        {
            channelViewsCount = l;
            return this;
        }

        public final Builder displayUsername(String s)
        {
            displayUsername = s;
            return this;
        }

        public final Builder email(String s)
        {
            email = s;
            return this;
        }

        public final Builder favoritesCount(int i)
        {
            favoritesCount = i;
            return this;
        }

        public final Builder favoritesUri(Uri uri1)
        {
            favoritesUri = uri1;
            return this;
        }

        public final Builder gender(Gender gender1)
        {
            gender = gender1;
            return this;
        }

        public final Builder isEligibleForChannel(boolean flag)
        {
            isEligibleForChannel = flag;
            return this;
        }

        public final Builder isLightweight(boolean flag)
        {
            isLightweight = flag;
            return this;
        }

        public final Builder playlistsUri(Uri uri1)
        {
            playlistsUri = uri1;
            return this;
        }

        public final Builder plusUserId(String s)
        {
            plusUserId = s;
            return this;
        }

        public final Builder selfUri(Uri uri1)
        {
            selfUri = uri1;
            return this;
        }

        public final Builder subscribersCount(int i)
        {
            subscribersCount = i;
            return this;
        }

        public final Builder subscriptionsCount(int i)
        {
            subscriptionsCount = i;
            return this;
        }

        public final Builder subscriptionsUri(Uri uri1)
        {
            subscriptionsUri = uri1;
            return this;
        }

        public final Builder summary(String s)
        {
            summary = s;
            return this;
        }

        public final Builder thumbnailUri(Uri uri1)
        {
            thumbnailUri = uri1;
            return this;
        }

        public final Builder uploadViewsCount(long l)
        {
            uploadViewsCount = l;
            return this;
        }

        public final Builder uploadedCount(int i)
        {
            uploadedCount = i;
            return this;
        }

        public final Builder uploadsUri(Uri uri1)
        {
            uploadsUri = uri1;
            return this;
        }

        public final Builder uri(Uri uri1)
        {
            uri = uri1;
            return this;
        }

        public final Builder username(String s)
        {
            username = s;
            return this;
        }

        public final Builder watchHistoryUri(Uri uri1)
        {
            watchHistoryUri = uri1;
            return this;
        }

        public final Builder watchLaterUri(Uri uri1)
        {
            watchLaterUri = uri1;
            return this;
        }

        public Builder()
        {
            age = -1;
            gender = Gender.UNKNOWN;
        }
    }

}
