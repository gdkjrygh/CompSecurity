// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import retrofit.client.Response;

// Referenced classes of package retrofit:
//            RetrofitError

public interface Callback
{

    public abstract void failure(RetrofitError retrofiterror);

    public abstract void success(Object obj, Response response);
}
