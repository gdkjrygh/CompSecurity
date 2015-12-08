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
//            r, Event

public final class 
    implements r, Serializable
{

    private when action;
    private String displayUsername;
    private String groupId;
    private String subject;
    private Uri subjectUri;
    private String target;
    private Video targetVideo;
    private Date when;

    private void readObject(ObjectInputStream objectinputstream)
    {
        subject = (String)objectinputstream.readObject();
        subjectUri = p.a((String)objectinputstream.readObject());
        action = (action)objectinputstream.readObject();
        target = (String)objectinputstream.readObject();
        targetVideo = (Video)objectinputstream.readObject();
        displayUsername = (String)objectinputstream.readObject();
        when = (Date)objectinputstream.readObject();
        groupId = (String)objectinputstream.readObject();
    }

    private Object readResolve()
    {
        return build();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeObject(subject);
        objectoutputstream.writeObject(p.a(subjectUri));
        objectoutputstream.writeObject(action);
        objectoutputstream.writeObject(target);
        objectoutputstream.writeObject(targetVideo);
        objectoutputstream.writeObject(displayUsername);
        objectoutputstream.writeObject(when);
        objectoutputstream.writeObject(groupId);
    }

    public final groupId action(groupId groupid)
    {
        action = groupid;
        return this;
    }

    public final Event build()
    {
        return new Event(subject, subjectUri, action, target, targetVideo, displayUsername, when, groupId);
    }

    public final volatile Object build()
    {
        return build();
    }

    public final build displayUsername(String s)
    {
        displayUsername = s;
        return this;
    }

    public final displayUsername groupId(String s)
    {
        groupId = s;
        return this;
    }

    public final groupId subject(String s)
    {
        subject = s;
        return this;
    }

    public final subject subjectUri(Uri uri)
    {
        subjectUri = uri;
        return this;
    }

    public final subjectUri target(String s)
    {
        target = s;
        return this;
    }

    public final target targetVideo(Video video)
    {
        targetVideo = video;
        return this;
    }

    public final targetVideo when(Date date)
    {
        when = date;
        return this;
    }

    public ()
    {
    }
}
