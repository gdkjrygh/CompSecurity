// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities;

import com.kofax.android.abc.image_classification.ImageClassifier;

public class ClassifierLibUtil
{

    public ClassifierLibUtil()
    {
    }

    public String getClassifierVersion()
    {
        return ImageClassifier.getVersion();
    }

    static 
    {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("AtalaBar");
        System.loadLibrary("sol_isg_mobile");
    }
}
