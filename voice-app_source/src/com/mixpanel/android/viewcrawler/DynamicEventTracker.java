// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class DynamicEventTracker
    implements ViewVisitor.OnEventListener
{
    private final class SendDebouncedTask
        implements Runnable
    {

        final DynamicEventTracker this$0;

        public void run()
        {
            long l = System.currentTimeMillis();
            Map map = mDebouncedEvents;
            map;
            JVM INSTR monitorenter ;
            Iterator iterator = mDebouncedEvents.entrySet().iterator();
_L2:
            if (iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_75;
            }
            if (!mDebouncedEvents.isEmpty())
            {
                mHandler.postDelayed(this, 500L);
            }
            return;
            UnsentEvent unsentevent = (UnsentEvent)((java.util.Map.Entry)iterator.next()).getValue();
            if (l - unsentevent.timeSentMillis > 1000L)
            {
                mMixpanel.track(unsentevent.eventName, unsentevent.properties);
                iterator.remove();
            }
            if (true) goto _L2; else goto _L1
_L1:
            Exception exception;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private SendDebouncedTask()
        {
            this$0 = DynamicEventTracker.this;
            super();
        }

        SendDebouncedTask(SendDebouncedTask senddebouncedtask)
        {
            this();
        }
    }

    private static class Signature
    {

        private final int mHashCode;

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Signature)
            {
                flag = flag1;
                if (mHashCode == obj.hashCode())
                {
                    flag = true;
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return mHashCode;
        }

        public Signature(View view, String s)
        {
            mHashCode = view.hashCode() ^ s.hashCode();
        }
    }

    private static class UnsentEvent
    {

        public final String eventName;
        public final JSONObject properties;
        public final long timeSentMillis;

        public UnsentEvent(String s, JSONObject jsonobject, long l)
        {
            eventName = s;
            properties = jsonobject;
            timeSentMillis = l;
        }
    }


    private static final int DEBOUNCE_TIME_MILLIS = 1000;
    private static String LOGTAG = "MixpanelAPI.DynamicEventTracker";
    private static final int MAX_PROPERTY_LENGTH = 128;
    private final Map mDebouncedEvents = new HashMap();
    private final Handler mHandler;
    private final MixpanelAPI mMixpanel;
    private final Runnable mTask = new SendDebouncedTask(null);

    public DynamicEventTracker(MixpanelAPI mixpanelapi, Handler handler)
    {
        mMixpanel = mixpanelapi;
        mHandler = handler;
    }

    private static String textPropertyFromView(View view)
    {
        Object obj = null;
        String s;
        if (view instanceof TextView)
        {
            view = ((TextView)view).getText();
            s = obj;
            if (view != null)
            {
                s = view.toString();
            }
        } else
        {
            s = obj;
            if (view instanceof ViewGroup)
            {
                StringBuilder stringbuilder = new StringBuilder();
                view = (ViewGroup)view;
                int j = view.getChildCount();
                boolean flag = false;
                int i = 0;
                do
                {
                    if (i >= j || stringbuilder.length() >= 128)
                    {
                        if (stringbuilder.length() > 128)
                        {
                            return stringbuilder.substring(0, 128);
                        }
                        break;
                    }
                    s = textPropertyFromView(view.getChildAt(i));
                    boolean flag1 = flag;
                    if (s != null)
                    {
                        flag1 = flag;
                        if (s.length() > 0)
                        {
                            if (flag)
                            {
                                stringbuilder.append(", ");
                            }
                            stringbuilder.append(s);
                            flag1 = true;
                        }
                    }
                    i++;
                    flag = flag1;
                } while (true);
                s = obj;
                if (flag)
                {
                    return stringbuilder.toString();
                }
            }
        }
        return s;
    }

    public void OnEvent(View view, String s, boolean flag)
    {
        Object obj;
        long l = System.currentTimeMillis();
        obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("$text", textPropertyFromView(view));
            ((JSONObject) (obj)).put("$from_binding", true);
            ((JSONObject) (obj)).put("time", l / 1000L);
        }
        catch (JSONException jsonexception)
        {
            Log.e(LOGTAG, "Can't format properties from view due to JSON issue", jsonexception);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        view = new Signature(view, s);
        obj = new UnsentEvent(s, ((JSONObject) (obj)), l);
        s = mDebouncedEvents;
        s;
        JVM INSTR monitorenter ;
        flag = mDebouncedEvents.isEmpty();
        mDebouncedEvents.put(view, obj);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        mHandler.postDelayed(mTask, 1000L);
        s;
        JVM INSTR monitorexit ;
        return;
        view;
        s;
        JVM INSTR monitorexit ;
        throw view;
        mMixpanel.track(s, ((JSONObject) (obj)));
        return;
    }




}
