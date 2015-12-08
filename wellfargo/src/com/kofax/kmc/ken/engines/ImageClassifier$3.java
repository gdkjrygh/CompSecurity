// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import android.os.Handler;
import com.kofax.android.abc.image_classification.ImageClassifier;

// Referenced classes of package com.kofax.kmc.ken.engines:
//            ImageClassifier

class a extends Thread
{

    final Bitmap a;
    final com.kofax.kmc.ken.engines.ImageClassifier b;

    public void run()
    {
        ImageClassifier.a(b).classify(a, ImageClassifier.e(b));
        ImageClassifier.f(b).post(b.a);
    }

    mageClassifier(com.kofax.kmc.ken.engines.ImageClassifier imageclassifier, Bitmap bitmap)
    {
        b = imageclassifier;
        a = bitmap;
        super();
    }
}
