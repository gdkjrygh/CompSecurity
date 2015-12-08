// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.media;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.a.a.a.a.fj;
import com.google.a.a.a.a.pp;
import com.google.android.apps.youtube.common.e.j;
import com.google.android.apps.youtube.common.e.o;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.exoplayer.a.m;
import com.google.android.exoplayer.b.a.a;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.c;
import java.util.Arrays;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model.media:
//            a, b, d

public class FormatStream
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.apps.youtube.datalib.innertube.model.media.a();
    private static final int DASH_PERIOD_START_MILLIS = 0;
    private static final int HLS_ITAG = 93;
    private static final String HLS_MIME_TYPE = "application/x-mpegURL";
    private static final int UNKNOWN_ITAG = 0;
    private static final String UNKNOWN_MIME_TYPE = "unknown";
    private static final String WIDEVINE_MIME_TYPE = "video/wvm";
    private final fj formatStreamProto;
    private Uri uri;
    private final long videoDurationMillis;
    private final String videoId;

    public FormatStream(fj fj1, String s, long l)
    {
        formatStreamProto = fj1;
        videoId = s;
        videoDurationMillis = l;
        uri = Uri.parse(fj1.c);
        if (s != null)
        {
            uri = o.a(uri).a("dnc", "1").a();
        }
    }

    public static FormatStream forHls(Uri uri1, String s, long l)
    {
        fj fj1 = new fj();
        fj1.b = 93;
        fj1.f = "application/x-mpegURL";
        fj1.c = uri1.toString();
        return new FormatStream(fj1, s, l);
    }

    public static FormatStream forPreload(Uri uri1, String s, long l)
    {
        fj fj1 = new fj();
        fj1.b = 0;
        fj1.f = "unknown";
        fj1.c = uri1.toString();
        fj1.m = l;
        return new FormatStream(fj1, s, 0L);
    }

    public com.google.android.apps.youtube.datalib.innertube.model.media.b buildUpon()
    {
        return new com.google.android.apps.youtube.datalib.innertube.model.media.b(this, (byte)0);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (FormatStream)obj;
            if (videoDurationMillis != ((FormatStream) (obj)).videoDurationMillis || !b.a(videoId, ((FormatStream) (obj)).videoId) || !c.a(formatStreamProto, ((FormatStream) (obj)).formatStreamProto))
            {
                return false;
            }
        }
        return true;
    }

    public long getContentLength()
    {
        return formatStreamProto.m;
    }

    public fj getFormatStreamProto()
    {
        fj fj1;
        try
        {
            fj1 = (fj)c.a(new fj(), c.a(formatStreamProto));
        }
        catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
        {
            throw new RuntimeException(invalidprotocolbuffernanoexception);
        }
        return fj1;
    }

    public int getHeight()
    {
        return formatStreamProto.i;
    }

    public int getItag()
    {
        return formatStreamProto.b;
    }

    public long getLastModified()
    {
        return formatStreamProto.l;
    }

    public String getMimeType()
    {
        return formatStreamProto.f;
    }

    public a getRepresentation(String s)
    {
        m m1 = new m(getItag(), formatStreamProto.f, getWidth(), getHeight(), 0, 0, formatStreamProto.g / 8);
        return new a(videoId, formatStreamProto.l, m1, getUriWithCpn(s), getContentLength(), formatStreamProto.j.d, formatStreamProto.j.e, formatStreamProto.k.d, formatStreamProto.k.e, 0L, videoDurationMillis);
    }

    public String getSimpleMimeType()
    {
        return TextUtils.split(getMimeType(), ";")[0];
    }

    public Uri getUri()
    {
        return uri;
    }

    public Uri getUriWithCpn(String s)
    {
        if (s == null)
        {
            return uri;
        } else
        {
            return uri.buildUpon().appendQueryParameter("cpn", s).build();
        }
    }

    public long getVideoDurationMillis()
    {
        return videoDurationMillis;
    }

    public String getVideoId()
    {
        return videoId;
    }

    public int getWidth()
    {
        return formatStreamProto.h;
    }

    public int hashCode()
    {
        int k = 0;
        int l = (int)(videoDurationMillis ^ videoDurationMillis >>> 32);
        int i;
        if (videoId == null)
        {
            i = 0;
        } else
        {
            i = videoId.hashCode();
        }
        if (formatStreamProto != null)
        {
            k = Arrays.hashCode(c.a(formatStreamProto));
        }
        return (i + (l + 31) * 31) * 31 + k;
    }

    public boolean is3D()
    {
        return formatStreamProto.r;
    }

    public boolean isAdaptive()
    {
        return com.google.android.apps.youtube.datalib.innertube.model.media.d.a.contains(Integer.valueOf(getItag()));
    }

    public boolean isFile()
    {
        return "file".equals(uri.getScheme());
    }

    public boolean isHD()
    {
        return getHeight() >= 720;
    }

    public boolean isHls()
    {
        return getItag() == 93;
    }

    public boolean isLocal()
    {
        return p.b(uri);
    }

    public boolean isWidevine()
    {
        return getMimeType().equals("video/wvm");
    }

    public String toString()
    {
        return String.format("v:{%s} t:{%d} i:{%d} s:{%dx%d} m:{%s} u:{%s}", new Object[] {
            videoId, Long.valueOf(videoDurationMillis), Integer.valueOf(getItag()), Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), getMimeType(), uri.toString()
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(parcel, formatStreamProto);
        parcel.writeString(videoId);
        parcel.writeLong(videoDurationMillis);
    }




}
