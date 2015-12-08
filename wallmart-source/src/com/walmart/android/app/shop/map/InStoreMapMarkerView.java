// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.Adapter;
import com.arubanetworks.meridian.maps.Marker;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapView, AisleSection

public class InStoreMapMarkerView extends InStoreMapView
{
    public static interface MarkerAdapter
        extends Adapter
    {

        public abstract Marker getMarker(int i);

        public abstract Marker getMarker(AisleSection aislesection);

        public abstract void registerDataSetObserver(AisleAdapter.AisleDataSetObserver aisledatasetobserver);

        public abstract void unregisterDataSetObserver(AisleAdapter.AisleDataSetObserver aisledatasetobserver);
    }

    private class Observer extends AisleAdapter.AisleDataSetObserver
    {

        final InStoreMapMarkerView this$0;

        public void onChanged()
        {
            setupMarkers();
        }

        public void onInvalidated()
        {
            setMarkers(Collections.emptyList());
        }

        public void onVisualChanged(List list)
        {
            updateMarkers(list);
        }

        private Observer()
        {
            this$0 = InStoreMapMarkerView.this;
            super();
        }

    }

    private class TransactionQueue
        implements android.os.Handler.Callback
    {

        private final List mQueue = new ArrayList();
        final InStoreMapMarkerView this$0;

        private void commitTransaction(TransactionWrapper transactionwrapper)
        {
            WLog.i(TAG, (new StringBuilder()).append("Committing transaction ").append(transactionwrapper).toString());
            TransactionWrapper transactionwrapper1 = null;
            Iterator iterator = mQueue.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                TransactionWrapper transactionwrapper2 = (TransactionWrapper)iterator.next();
                if (!Collections.disjoint(transactionwrapper2.mTouchedMarkers, transactionwrapper.mTouchedMarkers))
                {
                    transactionwrapper1 = transactionwrapper2;
                }
            } while (true);
            transactionwrapper.mWaitFor = transactionwrapper1;
            if (transactionwrapper1 != null)
            {
                WLog.i(TAG, (new StringBuilder()).append("Transaction ").append(transactionwrapper).append(" will for ").append(transactionwrapper1).append(" to finish").toString());
            }
            mQueue.add(transactionwrapper);
            releaseWaitingFor(null);
        }

        private void releaseWaitingFor(TransactionWrapper transactionwrapper)
        {
            mQueue.remove(transactionwrapper);
            Iterator iterator = mQueue.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                TransactionWrapper transactionwrapper1 = (TransactionWrapper)iterator.next();
                if (!transactionwrapper1.mIsCommitted && transactionwrapper1.mWaitFor == transactionwrapper)
                {
                    transactionwrapper1.mIsCommitted = true;
                    InStoreMapMarkerView.this.commitTransaction(transactionwrapper1.build());
                }
            } while (true);
        }

        public boolean handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 4: default 36
        //                       1 38
        //                       2 36
        //                       3 38
        //                       4 38;
               goto _L1 _L2 _L1 _L2 _L2
_L1:
            return true;
_L2:
            releaseWaitingFor((TransactionWrapper)message.obj);
            if (true) goto _L1; else goto _L3
