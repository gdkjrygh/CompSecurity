// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            q

public final class LiveEvent
    implements Serializable
{

    public final Date end;
    public final Uri selfUri;
    public final Date start;
    public final Status status;
    public final Video video;

    public LiveEvent(Date date, Date date1, Status status1, Uri uri, Video video1)
    {
        start = (Date)c.a(date);
        end = date1;
        status = status1;
        selfUri = (Uri)c.a(uri);
        video = (Video)c.a(video1);
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
        return (new Builder()).start(start).end(end).status(status).selfUri(selfUri).video(video);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof LiveEvent))
        {
            return false;
        } else
        {
            obj = (LiveEvent)obj;
            return selfUri.equals(((LiveEvent) (obj)).selfUri);
        }
    }

    public final int hashCode()
    {
        return selfUri.hashCode();
    }

    public final boolean isLiveNow()
    {
        return status == Status.ACTIVE && video.duration == 0;
    }

    public final boolean isPlayable()
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = flag1;
        q.a[status.ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 46
    //                   2 46
    //                   3 46
    //                   4 48;
           goto _L1 _L2 _L2 _L2 _L3
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        flag = false;
_L5:
        return flag;
_L3:
        flag = flag1;
        if (video.duration == 0)
        {
            return false;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final boolean isUpcoming()
    {
        return status == Status.PENDING || status == Status.DELAYED;
    }

    public final String toString()
    {
        return (new StringBuilder("Live Event [id = '")).append(video.id).append(", title='").append(video.title).append("', status: '").append(status).append("', start: '").append(start).append("']").toString();
    }

    private class Builder
        implements r, Serializable
    {

        private Date end;
        private Uri selfUri;
        private Date start;
        private Status status;
        private Video video;

        private void readObject(ObjectInputStream objectinputstream)
        {
            start = (Date)objectinputstream.readObject();
            end = (Date)objectinputstream.readObject();
            status = (Status)objectinputstream.readObject();
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

        public final Builder end(Date date)
        {
            end = date;
            return this;
        }

        public final Builder selfUri(Uri uri)
        {
            selfUri = uri;
            return this;
        }

        public final Builder start(Date date)
        {
            start = date;
            return this;
        }

        public final Builder status(Status status1)
        {
            status = status1;
            return this;
        }

        public final String toString()
        {
            return (new StringBuilder("Live Event [start = '")).append(start).append(", end='").append(end).append("', status: '").append(status).append("', video: '").append(video).append("']").toString();
        }

        public final Builder video(Video video1)
        {
            video = video1;
            return this;
        }

        public Builder()
        {
        }
    }


    private class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status ACTIVE;
        public static final Status CANCELLED;
        public static final Status COMPLETED;
        public static final Status DELAYED;
        public static final Status PENDING;
        public static final Status REJECTED;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/LiveEvent$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            PENDING = new Status("PENDING", 0);
            ACTIVE = new Status("ACTIVE", 1);
            DELAYED = new Status("DELAYED", 2);
            COMPLETED = new Status("COMPLETED", 3);
            CANCELLED = new Status("CANCELLED", 4);
            REJECTED = new Status("REJECTED", 5);
            $VALUES = (new Status[] {
                PENDING, ACTIVE, DELAYED, COMPLETED, CANCELLED, REJECTED
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }

}
