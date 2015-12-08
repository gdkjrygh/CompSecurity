// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import com.google.android.apps.youtube.common.e.p;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            r, Channel

public final class 
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

    public final paidContent author(String s)
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

    public final build paidContent(boolean flag)
    {
        paidContent = flag;
        return this;
    }

    public final paidContent subscriberCount(int i)
    {
        subscriberCount = i;
        return this;
    }

    public final subscriberCount summary(String s)
    {
        summary = s;
        return this;
    }

    public final summary title(String s)
    {
        title = s;
        return this;
    }

    public final title updated(Date date)
    {
        updated = date;
        return this;
    }

    public final updated userProfileUri(Uri uri)
    {
        userProfileUri = uri;
        return this;
    }

    public final userProfileUri videoCount(int i)
    {
        videoCount = i;
        return this;
    }

    public ()
    {
    }
}
