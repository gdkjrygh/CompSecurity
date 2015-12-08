// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.Optional;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class Subscription
    implements Optional, Serializable
{

    public final Uri channelUri;
    public final Uri editUri;
    public final String title;
    public final Type type;
    public final Uri uri;
    public final String username;

    public Subscription(String s, Type type1, Uri uri1, Uri uri2, String s1, Uri uri3)
    {
        editUri = (Uri)c.a(uri2);
        title = (String)c.a(s);
        type = (Type)c.a(type1);
        uri = (Uri)c.a(uri1);
        username = (String)c.a(s1);
        channelUri = (Uri)c.a(uri3);
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
        return (new Builder()).title(title).type(type).uri(uri).editUri(editUri).username(username).channelUri(channelUri);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Subscription)
        {
            if (username.equals(((Subscription) (obj = (Subscription)obj)).username) && type == ((Subscription) (obj)).type)
            {
                return true;
            }
        }
        return false;
    }

    public final Subscription get()
    {
        return this;
    }

    public final volatile Serializable get()
    {
        return get();
    }

    public final boolean isUserRelated()
    {
        return type == Type.CHANNEL || type == Type.FAVORITES || type == Type.USER;
    }

    public final String toString()
    {
        return title;
    }

    private class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type CHANNEL;
        public static final Type FAVORITES;
        public static final Type PLAYLIST;
        public static final Type QUERY;
        public static final Type UNKNOWN;
        public static final Type USER;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/Subscription$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            USER = new Type("USER", 0);
            FAVORITES = new Type("FAVORITES", 1);
            PLAYLIST = new Type("PLAYLIST", 2);
            QUERY = new Type("QUERY", 3);
            CHANNEL = new Type("CHANNEL", 4);
            UNKNOWN = new Type("UNKNOWN", 5);
            $VALUES = (new Type[] {
                USER, FAVORITES, PLAYLIST, QUERY, CHANNEL, UNKNOWN
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private class Builder
        implements r, Serializable
    {

        private Uri channelUri;
        private String displayUsername;
        private Uri editUri;
        private String playlistTitle;
        private String query;
        private String title;
        private Type type;
        private Uri uri;
        private String username;

        private void readObject(ObjectInputStream objectinputstream)
        {
            title = (String)objectinputstream.readObject();
            type = (Type)objectinputstream.readObject();
            uri = p.a((String)objectinputstream.readObject());
            editUri = p.a((String)objectinputstream.readObject());
            username = (String)objectinputstream.readObject();
            channelUri = p.a((String)objectinputstream.readObject());
        }

        private Object readResolve()
        {
            return build();
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
        {
            objectoutputstream.writeObject(title);
            objectoutputstream.writeObject(type);
            objectoutputstream.writeObject(p.a(uri));
            objectoutputstream.writeObject(p.a(editUri));
            objectoutputstream.writeObject(username);
            objectoutputstream.writeObject(p.a(channelUri));
        }

        public Subscription build()
        {
            if (title != null) goto _L2; else goto _L1
_L1:
            z.a[type.ordinal()];
            JVM INSTR tableswitch 1 6: default 56
        //                       1 88
        //                       2 88
        //                       3 88
        //                       4 119
        //                       5 130
        //                       6 141;
               goto _L2 _L3 _L3 _L3 _L4 _L5 _L6
_L2:
            return new Subscription(title, type, uri, editUri, username, channelUri);
_L3:
            String s;
            if (TextUtils.isEmpty(displayUsername))
            {
                s = username;
            } else
            {
                s = displayUsername;
            }
            title = s;
            continue; /* Loop/switch isn't completed */
_L4:
            title = playlistTitle;
            continue; /* Loop/switch isn't completed */
_L5:
            title = query;
            continue; /* Loop/switch isn't completed */
_L6:
            title = "";
            if (true) goto _L2; else goto _L7
_L7:
        }

        public volatile Object build()
        {
            return build();
        }

        public Builder channelUri(Uri uri1)
        {
            channelUri = uri1;
            return this;
        }

        public Builder displayUsername(String s)
        {
            displayUsername = s;
            return this;
        }

        public Builder editUri(Uri uri1)
        {
            editUri = uri1;
            return this;
        }

        public Builder playlistTitle(String s)
        {
            playlistTitle = s;
            return this;
        }

        public Builder query(String s)
        {
            query = s;
            return this;
        }

        public Builder title(String s)
        {
            title = s;
            return this;
        }

        public Builder type(Type type1)
        {
            type = type1;
            return this;
        }

        public Builder uri(Uri uri1)
        {
            uri = uri1;
            return this;
        }

        public Builder username(String s)
        {
            username = s;
            return this;
        }

        public Builder()
        {
        }
    }

}
