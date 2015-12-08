// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import com.kofax.android.abc.image_classification.ImageClassifier;
import com.kofax.android.abc.image_classification.ResultPair;
import com.kofax.kmc.ken.engines.appstats.ImgClassifierAppStatsClient;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

// Referenced classes of package com.kofax.kmc.ken.engines:
//            ImageClassificationResult, ImageClassificationCompletedListener, ImageClassificationCompleteEvent, ImageClassifier

class a
    implements Runnable
{

    final com.kofax.kmc.ken.engines.ImageClassifier a;

    private List a(Vector vector)
    {
        ArrayList arraylist = new ArrayList();
        if (vector == null)
        {
            return arraylist;
        }
        for (int i = 0; i < vector.size(); i++)
        {
            ResultPair resultpair = (ResultPair)vector.get(i);
            if (resultpair != null)
            {
                arraylist.add(new ImageClassificationResult(resultpair.classID, resultpair.confidence, resultpair.orientation));
            }
        }

        return arraylist;
    }

    private void a(Image image, List list)
    {
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                ImageClassificationCompletedListener imageclassificationcompletedlistener = (ImageClassificationCompletedListener)list.next();
                if (imageclassificationcompletedlistener != null)
                {
                    imageclassificationcompletedlistener.onImageClassified(new ImageClassificationCompleteEvent(this, image));
                }
            } while (true);
        }
    }

    public void run()
    {
        List list = null;
        List list1 = a(ImageClassifier.a(a).getClassificationResults());
        list = list1;
_L2:
        if (ImageClassifier.b(a) != null)
        {
            ImageClassifier.b(a).setImageClassifyResults(list);
            if (ImageClassifier.c(a))
            {
                ImageClassifier.b(a).imageClearBitmap();
                ImageClassifier.a(a, false);
            }
        }
        ImageClassifier.a(ageClassificationStatus.COMPLETE);
        ImageClassifier.a().logAppStats(AppStatsEventIDType.APP_STATS_CLASSIFY_STOP_EVENT, list, ImageClassifier.b(a).getImageID());
        a(ImageClassifier.b(a), ImageClassifier.d(a));
        return;
        Exception exception;
        exception;
        ImageClassifier.a(ageClassificationStatus.ERROR);
        if (true) goto _L2; else goto _L1
_L1:
    }

    fierAppStatsClient(com.kofax.kmc.ken.engines.ImageClassifier imageclassifier)
    {
        a = imageclassifier;
        super();
    }
}
