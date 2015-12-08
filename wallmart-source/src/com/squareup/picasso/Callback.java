// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


public interface Callback
{
    public static class EmptyCallback
        implements Callback
    {

        public void onError()
        {
        }

        public void onSuccess()
        {
        }

        public EmptyCallback()
        {
        }
    }


    public abstract void onError();

    public abstract void onSuccess();
}
