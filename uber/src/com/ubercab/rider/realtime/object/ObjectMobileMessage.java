// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import com.ubercab.rider.realtime.model.MobileMessage;
import hmd;

abstract class ObjectMobileMessage
    implements hmd
{

    ObjectMobileMessage()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (MobileMessage)obj;
            String s = getETag();
            if (s == null ? ((MobileMessage) (obj)).getETag() != null : !s.equals(((MobileMessage) (obj)).getETag()))
            {
                return false;
            }
            s = getId();
            if (s == null ? ((MobileMessage) (obj)).getId() != null : !s.equals(((MobileMessage) (obj)).getId()))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        String s = getId();
        int i;
        if (s != null)
        {
            i = s.hashCode();
        } else
        {
            i = 0;
        }
        s = getETag();
        if (s != null)
        {
            j = s.hashCode();
        }
        return i * 31 + j;
    }
}
