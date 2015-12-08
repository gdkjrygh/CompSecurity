// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import com.google.android.apps.youtube.common.e.p;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            r, Playlist

public class 
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

    public isPrivate author(String s)
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

    public build contentUri(Uri uri)
    {
        contentUri = uri;
        return this;
    }

    public contentUri editUri(Uri uri)
    {
        editUri = uri;
        return this;
    }

    public editUri hqThumbnailUri(Uri uri)
    {
        hqThumbnailUri = uri;
        return this;
    }

    public hqThumbnailUri id(String s)
    {
        id = s;
        return this;
    }

    public id isPrivate(boolean flag)
    {
        isPrivate = flag;
        return this;
    }

    public isPrivate postUri(Uri uri)
    {
        postUri = uri;
        return this;
    }

    public postUri sdThumbnailUri(Uri uri)
    {
        sdThumbnailUri = uri;
        return this;
    }

    public sdThumbnailUri size(int i)
    {
        size = i;
        return this;
    }

    public size summary(String s)
    {
        summary = s;
        return this;
    }

    public summary thumbnailUri(Uri uri)
    {
        thumbnailUri = uri;
        return this;
    }

    public thumbnailUri title(String s)
    {
        title = s;
        return this;
    }

    public title updated(Date date)
    {
        updated = date;
        return this;
    }

    public ()
    {
    }
}
