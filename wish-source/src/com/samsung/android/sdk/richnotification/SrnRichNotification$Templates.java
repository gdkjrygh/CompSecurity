// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import com.samsung.android.sdk.richnotification.templates.SrnPrimaryTemplate;
import com.samsung.android.sdk.richnotification.templates.SrnSecondaryTemplate;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnRichNotification

static class <init>
{

    private SrnPrimaryTemplate mPrimaryTemplate;
    private SrnSecondaryTemplate mSecondaryTemplate;





    private ()
    {
    }

    private ( )
    {
        if (.mPrimaryTemplate != null)
        {
            mPrimaryTemplate = (SrnPrimaryTemplate).mPrimaryTemplate.cloneSelf();
        }
        if (.mSecondaryTemplate != null)
        {
            mSecondaryTemplate = (SrnSecondaryTemplate).mSecondaryTemplate.cloneSelf();
        }
    }

    .cloneSelf(.cloneSelf cloneself, .cloneSelf cloneself1)
    {
        this();
    }

    <init>(<init> <init>1, <init> <init>2, <init> <init>3)
    {
        this(<init>1);
    }
}
