// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

public final class Playlist
    implements Serializable
{

    public final String author;
    public final Uri contentUri;
    public final Uri editUri;
    public final Uri hqThumbnailUri;
    public final String id;
    public final boolean isPrivate;
    public final Uri postUri;
    public final Uri sdThumbnailUri;
    public final int size;
    public final String summary;
    public final Uri thumbnailUri;
    public final String title;
    public final Date updated;

    public Playlist(String s, String s1, String s2, String s3, Date date, Uri uri, Uri uri1, 
            Uri uri2, Uri uri3, Uri uri4, Uri uri5, int i, boolean flag)
    {
        id = (String)c.a(s);
        title = s1;
        summary = s2;
        author = s3;
        updated = date;
        contentUri = uri;
        editUri = uri1;
        postUri = uri2;
        thumbnailUri = uri3;
        hqThumbnailUri = uri4;
        sdThumbnailUri = uri5;
        size = i;
        isPrivate = flag;
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
        return (new Builder()).id(id).title(title).summary(summary).author(author).updated(updated).contentUri(contentUri).editUri(editUri).postUri(postUri).thumbnailUri(thumbnailUri).hqThumbnailUri(hqThumbnailUri).sdThumbnailUri(sdThumbnailUri).size(size).isPrivate(isPrivate);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof Playlist))
        {
            return false;
        } else
        {
            obj = (Playlist)obj;
            return id.equals(((Playlist) (obj)).id);
        }
    }

    public final int hashCode()
    {
        return id.hashCode();
    }

    public final String toString()
    {
        return title;
    }

    private class Builder
        implements r, Serializable
    {

        private String author;
        private Uri contentUri;
        private Uri editUri;
        private Uri hqThumbnailUri;
        private String id;
        private boolean isPrivate;
        private Uri postUri;
        private Uri sdThumbnailUri;
        private int size;
        private String summary;
        private Uri thumbnailUri;
        private String title;
        private Date updated;

        private void readObject(ObjectInputStream objectinputstream)
        {
            id = (String)objectinputstream.readObject();
            title = (String)objectinputstream.readObject();
            summary = (String)objectinputstream.readObject();
            author = (String)objectinputstream.readObject();
            updated = (Date)objectinputstream.readObject();
            contentUri = p.a((String)objectinputstream.readObject());
            editUri = p.a((String)objectinputstream.readObject());
            postUri = p.a((String)objectinputstream.readObject());
            thumbnailUri = p.a((String)objectinputstream.readObject());
            hqThumbnailUri = p.a((String)objectinputstream.readObject());
            sdThumbnailUri = p.a((String)objectinputstream.readObject());
            size = objectinputstream.readInt();
            try
            {
                isPrivate = objectinputstream.readBoolean();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ObjectInputStream objectinputstream)
            {
                return;
            }
        }

        private Object readResolve()
        {
            return build();
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
        {
            objectoutputstream.writeObject(id);
            objectoutputstream.writeObject(title);
            objectoutputstream.writeObject(summary);
            objectoutputstream.writeObject(author);
            objectoutputstream.writeObject(updated);
            objectoutputstream.writeObject(p.a(contentUri));
            objectoutputstream.writeObject(p.a(editUri));
            objectoutputstream.writeObject(p.a(postUri));
            objectoutputstream.writeObject(p.a(thumbnailUri));
            objectoutputstream.writeObject(p.a(hqThumbnailUri));
            objectoutputstream.writeObject(p.a(sdThumbnailUri));
            objectoutputstream.writeInt(size);
            objectoutputstream.writeBoolean(isPrivate);
        }

        public Builder author(String s)
        {
            author = s;
            return this;
        }

        public Playlist build()
        {
            return new Playlist(id, title, summary, author, updated, contentUri, editUri, postUri, thumbnailUri, hqThumbnailUri, sdThumbnailUri, size, isPrivate);
        }

        public volatile Object build()
        {
            return build();
        }

        public Builder contentUri(Uri uri)
        {
            contentUri = uri;
            return this;
        }

        public Builder editUri(Uri uri)
        {
            editUri = uri;
            return this;
        }

        public Builder hqThumbnailUri(Uri uri)
        {
            hqThumbnailUri = uri;
            return this;
        }

        public Builder id(String s)
        {
            id = s;
            return this;
        }

        public Builder isPrivate(boolean flag)
        {
            isPrivate = flag;
            return this;
        }

        public Builder postUri(Uri uri)
        {
            postUri = uri;
            return this;
        }

        public Builder sdThumbnailUri(Uri uri)
        {
            sdThumbnailUri = uri;
            return this;
        }

        public Builder size(int i)
        {
            size = i;
            return this;
        }

        public Builder summary(String s)
        {
            summary = s;
            return this;
        }

        public Builder thumbnailUri(Uri uri)
        {
            thumbnailUri = uri;
            return this;
        }

        public Builder title(String s)
        {
            title = s;
            return this;
        }

        public Builder updated(Date date)
        {
            updated = date;
            return this;
        }

        public Builder()
        {
        }
    }

}
