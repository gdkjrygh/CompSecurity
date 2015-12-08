// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.persistence;

import android.content.SharedPreferences;

// Referenced classes of package io.fabric.sdk.android.services.persistence:
//            PersistenceStrategy, PreferenceStore, SerializationStrategy

public class PreferenceStoreStrategy
    implements PersistenceStrategy
{

    private final String key;
    private final SerializationStrategy serializer;
    private final PreferenceStore store;

    public PreferenceStoreStrategy(PreferenceStore preferencestore, SerializationStrategy serializationstrategy, String s)
    {
        store = preferencestore;
        serializer = serializationstrategy;
        key = s;
    }

    public void clear()
    {
        store.edit().remove(key).commit();
    }

    public Object restore()
    {
        SharedPreferences sharedpreferences = store.get();
        return serializer.deserialize(sharedpreferences.getString(key, null));
    }

    public void save(Object obj)
    {
        store.save(store.edit().putString(key, serializer.serialize(obj)));
    }
}
