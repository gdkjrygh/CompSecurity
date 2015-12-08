// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.batch;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.common.base.Charsets;
import com.weather.dal2.eventlog.post.DsxLog;
import com.weather.dal2.eventlog.tracking.TrackingBatchedEventReport;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.dal2.eventlog.batch:
//            Batchable

public class LocationUpdateBatchedEventReport
{
    public static class LocationUpdateReportService extends IntentService
    {

        private static final String TAG = "LocationUpdateReportService";
        private final DsxLog dsxLog;
        private final LocationUpdateBatchedEventReport locationUpdateBatchedEventReport;

        protected void onHandleIntent(Intent intent)
        {
            LogUtil.logToFile("Alarm Service Started");
            locationUpdateBatchedEventReport.send(dsxLog);
        }

        public LocationUpdateReportService()
        {
            this("LocationUpdateReportService", new DsxLog(), ((LocationUpdateBatchedEventReport) (TrackingBatchedEventReport.getInstance())));
        }

        LocationUpdateReportService(String s, DsxLog dsxlog, LocationUpdateBatchedEventReport locationupdatebatchedeventreport)
        {
            super(s);
            dsxLog = dsxlog;
            locationUpdateBatchedEventReport = locationupdatebatchedeventreport;
        }
    }


    public static final String CURRENT_SIZE = "LOCATION_UPDATE_CURRENT_BATCH_SIZE";
    public static final long MAX_SIZE_DEFAULT = 0x3d090L;
    static final String TAG = "LocationUpdateBatchedEventReport";
    private final String arrayTag;
    private final Context context;
    private final String eventType;
    private final LbsUtil lbsUtil;
    private final Object lock;
    private final long maxSizeLog;
    private final SharedPreferences pref;
    private final String tag;
    private final int version;

    protected LocationUpdateBatchedEventReport(String s, String s1, int i)
    {
        this(s, s1, i, 0x3d090L, AbstractTwcApplication.getRootContext(), LbsUtil.getInstance());
    }

    protected LocationUpdateBatchedEventReport(String s, String s1, int i, long l, Context context1, LbsUtil lbsutil)
    {
        lock = new Object();
        context = context1;
        pref = context1.getSharedPreferences(s1, 0);
        arrayTag = s;
        eventType = s1;
        version = i;
        maxSizeLog = l;
        lbsUtil = lbsutil;
        tag = (new StringBuilder()).append("LocationUpdateBatchedEventReport:").append(s1).toString();
        synchronized (lock)
        {
            if (!context1.getFileStreamPath(s).exists())
            {
                clear();
            }
        }
        return;
        s;
        s1;
        JVM INSTR monitorexit ;
        throw s;
    }

    private void append(Batchable batchable)
    {
        Object obj;
        StringBuilder stringbuilder;
        obj = context.openFileInput(arrayTag);
        stringbuilder = new StringBuilder();
_L1:
        int i = ((FileInputStream) (obj)).read();
label0:
        {
            if (i == -1)
            {
                break label0;
            }
            try
            {
                stringbuilder.append((char)i);
            }
            // Misplaced declaration of an exception variable
            catch (Batchable batchable)
            {
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Batchable batchable)
            {
                return;
            }
        }
          goto _L1
        ((FileInputStream) (obj)).close();
        obj = new JSONArray(stringbuilder.toString());
        ((JSONArray) (obj)).put(batchable.toJson());
        batchable = ((JSONArray) (obj)).toString();
        obj = context.openFileOutput(arrayTag, 0);
        ((FileOutputStream) (obj)).write(getBytesUTFEncoding(batchable));
        ((FileOutputStream) (obj)).close();
        obj = pref.edit();
        ((android.content.SharedPreferences.Editor) (obj)).putLong("LOCATION_UPDATE_CURRENT_BATCH_SIZE", getBytesUTFEncodingCount(batchable));
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        return;
    }

    private JSONArray getBatch()
        throws IOException, JSONException
    {
        FileInputStream fileinputstream = context.openFileInput(arrayTag);
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            int i = fileinputstream.read();
            if (i != -1)
            {
                stringbuilder.append((char)i);
            } else
            {
                fileinputstream.close();
                return new JSONArray(stringbuilder.toString());
            }
        } while (true);
    }

    private byte[] getBytesUTFEncoding(String s)
    {
        return s.getBytes(Charsets.UTF_8);
    }

    private int getBytesUTFEncodingCount(String s)
    {
        return s.getBytes(Charsets.UTF_8).length;
    }

    final void clear()
    {
        try
        {
            File file = context.getFileStreamPath(arrayTag);
            if (!file.exists() || file.delete())
            {
                String s = (new JSONArray()).toString();
                Object obj = context.openFileOutput(arrayTag, 0);
                ((FileOutputStream) (obj)).write(getBytesUTFEncoding(s));
                ((FileOutputStream) (obj)).close();
                obj = pref.edit();
                ((android.content.SharedPreferences.Editor) (obj)).clear();
                ((android.content.SharedPreferences.Editor) (obj)).putLong("LOCATION_UPDATE_CURRENT_BATCH_SIZE", getBytesUTFEncodingCount(s));
                ((android.content.SharedPreferences.Editor) (obj)).apply();
            }
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    long getBatchSize()
    {
        return pref.getLong("LOCATION_UPDATE_CURRENT_BATCH_SIZE", 0L);
    }

    public void process(Batchable batchable)
    {
        LogUtil.method("LocationUpdateBatchedEventReport", LoggingMetaTags.TWC_DAL, "process", new Object[] {
            batchable
        });
        int i = getBytesUTFEncodingCount(batchable.toJson().toString());
        synchronized (lock)
        {
            if (getBatchSize() + (long)i < maxSizeLog)
            {
                append(batchable);
            }
        }
        return;
        batchable;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw batchable;
        }
        // Misplaced declaration of an exception variable
        catch (Batchable batchable)
        {
            return;
        }
    }

    public void send(DsxLog dsxlog)
    {
        JSONObject jsonobject = null;
        if (!lbsUtil.isLbsEnabledForAppAndDevice())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        synchronized (lock)
        {
            JSONArray jsonarray = getBatch();
            if (jsonarray.length() > 0)
            {
                jsonobject = (new JSONObject()).put(arrayTag, jsonarray);
            }
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        dsxlog.send(tag, version, eventType, jsonobject);
        synchronized (lock)
        {
            clear();
        }
        return;
        dsxlog;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw dsxlog;
        }
        // Misplaced declaration of an exception variable
        catch (DsxLog dsxlog)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DsxLog dsxlog)
        {
            return;
        }
        exception;
        dsxlog;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
