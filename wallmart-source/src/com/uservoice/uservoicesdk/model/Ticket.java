// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            BaseModel

public class Ticket extends BaseModel
{

    public Ticket()
    {
    }

    public static void createTicket(String s, String s1, String s2, Map map, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("ticket[message]", s);
        if (s1 != null)
        {
            hashmap.put("email", s1);
        }
        if (s2 != null)
        {
            hashmap.put("display_name", s2);
        }
        for (s = getSession().getExternalIds().entrySet().iterator(); s.hasNext(); hashmap.put(String.format("created_by[external_ids][%s]", new Object[] {
    s1.getKey()
}), s1.getValue()))
        {
            s1 = (java.util.Map.Entry)s.next();
        }

        if (getConfig().getCustomFields() != null)
        {
            for (s = getConfig().getCustomFields().entrySet().iterator(); s.hasNext(); hashmap.put(String.format("ticket[custom_field_values][%s]", new Object[] {
    s1.getKey()
}), s1.getValue()))
            {
                s1 = (java.util.Map.Entry)s.next();
            }

        }
        if (map != null)
        {
            for (s = map.entrySet().iterator(); s.hasNext(); hashmap.put(String.format("ticket[custom_field_values][%s]", new Object[] {
    s1.getKey()
}), s1.getValue()))
            {
                s1 = (java.util.Map.Entry)s.next();
            }

        }
        doPost(apiPath("/tickets.json", new Object[0]), hashmap, new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                callback.onModel(BaseModel.deserializeObject(jsonobject, "ticket", com/uservoice/uservoicesdk/model/Ticket));
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public static void createTicket(String s, Map map, Callback callback)
    {
        createTicket(s, null, null, map, callback);
    }
}
