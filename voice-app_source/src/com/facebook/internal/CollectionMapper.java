// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.FacebookException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.facebook.internal:
//            Mutable

public class CollectionMapper
{
    public static interface Collection
    {

        public abstract Object get(Object obj);

        public abstract Iterator keyIterator();

        public abstract void set(Object obj, Object obj1, OnErrorListener onerrorlistener);
    }

    public static interface OnErrorListener
    {

        public abstract void onError(FacebookException facebookexception);
    }

    public static interface OnMapValueCompleteListener
        extends OnErrorListener
    {

        public abstract void onComplete(Object obj);
    }

    public static interface OnMapperCompleteListener
        extends OnErrorListener
    {

        public abstract void onComplete();
    }

    public static interface ValueMapper
    {

        public abstract void mapValue(Object obj, OnMapValueCompleteListener onmapvaluecompletelistener);
    }


    private CollectionMapper()
    {
    }

    public static void iterate(final Collection collection, ValueMapper valuemapper, final OnMapperCompleteListener onMapperCompleteListener)
    {
        final Mutable pendingJobCount;
        final Mutable didReturnError;
        LinkedList linkedlist;
        didReturnError = new Mutable(Boolean.valueOf(false));
        pendingJobCount = new Mutable(Integer.valueOf(1));
        onMapperCompleteListener = new OnMapperCompleteListener() {

            private final Mutable val$didReturnError;
            private final OnMapperCompleteListener val$onMapperCompleteListener;
            private final Mutable val$pendingJobCount;

            public void onComplete()
            {
                if (!((Boolean)didReturnError.value).booleanValue())
                {
                    Mutable mutable = pendingJobCount;
                    Integer integer = Integer.valueOf(((Integer)mutable.value).intValue() - 1);
                    mutable.value = integer;
                    if (integer.intValue() == 0)
                    {
                        onMapperCompleteListener.onComplete();
                        return;
                    }
                }
            }

            public void onError(FacebookException facebookexception)
            {
                if (((Boolean)didReturnError.value).booleanValue())
                {
                    return;
                } else
                {
                    didReturnError.value = Boolean.valueOf(true);
                    onMapperCompleteListener.onError(facebookexception);
                    return;
                }
            }

            
            {
                didReturnError = mutable;
                pendingJobCount = mutable1;
                onMapperCompleteListener = onmappercompletelistener;
                super();
            }
        };
        didReturnError = collection.keyIterator();
        linkedlist = new LinkedList();
_L3:
        if (didReturnError.hasNext()) goto _L2; else goto _L1
_L1:
        didReturnError = linkedlist.iterator();
_L4:
        if (!didReturnError.hasNext())
        {
            onMapperCompleteListener.onComplete();
            return;
        }
        break MISSING_BLOCK_LABEL_108;
_L2:
        linkedlist.add(didReturnError.next());
          goto _L3
        final Object key = (Object)didReturnError.next();
        Object obj = collection.get(key);
        key = new OnMapValueCompleteListener() {

            private final Collection val$collection;
            private final OnMapperCompleteListener val$jobCompleteListener;
            private final Object val$key;

            public void onComplete(Object obj1)
            {
                collection.set(key, obj1, jobCompleteListener);
                jobCompleteListener.onComplete();
            }

            public void onError(FacebookException facebookexception)
            {
                jobCompleteListener.onError(facebookexception);
            }

            
            {
                collection = collection1;
                key = obj;
                jobCompleteListener = onmappercompletelistener;
                super();
            }
        };
        pendingJobCount.value = Integer.valueOf(((Integer)pendingJobCount.value).intValue() + 1);
        valuemapper.mapValue(obj, ((OnMapValueCompleteListener) (key)));
          goto _L4
    }
}
