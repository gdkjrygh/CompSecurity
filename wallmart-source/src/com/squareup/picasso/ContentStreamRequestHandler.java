// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.squareup.picasso:
//            RequestHandler, Request

class ContentStreamRequestHandler extends RequestHandler
{

    final Context context;

    ContentStreamRequestHandler(Context context1)
    {
        context = context1;
    }

    public boolean canHandleRequest(Request request)
    {
        return "content".equals(request.uri.getScheme());
    }

    InputStream getInputStream(Request request)
        throws FileNotFoundException
    {
        return context.getContentResolver().openInputStream(request.uri);
    }

    public RequestHandler.Result load(Request request, int i)
        throws IOException
    {
        return new RequestHandler.Result(getInputStream(request), Picasso.LoadedFrom.DISK);
    }
}
