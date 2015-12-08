// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            r, LiveEvent

public final class 
    implements r, Serializable
{

    private Date end;
    private Uri selfUri;
    private Date start;
    private video status;
    private Video video;

    private void readObject(ObjectInputStream objectinputstream)
    {
        start = (Date)objectinputstream.readObject();
        end = (Date)objectinputstream.readObject();
        status = (status)objectinputstream.readObject();
        selfUri = p.a((String)objectinputstream.readObject());
        video = (Video)objectinputstream.readObject();
    }

    private Object readResolve()
    {
        return build();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeObject(start);
        objectoutputstream.writeObject(end);
        objectoutputstream.writeObject(status);
        objectoutputstream.writeObject(p.a(selfUri));
        objectoutputstream.writeObject(video);
    }

    public final LiveEvent build()
    {
        return new LiveEvent(start, end, status, selfUri, video);
    }

    public final volatile Object build()
    {
        return build();
    }

    public final build end(Date date)
    {
        end = date;
        return this;
    }

    public final end selfUri(Uri uri)
    {
        selfUri = uri;
        return this;
    }

    public final selfUri start(Date date)
    {
        start = date;
        return this;
    }

    public final start status(start start1)
    {
        status = start1;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("Live Event [start = '")).append(start).append(", end='").append(end).append("', status: '").append(status).append("', video: '").append(video).append("']").toString();
    }

    public final video video(Video video1)
    {
        video = video1;
        return this;
    }

    public ()
    {
    }
}
