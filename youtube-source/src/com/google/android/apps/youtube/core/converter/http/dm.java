// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.ar;
import com.google.android.apps.youtube.datalib.legacy.model.au;
import java.util.Map;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            dj

final class dm extends o
{

    dm()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        Object obj = (com.google.android.apps.youtube.datalib.legacy.model.SurveyQuestion.Type)dj.a().get(attributes.getValue("type"));
        if (obj == null)
        {
            L.c("Invalid survey type encountered");
            obj = com.google.android.apps.youtube.datalib.legacy.model.SurveyQuestion.Type.UNSUPPORTED;
        }
        com.google.android.apps.youtube.datalib.legacy.model.SurveyQuestion.RandomizeOptions randomizeoptions1 = (com.google.android.apps.youtube.datalib.legacy.model.SurveyQuestion.RandomizeOptions)dj.b().get(attributes.getValue("randomize_option"));
        com.google.android.apps.youtube.datalib.legacy.model.SurveyQuestion.RandomizeOptions randomizeoptions = randomizeoptions1;
        if (randomizeoptions1 == null)
        {
            L.c("Invalid randomize type encountered");
            randomizeoptions = com.google.android.apps.youtube.datalib.legacy.model.SurveyQuestion.RandomizeOptions.UNKNOWN;
        }
        obj = (new au(((com.google.android.apps.youtube.datalib.legacy.model.SurveyQuestion.Type) (obj)), dj.b(attributes.getValue("text")))).a(randomizeoptions).b(attributes.getValue("api_context"));
        attributes = attributes.getValue("video_timeout_seconds");
        if (attributes != null)
        {
            try
            {
                ((au) (obj)).b(Integer.valueOf(attributes.trim()).intValue());
            }
            catch (NumberFormatException numberformatexception)
            {
                L.c((new StringBuilder("Invalid value for duration: ")).append(attributes).toString());
            }
        }
        l1.add(obj);
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        attributes = ((au)l1.b(com/google/android/apps/youtube/datalib/legacy/model/au)).a();
        ((ar)l1.a(com/google/android/apps/youtube/datalib/legacy/model/ar)).a(attributes);
    }
}
