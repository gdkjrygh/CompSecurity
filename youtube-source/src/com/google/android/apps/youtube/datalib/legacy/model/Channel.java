// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

public final class Channel
    implements Serializable
{

    public final String author;
    public final boolean paidContent;
    public final int subscriberCount;
    public final String summary;
    public final String title;
    public final Date updated;
    public final Uri userProfileUri;
    public final int videoCount;

    public Channel(String s, String s1, String s2, Uri uri, Date date, int i, int j, 
            boolean flag)
    {
        title = s;
        summary = s1;
        author = s2;
        updated = date;
        userProfileUri = uri;
        videoCount = i;
        subscriberCount = j;
        paidContent = flag;
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
        return (new Builder()).title(title).summary(summary).author(author).userProfileUri(userProfileUri).updated(updated).videoCount(videoCount).subscriberCount(subscriberCount).paidContent(paidContent);
    }

    public final String toString()
    {
        return String.format("Channel[title = %s, author = %s]", new Object[] {
            title, author
        });
    }

    private class Builder
        implements r, Serializable
    {

        private String author;
        private boolean paidContent;
        private int subscriberCount;
        private String summary;
        private String title;
        private Date updated;
        private Uri userProfileUri;
        private int videoCount;

        private void readObject(ObjectInputStream objectinputstream)
        {
            title = (String)objectinputstream.readObject();
            summary = (String)objectinputstream.readObject();
            author = (String)objectinputstream.readObject();
            userProfileUri = p.a((String)objectinputstream.readObject());
            updated = (Date)objectinputstream.readObject();
            videoCount = objectinputstream.readInt();
            subscriberCount = objectinputstream.readInt();
            paidContent = objectinputstream.readBoolean();
        }

        private Object readResolve()
        {
            return build();
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
        {
            objectoutputstream.writeObject(title);
            objectoutputstream.writeObject(summary);
            objectoutputstream.writeObject(author);
            objectoutputstream.writeObject(p.a(userProfileUri));
            objectoutputstream.writeObject(updated);
            objectoutputstream.writeInt(videoCount);
            objectoutputstream.writeInt(subscriberCount);
            objectoutputstream.writeBoolean(paidContent);
        }

        public final Builder author(String s)
        {
            author = s;
            return this;
        }

        public final Channel build()
        {
            return new Channel(title, summary, author, userProfileUri, updated, videoCount, subscriberCount, paidContent);
        }

        public final volatile Object build()
        {
            return build();
        }

        public final Builder paidContent(boolean flag)
        {
            paidContent = flag;
            return this;
        }

        public final Builder subscriberCount(int i)
        {
            subscriberCount = i;
            return this;
        }

        public final Builder summary(String s)
        {
            summary = s;
            return this;
        }

        public final Builder title(String s)
        {
            title = s;
            return this;
        }

        public final Builder updated(Date date)
        {
            updated = date;
            return this;
        }

        public final Builder userProfileUri(Uri uri)
        {
            userProfileUri = uri;
            return this;
        }

        public final Builder videoCount(int i)
        {
            videoCount = i;
            return this;
        }

        public Builder()
        {
        }
    }

}
