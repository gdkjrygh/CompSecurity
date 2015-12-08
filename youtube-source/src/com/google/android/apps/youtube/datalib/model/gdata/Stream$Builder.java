// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.model.gdata;

import android.net.Uri;
import android.util.SparseIntArray;
import com.google.android.apps.youtube.common.e.p;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Referenced classes of package com.google.android.apps.youtube.datalib.model.gdata:
//            Stream

public final class itag
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

    public final sizeInBytes height(int i)
    {
        height = i;
        return this;
    }

    public final height itag(int i)
    {
        itag = i;
        return this;
    }

    public final itag legacyGdataFormat(int i)
    {
        return itag(Stream.access$000().get(i));
    }

    public final _cls00 mimeType(String s)
    {
        mimeType = s;
        return this;
    }

    public final mimeType sizeInBytes(long l)
    {
        sizeInBytes = l;
        return this;
    }

    public final sizeInBytes uri(Uri uri1)
    {
        uri = uri1;
        return this;
    }

    public final uri videoId(String s)
    {
        videoId = s;
        return this;
    }

    public ()
    {
        itag = 0;
    }
}
