// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.model.gdata;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.apps.youtube.common.e.o;
import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.datalib.model.gdata:
//            b, a

public class Stream
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private static final int FORMAT_100_OVER_HTTP = 24;
    private static final int FORMAT_101_OVER_HTTP = 25;
    private static final int FORMAT_102_OVER_HTTP = 26;
    private static final int FORMAT_113_OVER_HTTP = 16;
    private static final int FORMAT_114_OVER_HTTP = 15;
    private static final int FORMAT_119_OVER_HTTP = 20;
    private static final int FORMAT_159_OVER_HTTP = 32;
    private static final int FORMAT_17_OVER_HTTP = 2;
    private static final int FORMAT_180_OVER_HTTP = 35;
    private static final int FORMAT_186_OVER_HTTP = 34;
    private static final int FORMAT_18_OVER_HTTP = 3;
    private static final int FORMAT_193_OVER_HTTP = 38;
    private static final int FORMAT_22_OVER_HTTP = 8;
    private static final int FORMAT_36_OVER_HTTP = 9;
    private static final int FORMAT_37_OVER_HTTP = 30;
    private static final int FORMAT_5_OVER_HTTP = 7;
    private static final int FORMAT_62_OVER_HTTP = 14;
    private static final int FORMAT_64_OVER_HTTP = 31;
    private static final int FORMAT_80_OVER_HTTP = 11;
    private static final int FORMAT_81_OVER_HTTP = 12;
    private static final int FORMAT_82_OVER_HTTP = 21;
    private static final int FORMAT_83_OVER_HTTP = 22;
    private static final int FORMAT_84_OVER_HTTP = 23;
    private static final int FORMAT_88_OVER_HTTP = 13;
    private static final int FORMAT_HLS = 28;
    private static final SparseIntArray GDATA_TO_ITAG;
    public static final SparseArray ITAG_DESCRIPTORS;
    private static final int ITAG_HLS = 93;
    public static final int ITAG_UNKNOWN = 0;
    private final int height;
    public final boolean is3D;
    public final boolean isEncrypted;
    private final int itag;
    public final String mimeType;
    public final long sizeInBytes;
    public final Uri uri;
    public final String videoId;

    public Stream(int i, Uri uri1, String s, int j, String s1)
    {
        this(i, uri1, s, j, s1, 0L);
    }

    private Stream(int i, Uri uri1, String s, int j, String s1, long l)
    {
        boolean flag1 = true;
        super();
        itag = i;
        c.a(uri1);
        Uri uri2 = uri1;
        if (s != null)
        {
            uri2 = o.a(uri1).a("dnc", "1").a();
        }
        uri = uri2;
        videoId = s;
        mimeType = s1;
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        sizeInBytes = l;
        isEncrypted = "video/wvm".equals(s1);
        uri1 = (com.google.android.apps.youtube.datalib.model.gdata.b)ITAG_DESCRIPTORS.get(i);
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        i = j;
        if (uri1 != null)
        {
            i = j;
            if (j == 0)
            {
                i = ((com.google.android.apps.youtube.datalib.model.gdata.b) (uri1)).b;
            }
        }
        height = i;
        if (uri1 != null && ((com.google.android.apps.youtube.datalib.model.gdata.b) (uri1)).e)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        is3D = flag;
    }

    Stream(int i, Uri uri1, String s, int j, String s1, long l, 
            a a1)
    {
        this(i, uri1, s, j, s1, l);
    }

    public Stream(Uri uri1)
    {
        this(0, uri1, null, 0, null, 0L);
    }

    public Stream(Uri uri1, String s)
    {
        this(0, uri1, s, 0, null, 0L);
    }

    public Stream(Uri uri1, String s, int i)
    {
        this(0, uri1, s, i, null, 0L);
    }

    public Stream(Uri uri1, String s, int i, String s1)
    {
        this(0, uri1, s, i, s1, 0L);
    }

    public Stream(Parcel parcel)
    {
        this(parcel.readInt(), (Uri)parcel.readParcelable(android/net/Uri.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readLong());
    }

    public static Stream getFirstAvailableFormat(List list, Map map)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            Stream stream = (Stream)map.get((Integer)list.next());
            if (stream != null)
            {
                return stream;
            }
        }

        return null;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("builder required");
    }

    private Object writeReplace()
    {
        return buildUpon();
    }

    public Builder buildUpon()
    {
        return (new Builder()).uri(uri).videoId(videoId).height(height).sizeInBytes(sizeInBytes).mimeType(mimeType).itag(itag);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Stream))
            {
                return false;
            }
            obj = (Stream)obj;
            if (itag != ((Stream) (obj)).itag || height != ((Stream) (obj)).height || !uri.equals(((Stream) (obj)).uri) || !b.a(videoId, ((Stream) (obj)).videoId) || is3D != ((Stream) (obj)).is3D || isEncrypted != ((Stream) (obj)).isEncrypted || !b.a(mimeType, ((Stream) (obj)).mimeType))
            {
                return false;
            }
        }
        return true;
    }

    public int getHeight()
    {
        return height;
    }

    public int getItag()
    {
        return itag;
    }

    public int hashCode()
    {
        return uri.hashCode();
    }

    public boolean isHD()
    {
        return height >= 720;
    }

    public boolean isHls()
    {
        return itag == 93;
    }

    public String toString()
    {
        return (new StringBuilder("[")).append(uri).append(", ").append(videoId).append(", ").append(height).append(", ").append(mimeType).append(", ").append(itag).append(", ").append(sizeInBytes).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(itag);
        parcel.writeParcelable(uri, 0);
        parcel.writeString(videoId);
        parcel.writeInt(height);
        parcel.writeString(mimeType);
        parcel.writeLong(sizeInBytes);
    }

    static 
    {
        int i = 0;
        SparseArray sparsearray = new SparseArray();
        ITAG_DESCRIPTORS = sparsearray;
        sparsearray.append(5, new com.google.android.apps.youtube.datalib.model.gdata.b(7, 426, 240, false, false));
        ITAG_DESCRIPTORS.append(17, new com.google.android.apps.youtube.datalib.model.gdata.b(2, 176, 144, false, false));
        ITAG_DESCRIPTORS.append(18, new com.google.android.apps.youtube.datalib.model.gdata.b(3, 640, 360, false, false));
        ITAG_DESCRIPTORS.append(22, new com.google.android.apps.youtube.datalib.model.gdata.b(8, 1280, 720, false, false));
        ITAG_DESCRIPTORS.append(36, new com.google.android.apps.youtube.datalib.model.gdata.b(9, 320, 240, false, false));
        ITAG_DESCRIPTORS.append(37, new com.google.android.apps.youtube.datalib.model.gdata.b(30, 1920, 1080, false, false));
        ITAG_DESCRIPTORS.append(62, new com.google.android.apps.youtube.datalib.model.gdata.b(14, 0, 480, false, false));
        ITAG_DESCRIPTORS.append(64, new com.google.android.apps.youtube.datalib.model.gdata.b(31, 0, 1080, false, false));
        ITAG_DESCRIPTORS.append(80, new com.google.android.apps.youtube.datalib.model.gdata.b(11, 0, 405, false, false));
        ITAG_DESCRIPTORS.append(81, new com.google.android.apps.youtube.datalib.model.gdata.b(12, 0, 360, false, false));
        ITAG_DESCRIPTORS.append(82, new com.google.android.apps.youtube.datalib.model.gdata.b(21, 640, 360, false, true));
        ITAG_DESCRIPTORS.append(83, new com.google.android.apps.youtube.datalib.model.gdata.b(22, 854, 480, false, true));
        ITAG_DESCRIPTORS.append(84, new com.google.android.apps.youtube.datalib.model.gdata.b(23, 1280, 720, false, true));
        ITAG_DESCRIPTORS.append(88, new com.google.android.apps.youtube.datalib.model.gdata.b(13, 0, 720, false, false));
        ITAG_DESCRIPTORS.append(100, new com.google.android.apps.youtube.datalib.model.gdata.b(24, 640, 360, false, true));
        ITAG_DESCRIPTORS.append(101, new com.google.android.apps.youtube.datalib.model.gdata.b(25, 854, 480, false, true));
        ITAG_DESCRIPTORS.append(102, new com.google.android.apps.youtube.datalib.model.gdata.b(26, 1280, 720, false, true));
        ITAG_DESCRIPTORS.append(113, new com.google.android.apps.youtube.datalib.model.gdata.b(16, 0, 720, true, false));
        ITAG_DESCRIPTORS.append(114, new com.google.android.apps.youtube.datalib.model.gdata.b(15, 0, 480, true, false));
        ITAG_DESCRIPTORS.append(119, new com.google.android.apps.youtube.datalib.model.gdata.b(20, 0, 240, false, false));
        ITAG_DESCRIPTORS.append(159, new com.google.android.apps.youtube.datalib.model.gdata.b(32, 0, 1080, true, false));
        ITAG_DESCRIPTORS.append(180, new com.google.android.apps.youtube.datalib.model.gdata.b(35, 0, 1080, true, false));
        ITAG_DESCRIPTORS.append(186, new com.google.android.apps.youtube.datalib.model.gdata.b(34, 0, 720, true, false));
        ITAG_DESCRIPTORS.append(193, new com.google.android.apps.youtube.datalib.model.gdata.b(38, 0, 405, false, false));
        ITAG_DESCRIPTORS.append(93, new com.google.android.apps.youtube.datalib.model.gdata.b(28, 0, 0, false, false));
        GDATA_TO_ITAG = new SparseIntArray();
        for (; i < ITAG_DESCRIPTORS.size(); i++)
        {
            GDATA_TO_ITAG.put(((com.google.android.apps.youtube.datalib.model.gdata.b)ITAG_DESCRIPTORS.valueAt(i)).c, ITAG_DESCRIPTORS.keyAt(i));
        }

    }


    private class Builder
        implements Serializable
    {

        private int height;
        private int itag;
        private String mimeType;
        private long sizeInBytes;
        private Uri uri;
        private String videoId;

        private void readObject(ObjectInputStream objectinputstream)
        {
            itag = objectinputstream.readInt();
            uri = p.a((String)objectinputstream.readObject());
            videoId = (String)objectinputstream.readObject();
            height = objectinputstream.readInt();
            mimeType = (String)objectinputstream.readObject();
            sizeInBytes = objectinputstream.readLong();
        }

        private Object readResolve()
        {
            return build();
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
        {
            objectoutputstream.writeInt(itag);
            objectoutputstream.writeObject(p.a(uri));
            objectoutputstream.writeObject(videoId);
            objectoutputstream.writeInt(height);
            objectoutputstream.writeObject(mimeType);
            objectoutputstream.writeLong(sizeInBytes);
        }

        public final Stream build()
        {
            return new Stream(itag, uri, videoId, height, mimeType, sizeInBytes, null);
        }

        public final Builder height(int i)
        {
            height = i;
            return this;
        }

        public final Builder itag(int i)
        {
            itag = i;
            return this;
        }

        public final Builder legacyGdataFormat(int i)
        {
            return itag(Stream.GDATA_TO_ITAG.get(i));
        }

        public final Builder mimeType(String s)
        {
            mimeType = s;
            return this;
        }

        public final Builder sizeInBytes(long l)
        {
            sizeInBytes = l;
            return this;
        }

        public final Builder uri(Uri uri1)
        {
            uri = uri1;
            return this;
        }

        public final Builder videoId(String s)
        {
            videoId = s;
            return this;
        }

        public Builder()
        {
            itag = 0;
        }
    }

}
