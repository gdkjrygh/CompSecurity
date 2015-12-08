// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.share;

import android.net.Uri;
import com.weather.util.intent.MimeType;

// Referenced classes of package com.weather.commons.share:
//            ShareableMedia

public class SimpleShareableMedia
    implements ShareableMedia
{

    private final MimeType mimeType;
    private final String title;
    private final Uri uri;

    public SimpleShareableMedia(String s, Uri uri1, MimeType mimetype)
    {
        title = s;
        uri = uri1;
        mimeType = mimetype;
    }

    public MimeType getMimeType()
    {
        return mimeType;
    }

    public String getTitle()
    {
        return title;
    }

    public Uri getUri()
    {
        return uri;
    }
}
