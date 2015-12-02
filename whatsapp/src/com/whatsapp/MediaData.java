// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.io.File;
import java.io.Serializable;

// Referenced classes of package com.whatsapp:
//            ui, w5, p5

public class MediaData
    implements Serializable
{

    private static final long serialVersionUID = 0xfff496ede1a23006L;
    public boolean autodownloadRetryEnabled;
    public transient boolean dedupeDownload;
    public transient ui downloader;
    public int faceX;
    public int faceY;
    public File file;
    public long fileSize;
    public transient boolean forward;
    public long progress;
    public boolean transcoded;
    public transient w5 transcoder;
    public boolean transferred;
    public transient boolean transferring;
    public long trimFrom;
    public long trimTo;
    public transient p5 uploader;

    public MediaData()
    {
        transferring = false;
        transferred = false;
    }

    public MediaData(MediaData mediadata)
    {
        transferring = false;
        transferred = false;
        transferred = mediadata.transferred;
        file = mediadata.file;
        fileSize = mediadata.fileSize;
        faceX = mediadata.faceX;
        faceY = mediadata.faceY;
    }
}
