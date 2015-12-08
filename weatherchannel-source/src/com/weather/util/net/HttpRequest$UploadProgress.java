// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.net;


// Referenced classes of package com.weather.util.net:
//            HttpRequest

public static interface _cls1
{

    public static final _cls1 DEFAULT = new HttpRequest.UploadProgress() {

        public void onUpload(long l, long l1)
        {
        }

    };

    public abstract void onUpload(long l, long l1);

}
