// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.actionbarsherlock.widget:
//            SearchView

class ActivityChooserModel extends DataSetObservable
{

    private static final String LOG_TAG;
    private static final Executor SERIAL_EXECUTOR;
    private static final Map sDataModelRegistry;
    private static final Object sRegistryLock;
    private static final String z;
    private final List mActivites;
    private OnChooseActivityListener mActivityChoserModelPolicy;
    private ActivitySorter mActivitySorter;
    private boolean mCanReadHistoricalData;
    private final Context mContext;
    private final List mHistoricalRecords;
    private boolean mHistoricalRecordsChanged;
    private final String mHistoryFileName;
    private int mHistoryMaxSize;
    private final Object mInstanceLock;
    private Intent mIntent;
    private boolean mReadShareHistoryCalled;

    private boolean addHisoricalRecord(HistoricalRecord historicalrecord)
    {
        Object obj = mInstanceLock;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = mHistoricalRecords.add(historicalrecord);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        mHistoricalRecordsChanged = true;
        pruneExcessiveHistoricalRecordsLocked();
        persistHistoricalData();
        sortActivities();
        obj;
        JVM INSTR monitorexit ;
        return flag;
        historicalrecord;
        throw historicalrecord;
        historicalrecord;
        obj;
        JVM INSTR monitorexit ;
        throw historicalrecord;
    }

