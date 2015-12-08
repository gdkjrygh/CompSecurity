// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import com.google.android.gms.internal.do;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.ads.mediation:
//            e

public abstract class MediationServerParameters
{

    public MediationServerParameters()
    {
    }

    public final void a(Map map)
    {
        Object obj = new HashMap();
        Field afield[] = getClass().getFields();
        int j = afield.length;
        for (int i = 0; i < j; i++)
        {
            Field field1 = afield[i];
            e e1 = (e)field1.getAnnotation(com/google/ads/mediation/e);
            if (e1 != null)
            {
                ((Map) (obj)).put(e1.a(), field1);
            }
        }

        if (((Map) (obj)).isEmpty())
        {
            com.google.android.gms.internal.do.d("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            Field field2 = (Field)((Map) (obj)).remove(entry.getKey());
            if (field2 != null)
            {
                try
                {
                    field2.set(this, entry.getValue());
                }
                catch (IllegalAccessException illegalaccessexception)
                {
                    com.google.android.gms.internal.do.d((new StringBuilder("Server option \"")).append((String)entry.getKey()).append("\" could not be set: Illegal Access").toString());
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    com.google.android.gms.internal.do.d((new StringBuilder("Server option \"")).append((String)entry.getKey()).append("\" could not be set: Bad Type").toString());
                }
            } else
            {
                com.google.android.gms.internal.do.a((new StringBuilder("Unexpected server option: ")).append((String)entry.getKey()).append(" = \"").append((String)entry.getValue()).append("\"").toString());
            }
        }

        map = new StringBuilder();
        obj = ((Map) (obj)).values().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Field field = (Field)((Iterator) (obj)).next();
            if (((e)field.getAnnotation(com/google/ads/mediation/e)).b())
            {
                com.google.android.gms.internal.do.d((new StringBuilder("Required server option missing: ")).append(((e)field.getAnnotation(com/google/ads/mediation/e)).a()).toString());
                if (map.length() > 0)
                {
                    map.append(", ");
                }
                map.append(((e)field.getAnnotation(com/google/ads/mediation/e)).a());
            }
        } while (true);
        if (map.length() > 0)
        {
            throw new MappingException((new StringBuilder("Required server option(s) missing: ")).append(map.toString()).toString());
        } else
        {
            return;
        }
    }

    private class MappingException extends Exception
    {

        public MappingException(String s)
        {
            super(s);
        }
    }

}
