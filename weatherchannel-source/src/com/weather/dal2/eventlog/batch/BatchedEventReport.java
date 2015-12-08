// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.batch;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.weather.dal2.eventlog.post.DsxLog;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.time.SystemTimeProvider;
import com.weather.util.time.TimeProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.dal2.eventlog.batch:
//            Batchable, BatchedItemFactory

public class BatchedEventReport
{

    static final String COUNT = "COUNT";
    private static final int DEFAULT_OFFSET = 6;
    static final String FILE_SIZE = "FILE_SIZE";
    static final String IDX = "idx-";
    static final String LAST_UPDATE_TIME = "LAST_UPDATE_TIME";
    private static final String MAX_SIZE = "MAX_SIZE_REPORT";
    private static final long MAX_SIZE_DEFAULT = 4000L;
    private static final String TAG = "BatchedEventReport";
    private final String arrayTag;
    private final String eventType;
    private final BatchedItemFactory factory;
    private final Object lock;
    private final String max_size_tag;
    private final SharedPreferences pref;
    private final long reportingPeriod;
    private final String tag;
    private final TimeProvider timeProvider;
    private final int version;

    protected BatchedEventReport(long l, String s, String s1, int i, BatchedItemFactory batcheditemfactory)
    {
        lock = new Object();
        reportingPeriod = l;
        pref = AbstractTwcApplication.getRootContext().getSharedPreferences(s1, 0);
        arrayTag = s;
        max_size_tag = (new StringBuilder()).append(s).append("MAX_SIZE_REPORT").toString();
        eventType = s1;
        factory = batcheditemfactory;
        version = i;
        timeProvider = SystemTimeProvider.getInstance();
        tag = (new StringBuilder()).append("BatchedEventReport: ").append(s1).toString();
    }

    protected BatchedEventReport(long l, String s, String s1, int i, BatchedItemFactory batcheditemfactory, TimeProvider timeprovider)
    {
        lock = new Object();
        reportingPeriod = l;
        pref = AbstractTwcApplication.getRootContext().getSharedPreferences(s1, 0);
        arrayTag = s;
        max_size_tag = (new StringBuilder()).append(s).append("MAX_SIZE_REPORT").toString();
        eventType = s1;
        factory = batcheditemfactory;
        version = i;
        timeProvider = timeprovider;
        tag = (new StringBuilder()).append("BatchedEventReport: ").append(s1).toString();
    }

    private void append(Batchable batchable)
    {
        android.content.SharedPreferences.Editor editor = pref.edit();
        long l = pref.getLong("COUNT", 0L);
        long l1 = pref.getLong("FILE_SIZE", 0L);
        long l2 = getMaxSize();
        int i;
        try
        {
            batchable = batchable.toJson().toString();
            i = getBytesUTFEncoding(batchable);
        }
        // Misplaced declaration of an exception variable
        catch (Batchable batchable)
        {
            Log.w("BatchedEventReport", (new StringBuilder()).append("Unable to create JSON from item. ").append(batchable).toString());
            return;
        }
        if ((long)i + l1 > l2)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        editor.putString((new StringBuilder()).append("idx-").append(l).toString(), batchable);
        editor.putLong("COUNT", 1L + l);
        editor.putLong("FILE_SIZE", (long)i + l1);
        editor.putLong(max_size_tag, l2 - 1L);
        editor.apply();
    }

    private int getBytesUTFEncoding(String s)
    {
        return s.getBytes(Charsets.UTF_8).length;
    }

    private long getDefaultSize()
    {
        return 4000L - (long)(getBytesUTFEncoding(arrayTag) + 6);
    }

    private long getMaxSize()
    {
        long l1 = pref.getLong(max_size_tag, 0L);
        long l = l1;
        if (l1 == 0L)
        {
            l = getDefaultSize();
        }
        return l;
    }

    private boolean isReadyToReport()
    {
        return pref.getLong("LAST_UPDATE_TIME", 0L) < timeProvider.currentTimeMillis() - reportingPeriod;
    }

    private List readList()
    {
        ArrayList arraylist;
        long l;
        arraylist = new ArrayList();
        l = pref.getLong("COUNT", 0L);
        if (l <= 0L) goto _L2; else goto _L1
_L1:
        LogUtil.method("BatchedEventReport", LoggingMetaTags.TWC_DAL, "readList", new Object[] {
            Long.valueOf(l)
        });
        int i = 0;
_L3:
        if ((long)i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject = new JSONObject(pref.getString((new StringBuilder()).append("idx-").append(i).toString(), "{}"));
        arraylist.add(factory.create(jsonobject));
        i++;
        if (true) goto _L3; else goto _L2
        JSONException jsonexception;
        jsonexception;
        Log.e(tag, (new StringBuilder()).append("readList(): ").append(jsonexception).toString());
        clear();
_L2:
        LogUtil.d("BatchedEventReport", LoggingMetaTags.TWC_DAL, "readList() elements.size: %d", new Object[] {
            Integer.valueOf(arraylist.size())
        });
        return arraylist;
    }

    private void send(Iterable iterable)
    {
        try
        {
            iterable = buildEventDataArray(iterable);
            LogUtil.method("BatchedEventReport", LoggingMetaTags.TWC_DAL, "send", new Object[] {
                iterable
            });
            (new DsxLog()).send(tag, version, eventType, iterable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Iterable iterable)
        {
            Log.w(tag, iterable);
        }
    }

    protected JSONObject buildEventDataArray(Iterable iterable)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        for (iterable = iterable.iterator(); iterable.hasNext(); jsonarray.put(((Batchable)iterable.next()).toJson())) { }
        jsonobject.put(arrayTag, jsonarray);
        return jsonobject;
    }

    public void clear()
    {
        android.content.SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.putLong("LAST_UPDATE_TIME", 0L);
        editor.putLong("COUNT", 0L);
        editor.putLong("FILE_SIZE", 0L);
        editor.putLong(max_size_tag, getDefaultSize());
        editor.apply();
    }

    public long getFileSize()
    {
        return pref.getLong("FILE_SIZE", 0L);
    }

    public boolean isFileMaxSizeOverflow(String s)
    {
        return getFileSize() + (long)getBytesUTFEncoding(s) > getMaxSize();
    }

    public void process(Batchable batchable)
    {
        LogUtil.method("BatchedEventReport", LoggingMetaTags.TWC_DAL, "process", new Object[] {
            batchable
        });
        long l = timeProvider.currentTimeMillis();
        synchronized (lock)
        {
            Preconditions.checkNotNull(batchable);
            append(batchable);
            if (isReadyToReport())
            {
                send(readList());
                clear();
                batchable = pref.edit();
                batchable.putLong("LAST_UPDATE_TIME", l);
                batchable.apply();
            }
        }
        return;
        batchable;
        obj;
        JVM INSTR monitorexit ;
        throw batchable;
    }
}