    private void persistHistoricalData()
    {
        Object obj = mInstanceLock;
        obj;
        JVM INSTR monitorenter ;
        if (!mReadShareHistoryCalled)
        {
            throw new IllegalStateException(z);
        }
        break MISSING_BLOCK_LABEL_30;
        Object obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        if (mHistoricalRecordsChanged)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        mHistoricalRecordsChanged = false;
        mCanReadHistoricalData = true;
        if (!TextUtils.isEmpty(mHistoryFileName))
        {
            SERIAL_EXECUTOR.execute(new HistoryPersister(null));
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        throw obj1;
    }

    private void pruneExcessiveHistoricalRecordsLocked()
    {
        List list;
        int j;
        boolean flag;
        flag = SearchView.a;
        list = mHistoricalRecords;
        j = list.size() - mHistoryMaxSize;
        if (j > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        mHistoricalRecordsChanged = true;
        i = 0;
_L5:
        if (i >= j) goto _L1; else goto _L3
_L3:
        HistoricalRecord historicalrecord = (HistoricalRecord)list.remove(0);
        if (flag) goto _L1; else goto _L4
_L4:
        i++;
          goto _L5
    }

    private void sortActivities()
    {
        Object obj = mInstanceLock;
        obj;
        JVM INSTR monitorenter ;
        ActivitySorter activitysorter = mActivitySorter;
        if (activitysorter == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (!mActivites.isEmpty())
        {
            mActivitySorter.sort(mIntent, mActivites, Collections.unmodifiableList(mHistoricalRecords));
            notifyChanged();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public Intent chooseActivity(int i)
    {
        Object obj = (ActivityResolveInfo)mActivites.get(i);
        obj = new ComponentName(((ActivityResolveInfo) (obj)).resolveInfo.activityInfo.packageName, ((ActivityResolveInfo) (obj)).resolveInfo.activityInfo.name);
        Intent intent = new Intent(mIntent);
        intent.setComponent(((ComponentName) (obj)));
        if (mActivityChoserModelPolicy != null)
        {
            Intent intent1 = new Intent(intent);
            if (mActivityChoserModelPolicy.onChooseActivity(this, intent1))
            {
                return null;
            }
        }
        addHisoricalRecord(new HistoricalRecord(((ComponentName) (obj)), System.currentTimeMillis(), 1.0F));
        return intent;
    }

    public ResolveInfo getActivity(int i)
    {
        ResolveInfo resolveinfo;
        synchronized (mInstanceLock)
        {
            resolveinfo = ((ActivityResolveInfo)mActivites.get(i)).resolveInfo;
        }
        return resolveinfo;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int getActivityCount()
    {
        int i;
        synchronized (mInstanceLock)
        {
            i = mActivites.size();
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int getActivityIndex(ResolveInfo resolveinfo)
    {
        boolean flag = SearchView.a;
        List list = mActivites;
        int j = list.size();
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            Object obj = (ActivityResolveInfo)list.get(i);
            try
            {
                obj = ((ActivityResolveInfo) (obj)).resolveInfo;
            }
            // Misplaced declaration of an exception variable
            catch (ResolveInfo resolveinfo)
            {
                throw resolveinfo;
            }
            if (obj == resolveinfo)
            {
                return i;
            }
            i++;
        } while (!flag);
        return -1;
    }

    public ResolveInfo getDefaultActivity()
    {
        Object obj = mInstanceLock;
        obj;
        JVM INSTR monitorenter ;
        ResolveInfo resolveinfo;
        if (mActivites.isEmpty())
        {
            break MISSING_BLOCK_LABEL_40;
        }
        resolveinfo = ((ActivityResolveInfo)mActivites.get(0)).resolveInfo;
        return resolveinfo;
        obj;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int getHistorySize()
    {
        int i;
        synchronized (mInstanceLock)
        {
            i = mHistoricalRecords.size();
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setDefaultActivity(int i)
    {
        float f;
        ActivityResolveInfo activityresolveinfo;
label0:
        {
            activityresolveinfo = (ActivityResolveInfo)mActivites.get(i);
            ActivityResolveInfo activityresolveinfo1 = (ActivityResolveInfo)mActivites.get(0);
            if (activityresolveinfo1 != null)
            {
                f = (activityresolveinfo1.weight - activityresolveinfo.weight) + 5F;
                if (!SearchView.a)
                {
                    break label0;
                }
            }
            f = 1.0F;
        }
        addHisoricalRecord(new HistoricalRecord(new ComponentName(activityresolveinfo.resolveInfo.activityInfo.packageName, activityresolveinfo.resolveInfo.activityInfo.name), System.currentTimeMillis(), f));
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "?\006z]'\024\n?I<\037\016zN4\035\005zY:QJ(H4\025!3^!\036\0333N4\035-;Y4".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            LOG_TAG = com/actionbarsherlock/widget/ActivityChooserModel.getSimpleName();
            sRegistryLock = new Object();
            sDataModelRegistry = new HashMap();
            SERIAL_EXECUTOR = Executors.newSingleThreadExecutor();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 104
    //                   0 122
    //                   1 128
    //                   2 134
    //                   3 140;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_140;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 85;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 113;
          goto _L8
_L3:
        byte0 = 105;
          goto _L8
_L4:
        byte0 = 90;
          goto _L8
        byte0 = 45;
          goto _L8
    }






    private class HistoryPersister
        implements Runnable
    {

        private static final String z[];
        final ActivityChooserModel this$0;

        public void run()
        {
            int i;
            boolean flag = SearchView.a;
            ArrayList arraylist;
            synchronized (mInstanceLock)
            {
                arraylist = new ArrayList(mHistoricalRecords);
            }
            XmlSerializer xmlserializer;
            HistoricalRecord historicalrecord;
            int j;
            try
            {
                obj = mContext.openFileOutput(mHistoryFileName, 0);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append(z[9]).append(mHistoryFileName).toString(), ((Throwable) (obj)));
                return;
            }
            xmlserializer = Xml.newSerializer();
            xmlserializer.setOutput(((java.io.OutputStream) (obj)), null);
            xmlserializer.startDocument(z[4], Boolean.valueOf(true));
            xmlserializer.startTag(null, z[3]);
            j = arraylist.size();
            i = 0;
_L6:
            if (i >= j)
            {
                break MISSING_BLOCK_LABEL_218;
            }
            historicalrecord = (HistoricalRecord)arraylist.remove(0);
            xmlserializer.startTag(null, z[6]);
            xmlserializer.attribute(null, z[0], historicalrecord.activity.flattenToString());
            xmlserializer.attribute(null, z[2], String.valueOf(historicalrecord.time));
            xmlserializer.attribute(null, z[7], String.valueOf(historicalrecord.weight));
            xmlserializer.endTag(null, z[8]);
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_456;
            }
            xmlserializer.endTag(null, z[5]);
            xmlserializer.endDocument();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_245;
            }
            ((FileOutputStream) (obj)).close();
_L2:
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            Object obj1;
            obj1;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append(z[1]).append(mHistoryFileName).toString(), ((Throwable) (obj1)));
            if (obj == null) goto _L2; else goto _L1
_L1:
            try
            {
                ((FileOutputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
            obj1;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append(z[10]).append(mHistoryFileName).toString(), ((Throwable) (obj1)));
            if (obj == null) goto _L2; else goto _L3
_L3:
            try
            {
                ((FileOutputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
            obj1;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append(z[11]).append(mHistoryFileName).toString(), ((Throwable) (obj1)));
            if (obj == null) goto _L2; else goto _L4
_L4:
            try
            {
                ((FileOutputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
            obj1;
            IOException ioexception;
            if (obj != null)
            {
                try
                {
                    ((FileOutputStream) (obj)).close();
                }
                catch (IOException ioexception1) { }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
            }
            throw obj1;
            ioexception;
            return;
            i++;
            if (true) goto _L6; else goto _L5
_L5:
        }

        static 
        {
            Object obj;
            String as[];
            byte byte0;
            int i;
            as = new String[12];
            obj = "so\022\0269{x\037";
            byte0 = -1;
            i = 0;
_L2:
            String as1[];
            int j;
            int k;
            as1 = as;
            obj = ((String) (obj)).toCharArray();
            k = obj.length;
            j = 0;
_L8:
label0:
            {
                if (k > j)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte0)
                {
                default:
                    as1[i] = ((String) (obj));
                    obj = "W~\024\020=2{\024\026;{b\001_'{\177\022\020={o\007\023o`i\005\r v,\000\026#w6F";
                    i = 1;
                    byte0 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    obj = "fe\013\032";
                    i = 2;
                    byte0 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    obj = "ze\025\013 `e\005\036#?~\003\034 `h\025";
                    i = 3;
                    byte0 = 2;
                    break;

                case 2: // '\002'
                    as1[i] = ((String) (obj));
                    obj = "GX Rw";
                    i = 4;
                    byte0 = 3;
                    break;

                case 3: // '\003'
                    as1[i] = ((String) (obj));
                    i = 5;
                    obj = "ze\025\013 `e\005\036#?~\003\034 `h\025";
                    byte0 = 4;
                    break;

                case 4: // '\004'
                    as1[i] = ((String) (obj));
                    i = 6;
                    obj = "ze\025\013 `e\005\036#?~\003\034 `h";
                    byte0 = 5;
                    break;

                case 5: // '\005'
                    as1[i] = ((String) (obj));
                    i = 7;
                    obj = "ei\017\030'f";
                    byte0 = 6;
                    break;

                case 6: // '\006'
                    as1[i] = ((String) (obj));
                    i = 8;
                    obj = "ze\025\013 `e\005\036#?~\003\034 `h";
                    byte0 = 7;
                    break;

                case 7: // '\007'
                    as1[i] = ((String) (obj));
                    i = 9;
                    obj = "W~\024\020=2{\024\026;{b\001_'{\177\022\020={o\007\023o`i\005\r v,\000\026#w6F";
                    byte0 = 8;
                    break;

                case 8: // '\b'
                    as1[i] = ((String) (obj));
                    i = 10;
                    obj = "W~\024\020=2{\024\026;{b\001_'{\177\022\020={o\007\023o`i\005\r v,\000\026#w6F";
                    byte0 = 9;
                    break;

                case 9: // '\t'
                    as1[i] = ((String) (obj));
                    i = 11;
                    obj = "W~\024\020=2{\024\026;{b\001_'{\177\022\020={o\007\023o`i\005\r v,\000\026#w6F";
                    byte0 = 10;
                    break;

                case 10: // '\n'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 344
        //                       0 367
        //                       1 374
        //                       2 381
        //                       3 388;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_388;
_L3:
            byte byte1 = 79;
_L9:
            obj[j] = (char)(byte1 ^ c);
            j++;
              goto _L8
_L4:
            byte1 = 18;
              goto _L9
_L5:
            byte1 = 12;
              goto _L9
_L6:
            byte1 = 102;
              goto _L9
            byte1 = 127;
              goto _L9
        }

        private HistoryPersister()
        {
            this$0 = ActivityChooserModel.this;
            super();
        }

        HistoryPersister(_cls1 _pcls1)
        {
            this();
        }
    }


    private class HistoricalRecord
    {

        private static final String z[];
        public final ComponentName activity;
        public final long time;
        public final float weight;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null)
                {
                    return false;
                }
                if (getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (HistoricalRecord)obj;
                if (activity == null)
                {
                    if (((HistoricalRecord) (obj)).activity != null)
                    {
                        return false;
                    }
                } else
                if (!activity.equals(((HistoricalRecord) (obj)).activity))
                {
                    return false;
                }
                if (time != ((HistoricalRecord) (obj)).time)
                {
                    return false;
                }
                if (Float.floatToIntBits(weight) != Float.floatToIntBits(((HistoricalRecord) (obj)).weight))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            int i;
            if (activity == null)
            {
                i = 0;
            } else
            {
                i = activity.hashCode();
            }
            return ((i + 31) * 31 + (int)(time ^ time >>> 32)) * 31 + Float.floatToIntBits(weight);
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("[");
            stringbuilder.append(z[1]).append(activity);
            stringbuilder.append(z[0]).append(time);
            stringbuilder.append(z[2]).append(new BigDecimal(weight));
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        static 
        {
            Object obj;
            String as[];
            byte byte1;
            int i;
            as = new String[3];
            obj = "!H\005,J\177R";
            byte1 = -1;
            i = 0;
_L2:
            String as1[];
            int j;
            int k;
            as1 = as;
            obj = ((String) (obj)).toCharArray();
            k = obj.length;
            j = 0;
_L8:
label0:
            {
                if (k > j)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte1)
                {
                default:
                    as1[i] = ((String) (obj));
                    obj = "!H\020&Ss\036\0301^ ";
                    i = 1;
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    i = 2;
                    obj = "!H\006 N}\000\005\177";
                    byte1 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 156
        //                       0 177
        //                       1 183
        //                       2 189
        //                       3 195;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_195;
_L3:
            byte byte0 = 39;
_L9:
            obj[j] = (char)(byte0 ^ c);
            j++;
              goto _L8
_L4:
            byte0 = 26;
              goto _L9
_L5:
            byte0 = 104;
              goto _L9
_L6:
            byte0 = 113;
              goto _L9
            byte0 = 69;
              goto _L9
        }

        public HistoricalRecord(ComponentName componentname, long l, float f)
        {
            activity = componentname;
            time = l;
            weight = f;
        }
    }


    private class ActivitySorter
    {

        public abstract void sort(Intent intent, List list, List list1);
    }


    private class ActivityResolveInfo
        implements Comparable
    {

        private static final String z[];
        public final ResolveInfo resolveInfo;
        public float weight;

        public int compareTo(ActivityResolveInfo activityresolveinfo)
        {
            return Float.floatToIntBits(activityresolveinfo.weight) - Float.floatToIntBits(weight);
        }

        public int compareTo(Object obj)
        {
            return compareTo((ActivityResolveInfo)obj);
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null)
                {
                    return false;
                }
                if (getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (ActivityResolveInfo)obj;
                if (Float.floatToIntBits(weight) != Float.floatToIntBits(((ActivityResolveInfo) (obj)).weight))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return Float.floatToIntBits(weight) + 31;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("[");
            stringbuilder.append(z[1]).append(resolveInfo.toString());
            stringbuilder.append(z[0]).append(new BigDecimal(weight));
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        static 
        {
            Object obj;
            String as[];
            byte byte1;
            int i;
            as = new String[2];
            obj = "\0202@!\003LzC~";
            byte1 = -1;
            i = 0;
_L2:
            String as1[];
            int j;
            int k;
            as1 = as;
            obj = ((String) (obj)).toCharArray();
            k = obj.length;
            j = 0;
_L8:
label0:
            {
                if (k > j)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte1)
                {
                default:
                    as1[i] = ((String) (obj));
                    i = 1;
                    obj = "YwD+\006]w~*\fD(";
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 136
        //                       0 157
        //                       1 163
        //                       2 169
        //                       3 175;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_175;
_L3:
            byte byte0 = 106;
_L9:
            obj[j] = (char)(byte0 ^ c);
            j++;
              goto _L8
_L4:
            byte0 = 43;
              goto _L9
_L5:
            byte0 = 18;
              goto _L9
_L6:
            byte0 = 55;
              goto _L9
            byte0 = 68;
              goto _L9
        }
    }


    private class OnChooseActivityListener
    {

        public abstract boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent);
    }

}
