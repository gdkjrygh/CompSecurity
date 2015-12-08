// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Field;

// Referenced classes of package com.stripe.model:
//            EventData, EventDataDeserializer

public abstract class StripeObject
{

    public static final Gson prettyPrintGson;

    public StripeObject()
    {
    }

    private Object getIdString()
    {
        Object obj;
        try
        {
            obj = getClass().getDeclaredField("id").get(this);
        }
        catch (SecurityException securityexception)
        {
            return "";
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            return "";
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return "";
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            return "";
        }
        return obj;
    }

    public String toString()
    {
        return String.format("<%s@%s id=%s> JSON: %s", new Object[] {
            getClass().getName(), Integer.valueOf(System.identityHashCode(this)), getIdString(), prettyPrintGson.toJson(this)
        });
    }

    static 
    {
        prettyPrintGson = (new GsonBuilder()).setPrettyPrinting().serializeNulls().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).registerTypeAdapter(com/stripe/model/EventData, new EventDataDeserializer()).create();
    }
}
