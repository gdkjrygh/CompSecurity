// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.iplib;

import com.kofax.kmc.ken.engines.service.ImageService;

public class ProcessPageOutRep
{

    final int KIPPOUTREP_BITMAP = 1;
    final int KIPPOUTREP_BOTH = 3;
    final int KIPPOUTREP_FILE = 2;
    final int KIPPOUTREP_NONE = 0;
    final int QUICKANALYSISMODE_METADATAONLY = 1;
    final int QUICKANALYSISMODE_METADATAPLUSIMAGE = 2;
    final int QUICKANALYSISMODE_OFF = 0;
    public boolean callbackOnWorkerThread;
    public String exifMetadataStr;
    public String imageID;
    public com.kofax.kmc.ken.engines.data.Image.ImageMimeType imageMimeType;
    public int imageMimeTypeCode;
    public com.kofax.kmc.ken.engines.data.Image.ImageRep imageRep;
    public int imageRepCode;
    public String processedFilePathStr;
    public int processedImageJpegQuality;
    public int quickAnalysisMode;

    public ProcessPageOutRep()
    {
    }

    public boolean isQuickAnalysisBitmapNeeded()
    {
        return 2 == quickAnalysisMode;
    }

    public boolean isQuickAnalysisEnabled()
    {
        return quickAnalysisMode != 0;
    }

    public void setImageMimeType(com.kofax.kmc.ken.engines.data.Image.ImageMimeType imagemimetype)
    {
        imageMimeType = imagemimetype;
        imageMimeTypeCode = ImageService.imgMimeTypetoIpFileType(imagemimetype);
    }

    public void setImageRep(com.kofax.kmc.ken.engines.data.Image.ImageRep imagerep)
    {
        imageRep = imagerep;
        if (com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BITMAP == imagerep)
        {
            imageRepCode = 1;
            return;
        }
        if (com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BOTH == imagerep)
        {
            imageRepCode = 3;
            return;
        }
        if (com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_FILE == imagerep)
        {
            imageRepCode = 2;
            return;
        }
        if (com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_NONE == imagerep)
        {
            imageRepCode = 0;
            return;
        } else
        {
            throw new InternalError("ProcessPageOutRep: unable to recognize imageRep");
        }
    }

    public void setQuickAnalysisMode(boolean flag, boolean flag1)
    {
        if (!flag)
        {
            quickAnalysisMode = 0;
            return;
        }
        int i;
        if (flag1)
        {
            i = 2;
        } else
        {
            i = 1;
        }
        quickAnalysisMode = i;
    }
}
