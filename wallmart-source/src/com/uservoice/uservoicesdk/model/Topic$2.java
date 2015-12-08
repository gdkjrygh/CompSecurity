// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            Topic, BaseModel

static final class allback extends RestTaskCallback
{

    final Callback val$callback;

    public void onComplete(JSONObject jsonobject)
        throws JSONException
    {
        Object obj = BaseModel.deserializeList(jsonobject, "topics", com/uservoice/uservoicesdk/model/Topic);
        jsonobject = new ArrayList(((List) (obj)).size());
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Topic topic = (Topic)((Iterator) (obj)).next();
            if (topic.getNumberOfArticles() > 0)
            {
                jsonobject.add(topic);
            }
        } while (true);
        val$callback.onModel(jsonobject);
    }

    l(Callback callback1, Callback callback2)
    {
        val$callback = callback2;
        super(callback1);
    }
}
