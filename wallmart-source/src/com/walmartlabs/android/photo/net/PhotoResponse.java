// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net;

import android.text.TextUtils;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoObjectMapper;
import java.util.Map;

public class PhotoResponse
{

    private static final String TAG = com/walmartlabs/android/photo/net/PhotoResponse.getSimpleName();
    private String mEntity;
    private Exception mException;
    private Map mHttpHeaders;
    private String mHttpReason;
    private int mHttpStatus;
    private boolean mIsValid;

    public PhotoResponse()
    {
    }

    public Object asType(Class class1)
    {
        if (mEntity != null)
        {
            return PhotoObjectMapper.get().readFromString(mEntity, class1);
        } else
        {
            PhotoLogger.get().e(TAG, "asType(): Entity is null, cannot be inflated");
            return null;
        }
    }

    public String getEntity()
    {
        return mEntity;
    }

    public Exception getException()
    {
        return mException;
    }

    public String getHttpHeader(String s)
    {
        if (mHttpHeaders != null && s != null && TextUtils.isEmpty((String)mHttpHeaders.get(s)))
        {
            return (String)mHttpHeaders.get(s.toLowerCase());
        } else
        {
            return null;
        }
    }

    public Map getHttpHeaders()
    {
        return mHttpHeaders;
    }

    public String getHttpReason()
    {
        return mHttpReason;
    }

    public int getHttpStatus()
    {
        return mHttpStatus;
    }

    public String getReason()
    {
        return getHttpReason();
    }

    public int getStatus()
    {
        return getHttpStatus();
    }

    public boolean isValid()
    {
        return mIsValid;
    }

    public void setEntity(String s)
    {
        mEntity = s;
    }

    public void setException(Exception exception)
    {
        mException = exception;
    }

    public void setHttpHeaders(Map map)
    {
        mHttpHeaders = map;
    }

    public void setHttpReason(String s)
    {
        mHttpReason = s;
    }

    public void setHttpStatus(int i)
    {
        mHttpStatus = i;
    }

    public void setValid(boolean flag)
    {
        mIsValid = flag;
    }

    public String toString()
    {
        return (new StringBuilder(com/walmartlabs/android/photo/net/PhotoResponse.getSimpleName())).append(" {").append("\n   Status: ").append(getStatus()).append("\n   Reason: ").append(getReason()).append("\n   Entity: ").append(getEntity()).append("\n   Exception: ").append(getException()).append("\n}").toString();
    }

}
