// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

public class LocalBroadcastManager
{
    private static class BroadcastRecord
    {

        final Intent intent;
        final ArrayList receivers;

        BroadcastRecord(Intent intent1, ArrayList arraylist)
        {
            intent = intent1;
            receivers = arraylist;
        }
    }

    private static class ReceiverRecord
    {

        boolean broadcasting;
        final IntentFilter filter;
        final BroadcastReceiver receiver;

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(128);
            stringbuilder.append("Receiver{");
            stringbuilder.append(receiver);
            stringbuilder.append(" filter=");
            stringbuilder.append(filter);
            stringbuilder.append("}");
            return stringbuilder.toString();
        }

        ReceiverRecord(IntentFilter intentfilter, BroadcastReceiver broadcastreceiver)
        {
            filter = intentfilter;
            receiver = broadcastreceiver;
        }
    }


    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final HashMap mActions = new HashMap();
    private final Context mAppContext;
    private final Handler mHandler;
    private final ArrayList mPendingBroadcasts = new ArrayList();
    private final HashMap mReceivers = new HashMap();

    private LocalBroadcastManager(Context context)
    {
        mAppContext = context;
        mHandler = new Handler(context.getMainLooper()) {

            final LocalBroadcastManager this$0;

            public void handleMessage(Message message)
            {
                switch (message.what)
                {
                default:
                    super.handleMessage(message);
                    return;

                case 1: // '\001'
                    executePendingBroadcasts();
                    break;
                }
            }

            
            {
                this$0 = LocalBroadcastManager.this;
                super(looper);
            }
        };
    }

    private void executePendingBroadcasts()
    {
_L2:
        Object obj = mReceivers;
        obj;
        JVM INSTR monitorenter ;
        int i = mPendingBroadcasts.size();
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        BroadcastRecord abroadcastrecord[];
        abroadcastrecord = new BroadcastRecord[i];
        mPendingBroadcasts.toArray(abroadcastrecord);
        mPendingBroadcasts.clear();
        obj;
        JVM INSTR monitorexit ;
        i = 0;
_L4:
        if (i >= abroadcastrecord.length) goto _L2; else goto _L1
_L1:
        int j;
        obj = abroadcastrecord[i];
        j = 0;
_L5:
        if (j < ((BroadcastRecord) (obj)).receivers.size())
        {
            break MISSING_BLOCK_LABEL_84;
        }
        i++;
        if (true) goto _L4; else goto _L3
_L3:
          goto _L2
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        ((ReceiverRecord)((BroadcastRecord) (obj)).receivers.get(j)).receiver.onReceive(mAppContext, ((BroadcastRecord) (obj)).intent);
        j++;
          goto _L5
    }

    public static LocalBroadcastManager getInstance(Context context)
    {
        synchronized (mLock)
        {
            if (mInstance == null)
            {
                mInstance = new LocalBroadcastManager(context.getApplicationContext());
            }
            context = mInstance;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void registerReceiver(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter)
    {
        HashMap hashmap = mReceivers;
        hashmap;
        JVM INSTR monitorenter ;
        Object obj;
        ReceiverRecord receiverrecord;
        receiverrecord = new ReceiverRecord(intentfilter, broadcastreceiver);
        obj = (ArrayList)mReceivers.get(broadcastreceiver);
        ArrayList arraylist;
        arraylist = ((ArrayList) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        arraylist = new ArrayList(1);
        mReceivers.put(broadcastreceiver, arraylist);
        arraylist.add(intentfilter);
        int i = 0;
_L2:
        if (i < intentfilter.countActions())
        {
            break MISSING_BLOCK_LABEL_82;
        }
        hashmap;
        JVM INSTR monitorexit ;
        return;
        obj = intentfilter.getAction(i);
        arraylist = (ArrayList)mActions.get(obj);
        broadcastreceiver = arraylist;
        if (arraylist != null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        broadcastreceiver = new ArrayList(1);
        mActions.put(obj, broadcastreceiver);
        broadcastreceiver.add(receiverrecord);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        broadcastreceiver;
        hashmap;
        JVM INSTR monitorexit ;
        throw broadcastreceiver;
    }

    public boolean sendBroadcast(Intent intent)
    {
        HashMap hashmap = mReceivers;
        hashmap;
        JVM INSTR monitorenter ;
        String s;
        String s1;
        android.net.Uri uri;
        String s2;
        java.util.Set set;
        s = intent.getAction();
        s1 = intent.resolveTypeIfNeeded(mAppContext.getContentResolver());
        uri = intent.getData();
        s2 = intent.getScheme();
        set = intent.getCategories();
        Object obj;
        Object obj1;
        int j;
        ArrayList arraylist;
        ReceiverRecord receiverrecord;
        int i;
        int k;
        if ((intent.getFlags() & 8) == 0)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        Log.v("LocalBroadcastManager", (new StringBuilder("Resolving type ")).append(s1).append(" scheme ").append(s2).append(" of intent ").append(intent).toString());
        arraylist = (ArrayList)mActions.get(intent.getAction());
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        if (i == 0) goto _L4; else goto _L3
_L3:
        Log.v("LocalBroadcastManager", (new StringBuilder("Action list: ")).append(arraylist).toString());
          goto _L4
_L23:
        if (j < arraylist.size()) goto _L6; else goto _L5
_L5:
        if (obj1 == null) goto _L2; else goto _L7
_L7:
        i = 0;
_L22:
        if (i < ((ArrayList) (obj1)).size()) goto _L9; else goto _L8
_L8:
        mPendingBroadcasts.add(new BroadcastRecord(intent, ((ArrayList) (obj1))));
        if (!mHandler.hasMessages(1))
        {
            mHandler.sendEmptyMessage(1);
        }
        hashmap;
        JVM INSTR monitorexit ;
        return true;
_L6:
        receiverrecord = (ReceiverRecord)arraylist.get(j);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        Log.v("LocalBroadcastManager", (new StringBuilder("Matching against filter ")).append(receiverrecord.filter).toString());
        if (!receiverrecord.broadcasting) goto _L11; else goto _L10
_L10:
        obj = obj1;
        if (i == 0) goto _L13; else goto _L12
_L12:
        Log.v("LocalBroadcastManager", "  Filter's target already added");
        obj = obj1;
          goto _L13
_L11:
        k = receiverrecord.filter.match(s, s1, s2, uri, set, "LocalBroadcastManager");
        if (k < 0) goto _L15; else goto _L14
_L14:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        Log.v("LocalBroadcastManager", (new StringBuilder("  Filter matched!  match=0x")).append(Integer.toHexString(k)).toString());
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        obj = new ArrayList();
        ((ArrayList) (obj)).add(receiverrecord);
        receiverrecord.broadcasting = true;
          goto _L13
        intent;
        hashmap;
        JVM INSTR monitorexit ;
        throw intent;
_L15:
        obj = obj1;
        if (i == 0) goto _L13; else goto _L16
_L16:
        k;
        JVM INSTR tableswitch -4 -1: default 432
    //                   -4 520
    //                   -3 514
    //                   -2 526
    //                   -1 532;
           goto _L17 _L18 _L19 _L20 _L21
_L21:
        break MISSING_BLOCK_LABEL_532;
_L17:
        obj = "unknown reason";
_L24:
        Log.v("LocalBroadcastManager", (new StringBuilder("  Filter did not match: ")).append(((String) (obj))).toString());
        obj = obj1;
          goto _L13
_L9:
        ((ReceiverRecord)((ArrayList) (obj1)).get(i)).broadcasting = false;
        i++;
          goto _L22
_L2:
        hashmap;
        JVM INSTR monitorexit ;
        return false;
_L4:
        obj1 = null;
        j = 0;
          goto _L23
_L13:
        j++;
        obj1 = obj;
          goto _L23
_L19:
        obj = "action";
          goto _L24
_L18:
        obj = "category";
          goto _L24
_L20:
        obj = "data";
          goto _L24
        obj = "type";
          goto _L24
    }

    public void sendBroadcastSync(Intent intent)
    {
        if (sendBroadcast(intent))
        {
            executePendingBroadcasts();
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastreceiver)
    {
        HashMap hashmap = mReceivers;
        hashmap;
        JVM INSTR monitorenter ;
        ArrayList arraylist = (ArrayList)mReceivers.remove(broadcastreceiver);
        if (arraylist != null) goto _L2; else goto _L1
_L1:
        hashmap;
        JVM INSTR monitorexit ;
        return;
_L3:
        int j;
        if (j < arraylist.size())
        {
            break MISSING_BLOCK_LABEL_43;
        }
        hashmap;
        JVM INSTR monitorexit ;
        return;
        broadcastreceiver;
        hashmap;
        JVM INSTR monitorexit ;
        throw broadcastreceiver;
        IntentFilter intentfilter = (IntentFilter)arraylist.get(j);
        int k = 0;
_L7:
        if (k < intentfilter.countActions())
        {
            break MISSING_BLOCK_LABEL_76;
        }
        j++;
          goto _L3
        String s;
        ArrayList arraylist1;
        s = intentfilter.getAction(k);
        arraylist1 = (ArrayList)mActions.get(s);
        if (arraylist1 == null) goto _L5; else goto _L4
_L4:
        int i = 0;
_L6:
        int l;
        if (i >= arraylist1.size())
        {
            if (arraylist1.size() <= 0)
            {
                mActions.remove(s);
            }
            break; /* Loop/switch isn't completed */
        }
        l = i;
        if (((ReceiverRecord)arraylist1.get(i)).receiver != broadcastreceiver)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        arraylist1.remove(i);
        l = i - 1;
        i = l + 1;
        if (true) goto _L6; else goto _L5
_L2:
        j = 0;
          goto _L3
_L5:
        k++;
          goto _L7
    }


}
