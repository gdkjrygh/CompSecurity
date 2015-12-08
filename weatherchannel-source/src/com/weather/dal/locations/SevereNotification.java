// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;

import java.io.Serializable;

public final class SevereNotification
    implements Serializable
{

    private static final long serialVersionUID = 0xc44c6d28047ded1dL;
    private final String audioAlert;
    private final int level;
    private final boolean vibrate;

    public SevereNotification(int i, boolean flag, String s)
    {
        level = i;
        vibrate = flag;
        audioAlert = s;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (SevereNotification)obj;
            if (audioAlert == null)
            {
                if (((SevereNotification) (obj)).audioAlert != null)
                {
                    return false;
                }
            } else
            if (!audioAlert.equals(((SevereNotification) (obj)).audioAlert))
            {
                return false;
            }
            if (level != ((SevereNotification) (obj)).level)
            {
                return false;
            }
            if (vibrate != ((SevereNotification) (obj)).vibrate)
            {
                return false;
            }
        }
        return true;
    }

    public String getAudioAlert()
    {
        return audioAlert;
    }

    public int getLevel()
    {
        return level;
    }

    public int hashCode()
    {
        int i;
        char c;
        int j;
        if (audioAlert == null)
        {
            i = 0;
        } else
        {
            i = audioAlert.hashCode();
        }
        j = level;
        if (vibrate)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return ((i + 31) * 31 + j) * 31 + c;
    }

    public boolean isVibrate()
    {
        return vibrate;
    }
}
