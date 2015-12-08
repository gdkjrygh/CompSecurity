// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.audio;


public interface TwcMediaPlayer
{

    public static final float MAX_VOLUME = 1F;
    public static final float UNSET_VOLUME = -1F;

    public abstract float getVolume();

    public abstract boolean isPlaying();

    public abstract void pause();

    public abstract void pausePermanently();

    public abstract void play(boolean flag);

    public abstract void setVolume(float f);
}
