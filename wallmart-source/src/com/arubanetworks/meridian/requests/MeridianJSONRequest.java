// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.requests;

import android.net.Uri;
import com.android.volley.Request;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.arubanetworks.meridian.requests:
//            MeridianRequest

public abstract class MeridianJSONRequest extends MeridianRequest
{

    public MeridianJSONRequest(String s)
    {
        super(Uri.parse(s));
    }

    public MeridianJSONRequest(String s, Map map)
    {
        this(s, map, null);
    }

    public MeridianJSONRequest(String s, Map map, MeridianRequest.BodyContentType bodycontenttype)
    {
        super(Uri.parse(s), map, bodycontenttype);
    }

    public MeridianJSONRequest(String s, JSONObject jsonobject)
    {
        super(Uri.parse(s), jsonobject);
    }

    protected Request buildVolleyRequest()
    {
        return new _cls3(getMethod(), getUri().toString(), getJSONBody(), new _cls1(), new _cls2());
    }

    protected abstract void onJSONError(Throwable throwable);

    protected abstract void onJSONResponse(JSONObject jsonobject);

    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
