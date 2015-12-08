// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.templates;

import android.graphics.Color;
import com.samsung.android.sdk.richnotification.SrnImageAsset;
import com.samsung.android.sdk.richnotification.SrnTemplate;

// Referenced classes of package com.samsung.android.sdk.richnotification.templates:
//            TemplateUtil

public abstract class SrnPrimaryTemplate extends SrnTemplate
{

    private String mBackgroundColor;
    private SrnImageAsset mBackgroundImage;

    SrnPrimaryTemplate(SrnPrimaryTemplate srnprimarytemplate)
    {
        super(srnprimarytemplate);
        mBackgroundImage = srnprimarytemplate.mBackgroundImage;
        mBackgroundColor = srnprimarytemplate.mBackgroundColor;
    }

    SrnPrimaryTemplate(String s, String s1)
    {
        super(com.samsung.android.sdk.richnotification.SrnTemplate.Priority.PRIMARY, s, s1);
    }

    public void setBackgroundColor(int i)
    {
        mBackgroundColor = String.format("%2X,%2X,%2X", new Object[] {
            Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i))
        });
    }

    public void setBackgroundImage(SrnImageAsset srnimageasset)
    {
        mBackgroundImage = srnimageasset;
        if (mBackgroundImage != null)
        {
            TemplateUtil.setCompressFormat(mBackgroundImage, android.graphics.Bitmap.CompressFormat.JPEG);
        }
    }
}
