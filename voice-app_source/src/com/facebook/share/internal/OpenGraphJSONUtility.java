// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class OpenGraphJSONUtility
{
    public static interface PhotoJSONProcessor
    {

        public abstract JSONObject toJSONObject(SharePhoto sharephoto);
    }


    private OpenGraphJSONUtility()
    {
    }

    private static JSONArray toJSONArray(List list, PhotoJSONProcessor photojsonprocessor)
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                return jsonarray;
            }
            jsonarray.put(toJSONValue(list.next(), photojsonprocessor));
        } while (true);
    }

    public static JSONObject toJSONObject(ShareOpenGraphAction shareopengraphaction, PhotoJSONProcessor photojsonprocessor)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        Iterator iterator = shareopengraphaction.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return jsonobject;
            }
            String s = (String)iterator.next();
            jsonobject.put(s, toJSONValue(shareopengraphaction.get(s), photojsonprocessor));
        } while (true);
    }

    private static JSONObject toJSONObject(ShareOpenGraphObject shareopengraphobject, PhotoJSONProcessor photojsonprocessor)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        Iterator iterator = shareopengraphobject.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return jsonobject;
            }
            String s = (String)iterator.next();
            jsonobject.put(s, toJSONValue(shareopengraphobject.get(s), photojsonprocessor));
        } while (true);
    }

    public static Object toJSONValue(Object obj, PhotoJSONProcessor photojsonprocessor)
        throws JSONException
    {
        Object obj1;
        if (obj == null)
        {
            obj1 = JSONObject.NULL;
        } else
        {
            obj1 = obj;
            if (!(obj instanceof String))
            {
                obj1 = obj;
                if (!(obj instanceof Boolean))
                {
                    obj1 = obj;
                    if (!(obj instanceof Double))
                    {
                        obj1 = obj;
                        if (!(obj instanceof Float))
                        {
                            obj1 = obj;
                            if (!(obj instanceof Integer))
                            {
                                obj1 = obj;
                                if (!(obj instanceof Long))
                                {
                                    if (obj instanceof SharePhoto)
                                    {
                                        if (photojsonprocessor != null)
                                        {
                                            return photojsonprocessor.toJSONObject((SharePhoto)obj);
                                        } else
                                        {
                                            return null;
                                        }
                                    }
                                    if (obj instanceof ShareOpenGraphObject)
                                    {
                                        return toJSONObject((ShareOpenGraphObject)obj, photojsonprocessor);
                                    }
                                    if (obj instanceof List)
                                    {
                                        return toJSONArray((List)obj, photojsonprocessor);
                                    } else
                                    {
                                        throw new IllegalArgumentException((new StringBuilder("Invalid object found for JSON serialization: ")).append(obj.toString()).toString());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return obj1;
    }
}
