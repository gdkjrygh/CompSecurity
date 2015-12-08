// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// Referenced classes of package com.squareup.picasso:
//            Picasso, Request

abstract class Action
{
    static class RequestWeakReference extends WeakReference
    {

        final Action action;

        public RequestWeakReference(Action action1, Object obj, ReferenceQueue referencequeue)
        {
            super(obj, referencequeue);
            action = action1;
        }
    }


    boolean cancelled;
    final Drawable errorDrawable;
    final int errorResId;
    final String key;
    final int memoryPolicy;
    final int networkPolicy;
    final boolean noFade;
    final Picasso picasso;
    final Request request;
    final Object tag;
    final WeakReference target;
    boolean willReplay;

    Action(Picasso picasso1, Object obj, Request request1, int i, int j, int k, Drawable drawable, 
            String s, Object obj1, boolean flag)
    {
        picasso = picasso1;
        request = request1;
        if (obj == null)
        {
            picasso1 = null;
        } else
        {
            picasso1 = new RequestWeakReference(this, obj, picasso1.referenceQueue);
        }
        target = picasso1;
        memoryPolicy = i;
        networkPolicy = j;
        noFade = flag;
        errorResId = k;
        errorDrawable = drawable;
        key = s;
        if (obj1 == null)
        {
            obj1 = this;
        }
        tag = obj1;
    }

    void cancel()
    {
        cancelled = true;
    }

    abstract void complete(Bitmap bitmap, Picasso.LoadedFrom loadedfrom);

    abstract void error();

    String getKey()
    {
        return key;
    }

    int getMemoryPolicy()
    {
        return memoryPolicy;
    }

    int getNetworkPolicy()
    {
        return networkPolicy;
    }

    Picasso getPicasso()
    {
        return picasso;
    }

    Picasso.Priority getPriority()
    {
        return request.priority;
    }

    Request getRequest()
    {
        return request;
    }

    Object getTag()
    {
        return tag;
    }

    Object getTarget()
    {
        if (target == null)
        {
            return null;
        } else
        {
            return target.get();
        }
    }

    boolean isCancelled()
    {
        return cancelled;
    }

    boolean willReplay()
    {
        return willReplay;
    }
}
