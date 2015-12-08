// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;


public final class SettingsCacheBehavior extends Enum
{

    private static final SettingsCacheBehavior $VALUES[];
    public static final SettingsCacheBehavior IGNORE_CACHE_EXPIRATION;
    public static final SettingsCacheBehavior SKIP_CACHE_LOOKUP;
    public static final SettingsCacheBehavior USE_CACHE;

    private SettingsCacheBehavior(String s, int i)
    {
        super(s, i);
    }

    public static SettingsCacheBehavior valueOf(String s)
    {
        return (SettingsCacheBehavior)Enum.valueOf(io/fabric/sdk/android/services/settings/SettingsCacheBehavior, s);
    }

    public static SettingsCacheBehavior[] values()
    {
        return (SettingsCacheBehavior[])$VALUES.clone();
    }

    static 
    {
        USE_CACHE = new SettingsCacheBehavior("USE_CACHE", 0);
        SKIP_CACHE_LOOKUP = new SettingsCacheBehavior("SKIP_CACHE_LOOKUP", 1);
        IGNORE_CACHE_EXPIRATION = new SettingsCacheBehavior("IGNORE_CACHE_EXPIRATION", 2);
        $VALUES = (new SettingsCacheBehavior[] {
            USE_CACHE, SKIP_CACHE_LOOKUP, IGNORE_CACHE_EXPIRATION
        });
    }
}
