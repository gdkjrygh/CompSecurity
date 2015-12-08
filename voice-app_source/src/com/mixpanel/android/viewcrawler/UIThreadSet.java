// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class UIThreadSet
{

    private Set mSet;

    public UIThreadSet()
    {
        mSet = new HashSet();
    }

    public void add(Object obj)
    {
        if (Thread.currentThread() != Looper.getMainLooper().getThread())
        {
            throw new RuntimeException("Can't add an activity when not on the UI thread");
        } else
        {
            mSet.add(obj);
            return;
        }
    }

    public Set getAll()
    {
        if (Thread.currentThread() != Looper.getMainLooper().getThread())
        {
            throw new RuntimeException("Can't remove an activity when not on the UI thread");
        } else
        {
            return Collections.unmodifiableSet(mSet);
        }
    }

    public boolean isEmpty()
    {
        if (Thread.currentThread() != Looper.getMainLooper().getThread())
        {
            throw new RuntimeException("Can't check isEmpty() when not on the UI thread");
        } else
        {
            return mSet.isEmpty();
        }
    }

    public void remove(Object obj)
    {
        if (Thread.currentThread() != Looper.getMainLooper().getThread())
        {
            throw new RuntimeException("Can't remove an activity when not on the UI thread");
        } else
        {
            mSet.remove(obj);
            return;
        }
    }
}
