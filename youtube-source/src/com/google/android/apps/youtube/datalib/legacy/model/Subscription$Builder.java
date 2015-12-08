// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.e.p;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            r, z, Subscription

public class 
    implements r, Serializable
{

    private Uri channelUri;
    private String displayUsername;
    private Uri editUri;
    private String playlistTitle;
    private String query;
    private String title;
    private username type;
    private Uri uri;
    private String username;

    private void readObject(ObjectInputStream objectinputstream)
    {
        title = (String)objectinputstream.readObject();
        type = (type)objectinputstream.readObject();
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
        z.a[type.inal()];
        JVM INSTR tableswitch 1 6: default 56
    //                   1 88
    //                   2 88
    //                   3 88
    //                   4 119
    //                   5 130
    //                   6 141;
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

    public build channelUri(Uri uri1)
    {
        channelUri = uri1;
        return this;
    }

    public channelUri displayUsername(String s)
    {
        displayUsername = s;
        return this;
    }

    public displayUsername editUri(Uri uri1)
    {
        editUri = uri1;
        return this;
    }

    public editUri playlistTitle(String s)
    {
        playlistTitle = s;
        return this;
    }

    public playlistTitle query(String s)
    {
        query = s;
        return this;
    }

    public query title(String s)
    {
        title = s;
        return this;
    }

    public title type(title title1)
    {
        type = title1;
        return this;
    }

    public type uri(Uri uri1)
    {
        uri = uri1;
        return this;
    }

    public uri username(String s)
    {
        username = s;
        return this;
    }

    public ()
    {
    }
}
