// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.model.gdata;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.youtube.datalib.model.gdata:
//            c

public final class Video
    implements Serializable
{

    private static Pattern DEFAULT_LANG_REGEX = Pattern.compile("yt:cc_default_lang=([a-zA-Z]{2})");
    public final Map accessControl;
    public final boolean adultContent;
    public final Uri captionTracksUri;
    public final String categoryLabel;
    public final String categoryTerm;
    public final Uri defaultThumbnailUri;
    public final String description;
    public final long dislikesCount;
    public final int duration;
    public final Uri editUri;
    public final Uri hqThumbnailUri;
    public final String id;
    public final boolean is3d;
    public final boolean isInOfflineStore;
    public final boolean isUpsell;
    public final long likesCount;
    public final Uri liveEventUri;
    public final String location;
    public final boolean monetize;
    public final Set monetizeExceptionCountries;
    public final Uri mqThumbnailUri;
    public final String offlineChannelAvatarThumbnailUrl;
    public final String owner;
    public final String ownerDisplayName;
    public final Uri ownerUri;
    public final boolean paidContent;
    public final Privacy privacy;
    public final Date publishedDate;
    public final Uri sdThumbnailUri;
    public final boolean showSubtitlesAlways;
    public final State state;
    public final Set streams;
    public final String tags;
    public final String title;
    public final Date uploadedDate;
    public final long viewCount;
    public final Uri watchUri;
    public final String where;

    private Video(String s, Set set, Uri uri, Uri uri1, Uri uri2, Uri uri3, Uri uri4, 
            Uri uri5, Uri uri6, String s1, int i, long l, long l1, long l2, String s2, Uri uri7, Date date, Date date1, 
            String s3, String s4, String s5, String s6, Privacy privacy1, Map map, String s7, 
            String s8, boolean flag, State state1, boolean flag1, Set set1, boolean flag2, boolean flag3, 
            Uri uri8, boolean flag4, String s9, boolean flag5, String s10)
    {
        id = c.a(s, "youTubeId can't be empty");
        streams = com.google.android.apps.youtube.common.e.c.a((Set)c.a(set));
        watchUri = uri;
        defaultThumbnailUri = uri1;
        mqThumbnailUri = uri2;
        hqThumbnailUri = uri3;
        sdThumbnailUri = uri4;
        editUri = uri5;
        captionTracksUri = uri6;
        title = s1;
        duration = i;
        viewCount = l;
        likesCount = l1;
        dislikesCount = l2;
        owner = s2;
        ownerUri = uri7;
        uploadedDate = date;
        publishedDate = date1;
        categoryTerm = s3;
        categoryLabel = s4;
        tags = s5;
        description = s6;
        privacy = privacy1;
        accessControl = map;
        location = s7;
        where = s8;
        adultContent = flag;
        state = (State)c.a(state1);
        monetize = flag1;
        if (set1 == null)
        {
            s = null;
        } else
        {
            s = com.google.android.apps.youtube.common.e.c.a(m.a(set1));
        }
        monetizeExceptionCountries = s;
        if (s5 != null && s5.contains("yt:cc=alwayson"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        showSubtitlesAlways = flag;
        paidContent = flag2;
        isUpsell = flag3;
        liveEventUri = uri8;
        is3d = flag4;
        if (!TextUtils.isEmpty(s9))
        {
            s2 = s9;
        }
        ownerDisplayName = s2;
        isInOfflineStore = flag5;
        offlineChannelAvatarThumbnailUrl = s10;
    }

    Video(String s, Set set, Uri uri, Uri uri1, Uri uri2, Uri uri3, Uri uri4, 
            Uri uri5, Uri uri6, String s1, int i, long l, long l1, long l2, String s2, Uri uri7, Date date, Date date1, 
            String s3, String s4, String s5, String s6, Privacy privacy1, Map map, String s7, 
            String s8, boolean flag, State state1, boolean flag1, Set set1, boolean flag2, boolean flag3, 
            Uri uri8, boolean flag4, String s9, boolean flag5, String s10, com.google.android.apps.youtube.datalib.model.gdata.c c1)
    {
        this(s, set, uri, uri1, uri2, uri3, uri4, uri5, uri6, s1, i, l, l1, l2, s2, uri7, date, date1, s3, s4, s5, s6, privacy1, map, s7, s8, flag, state1, flag1, set1, flag2, flag3, uri8, flag4, s9, flag5, s10);
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
        return (new Builder()).id(id).streams(new HashSet(streams)).watchUri(watchUri).defaultThumbnailUri(defaultThumbnailUri).mqThumbnailUri(mqThumbnailUri).hqThumbnailUri(hqThumbnailUri).sdThumbnailUri(sdThumbnailUri).editUri(editUri).captionTracksUri(captionTracksUri).title(title).duration(duration).viewCount(viewCount).likesCount(likesCount).dislikesCount(dislikesCount).owner(owner).ownerUri(ownerUri).uploadedDate(uploadedDate).publishedDate(publishedDate).categoryTerm(categoryTerm).categoryLabel(categoryLabel).tags(tags).description(description).privacy(privacy).accessControl(accessControl).location(location).where(where).adultContent(adultContent).state(state).monetize(monetize).monetizeExceptionCountries(monetizeExceptionCountries).paidContent(paidContent).isUpsell(isUpsell).liveEventUri(liveEventUri).is3d(is3d).ownerDisplayName(ownerDisplayName).isInOfflineStore(isInOfflineStore).offlineChannelAvatarThumbnailUrl(offlineChannelAvatarThumbnailUrl);
    }

    public final boolean couldBeMusicVideo()
    {
        return "Music".equals(categoryTerm);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof Video))
        {
            return false;
        } else
        {
            obj = (Video)obj;
            return id.equals(((Video) (obj)).id);
        }
    }

    public final String getDefaultSubtitleLanguageCode()
    {
        if (tags != null)
        {
            Matcher matcher = DEFAULT_LANG_REGEX.matcher(tags);
            if (matcher.find())
            {
                return matcher.group(1);
            }
        }
        return null;
    }

    public final int hashCode()
    {
        return id.hashCode();
    }

    public final boolean isActionable()
    {
        if (isInOfflineStore)
        {
            return false;
        }
        switch (c.a[state.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return true;

        case 4: // '\004'
            return isLive();
        }
    }

    public final boolean isLive()
    {
        return liveEventUri != null && state != State.PLAYABLE;
    }

    public final boolean isMonetized(String s)
    {
        if (monetizeExceptionCountries != null)
        {
            return monetize != monetizeExceptionCountries.contains(s.toLowerCase(Locale.US));
        } else
        {
            return monetize;
        }
    }

    public final String toString()
    {
        return (new StringBuilder("Video[id = '")).append(id).append("', title='").append(title).append("']").toString();
    }


    private class State extends Enum
    {

        private static final State $VALUES[];
        public static final State ACCOUNT_SUSPENDED;
        public static final State BLOCKED_BY_OWNER;
        public static final State BLOCKED_FOR_CLIENT_APP;
        public static final State CANT_PROCESS;
        public static final State COPYRIGHT;
        public static final State COUNTRY_RESTRICTED;
        public static final State DELETED;
        public static final State DUPLICATE;
        public static final State EMPTY;
        public static final State INAPPROPRIATE;
        public static final State INVALID_FORMAT;
        public static final State NOT_AVAILABLE_ON_MOBILE;
        public static final State PLAYABLE;
        public static final State PRIVATE;
        public static final State PROCESSING;
        public static final State TERMS_OF_USE;
        public static final State TOO_SMALL;
        public static final State UNSUPPORTED_CODEC;
        public static final State VIDEO_TOO_LONG;
        public final int explanationId;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/android/apps/youtube/datalib/model/gdata/Video$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            PLAYABLE = new State("PLAYABLE", 0, -1);
            PROCESSING = new State("PROCESSING", 1, p.eI);
            DELETED = new State("DELETED", 2, p.hd);
            COUNTRY_RESTRICTED = new State("COUNTRY_RESTRICTED", 3, p.gP);
            NOT_AVAILABLE_ON_MOBILE = new State("NOT_AVAILABLE_ON_MOBILE", 4, p.gQ);
            PRIVATE = new State("PRIVATE", 5, p.gM);
            BLOCKED_FOR_CLIENT_APP = new State("BLOCKED_FOR_CLIENT_APP", 6, p.J);
            COPYRIGHT = new State("COPYRIGHT", 7, p.gJ);
            INAPPROPRIATE = new State("INAPPROPRIATE", 8, p.he);
            DUPLICATE = new State("DUPLICATE", 9, p.ba);
            TERMS_OF_USE = new State("TERMS_OF_USE", 10, p.hc);
            ACCOUNT_SUSPENDED = new State("ACCOUNT_SUSPENDED", 11, p.gv);
            VIDEO_TOO_LONG = new State("VIDEO_TOO_LONG", 12, p.gZ);
            BLOCKED_BY_OWNER = new State("BLOCKED_BY_OWNER", 13, p.I);
            CANT_PROCESS = new State("CANT_PROCESS", 14, p.gH);
            INVALID_FORMAT = new State("INVALID_FORMAT", 15, p.gL);
            UNSUPPORTED_CODEC = new State("UNSUPPORTED_CODEC", 16, p.ha);
            EMPTY = new State("EMPTY", 17, p.gK);
            TOO_SMALL = new State("TOO_SMALL", 18, p.gN);
            $VALUES = (new State[] {
                PLAYABLE, PROCESSING, DELETED, COUNTRY_RESTRICTED, NOT_AVAILABLE_ON_MOBILE, PRIVATE, BLOCKED_FOR_CLIENT_APP, COPYRIGHT, INAPPROPRIATE, DUPLICATE, 
                TERMS_OF_USE, ACCOUNT_SUSPENDED, VIDEO_TOO_LONG, BLOCKED_BY_OWNER, CANT_PROCESS, INVALID_FORMAT, UNSUPPORTED_CODEC, EMPTY, TOO_SMALL
            });
        }

        private State(String s, int i, int j)
        {
            super(s, i);
            explanationId = j;
        }
    }


    private class Builder
        implements r, Serializable
    {

        private Map accessControl;
        private boolean adultContent;
        private Uri captionTracksUri;
        private String categoryLabel;
        private String categoryTerm;
        private Uri defaultThumbnailUri;
        private String description;
        private long dislikesCount;
        private int duration;
        private Uri editUri;
        private Uri hqThumbnailUri;
        private String id;
        private boolean is3d;
        private boolean isInOfflineStore;
        private boolean isUpsell;
        private long likesCount;
        private Uri liveEventUri;
        private String location;
        private boolean monetize;
        private Set monetizeExceptionCountries;
        private Uri mqThumbnailUri;
        private String offlineChannelAvatarThumbnailUrl;
        private String owner;
        private String ownerDisplayName;
        private Uri ownerUri;
        private boolean paidContent;
        private Privacy privacy;
        private Date publishedDate;
        private Uri sdThumbnailUri;
        private State state;
        private Set streams;
        private String tags;
        private String title;
        private Date uploadedDate;
        private long viewCount;
        private Uri watchUri;
        private String where;

        private void readObject(ObjectInputStream objectinputstream)
        {
            id = (String)objectinputstream.readObject();
            streams = (Set)objectinputstream.readObject();
            watchUri = com.google.android.apps.youtube.common.e.p.a((String)objectinputstream.readObject());
            defaultThumbnailUri = com.google.android.apps.youtube.common.e.p.a((String)objectinputstream.readObject());
            mqThumbnailUri = com.google.android.apps.youtube.common.e.p.a((String)objectinputstream.readObject());
            hqThumbnailUri = com.google.android.apps.youtube.common.e.p.a((String)objectinputstream.readObject());
            sdThumbnailUri = com.google.android.apps.youtube.common.e.p.a((String)objectinputstream.readObject());
            editUri = com.google.android.apps.youtube.common.e.p.a((String)objectinputstream.readObject());
            captionTracksUri = com.google.android.apps.youtube.common.e.p.a((String)objectinputstream.readObject());
            title = (String)objectinputstream.readObject();
            duration = objectinputstream.readInt();
            viewCount = objectinputstream.readLong();
            likesCount = objectinputstream.readLong();
            dislikesCount = objectinputstream.readLong();
            owner = (String)objectinputstream.readObject();
            ownerUri = com.google.android.apps.youtube.common.e.p.a((String)objectinputstream.readObject());
            uploadedDate = (Date)objectinputstream.readObject();
            publishedDate = (Date)objectinputstream.readObject();
            categoryTerm = (String)objectinputstream.readObject();
            categoryLabel = (String)objectinputstream.readObject();
            tags = (String)objectinputstream.readObject();
            description = (String)objectinputstream.readObject();
            privacy = (Privacy)objectinputstream.readObject();
            accessControl = (Map)objectinputstream.readObject();
            location = (String)objectinputstream.readObject();
            where = (String)objectinputstream.readObject();
            adultContent = objectinputstream.readBoolean();
            state = (State)objectinputstream.readObject();
            monetize = objectinputstream.readBoolean();
            monetizeExceptionCountries = (Set)objectinputstream.readObject();
            paidContent = objectinputstream.readBoolean();
            isUpsell = objectinputstream.readBoolean();
            liveEventUri = com.google.android.apps.youtube.common.e.p.a((String)objectinputstream.readObject());
            is3d = objectinputstream.readBoolean();
            ownerDisplayName = (String)objectinputstream.readObject();
            isInOfflineStore = objectinputstream.readBoolean();
            offlineChannelAvatarThumbnailUrl = (String)objectinputstream.readObject();
        }

        private Object readResolve()
        {
            return build();
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
        {
            objectoutputstream.writeObject(id);
            objectoutputstream.writeObject(streams);
            objectoutputstream.writeObject(com.google.android.apps.youtube.common.e.p.a(watchUri));
            objectoutputstream.writeObject(com.google.android.apps.youtube.common.e.p.a(defaultThumbnailUri));
            objectoutputstream.writeObject(com.google.android.apps.youtube.common.e.p.a(mqThumbnailUri));
            objectoutputstream.writeObject(com.google.android.apps.youtube.common.e.p.a(hqThumbnailUri));
            objectoutputstream.writeObject(com.google.android.apps.youtube.common.e.p.a(sdThumbnailUri));
            objectoutputstream.writeObject(com.google.android.apps.youtube.common.e.p.a(editUri));
            objectoutputstream.writeObject(com.google.android.apps.youtube.common.e.p.a(captionTracksUri));
            objectoutputstream.writeObject(title);
            objectoutputstream.writeInt(duration);
            objectoutputstream.writeLong(viewCount);
            objectoutputstream.writeLong(likesCount);
            objectoutputstream.writeLong(dislikesCount);
            objectoutputstream.writeObject(owner);
            objectoutputstream.writeObject(com.google.android.apps.youtube.common.e.p.a(ownerUri));
            objectoutputstream.writeObject(uploadedDate);
            objectoutputstream.writeObject(publishedDate);
            objectoutputstream.writeObject(categoryTerm);
            objectoutputstream.writeObject(categoryLabel);
            objectoutputstream.writeObject(tags);
            objectoutputstream.writeObject(description);
            objectoutputstream.writeObject(privacy);
            objectoutputstream.writeObject(accessControl);
            objectoutputstream.writeObject(location);
            objectoutputstream.writeObject(where);
            objectoutputstream.writeBoolean(adultContent);
            objectoutputstream.writeObject(state);
            objectoutputstream.writeBoolean(monetize);
            objectoutputstream.writeObject(monetizeExceptionCountries);
            objectoutputstream.writeBoolean(paidContent);
            objectoutputstream.writeBoolean(isUpsell);
            objectoutputstream.writeObject(com.google.android.apps.youtube.common.e.p.a(liveEventUri));
            objectoutputstream.writeBoolean(is3d);
            objectoutputstream.writeObject(ownerDisplayName);
            objectoutputstream.writeBoolean(isInOfflineStore);
            objectoutputstream.writeObject(offlineChannelAvatarThumbnailUrl);
        }

        public final Builder accessControl(String s, String s1)
        {
            if (accessControl == null)
            {
                accessControl = new LinkedHashMap();
            }
            accessControl.put(s, s1);
            return this;
        }

        public final Builder accessControl(Map map)
        {
            accessControl = map;
            return this;
        }

        public final Builder addStream(Stream stream)
        {
            c.a(stream);
            if (streams == null)
            {
                streams = new HashSet();
            }
            streams.add(stream);
            return this;
        }

        public final Builder adultContent(boolean flag)
        {
            adultContent = flag;
            return this;
        }

        public final Video build()
        {
            Set set;
            if (streams != null)
            {
                set = streams;
            } else
            {
                set = Collections.emptySet();
            }
            streams = set;
            return new Video(id, streams, watchUri, defaultThumbnailUri, mqThumbnailUri, hqThumbnailUri, sdThumbnailUri, editUri, captionTracksUri, title, duration, viewCount, likesCount, dislikesCount, owner, ownerUri, uploadedDate, publishedDate, categoryTerm, categoryLabel, tags, description, privacy, accessControl, location, where, adultContent, state, monetize, monetizeExceptionCountries, paidContent, isUpsell, liveEventUri, is3d, ownerDisplayName, isInOfflineStore, offlineChannelAvatarThumbnailUrl, null);
        }

        public final volatile Object build()
        {
            return build();
        }

        public final Builder captionTracksUri(Uri uri)
        {
            captionTracksUri = uri;
            return this;
        }

        public final Builder categoryLabel(String s)
        {
            categoryLabel = s;
            return this;
        }

        public final Builder categoryTerm(String s)
        {
            categoryTerm = s;
            return this;
        }

        public final Builder defaultThumbnailUri(Uri uri)
        {
            defaultThumbnailUri = uri;
            return this;
        }

        public final Builder description(String s)
        {
            description = s;
            return this;
        }

        public final Builder dislikesCount(long l)
        {
            dislikesCount = l;
            return this;
        }

        public final Builder duration(int i)
        {
            duration = i;
            return this;
        }

        public final Builder editUri(Uri uri)
        {
            editUri = uri;
            return this;
        }

        public final Date getUploadedDate()
        {
            return uploadedDate;
        }

        public final Builder hqThumbnailUri(Uri uri)
        {
            hqThumbnailUri = uri;
            return this;
        }

        public final Builder id(String s)
        {
            id = s;
            return this;
        }

        public final Builder is3d(boolean flag)
        {
            is3d = flag;
            return this;
        }

        public final Builder isInOfflineStore(boolean flag)
        {
            isInOfflineStore = flag;
            return this;
        }

        public final Builder isUpsell(boolean flag)
        {
            isUpsell = flag;
            return this;
        }

        public final Builder likesCount(long l)
        {
            likesCount = l;
            return this;
        }

        public final Builder liveEventUri(Uri uri)
        {
            liveEventUri = uri;
            return this;
        }

        public final Builder location(String s)
        {
            location = s;
            return this;
        }

        public final Builder monetize(boolean flag)
        {
            monetize = flag;
            return this;
        }

        public final Builder monetizeExceptionCountries(Set set)
        {
            monetizeExceptionCountries = set;
            return this;
        }

        public final Builder mqThumbnailUri(Uri uri)
        {
            mqThumbnailUri = uri;
            return this;
        }

        public final Builder offlineChannelAvatarThumbnailUrl(String s)
        {
            offlineChannelAvatarThumbnailUrl = s;
            return this;
        }

        public final Builder owner(String s)
        {
            owner = s;
            return this;
        }

        public final Builder ownerDisplayName(String s)
        {
            ownerDisplayName = s;
            return this;
        }

        public final Builder ownerUri(Uri uri)
        {
            ownerUri = uri;
            return this;
        }

        public final Builder paidContent(boolean flag)
        {
            paidContent = flag;
            return this;
        }

        public final Builder privacy(Privacy privacy1)
        {
            if (privacy != Privacy.PRIVATE)
            {
                privacy = privacy1;
            }
            return this;
        }

        public final Builder publishedDate(Date date)
        {
            publishedDate = date;
            return this;
        }

        public final Builder sdThumbnailUri(Uri uri)
        {
            sdThumbnailUri = uri;
            return this;
        }

        public final Builder state(State state1)
        {
            state = (State)c.a(state1);
            return this;
        }

        public final Builder streams(Set set)
        {
            streams = set;
            return this;
        }

        public final Builder tags(String s)
        {
            tags = s;
            return this;
        }

        public final Builder title(String s)
        {
            title = s;
            return this;
        }

        public final Builder uploadedDate(Date date)
        {
            uploadedDate = date;
            return this;
        }

        public final Builder viewCount(long l)
        {
            viewCount = l;
            return this;
        }

        public final Builder watchUri(Uri uri)
        {
            watchUri = uri;
            return this;
        }

        public final Builder where(String s)
        {
            where = s;
            return this;
        }

        public Builder()
        {
            state = State.PLAYABLE;
        }

        private class Privacy extends Enum
        {

            private static final Privacy $VALUES[];
            public static final Privacy PRIVATE;
            public static final Privacy PUBLIC;
            public static final Privacy UNLISTED;
            public final int nameId;

            public static Privacy valueOf(String s)
            {
                return (Privacy)Enum.valueOf(com/google/android/apps/youtube/datalib/model/gdata/Video$Privacy, s);
            }

            public static Privacy[] values()
            {
                return (Privacy[])$VALUES.clone();
            }

            static 
            {
                PUBLIC = new Privacy("PUBLIC", 0, p.gV);
                UNLISTED = new Privacy("UNLISTED", 1, p.gX);
                PRIVATE = new Privacy("PRIVATE", 2, p.gT);
                $VALUES = (new Privacy[] {
                    PUBLIC, UNLISTED, PRIVATE
                });
            }

            private Privacy(String s, int i, int j)
            {
                super(s, i);
                nameId = j;
            }
        }

    }

}
