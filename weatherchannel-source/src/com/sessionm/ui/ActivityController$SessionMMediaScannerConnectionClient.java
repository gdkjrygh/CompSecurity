// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.media.MediaScannerConnection;
import android.net.Uri;

// Referenced classes of package com.sessionm.ui:
//            ActivityController

private class <init>
    implements android.media.t
{

    private final String mFilename;
    private MediaScannerConnection mMediaScannerConnection;
    private final String mMimeType;
    final ActivityController this$0;

    private void setMediaScannerConnection(MediaScannerConnection mediascannerconnection)
    {
        mMediaScannerConnection = mediascannerconnection;
    }

    public void onMediaScannerConnected()
    {
        if (mMediaScannerConnection != null)
        {
            mMediaScannerConnection.scanFile(mFilename, mMimeType);
        }
    }

    public void onScanCompleted(String s, Uri uri)
    {
        if (mMediaScannerConnection != null)
        {
            mMediaScannerConnection.disconnect();
        }
    }


    private (String s, String s1)
    {
        this$0 = ActivityController.this;
        super();
        mFilename = s;
        mMimeType = s1;
    }

    mMimeType(String s, String s1, mMimeType mmimetype)
    {
        this(s, s1);
    }
}