_L3:
        }


        public TransactionQueue()
        {
            this$0 = InStoreMapMarkerView.this;
            super();
        }
    }

    private class TransactionWrapper extends com.arubanetworks.meridian.maps.Transaction.Builder
        implements com.arubanetworks.meridian.maps.Transaction.Listener
    {

        private final Handler mHandler;
        boolean mIsCommitted;
        final Set mTouchedMarkers = new HashSet();
        TransactionWrapper mWaitFor;
        final InStoreMapMarkerView this$0;

        public com.arubanetworks.meridian.maps.Transaction.Builder addMarker(Marker marker)
        {
            mTouchedMarkers.add(marker);
            return super.addMarker(marker);
        }

        public com.arubanetworks.meridian.maps.Transaction.Builder addMarkers(Collection collection)
        {
            mTouchedMarkers.addAll(collection);
            return super.addMarkers(collection);
        }

        public void onTransactionAnimationComplete()
        {
            mHandler.sendMessage(mHandler.obtainMessage(1, this));
        }

        public void onTransactionCanceled()
        {
            mHandler.sendMessage(mHandler.obtainMessage(3, this));
        }

        public void onTransactionComplete()
        {
            mHandler.sendMessage(mHandler.obtainMessage(2, this));
        }

        public void onTransactionFailed()
        {
            mHandler.sendMessage(mHandler.obtainMessage(4, this));
        }

        public TransactionWrapper(TransactionQueue transactionqueue)
        {
            this$0 = InStoreMapMarkerView.this;
            super();
            mHandler = new Handler(transactionqueue);
            setListener(this);
        }
    }


    private static final int TRANSACTION_ANIMATION_COMPLETE = 1;
    private static final int TRANSACTION_CANCELED = 3;
    private static final int TRANSACTION_COMPLETE = 2;
    private static final int TRANSACTION_FAILED = 4;
    private final String TAG;
    private MarkerAdapter mAdapter;
    private final Observer mObserver;
    private final TransactionQueue mTransactionQueue;

    public InStoreMapMarkerView(Context context)
    {
        this(context, null);
    }

    public InStoreMapMarkerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, -1);
    }

    public InStoreMapMarkerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        TAG = (new StringBuilder()).append(com/walmart/android/app/shop/map/InStoreMapMarkerView.getSimpleName()).append(Integer.toHexString(hashCode())).toString();
        mTransactionQueue = new TransactionQueue();
        mObserver = new Observer();
    }

    private void setupMarkers()
    {
        WLog.i(TAG, (new StringBuilder()).append("setupMarkers isReady=").append(isReady()).toString());
        if (isReady())
        {
            ArrayList arraylist = new ArrayList();
            if (mAdapter != null && mAdapter.getCount() > 0)
            {
                for (int i = 0; i < mAdapter.getCount(); i++)
                {
                    Marker marker = getAdapter().getMarker(i);
                    if (marker != null)
                    {
                        WLog.i(TAG, (new StringBuilder()).append("Placing marker ").append(Arrays.toString(marker.getPosition())).toString());
                        arraylist.add(marker);
                    }
                }

            }
            if (!getUserMarkers().isEmpty())
            {
                TransactionWrapper transactionwrapper = new TransactionWrapper(mTransactionQueue);
                transactionwrapper.setType(com.arubanetworks.meridian.maps.Transaction.Type.REMOVE);
                transactionwrapper.addMarkers(getUserMarkers());
                mTransactionQueue.commitTransaction(transactionwrapper);
            }
            if (!arraylist.isEmpty())
            {
                TransactionWrapper transactionwrapper1 = new TransactionWrapper(mTransactionQueue);
                transactionwrapper1.addMarkers(arraylist).setAnimated(true);
                mTransactionQueue.commitTransaction(transactionwrapper1);
                return;
            }
        }
    }

    private void updateMarkers(List list)
    {
        if (isReady())
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = getUserMarkers().iterator(); iterator.hasNext();)
            {
                Marker marker = (Marker)iterator.next();
                if (marker instanceof AisleAdapter.AisleMarker)
                {
                    Iterator iterator1 = list.iterator();
                    while (iterator1.hasNext()) 
                    {
                        if (((AisleSection)iterator1.next()).equals(((AisleAdapter.AisleMarker)marker).getAisleSection()))
                        {
                            float af1[] = marker.getPosition();
                            WLog.i(TAG, (new StringBuilder()).append("Removing marker ").append(Arrays.toString(af1)).toString());
                            arraylist.add(marker);
                        }
                    }
                }
            }

            if (!arraylist.isEmpty())
            {
                TransactionWrapper transactionwrapper = new TransactionWrapper(mTransactionQueue);
                transactionwrapper.setType(com.arubanetworks.meridian.maps.Transaction.Type.REMOVE);
                transactionwrapper.addMarkers(arraylist).setAnimated(true);
                mTransactionQueue.commitTransaction(transactionwrapper);
            }
            arraylist.clear();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Object obj = (AisleSection)list.next();
                obj = getAdapter().getMarker(((AisleSection) (obj)));
                if (obj != null)
                {
                    float af[] = ((Marker) (obj)).getPosition();
                    WLog.i(TAG, (new StringBuilder()).append("Adding marker ").append(Arrays.toString(af)).toString());
                    arraylist.add(obj);
                }
            } while (true);
            if (!arraylist.isEmpty())
            {
                list = new TransactionWrapper(mTransactionQueue);
                list.addMarkers(arraylist).setAnimated(true);
                mTransactionQueue.commitTransaction(list);
                return;
            }
        }
    }

    public MarkerAdapter getAdapter()
    {
        return mAdapter;
    }

    protected void internalMapLoadFinish()
    {
        super.internalMapLoadFinish();
        setupMarkers();
    }

    public void setAdapter(MarkerAdapter markeradapter)
    {
        if (mAdapter != null)
        {
            mAdapter.unregisterDataSetObserver(mObserver);
        }
        mAdapter = markeradapter;
        if (mAdapter != null)
        {
            mAdapter.registerDataSetObserver(mObserver);
        }
        setupMarkers();
    }



}
