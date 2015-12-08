// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.iplib;

import com.kofax.kmc.ken.engines.service.ImageService;
import java.nio.ByteBuffer;

public class IpFileBuffer
{

    public int mBitDepth;
    public ByteBuffer mByteBuffer;
    public String mExifMetadataStr;
    public int mFileBufferLength;
    public int mHeight;
    public int mIpFileType;
    public int mIpRetVal;
    public int mJniFileBufferHandle;
    public int mJpegQuality;
    public int mWidth;

    public IpFileBuffer(com.kofax.kmc.ken.engines.data.Image.ImageMimeType imagemimetype, int i, int j, String s)
    {
        mIpFileType = ImageService.imgMimeTypetoIpFileType(imagemimetype);
        mBitDepth = i;
        mJpegQuality = j;
        mExifMetadataStr = s;
    }
}
