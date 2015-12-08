// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

// Referenced classes of package com.facebook.share.internal:
//            VideoUploader

private static class <init>
{

    public final AccessToken accessToken;
    public final FacebookCallback callback;
    public String chunkStart;
    public final String description;
    public final String graphNode;
    public boolean isCanceled;
    public Bundle params;
    public final String ref;
    public String sessionId;
    public final String title;
    public String videoId;
    public long videoSize;
    public InputStream videoStream;
    public final Uri videoUri;
    public com.facebook.internal.ntext.videoUri workItem;

    private void initialize()
        throws FileNotFoundException
    {
        try
        {
            if (Utility.isFileUri(videoUri))
            {
                ParcelFileDescriptor parcelfiledescriptor = ParcelFileDescriptor.open(new File(videoUri.getPath()), 0x10000000);
                videoSize = parcelfiledescriptor.getStatSize();
                videoStream = new android.os.seInputStream(parcelfiledescriptor);
                return;
            }
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            Utility.closeQuietly(videoStream);
            throw filenotfoundexception;
        }
        if (Utility.isContentUri(videoUri))
        {
            videoSize = Utility.getContentSize(videoUri);
            videoStream = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(videoUri);
            return;
        }
        throw new FacebookException("Uri must be a content:// or file:// uri");
    }


    private (ShareVideoContent sharevideocontent, String s, FacebookCallback facebookcallback)
    {
        chunkStart = "0";
        accessToken = AccessToken.getCurrentAccessToken();
        videoUri = sharevideocontent.getVideo().getLocalUrl();
        title = sharevideocontent.getContentTitle();
        description = sharevideocontent.getContentDescription();
        ref = sharevideocontent.getRef();
        graphNode = s;
        callback = facebookcallback;
        params = sharevideocontent.getVideo().getParameters();
    }

    params(ShareVideoContent sharevideocontent, String s, FacebookCallback facebookcallback, params params1)
    {
        this(sharevideocontent, s, facebookcallback);
    }
}
