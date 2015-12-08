// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.Locale;

public final class Event
    implements Serializable
{

    public final Action action;
    public final String displayUsername;
    public final String groupId;
    public final String subject;
    public final Uri subjectUri;
    public final String target;
    public Video targetVideo;
    public final Date when;

    public Event(String s, Uri uri, Action action1, String s1, Video video, String s2, Date date, 
            String s3)
    {
        subject = s;
        subjectUri = uri;
        action = action1;
        target = s1;
        targetVideo = video;
        when = date;
        if (action1 != null && !action1.targetsVideo && TextUtils.isEmpty(s2))
        {
            displayUsername = s1;
        } else
        {
            displayUsername = s2;
        }
        groupId = s3;
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
        return (new Builder()).subject(subject).subjectUri(subjectUri).action(action).target(target).targetVideo(targetVideo).displayUsername(displayUsername).when(when).groupId(groupId);
    }

    public final boolean targetIsChannel()
    {
        return action != null && !action.targetsVideo;
    }

    public final boolean targetIsVideo()
    {
        return action != null && action.targetsVideo;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(subject).append(" ");
        String s;
        if (action != null)
        {
            s = action.toString();
        } else
        {
            s = "";
        }
        return stringbuilder.append(s.toLowerCase(Locale.US)).append(" ").append(target).toString();
    }

    private class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action BULLETIN_POSTED;
        public static final Action FRIEND_ADDED;
        public static final Action USER_SUBSCRIPTION_ADDED;
        public static final Action VIDEO_ADDED_TO_PLAYLIST;
        public static final Action VIDEO_COMMENTED;
        public static final Action VIDEO_FAVORITED;
        public static final Action VIDEO_LIKED;
        public static final Action VIDEO_RECOMMENDED;
        public static final Action VIDEO_SHARED;
        public static final Action VIDEO_UPLOADED;
        public final int stringId;
        public final boolean targetsVideo;

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/Event$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        static 
        {
            VIDEO_LIKED = new Action("VIDEO_LIKED", 0, p.bJ, true);
            VIDEO_SHARED = new Action("VIDEO_SHARED", 1, p.bL, true);
            VIDEO_FAVORITED = new Action("VIDEO_FAVORITED", 2, p.bI, true);
            VIDEO_COMMENTED = new Action("VIDEO_COMMENTED", 3, p.bH, true);
            VIDEO_UPLOADED = new Action("VIDEO_UPLOADED", 4, p.bM, true);
            VIDEO_RECOMMENDED = new Action("VIDEO_RECOMMENDED", 5, p.bK, true);
            VIDEO_ADDED_TO_PLAYLIST = new Action("VIDEO_ADDED_TO_PLAYLIST", 6, p.bG, true);
            FRIEND_ADDED = new Action("FRIEND_ADDED", 7, p.bE, false);
            USER_SUBSCRIPTION_ADDED = new Action("USER_SUBSCRIPTION_ADDED", 8, p.bF, false);
            BULLETIN_POSTED = new Action("BULLETIN_POSTED", 9, p.bD, true);
            $VALUES = (new Action[] {
                VIDEO_LIKED, VIDEO_SHARED, VIDEO_FAVORITED, VIDEO_COMMENTED, VIDEO_UPLOADED, VIDEO_RECOMMENDED, VIDEO_ADDED_TO_PLAYLIST, FRIEND_ADDED, USER_SUBSCRIPTION_ADDED, BULLETIN_POSTED
            });
        }

        private Action(String s, int i, int j, boolean flag)
        {
            super(s, i);
            stringId = j;
            targetsVideo = flag;
        }
    }


    private class Builder
        implements r, Serializable
    {

        private Action action;
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
            subjectUri = com.google.android.apps.youtube.common.e.p.a((String)objectinputstream.readObject());
            action = (Action)objectinputstream.readObject();
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
            objectoutputstream.writeObject(com.google.android.apps.youtube.common.e.p.a(subjectUri));
            objectoutputstream.writeObject(action);
            objectoutputstream.writeObject(target);
            objectoutputstream.writeObject(targetVideo);
            objectoutputstream.writeObject(displayUsername);
            objectoutputstream.writeObject(when);
            objectoutputstream.writeObject(groupId);
        }

        public final Builder action(Action action1)
        {
            action = action1;
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

        public final Builder displayUsername(String s)
        {
            displayUsername = s;
            return this;
        }

        public final Builder groupId(String s)
        {
            groupId = s;
            return this;
        }

        public final Builder subject(String s)
        {
            subject = s;
            return this;
        }

        public final Builder subjectUri(Uri uri)
        {
            subjectUri = uri;
            return this;
        }

        public final Builder target(String s)
        {
            target = s;
            return this;
        }

        public final Builder targetVideo(Video video)
        {
            targetVideo = video;
            return this;
        }

        public final Builder when(Date date)
        {
            when = date;
            return this;
        }

        public Builder()
        {
        }
    }

}
