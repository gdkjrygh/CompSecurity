// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.media.MediaScannerConnection;
import android.net.Uri;
import android.util.Log;

// Referenced classes of package net.hockeyapp.android:
//            FeedbackManager

private static class <init>
    implements android.media.ConnectionClient
{

    private MediaScannerConnection connection;
    private String path;

    public void onMediaScannerConnected()
    {
        if (connection != null)
        {
            connection.scanFile(path, null);
        }
    }

    public void onScanCompleted(String s, Uri uri)
    {
        Log.i("HockeyApp", String.format("Scanned path %s -> URI = %s", new Object[] {
            s, uri.toString()
        }));
        connection.disconnect();
    }

    public void setConnection(MediaScannerConnection mediascannerconnection)
    {
        connection = mediascannerconnection;
    }

    private onClient(String s)
    {
        connection = null;
        path = s;
    }

    path(String s, path path1)
    {
        this(s);
    }
}
