// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.squareup.picasso:
//            RequestHandler, Request

class AssetRequestHandler extends RequestHandler
{

    protected static final String ANDROID_ASSET = "android_asset";
    private static final int ASSET_PREFIX_LENGTH = "file:///android_asset/".length();
    private final AssetManager assetManager;

    public AssetRequestHandler(Context context)
    {
        assetManager = context.getAssets();
    }

    static String getFilePath(Request request)
    {
        return request.uri.toString().substring(ASSET_PREFIX_LENGTH);
    }

    public boolean canHandleRequest(Request request)
    {
        boolean flag1 = false;
        request = request.uri;
        boolean flag = flag1;
        if ("file".equals(request.getScheme()))
        {
            flag = flag1;
            if (!request.getPathSegments().isEmpty())
            {
                flag = flag1;
                if ("android_asset".equals(request.getPathSegments().get(0)))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public RequestHandler.Result load(Request request, int i)
        throws IOException
    {
        return new RequestHandler.Result(assetManager.open(getFilePath(request)), Picasso.LoadedFrom.DISK);
    }

}
