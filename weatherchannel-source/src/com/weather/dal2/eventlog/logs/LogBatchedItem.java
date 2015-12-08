// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.logs;

import android.util.Log;
import com.google.common.base.Strings;
import com.weather.dal2.eventlog.batch.Batchable;
import com.weather.dal2.eventlog.batch.BatchedItemFactory;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.dal2.eventlog.logs:
//            StateJson

public class LogBatchedItem
    implements Batchable
{
    static class LogBatchedItemFactory
        implements BatchedItemFactory
    {

        public volatile Batchable create(JSONObject jsonobject)
            throws JSONException
        {
            return create(jsonobject);
        }

        public LogBatchedItem create(JSONObject jsonobject)
            throws JSONException
        {
            return new LogBatchedItem(jsonobject);
        }

        LogBatchedItemFactory()
        {
        }
    }


    static final String MESSAGE_KEY = "msg";
    static final String STATE = "state";
    static final String TAG_KEY = "tag";
    static final String TIMESTAMP = "time";
    static final String TRACE_KEY = "trace";
    private final String msg;
    private final String tag;
    private final long timeStamp;
    private final String tr;

    public LogBatchedItem(String s, String s1, Throwable throwable, long l)
    {
        tag = s;
        msg = s1;
        timeStamp = l;
        tr = Log.getStackTraceString(throwable);
    }

    public LogBatchedItem(JSONObject jsonobject)
    {
        tag = jsonobject.optString("tag");
        msg = jsonobject.optString("msg", null);
        timeStamp = jsonobject.optLong("time", 0L);
        tr = jsonobject.optString("trace");
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (getClass() != obj.getClass())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (LogBatchedItem)obj;
        flag = flag1;
        if (timeStamp != ((LogBatchedItem) (obj)).timeStamp)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (msg == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!msg.equals(((LogBatchedItem) (obj)).msg))
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (tag.equals(((LogBatchedItem) (obj)).tag))
        {
            return tr.equals(((LogBatchedItem) (obj)).tr);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (((LogBatchedItem) (obj)).msg != null)
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public String getMessage()
    {
        return msg;
    }

    public String getTag()
    {
        return tag;
    }

    public String getThrowable()
    {
        return tr;
    }

    public long getTimeStamp()
    {
        return timeStamp;
    }

    public int hashCode()
    {
        int j = tag.hashCode();
        int i;
        if (msg != null)
        {
            i = msg.hashCode();
        } else
        {
            i = 0;
        }
        return ((j * 31 + i) * 31 + tr.hashCode()) * 31 + (int)(timeStamp ^ timeStamp >>> 32);
    }

    public JSONObject toJson()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        if (!Strings.isNullOrEmpty(tag))
        {
            jsonobject.put("tag", tag);
        }
        if (!Strings.isNullOrEmpty(msg))
        {
            jsonobject.put("msg", msg);
        }
        if (!Strings.isNullOrEmpty(tr))
        {
            jsonobject.put("trace", tr);
        }
        jsonobject.put("time", timeStamp);
        jsonobject.put("state", (new StateJson()).getJsonObject());
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append(tag).append(", ").append(msg).toString();
    }
}
