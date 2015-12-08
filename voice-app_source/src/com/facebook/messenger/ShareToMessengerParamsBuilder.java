// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messenger;

import android.net.Uri;

// Referenced classes of package com.facebook.messenger:
//            ShareToMessengerParams

public class ShareToMessengerParamsBuilder
{

    private Uri mExternalUri;
    private String mMetaData;
    private final String mMimeType;
    private final Uri mUri;

    ShareToMessengerParamsBuilder(Uri uri, String s)
    {
        mUri = uri;
        mMimeType = s;
    }

    public ShareToMessengerParams build()
    {
        return new ShareToMessengerParams(this);
    }

    public Uri getExternalUri()
    {
        return mExternalUri;
    }

    public String getMetaData()
    {
        return mMetaData;
    }

    public String getMimeType()
    {
        return mMimeType;
    }

    public Uri getUri()
    {
        return mUri;
    }

    public ShareToMessengerParamsBuilder setExternalUri(Uri uri)
    {
        mExternalUri = uri;
        return this;
    }

    public ShareToMessengerParamsBuilder setMetaData(String s)
    {
        mMetaData = s;
        return this;
    }
}
