// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.util;

import android.content.Context;
import java.io.IOException;
import java.util.List;

public interface RemoteService
{
    public static class ServiceUnavailableException extends Exception
    {

        private final int mRetryAfter;

        public int getRetryAfter()
        {
            return mRetryAfter;
        }

        public ServiceUnavailableException(String s, String s1)
        {
            super(s);
            int i;
            try
            {
                i = Integer.parseInt(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                i = 0;
            }
            mRetryAfter = i;
        }
    }


    public abstract boolean isOnline(Context context);

    public abstract byte[] performRequest(String s, List list)
        throws ServiceUnavailableException, IOException;
}
