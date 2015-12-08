// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;


final class _cls9 extends Enum
{

    private static final DESTROYED $VALUES[];
    public static final DESTROYED DESTROYED;
    public static final DESTROYED LOADED;
    public static final DESTROYED LOADING;
    public static final DESTROYED UNINITIALIZED;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/google/android/apps/youtube/api/ApiPlayer$State, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        UNINITIALIZED = new <init>("UNINITIALIZED", 0);
        LOADING = new <init>("LOADING", 1);
        LOADED = new <init>("LOADED", 2);
        DESTROYED = new <init>("DESTROYED", 3);
        $VALUES = (new .VALUES[] {
            UNINITIALIZED, LOADING, LOADED, DESTROYED
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
