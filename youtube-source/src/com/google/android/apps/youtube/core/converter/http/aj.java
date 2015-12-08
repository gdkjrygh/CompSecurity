// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import java.util.Locale;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            ae

final class aj extends o
{

    final ae a;

    aj(ae ae)
    {
        a = ae;
        super();
    }

    public final void a(l l1, Attributes attributes, String s)
    {
label0:
        {
            if ("http://gdata.youtube.com/schemas/2007/userevents.cat".equals(attributes.getValue("scheme")))
            {
                s = attributes.getValue("term").toUpperCase(Locale.US);
                if (!TextUtils.isEmpty(s))
                {
                    if (s.equals("BULLETIN_POSTED"))
                    {
                        attributes = com.google.android.apps.youtube.datalib.legacy.model.Event.Action.BULLETIN_POSTED;
                    } else
                    if (s.equals("VIDEO_UPLOADED"))
                    {
                        attributes = com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_UPLOADED;
                    } else
                    if (s.equals("VIDEO_RATED"))
                    {
                        attributes = com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_LIKED;
                    } else
                    if (s.equals("VIDEO_SHARED"))
                    {
                        attributes = com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_SHARED;
                    } else
                    if (s.equals("VIDEO_FAVORITED"))
                    {
                        attributes = com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_FAVORITED;
                    } else
                    if (s.equals("VIDEO_COMMENTED"))
                    {
                        attributes = com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_COMMENTED;
                    } else
                    if (s.equals("VIDEO_RECOMMENDED"))
                    {
                        attributes = com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_RECOMMENDED;
                    } else
                    if (s.equals("VIDEO_ADDED_TO_PLAYLIST"))
                    {
                        attributes = com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_ADDED_TO_PLAYLIST;
                    } else
                    if (s.equals("FRIEND_ADDED"))
                    {
                        attributes = com.google.android.apps.youtube.datalib.legacy.model.Event.Action.FRIEND_ADDED;
                    } else
                    if (s.equals("USER_SUBSCRIPTION_ADDED"))
                    {
                        attributes = com.google.android.apps.youtube.datalib.legacy.model.Event.Action.USER_SUBSCRIPTION_ADDED;
                    } else
                    {
                        attributes = null;
                    }
                    if (attributes == null)
                    {
                        break label0;
                    }
                    ((com.google.android.apps.youtube.datalib.legacy.model.Event.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/Event$Builder)).action(attributes);
                }
            }
            return;
        }
        L.c((new StringBuilder("Unexpected event action ")).append(s).toString());
    }
}
