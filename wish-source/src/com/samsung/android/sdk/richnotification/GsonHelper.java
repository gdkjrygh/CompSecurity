// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.samsung.android.sdk.richnotification.actions.SrnRemoteInputAction;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnImageAsset

final class GsonHelper
{
    private static class BundleSerializer
        implements JsonSerializer
    {

        public JsonElement serialize(Bundle bundle, Type type, JsonSerializationContext jsonserializationcontext)
        {
            type = new JsonArray();
            jsonserializationcontext = bundle.keySet().iterator();
            do
            {
                if (!jsonserializationcontext.hasNext())
                {
                    return type;
                }
                String s = (String)jsonserializationcontext.next();
                JsonObject jsonobject = new JsonObject();
                jsonobject.addProperty("key", s);
                jsonobject.addProperty("value", bundle.get(s).toString());
                type.add(jsonobject);
            } while (true);
        }

        public volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
        {
            return serialize((Bundle)obj, type, jsonserializationcontext);
        }

        private BundleSerializer()
        {
        }

        BundleSerializer(BundleSerializer bundleserializer)
        {
            this();
        }
    }

    private static class EnumSerializer
        implements JsonSerializer
    {

        public JsonElement serialize(Enum enum, Type type, JsonSerializationContext jsonserializationcontext)
        {
            return new JsonPrimitive(Integer.valueOf(enum.ordinal()));
        }

        public volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
        {
            return serialize((Enum)obj, type, jsonserializationcontext);
        }

        private EnumSerializer()
        {
        }

        EnumSerializer(EnumSerializer enumserializer)
        {
            this();
        }
    }

    private static class MapSerializer
        implements JsonSerializer
    {

        public volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
        {
            return serialize((Map)obj, type, jsonserializationcontext);
        }

        public JsonElement serialize(Map map, Type type, JsonSerializationContext jsonserializationcontext)
        {
            if (map.size() == 0)
            {
                return null;
            } else
            {
                return jsonserializationcontext.serialize(map);
            }
        }

        private MapSerializer()
        {
        }

        MapSerializer(MapSerializer mapserializer)
        {
            this();
        }
    }

    private static class StringItemSerializer
        implements JsonSerializer
    {

        public JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
        {
            return new JsonPrimitive(obj.toString());
        }

        private StringItemSerializer()
        {
        }

        StringItemSerializer(StringItemSerializer stringitemserializer)
        {
            this();
        }
    }


    private static final String TAG;
    private static Gson gson;

    private GsonHelper()
    {
    }

    static Gson getGson()
    {
        return gson;
    }

    static 
    {
        GsonBuilder gsonbuilder;
        TAG = com/samsung/android/sdk/richnotification/GsonHelper.getSimpleName();
        gsonbuilder = (new GsonBuilder()).disableHtmlEscaping().excludeFieldsWithoutExposeAnnotation();
        gsonbuilder.registerTypeHierarchyAdapter(java/lang/Enum, new EnumSerializer(null));
        gsonbuilder.registerTypeAdapter(android/net/Uri, new StringItemSerializer(null));
        gsonbuilder.registerTypeAdapter(android/os/Bundle, new BundleSerializer(null));
        gsonbuilder.registerTypeAdapter(com/samsung/android/sdk/richnotification/SrnImageAsset, new SrnImageAsset.ImageAssetSerializer());
        gsonbuilder.registerTypeAdapter(com/samsung/android/sdk/richnotification/SrnAction$CallbackIntent, new SrnAction.CallbackIntentSerializer());
        gsonbuilder.registerTypeAdapter(com/samsung/android/sdk/richnotification/SrnRichNotification$Templates, new SrnRichNotification.TemplatesSerializer());
        gsonbuilder.registerTypeAdapter(java/util/Map, new MapSerializer(null));
        Field field = com/samsung/android/sdk/richnotification/actions/SrnRemoteInputAction.getDeclaredField("SERIALIZER");
        field.setAccessible(true);
        gsonbuilder.registerTypeAdapter(com/samsung/android/sdk/richnotification/actions/SrnRemoteInputAction, field.get(null));
_L2:
        gson = gsonbuilder.create();
        return;
        Object obj;
        obj;
_L3:
        Log.e(TAG, ((Exception) (obj)).getMessage(), ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
          goto _L3
        obj;
          goto _L3
    }
}
